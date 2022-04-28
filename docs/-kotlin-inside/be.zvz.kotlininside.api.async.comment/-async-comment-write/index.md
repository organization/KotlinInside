---
title: AsyncCommentWrite
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.api.async.comment](../index.html)/[AsyncCommentWrite](index.html)



# AsyncCommentWrite



[jvm]\
class [AsyncCommentWrite](index.html)@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)constructor(gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), articleId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), comment: [Comment](../../be.zvz.kotlininside.api.type.comment/-comment/index.html), session: [Session](../../be.zvz.kotlininside.session/-session/index.html), fcmToken: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = KotlinInside.getInstance().auth.fcmToken)



## Constructors


| | |
|---|---|
| [AsyncCommentWrite](-async-comment-write.html) | [jvm]<br>@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)<br>fun [AsyncCommentWrite](-async-comment-write.html)(gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), articleId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), comment: [Comment](../../be.zvz.kotlininside.api.type.comment/-comment/index.html), session: [Session](../../be.zvz.kotlininside.session/-session/index.html), fcmToken: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = KotlinInside.getInstance().auth.fcmToken) |


## Functions


| Name | Summary |
|---|---|
| [replyAsync](reply-async.html) | [jvm]<br>suspend fun [replyAsync](reply-async.html)(commentId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): Deferred&lt;[CommentWrite.WriteResult](../../be.zvz.kotlininside.api.comment/-comment-write/-write-result/index.html)&gt; |
| [writeAsync](write-async.html) | [jvm]<br>suspend fun [writeAsync](write-async.html)(): Deferred&lt;[CommentWrite.WriteResult](../../be.zvz.kotlininside.api.comment/-comment-write/-write-result/index.html)&gt; |

