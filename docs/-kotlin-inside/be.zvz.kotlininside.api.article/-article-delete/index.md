---
title: ArticleDelete
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.api.article](../index.html)/[ArticleDelete](index.html)

# ArticleDelete

[jvm]\
class [ArticleDelete](index.html)
@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)()constructor(**gallId**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)
, **articleId**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **
session**: [Session](../../be.zvz.kotlininside.session/-session/index.html), **
fcmToken**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))

## Types

| Name | Summary |
|---|---|
| [DeleteResult](-delete-result/index.html) | [jvm]<br>data class [DeleteResult](-delete-result/index.html)(**
result**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **
cause**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, **
message**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, **
status**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)?) |

## Functions

| Name | Summary |
|---|---|
| [delete](delete.html) | [jvm]<br>fun [delete](delete.html)(): [ArticleDelete.DeleteResult](-delete-result/index.html)<br>글을 삭제합니다. |

