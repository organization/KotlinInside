---
title: ArticleModify
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.api.article](../index.html)/[ArticleModify](index.html)

# ArticleModify

[jvm]\
class [ArticleModify](index.html)(**
gallId**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **
articleId**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **
session**: [Session](../../be.zvz.kotlininside.session/-session/index.html))

## Types

| Name | Summary |
|---|---|
| [FileData](-file-data/index.html) | [jvm]<br>data class [FileData](-file-data/index.html)(**
block**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **
fileSize**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [ModifyResult](-modify-result/index.html) | [jvm]<br>data class [ModifyResult](-modify-result/index.html)(**
result**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **
gallId**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, **
articleId**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **
fileCount**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **
fileSize**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **
subject**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, **
content**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Content](../../be.zvz.kotlininside.api.type.content/-content/index.html)>, **
file**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[ArticleModify.FileData](-file-data/index.html)>, **
headText**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[HeadText](../../be.zvz.kotlininside.api.type/-head-text/index.html)>, **
currentHeadText**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, **
cause**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?) |

## Functions

| Name | Summary |
|---|---|
| [modify](modify.html) | [jvm]<br>@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)()<br>fun [modify](modify.html)(article: [Article](../../be.zvz.kotlininside.api.type/-article/index.html), fcmToken: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = "N"): [ArticleWrite.WriteResult](../-article-write/-write-result/index.html) |
| [modifyInfo](modify-info.html) | [jvm]<br>fun [modifyInfo](modify-info.html)(): [ArticleModify.ModifyResult](-modify-result/index.html) |

