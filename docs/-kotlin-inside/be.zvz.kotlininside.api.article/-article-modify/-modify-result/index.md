---
title: ModifyResult
---
//[KotlinInside](../../../../index.html)/[be.zvz.kotlininside.api.article](../../index.html)/[ArticleModify](../index.html)/[ModifyResult](index.html)



# ModifyResult



[jvm]\
data class [ModifyResult](index.html)(val result: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, val articleId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0, val fileCount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0, val fileSize: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0, val subject: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, val content: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Content](../../../be.zvz.kotlininside.api.type.content/-content/index.html)&gt; = mutableListOf(), val file: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ArticleModify.FileData](../-file-data/index.html)&gt; = mutableListOf(), val headText: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[HeadText](../../../be.zvz.kotlininside.api.type/-head-text/index.html)&gt; = mutableListOf(), val currentHeadText: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, val cause: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null)



## Constructors


| | |
|---|---|
| [ModifyResult](-modify-result.html) | [jvm]<br>fun [ModifyResult](-modify-result.html)(result: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, articleId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0, fileCount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0, fileSize: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0, subject: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, content: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Content](../../../be.zvz.kotlininside.api.type.content/-content/index.html)&gt; = mutableListOf(), file: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ArticleModify.FileData](../-file-data/index.html)&gt; = mutableListOf(), headText: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[HeadText](../../../be.zvz.kotlininside.api.type/-head-text/index.html)&gt; = mutableListOf(), currentHeadText: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, cause: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) |


## Properties


| Name | Summary |
|---|---|
| [articleId](article-id.html) | [jvm]<br>val [articleId](article-id.html): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0 |
| [cause](cause.html) | [jvm]<br>val [cause](cause.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null |
| [content](content.html) | [jvm]<br>val [content](content.html): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Content](../../../be.zvz.kotlininside.api.type.content/-content/index.html)&gt; |
| [currentHeadText](current-head-text.html) | [jvm]<br>val [currentHeadText](current-head-text.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null |
| [file](file.html) | [jvm]<br>val [file](file.html): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ArticleModify.FileData](../-file-data/index.html)&gt; |
| [fileCount](file-count.html) | [jvm]<br>val [fileCount](file-count.html): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0 |
| [fileSize](file-size.html) | [jvm]<br>val [fileSize](file-size.html): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0 |
| [gallId](gall-id.html) | [jvm]<br>val [gallId](gall-id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null |
| [headText](head-text.html) | [jvm]<br>val [headText](head-text.html): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[HeadText](../../../be.zvz.kotlininside.api.type/-head-text/index.html)&gt; |
| [result](result.html) | [jvm]<br>val [result](result.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [subject](subject.html) | [jvm]<br>val [subject](subject.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null |

