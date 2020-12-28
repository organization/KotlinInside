---
title: CommentWrite -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.api.comment](../index.md)/[CommentWrite](index.md)



# CommentWrite  
 [jvm] class [CommentWrite](index.md)@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)()constructor(**gallId**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **articleId**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **comment**: [Comment](../../be.zvz.kotlininside.api.type.comment/-comment/index.md), **session**: [Session](../../be.zvz.kotlininside.session/-session/index.md), **fcmToken**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))   


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="be.zvz.kotlininside.api.comment/CommentWrite.WriteResult///PointingToDeclaration/"></a>[WriteResult](-write-result/index.md)| <a name="be.zvz.kotlininside.api.comment/CommentWrite.WriteResult///PointingToDeclaration/"></a>[jvm]  <br>Content  <br>data class [WriteResult](-write-result/index.md)(**result**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **data**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)?, **cause**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, **word**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?)  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../be.zvz.kotlininside.utils/-string-util/-companion/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F49489957)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open operator fun [equals](../../be.zvz.kotlininside.utils/-string-util/-companion/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F49489957)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../be.zvz.kotlininside.utils/-string-util/-companion/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F49489957)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [hashCode](../../be.zvz.kotlininside.utils/-string-util/-companion/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F49489957)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="be.zvz.kotlininside.api.comment/CommentWrite/reply/#kotlin.Int/PointingToDeclaration/"></a>[reply](reply.md)| <a name="be.zvz.kotlininside.api.comment/CommentWrite/reply/#kotlin.Int/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>fun [reply](reply.md)(commentId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [CommentWrite.WriteResult](-write-result/index.md)  <br>More info  <br>대댓글을 작성합니다.  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../be.zvz.kotlininside.utils/-string-util/-companion/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F49489957)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [toString](../../be.zvz.kotlininside.utils/-string-util/-companion/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F49489957)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| <a name="be.zvz.kotlininside.api.comment/CommentWrite/write/#/PointingToDeclaration/"></a>[write](write.md)| <a name="be.zvz.kotlininside.api.comment/CommentWrite/write/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>fun [write](write.md)(): [CommentWrite.WriteResult](-write-result/index.md)  <br>More info  <br>댓글을 작성합니다.  <br><br><br>

