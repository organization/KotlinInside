---
title: ImageContent
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.api.type.content](../index.html)/[ImageContent](index.html)



# ImageContent



[jvm]\
data class [ImageContent](index.html)@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)constructor(val stream: [InputStream](https://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html), val mimeType: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) : [Content](../-content/index.html), [AutoCloseable](https://docs.oracle.com/javase/7/docs/api/java/lang/AutoCloseable.html)



## Constructors


| | |
|---|---|
| [ImageContent](-image-content.html) | [jvm]<br>fun [ImageContent](-image-content.html)(urlConnection: [URLConnection](https://docs.oracle.com/javase/7/docs/api/java/net/URLConnection.html)) |
| [ImageContent](-image-content.html) | [jvm]<br>fun [ImageContent](-image-content.html)(file: [File](https://docs.oracle.com/javase/7/docs/api/java/io/File.html)) |
| [ImageContent](-image-content.html) | [jvm]<br>@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)<br>fun [ImageContent](-image-content.html)(stream: [InputStream](https://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html), mimeType: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) |


## Functions


| Name | Summary |
|---|---|
| [close](close.html) | [jvm]<br>open override fun [close](close.html)() |


## Properties


| Name | Summary |
|---|---|
| [mimeType](mime-type.html) | [jvm]<br>val [mimeType](mime-type.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null |
| [stream](stream.html) | [jvm]<br>val [stream](stream.html): [InputStream](https://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html) |

