---
title: ArticleVote -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.api.article](../index.md)/[ArticleVote](index.md)



# ArticleVote  
 [jvm] class [ArticleVote](index.md)(**gallId**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **articleId**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **session**: [Session](../../be.zvz.kotlininside.session/-session/index.md))   


## Types  
  
|  Name|  Summary| 
|---|---|
| [VoteResult](-vote-result/index.md)| [jvm]  <br>Content  <br>data class [VoteResult](-vote-result/index.md)(**result**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **cause**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **member**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)?)  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| [downvote](downvote.md)| [jvm]  <br>Brief description  <br><br><br>글을 비추천합니다.<br><br>  <br>Content  <br>fun [downvote](downvote.md)(): [ArticleVote.VoteResult](-vote-result/index.md)  <br><br><br>
| [equals](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html)| [jvm]  <br>Content  <br>open operator override fun [equals](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| [hashCode](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/hash-code.html)| [jvm]  <br>Content  <br>open override fun [hashCode](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/hash-code.html)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| [toString](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/to-string.html)| [jvm]  <br>Content  <br>open override fun [toString](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/to-string.html)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| [upvote](upvote.md)| [jvm]  <br>Brief description  <br><br><br>글을 추천합니다.<br><br>  <br>Content  <br>fun [upvote](upvote.md)(): [ArticleVote.VoteResult](-vote-result/index.md)  <br><br><br>

