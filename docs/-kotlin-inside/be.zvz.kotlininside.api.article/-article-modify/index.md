---
title: ArticleModify -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.api.article](../index.md)/[ArticleModify](index.md)



# ArticleModify  
 [jvm] class [ArticleModify](index.md)(**gallId**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **articleId**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **session**: [Session](../../be.zvz.kotlininside.session/-session/index.md))   


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="be.zvz.kotlininside.api.article/ArticleModify.FileData///PointingToDeclaration/"></a>[FileData](-file-data/index.md)| <a name="be.zvz.kotlininside.api.article/ArticleModify.FileData///PointingToDeclaration/"></a>[jvm]  <br>Content  <br>data class [FileData](-file-data/index.md)(**block**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **fileSize**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br><br><br>
| <a name="be.zvz.kotlininside.api.article/ArticleModify.ModifyResult///PointingToDeclaration/"></a>[ModifyResult](-modify-result/index.md)| <a name="be.zvz.kotlininside.api.article/ArticleModify.ModifyResult///PointingToDeclaration/"></a>[jvm]  <br>Content  <br>data class [ModifyResult](-modify-result/index.md)(**result**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **gallId**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, **articleId**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **fileCount**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **fileSize**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **subject**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, **content**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Content](../../be.zvz.kotlininside.api.type.content/-content/index.md)>, **file**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[ArticleModify.FileData](-file-data/index.md)>, **headText**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[HeadText](../../be.zvz.kotlininside.api.type/-head-text/index.md)>, **currentHeadText**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, **cause**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?)  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../be.zvz.kotlininside.utils/-string-util/-companion/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1231821796)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open operator fun [equals](../../be.zvz.kotlininside.utils/-string-util/-companion/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1231821796)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../be.zvz.kotlininside.utils/-string-util/-companion/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1231821796)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [hashCode](../../be.zvz.kotlininside.utils/-string-util/-companion/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1231821796)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="be.zvz.kotlininside.api.article/ArticleModify/modify/#be.zvz.kotlininside.api.type.Article#kotlin.String/PointingToDeclaration/"></a>[modify](modify.md)| <a name="be.zvz.kotlininside.api.article/ArticleModify/modify/#be.zvz.kotlininside.api.type.Article#kotlin.String/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)()  <br>  <br>fun [modify](modify.md)(article: [Article](../../be.zvz.kotlininside.api.type/-article/index.md), fcmToken: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = "N"): [ArticleWrite.WriteResult](../-article-write/-write-result/index.md)  <br><br><br>
| <a name="be.zvz.kotlininside.api.article/ArticleModify/modifyInfo/#/PointingToDeclaration/"></a>[modifyInfo](modify-info.md)| <a name="be.zvz.kotlininside.api.article/ArticleModify/modifyInfo/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>fun [modifyInfo](modify-info.md)(): [ArticleModify.ModifyResult](-modify-result/index.md)  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../be.zvz.kotlininside.utils/-string-util/-companion/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1231821796)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [toString](../../be.zvz.kotlininside.utils/-string-util/-companion/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1231821796)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>

