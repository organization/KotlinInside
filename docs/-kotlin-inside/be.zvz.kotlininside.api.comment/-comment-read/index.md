---
title: CommentRead
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.api.comment](../index.html)/[CommentRead](index.html)

# CommentRead

[jvm]\
class [CommentRead](index.html)(**
gallId**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **
articleId**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **
rePage**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))

## Types

| Name | Summary |
|---|---|
| [CommentData](-comment-data/index.html) | [jvm]<br>data class [CommentData](-comment-data/index.html)(**
memberIcon**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **
ipData**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, **
gallerCon**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, **
name**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **
userId**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **
content**: [Comment](../../be.zvz.kotlininside.api.type.comment/-comment/index.html), **
identifier**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **
dateTime**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **
isReply**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **
isDeleteFlag**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?) |
| [ReadResult](-read-result/index.html) | [jvm]<br>data class [ReadResult](-read-result/index.html)(**
totalComment**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **
totalPage**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **
rePage**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **
commentList**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[CommentRead.CommentData](-comment-data/index.html)>) |

## Functions

| Name | Summary |
|---|---|
| [request](request.html) | [jvm]<br>fun [request](request.html)(): [CommentRead.ReadResult](-read-result/index.html)<br>댓글 데이터를 읽어옵니다. |

