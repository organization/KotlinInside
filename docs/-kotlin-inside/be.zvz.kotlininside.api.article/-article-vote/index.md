---
title: ArticleVote
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.api.article](../index.html)/[ArticleVote](index.html)

# ArticleVote

[jvm]\
class [ArticleVote](index.html)(gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)
, articleId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html),
session: [Session](../../be.zvz.kotlininside.session/-session/index.html))

## Types

| Name | Summary |
|---|---|
| [VoteResult](-vote-result/index.html) | [jvm]<br>data class [VoteResult](-vote-result/index.html)(result: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), cause: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), member: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)?) |

## Functions

| Name | Summary |
|---|---|
| [downvote](downvote.html) | [jvm]<br>fun [downvote](downvote.html)(): [ArticleVote.VoteResult](-vote-result/index.html)<br>글을 비추천합니다. |
| [upvote](upvote.html) | [jvm]<br>fun [upvote](upvote.html)(): [ArticleVote.VoteResult](-vote-result/index.html)<br>글을 추천합니다. |

