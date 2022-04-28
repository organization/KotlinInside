---
title: ArticleWrite
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.api.article](../index.html)/[ArticleWrite](index.html)



# ArticleWrite



[jvm]\
class [ArticleWrite](index.html)



## Constructors


| | |
|---|---|
| [ArticleWrite](-article-write.html) | [jvm]<br>@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)<br>fun [ArticleWrite](-article-write.html)(gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), article: [Article](../../be.zvz.kotlininside.api.type/-article/index.html), session: [Session](../../be.zvz.kotlininside.session/-session/index.html), fcmToken: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = KotlinInside.getInstance().auth.fcmToken) |


## Types


| Name | Summary |
|---|---|
| [WriteResult](-write-result/index.html) | [jvm]<br>data class [WriteResult](-write-result/index.html)(val result: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val articleId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)? = null, val cause: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, val id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) |


## Functions


| Name | Summary |
|---|---|
| [write](write.html) | [jvm]<br>fun [write](write.html)(): [ArticleWrite.WriteResult](-write-result/index.html)<br>글을 작성합니다. |

