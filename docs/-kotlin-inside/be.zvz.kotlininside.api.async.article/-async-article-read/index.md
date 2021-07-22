---
title: AsyncArticleRead
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.api.async.article](../index.html)
/[AsyncArticleRead](index.html)

# AsyncArticleRead

[jvm]\
class [AsyncArticleRead](index.html)
@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)()constructor(**gallId**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)
, **articleId**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **
session**: [Session](../../be.zvz.kotlininside.session/-session/index.html)?)

## Functions

| Name | Summary |
|---|---|
| [getViewInfoAsync](get-view-info-async.html) | [jvm]<br>suspend fun [getViewInfoAsync](get-view-info-async.html)(): Deferred<[ArticleRead.ViewInfo](../../be.zvz.kotlininside.api.article/-article-read/-view-info/index.html)> |
| [getViewMainAsync](get-view-main-async.html) | [jvm]<br>suspend fun [getViewMainAsync](get-view-main-async.html)(): Deferred<[ArticleRead.ViewMain](../../be.zvz.kotlininside.api.article/-article-read/-view-main/index.html)> |
| [requestAsync](request-async.html) | [jvm]<br>suspend fun [requestAsync](request-async.html)(): Deferred<[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)> |

