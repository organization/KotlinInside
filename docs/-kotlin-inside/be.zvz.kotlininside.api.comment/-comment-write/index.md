---
title: CommentWrite -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.api.comment](../index.md)/[CommentWrite](index.md)



# CommentWrite  
 [jvm] class [CommentWrite](index.md)@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)()constructor(**gallId**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **articleId**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **comment**: [Comment](../../be.zvz.kotlininside.api.type.comment/-comment/index.md), **session**: [Session](../../be.zvz.kotlininside.session/-session/index.md), **fcmToken**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))   


## Types  
  
|  Name|  Summary| 
|---|---|
| [WriteResult](-write-result/index.md)| [jvm]  <br>Content  <br>data class [WriteResult](-write-result/index.md)(**result**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **data**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)?, **cause**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, **word**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?)  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| [equals](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html)| [jvm]  <br>Content  <br>open operator override fun [equals](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| [hashCode](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/hash-code.html)| [jvm]  <br>Content  <br>open override fun [hashCode](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/hash-code.html)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| [reply](reply.md)| [jvm]  <br>Brief description  <br><br><br>대댓글을 작성합니다.<br><br>  <br>Content  <br>fun [reply](reply.md)(commentId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [CommentWrite.WriteResult](-write-result/index.md)  <br><br><br>
| [toString](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/to-string.html)| [jvm]  <br>Content  <br>open override fun [toString](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/to-string.html)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| [write](write.md)| [jvm]  <br>Brief description  <br><br><br>댓글을 작성합니다.<br><br>  <br>Content  <br>fun [write](write.md)(): [CommentWrite.WriteResult](-write-result/index.md)  <br><br><br>

