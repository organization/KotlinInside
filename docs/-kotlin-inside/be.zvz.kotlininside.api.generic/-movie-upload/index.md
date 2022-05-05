---
title: MovieUpload
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.api.generic](../index.html)/[MovieUpload](index.html)



# MovieUpload



[jvm]\
class [MovieUpload](index.html)@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)constructor(val gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val content: [MovieContent](../../be.zvz.kotlininside.api.type.content/-movie-content/index.html), val checkRestriction: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true)

[be.zvz.kotlininside.api.type.content.MovieContent](../../be.zvz.kotlininside.api.type.content/-movie-content/index.html) 업로드를 위한 API 클래스



## Constructors


| | |
|---|---|
| [MovieUpload](-movie-upload.html) | [jvm]<br>@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)<br>fun [MovieUpload](-movie-upload.html)(gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), content: [MovieContent](../../be.zvz.kotlininside.api.type.content/-movie-content/index.html), checkRestriction: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true) |


## Types


| Name | Summary |
|---|---|
| [CheckResult](-check-result/index.html) | [jvm]<br>data class [CheckResult](-check-result/index.html)(val result: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val cause: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) |
| [UploadException](-upload-exception/index.html) | [jvm]<br>class [UploadException](-upload-exception/index.html)(val checkResult: [MovieUpload.CheckResult](-check-result/index.html)) : [IOException](https://docs.oracle.com/javase/7/docs/api/java/io/IOException.html) |
| [UploadResult](-upload-result/index.html) | [jvm]<br>data class [UploadResult](-upload-result/index.html)(val msg: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, val fileId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)?, val thumbnailUrls: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;?, val width: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)?, val height: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)?) |


## Functions


| Name | Summary |
|---|---|
| [upload](upload.html) | [jvm]<br>fun [upload](upload.html)(): [MovieUpload.UploadResult](-upload-result/index.html) |


## Properties


| Name | Summary |
|---|---|
| [checkRestriction](check-restriction.html) | [jvm]<br>val [checkRestriction](check-restriction.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true |
| [content](content.html) | [jvm]<br>val [content](content.html): [MovieContent](../../be.zvz.kotlininside.api.type.content/-movie-content/index.html) |
| [gallId](gall-id.html) | [jvm]<br>val [gallId](gall-id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

