---
title: ArticleWrite -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.api.article](../index.md)/[ArticleWrite](index.md)



# ArticleWrite  
 [jvm] class [ArticleWrite](index.md)   


## Constructors  
  
|  Name|  Summary| 
|---|---|
| <a name="be.zvz.kotlininside.api.article/ArticleWrite/ArticleWrite/#kotlin.String#be.zvz.kotlininside.api.type.Article#be.zvz.kotlininside.session.Session#kotlin.String/PointingToDeclaration/"></a>[ArticleWrite](-article-write.md)| <a name="be.zvz.kotlininside.api.article/ArticleWrite/ArticleWrite/#kotlin.String#be.zvz.kotlininside.api.type.Article#be.zvz.kotlininside.session.Session#kotlin.String/PointingToDeclaration/"></a> [jvm] @[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)()  <br>  <br>fun [ArticleWrite](-article-write.md)(gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), article: [Article](../../be.zvz.kotlininside.api.type/-article/index.md), session: [Session](../../be.zvz.kotlininside.session/-session/index.md), fcmToken: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = Const.DEFAULT_FCM_TOKEN)   <br>


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="be.zvz.kotlininside.api.article/ArticleWrite.WriteResult///PointingToDeclaration/"></a>[WriteResult](-write-result/index.md)| <a name="be.zvz.kotlininside.api.article/ArticleWrite.WriteResult///PointingToDeclaration/"></a>[jvm]  <br>Content  <br>data class [WriteResult](-write-result/index.md)(**result**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **articleId**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)?, **cause**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, **id**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?)  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../be.zvz.kotlininside.utils/-string-util/-companion/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F49489957)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open operator fun [equals](../../be.zvz.kotlininside.utils/-string-util/-companion/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F49489957)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../be.zvz.kotlininside.utils/-string-util/-companion/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F49489957)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [hashCode](../../be.zvz.kotlininside.utils/-string-util/-companion/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F49489957)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../be.zvz.kotlininside.utils/-string-util/-companion/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F49489957)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [toString](../../be.zvz.kotlininside.utils/-string-util/-companion/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F49489957)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| <a name="be.zvz.kotlininside.api.article/ArticleWrite/write/#/PointingToDeclaration/"></a>[write](write.md)| <a name="be.zvz.kotlininside.api.article/ArticleWrite/write/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>fun [write](write.md)(): [ArticleWrite.WriteResult](-write-result/index.md)  <br>More info  <br>글을 작성합니다.  <br><br><br>

