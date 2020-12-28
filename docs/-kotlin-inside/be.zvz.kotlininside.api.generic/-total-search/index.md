---
title: TotalSearch -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.api.generic](../index.md)/[TotalSearch](index.md)



# TotalSearch  
 [jvm] class [TotalSearch](index.md)(**keyword**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))   


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="be.zvz.kotlininside.api.generic/TotalSearch.RealTime///PointingToDeclaration/"></a>[RealTime](-real-time/index.md)| <a name="be.zvz.kotlininside.api.generic/TotalSearch.RealTime///PointingToDeclaration/"></a>[jvm]  <br>Content  <br>data class [RealTime](-real-time/index.md)(**rank**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **title**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **url**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br><br><br>
| <a name="be.zvz.kotlininside.api.generic/TotalSearch.SearchedArticle///PointingToDeclaration/"></a>[SearchedArticle](-searched-article/index.md)| <a name="be.zvz.kotlininside.api.generic/TotalSearch.SearchedArticle///PointingToDeclaration/"></a>[jvm]  <br>Content  <br>data class [SearchedArticle](-searched-article/index.md)(**title**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **content**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **gallId**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **gallName**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **articleId**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **regDate**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br><br><br>
| <a name="be.zvz.kotlininside.api.generic/TotalSearch.TotalSearchResult///PointingToDeclaration/"></a>[TotalSearchResult](-total-search-result/index.md)| <a name="be.zvz.kotlininside.api.generic/TotalSearch.TotalSearchResult///PointingToDeclaration/"></a>[jvm]  <br>Content  <br>data class [TotalSearchResult](-total-search-result/index.md)(**mainGallery**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Gallery](../../be.zvz.kotlininside.api.type/-gallery/index.md)>, **minorGallery**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Gallery](../../be.zvz.kotlininside.api.type/-gallery/index.md)>, **wiki**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[TotalSearch.Wiki](-wiki/index.md)>, **board**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[TotalSearch.SearchedArticle](-searched-article/index.md)>, **todayIssue**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[TotalSearch.SearchedArticle](-searched-article/index.md)>, **realTime**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[TotalSearch.RealTime](-real-time/index.md)>)  <br><br><br>
| <a name="be.zvz.kotlininside.api.generic/TotalSearch.Wiki///PointingToDeclaration/"></a>[Wiki](-wiki/index.md)| <a name="be.zvz.kotlininside.api.generic/TotalSearch.Wiki///PointingToDeclaration/"></a>[jvm]  <br>Content  <br>data class [Wiki](-wiki/index.md)(**title**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **gallName**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **url**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../be.zvz.kotlininside.utils/-string-util/-companion/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F49489957)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open operator fun [equals](../../be.zvz.kotlininside.utils/-string-util/-companion/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F49489957)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../be.zvz.kotlininside.utils/-string-util/-companion/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F49489957)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [hashCode](../../be.zvz.kotlininside.utils/-string-util/-companion/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F49489957)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="be.zvz.kotlininside.api.generic/TotalSearch/search/#/PointingToDeclaration/"></a>[search](search.md)| <a name="be.zvz.kotlininside.api.generic/TotalSearch/search/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>fun [search](search.md)(): [TotalSearch.TotalSearchResult](-total-search-result/index.md)  <br>More info  <br>통합 검색을 실행하고, 검색 결과를 받아옵니다.  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../be.zvz.kotlininside.utils/-string-util/-companion/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F49489957)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [toString](../../be.zvz.kotlininside.utils/-string-util/-companion/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F49489957)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>

