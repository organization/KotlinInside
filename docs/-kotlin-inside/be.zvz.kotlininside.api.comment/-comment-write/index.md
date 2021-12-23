---
title: CommentWrite
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.api.comment](../index.html)/[CommentWrite](index.html)



# CommentWrite



[jvm]\
class [CommentWrite](index.html)@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)constructor(gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), articleId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), comment: [Comment](../../be.zvz.kotlininside.api.type.comment/-comment/index.html), session: [Session](../../be.zvz.kotlininside.session/-session/index.html), fcmToken: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))



## Types


| Name | Summary |
|---|---|
| [WriteResult](-write-result/index.html) | [jvm]<br>data class [WriteResult](-write-result/index.html)(result: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), data: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)?, cause: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, word: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?) |


## Functions


| Name | Summary |
|---|---|
| [reply](reply.html) | [jvm]<br>fun [reply](reply.html)(commentId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [CommentWrite.WriteResult](-write-result/index.html)<br>대댓글을 작성합니다. |
| [write](write.html) | [jvm]<br>fun [write](write.html)(): [CommentWrite.WriteResult](-write-result/index.html)<br>댓글을 작성합니다. |

