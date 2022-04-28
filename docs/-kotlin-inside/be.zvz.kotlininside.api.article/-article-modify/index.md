---
title: ArticleModify
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.api.article](../index.html)/[ArticleModify](index.html)



# ArticleModify



[jvm]\
class [ArticleModify](index.html)(gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), articleId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), session: [Session](../../be.zvz.kotlininside.session/-session/index.html))



## Constructors


| | |
|---|---|
| [ArticleModify](-article-modify.html) | [jvm]<br>fun [ArticleModify](-article-modify.html)(gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), articleId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), session: [Session](../../be.zvz.kotlininside.session/-session/index.html)) |


## Types


| Name | Summary |
|---|---|
| [FileData](-file-data/index.html) | [jvm]<br>data class [FileData](-file-data/index.html)(val block: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val fileSize: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [ModifyResult](-modify-result/index.html) | [jvm]<br>data class [ModifyResult](-modify-result/index.html)(val result: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, val articleId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0, val fileCount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0, val fileSize: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0, val subject: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, val content: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Content](../../be.zvz.kotlininside.api.type.content/-content/index.html)&gt; = mutableListOf(), val file: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ArticleModify.FileData](-file-data/index.html)&gt; = mutableListOf(), val headText: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[HeadText](../../be.zvz.kotlininside.api.type/-head-text/index.html)&gt; = mutableListOf(), val currentHeadText: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, val cause: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) |


## Functions


| Name | Summary |
|---|---|
| [modify](modify.html) | [jvm]<br>@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)<br>fun [modify](modify.html)(article: [Article](../../be.zvz.kotlininside.api.type/-article/index.html), fcmToken: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = &quot;N&quot;): [ArticleWrite.WriteResult](../-article-write/-write-result/index.html) |
| [modifyInfo](modify-info.html) | [jvm]<br>fun [modifyInfo](modify-info.html)(): [ArticleModify.ModifyResult](-modify-result/index.html) |

