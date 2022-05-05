---
title: MovieContent
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.api.type.content](../index.html)/[MovieContent](index.html)



# MovieContent



[jvm]\
data class [MovieContent](index.html)@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)constructor(val info: [MovieContent.MovieInfo](-movie-info/index.html), val stream: [InputStream](https://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html), val mimeType: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) : [Content](../-content/index.html), [AutoCloseable](https://docs.oracle.com/javase/7/docs/api/java/lang/AutoCloseable.html)

[MovieContent](index.html)를 사용한 글을 작성해야 할 경우, 글 작성 전에 [be.zvz.kotlininside.api.generic.MovieUpload](../../be.zvz.kotlininside.api.generic/-movie-upload/index.html)를 사용하여 [MovieContent](index.html)를 업로드 해놓아야 합니다.



## Constructors


| | |
|---|---|
| [MovieContent](-movie-content.html) | [jvm]<br>fun [MovieContent](-movie-content.html)(info: [MovieContent.MovieInfo](-movie-info/index.html), file: [File](https://docs.oracle.com/javase/7/docs/api/java/io/File.html)) |
| [MovieContent](-movie-content.html) | [jvm]<br>@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)<br>fun [MovieContent](-movie-content.html)(info: [MovieContent.MovieInfo](-movie-info/index.html), stream: [InputStream](https://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html), mimeType: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) |


## Types


| Name | Summary |
|---|---|
| [MovieInfo](-movie-info/index.html) | [jvm]<br>data class [MovieInfo](-movie-info/index.html)@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)constructor(val allowDownload: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val description: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val tag: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; = emptyList()) |


## Functions


| Name | Summary |
|---|---|
| [close](close.html) | [jvm]<br>open override fun [close](close.html)() |


## Properties


| Name | Summary |
|---|---|
| [info](info.html) | [jvm]<br>val [info](info.html): [MovieContent.MovieInfo](-movie-info/index.html) |
| [mimeType](mime-type.html) | [jvm]<br>val [mimeType](mime-type.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null |
| [stream](stream.html) | [jvm]<br>val [stream](stream.html): [InputStream](https://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html) |

