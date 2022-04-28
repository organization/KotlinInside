---
title: AsyncCommentDelete
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.api.async.comment](../index.html)/[AsyncCommentDelete](index.html)



# AsyncCommentDelete



[jvm]\
class [AsyncCommentDelete](index.html)@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)constructor(gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), articleId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), commentId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), session: [Session](../../be.zvz.kotlininside.session/-session/index.html), fcmToken: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = KotlinInside.getInstance().auth.fcmToken)



## Constructors


| | |
|---|---|
| [AsyncCommentDelete](-async-comment-delete.html) | [jvm]<br>@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)<br>fun [AsyncCommentDelete](-async-comment-delete.html)(gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), articleId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), commentId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), session: [Session](../../be.zvz.kotlininside.session/-session/index.html), fcmToken: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = KotlinInside.getInstance().auth.fcmToken) |


## Functions


| Name | Summary |
|---|---|
| [deleteAsync](delete-async.html) | [jvm]<br>suspend fun [deleteAsync](delete-async.html)(): Deferred&lt;[CommentDelete.DeleteResult](../../be.zvz.kotlininside.api.comment/-comment-delete/-delete-result/index.html)&gt; |

