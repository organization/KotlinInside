---
title: AsyncCommentWrite
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.api.async.comment](../index.html)
/[AsyncCommentWrite](index.html)

# AsyncCommentWrite

[jvm]\
class [AsyncCommentWrite](index.html)
@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)()constructor(**gallId**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)
, **articleId**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **
comment**: [Comment](../../be.zvz.kotlininside.api.type.comment/-comment/index.html), **
session**: [Session](../../be.zvz.kotlininside.session/-session/index.html), **
fcmToken**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))

## Functions

| Name | Summary |
|---|---|
| [replyAsync](reply-async.html) | [jvm]<br>suspend fun [replyAsync](reply-async.html)(commentId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): Deferred<[CommentWrite.WriteResult](../../be.zvz.kotlininside.api.comment/-comment-write/-write-result/index.html)> |
| [writeAsync](write-async.html) | [jvm]<br>suspend fun [writeAsync](write-async.html)(): Deferred<[CommentWrite.WriteResult](../../be.zvz.kotlininside.api.comment/-comment-write/-write-result/index.html)> |

