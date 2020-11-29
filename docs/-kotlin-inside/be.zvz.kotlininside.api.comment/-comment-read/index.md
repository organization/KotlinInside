---
title: CommentRead -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.api.comment](../index.md)/[CommentRead](index.md)



# CommentRead  
 [jvm] class [CommentRead](index.md)(**gallId**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **articleId**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **rePage**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))   


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="be.zvz.kotlininside.api.comment/CommentRead.CommentData///PointingToDeclaration/"></a>[CommentData](-comment-data/index.md)| <a name="be.zvz.kotlininside.api.comment/CommentRead.CommentData///PointingToDeclaration/"></a>[jvm]  <br>Content  <br>data class [CommentData](-comment-data/index.md)(**memberIcon**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **ipData**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, **gallerCon**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, **name**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **userId**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **content**: [Comment](../../be.zvz.kotlininside.api.type.comment/-comment/index.md), **identifier**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **dateTime**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **isReply**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **isDeleteFlag**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?)  <br><br><br>
| <a name="be.zvz.kotlininside.api.comment/CommentRead.ReadResult///PointingToDeclaration/"></a>[ReadResult](-read-result/index.md)| <a name="be.zvz.kotlininside.api.comment/CommentRead.ReadResult///PointingToDeclaration/"></a>[jvm]  <br>Content  <br>data class [ReadResult](-read-result/index.md)(**totalComment**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **totalPage**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **rePage**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **commentList**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[CommentRead.CommentData](-comment-data/index.md)>)  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../be.zvz.kotlininside.utils/-string-util/-companion/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1231821796)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open operator fun [equals](../../be.zvz.kotlininside.utils/-string-util/-companion/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1231821796)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="be.zvz.kotlininside.api.comment/CommentRead/get/#/PointingToDeclaration/"></a>[get](get.md)| <a name="be.zvz.kotlininside.api.comment/CommentRead/get/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>fun [get](get.md)(): [CommentRead.ReadResult](-read-result/index.md)  <br>More info  <br>댓글 데이터를 읽어옵니다.  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../be.zvz.kotlininside.utils/-string-util/-companion/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1231821796)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [hashCode](../../be.zvz.kotlininside.utils/-string-util/-companion/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1231821796)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../be.zvz.kotlininside.utils/-string-util/-companion/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1231821796)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [toString](../../be.zvz.kotlininside.utils/-string-util/-companion/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1231821796)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>

