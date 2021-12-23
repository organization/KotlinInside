---
title: AsyncArticleModify
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.api.async.article](../index.html)
/[AsyncArticleModify](index.html)

# AsyncArticleModify

[jvm]\
class [AsyncArticleModify](index.html)(
gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html),
articleId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html),
session: [Session](../../be.zvz.kotlininside.session/-session/index.html))

## Functions

| Name | Summary |
|---|---|
| [modifyAsync](modify-async.html) | [jvm]<br>suspend fun [modifyAsync](modify-async.html)(article: [Article](../../be.zvz.kotlininside.api.type/-article/index.html), fcmToken: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = "N"): Deferred&lt;[ArticleWrite.WriteResult](../../be.zvz.kotlininside.api.article/-article-write/-write-result/index.html)&gt; |
| [modifyInfoAsync](modify-info-async.html) | [jvm]<br>suspend fun [modifyInfoAsync](modify-info-async.html)(): Deferred&lt;[ArticleModify.ModifyResult](../../be.zvz.kotlininside.api.article/-article-modify/-modify-result/index.html)&gt; |

