---
title: CommentRead
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.api.comment](../index.html)/[CommentRead](index.html)



# CommentRead



[jvm]\
class [CommentRead](index.html)(gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), articleId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), rePage: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))



## Constructors


| | |
|---|---|
| [CommentRead](-comment-read.html) | [jvm]<br>fun [CommentRead](-comment-read.html)(gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), articleId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), rePage: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Types


| Name | Summary |
|---|---|
| [CommentData](-comment-data/index.html) | [jvm]<br>data class [CommentData](-comment-data/index.html)(val memberIcon: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val ipData: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, val gallerCon: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val userId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val content: [Comment](../../be.zvz.kotlininside.api.type.comment/-comment/index.html), val identifier: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val dateTime: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val isReply: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val isDeleteFlag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?) |
| [ReadResult](-read-result/index.html) | [jvm]<br>data class [ReadResult](-read-result/index.html)(val totalComment: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val totalPage: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val rePage: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val commentList: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[CommentRead.CommentData](-comment-data/index.html)&gt;) |


## Functions


| Name | Summary |
|---|---|
| [request](request.html) | [jvm]<br>fun [request](request.html)(): [CommentRead.ReadResult](-read-result/index.html)<br>댓글 데이터를 읽어옵니다. |

