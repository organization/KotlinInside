---
title: ArticleWrite -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.api.article](../index.md)/[ArticleWrite](index.md)



# ArticleWrite  
 [jvm] class [ArticleWrite](index.md)   


## Constructors  
  
|  Name|  Summary| 
|---|---|
| [ArticleWrite](-article-write.md)|  [jvm] @[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)()  <br>  <br>fun [ArticleWrite](-article-write.md)(gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), article: [Article](../../be.zvz.kotlininside.api.type/-article/index.md), session: [Session](../../be.zvz.kotlininside.session/-session/index.md), fcmToken: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))   <br>


## Types  
  
|  Name|  Summary| 
|---|---|
| [WriteResult](-write-result/index.md)| [jvm]  <br>Content  <br>data class [WriteResult](-write-result/index.md)(**result**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **articleId**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)?, **cause**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, **id**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?)  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| [equals](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html)| [jvm]  <br>Content  <br>open operator override fun [equals](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| [hashCode](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/hash-code.html)| [jvm]  <br>Content  <br>open override fun [hashCode](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/hash-code.html)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| [toString](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/to-string.html)| [jvm]  <br>Content  <br>open override fun [toString](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/to-string.html)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| [write](write.md)| [jvm]  <br>Brief description  <br><br><br>글을 작성합니다.<br><br>  <br>Content  <br>fun [write](write.md)(): [ArticleWrite.WriteResult](-write-result/index.md)  <br><br><br>

