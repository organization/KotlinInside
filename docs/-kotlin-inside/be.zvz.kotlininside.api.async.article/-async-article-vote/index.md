---
title: AsyncArticleVote
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.api.async.article](../index.html)/[AsyncArticleVote](index.html)



# AsyncArticleVote



[jvm]\
class [AsyncArticleVote](index.html)(gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), articleId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), session: [Session](../../be.zvz.kotlininside.session/-session/index.html))



## Constructors


| | |
|---|---|
| [AsyncArticleVote](-async-article-vote.html) | [jvm]<br>fun [AsyncArticleVote](-async-article-vote.html)(gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), articleId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), session: [Session](../../be.zvz.kotlininside.session/-session/index.html)) |


## Functions


| Name | Summary |
|---|---|
| [downvoteAsync](downvote-async.html) | [jvm]<br>suspend fun [downvoteAsync](downvote-async.html)(): Deferred&lt;[ArticleVote.VoteResult](../../be.zvz.kotlininside.api.article/-article-vote/-vote-result/index.html)&gt; |
| [upvoteAsync](upvote-async.html) | [jvm]<br>suspend fun [upvoteAsync](upvote-async.html)(): Deferred&lt;[ArticleVote.VoteResult](../../be.zvz.kotlininside.api.article/-article-vote/-vote-result/index.html)&gt; |

