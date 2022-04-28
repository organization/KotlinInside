---
title: AsyncArticleRead
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.api.async.article](../index.html)/[AsyncArticleRead](index.html)



# AsyncArticleRead



[jvm]\
class [AsyncArticleRead](index.html)@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)constructor(gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), articleId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), session: [Session](../../be.zvz.kotlininside.session/-session/index.html)? = null)



## Constructors


| | |
|---|---|
| [AsyncArticleRead](-async-article-read.html) | [jvm]<br>@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)<br>fun [AsyncArticleRead](-async-article-read.html)(gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), articleId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), session: [Session](../../be.zvz.kotlininside.session/-session/index.html)? = null) |


## Functions


| Name | Summary |
|---|---|
| [getViewInfoAsync](get-view-info-async.html) | [jvm]<br>suspend fun [getViewInfoAsync](get-view-info-async.html)(): Deferred&lt;[ArticleRead.ViewInfo](../../be.zvz.kotlininside.api.article/-article-read/-view-info/index.html)&gt; |
| [getViewMainAsync](get-view-main-async.html) | [jvm]<br>suspend fun [getViewMainAsync](get-view-main-async.html)(): Deferred&lt;[ArticleRead.ViewMain](../../be.zvz.kotlininside.api.article/-article-read/-view-main/index.html)&gt; |
| [requestAsync](request-async.html) | [jvm]<br>suspend fun [requestAsync](request-async.html)(): Deferred&lt;[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)&gt; |

