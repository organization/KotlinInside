---
title: CommentDelete
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.api.comment](../index.html)/[CommentDelete](index.html)

# CommentDelete

[jvm]\
class [CommentDelete](index.html)
@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)()constructor(**gallId**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)
, **articleId**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **
commentId**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **
session**: [Session](../../be.zvz.kotlininside.session/-session/index.html), **
fcmToken**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))

## Types

| Name | Summary |
|---|---|
| [DeleteResult](-delete-result/index.html) | [jvm]<br>data class [DeleteResult](-delete-result/index.html)(**
result**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **
cause**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?) |

## Functions

| Name | Summary |
|---|---|
| [delete](delete.html) | [jvm]<br>fun [delete](delete.html)(): [CommentDelete.DeleteResult](-delete-result/index.html)<br>댓글을 삭제합니다. |

