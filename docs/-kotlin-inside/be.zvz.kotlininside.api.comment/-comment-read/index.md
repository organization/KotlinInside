---
title: CommentRead -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.api.comment](../index.md)/[CommentRead](index.md)



# CommentRead  
 [jvm] class [CommentRead](index.md)(**gallId**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **articleId**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **rePage**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))   


## Types  
  
|  Name|  Summary| 
|---|---|
| [CommentData](-comment-data/index.md)| [jvm]  <br>Content  <br>data class [CommentData](-comment-data/index.md)(**memberIcon**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **ipData**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, **gallerCon**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, **name**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **userId**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **content**: [Comment](../../be.zvz.kotlininside.api.type.comment/-comment/index.md), **identifier**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **dateTime**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **isDeleteFlag**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?)  <br><br><br>
| [ReadResult](-read-result/index.md)| [jvm]  <br>Content  <br>data class [ReadResult](-read-result/index.md)(**totalComment**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **totalPage**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **rePage**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **commentList**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[CommentRead.CommentData](-comment-data/index.md)>)  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| [equals](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html)| [jvm]  <br>Content  <br>open operator override fun [equals](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| [get](get.md)| [jvm]  <br>Brief description  <br><br><br>댓글 데이터를 읽어옵니다.<br><br>  <br>Content  <br>fun [get](get.md)(): [CommentRead.ReadResult](-read-result/index.md)  <br><br><br>
| [hashCode](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/hash-code.html)| [jvm]  <br>Content  <br>open override fun [hashCode](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/hash-code.html)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| [toString](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/to-string.html)| [jvm]  <br>Content  <br>open override fun [toString](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/to-string.html)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>

