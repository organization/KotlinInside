---
title: ArticleHitUpvote
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.api.article](../index.html)/[ArticleHitUpvote](index.html)



# ArticleHitUpvote



[jvm]\
class [ArticleHitUpvote](index.html)(gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), articleId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), session: [Session](../../be.zvz.kotlininside.session/-session/index.html))



## Constructors


| | |
|---|---|
| [ArticleHitUpvote](-article-hit-upvote.html) | [jvm]<br>fun [ArticleHitUpvote](-article-hit-upvote.html)(gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), articleId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), session: [Session](../../be.zvz.kotlininside.session/-session/index.html)) |


## Types


| Name | Summary |
|---|---|
| [HitUpvoteResult](-hit-upvote-result/index.html) | [jvm]<br>data class [HitUpvoteResult](-hit-upvote-result/index.html)(val result: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val cause: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) |


## Functions


| Name | Summary |
|---|---|
| [upvote](upvote.html) | [jvm]<br>fun [upvote](upvote.html)(): [ArticleHitUpvote.HitUpvoteResult](-hit-upvote-result/index.html)<br>글을 힛갤 추천합니다. |

