---
title: TotalSearch -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.api.generic](../index.md)/[TotalSearch](index.md)



# TotalSearch  
 [jvm] class [TotalSearch](index.md)(**keyword**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))   


## Types  
  
|  Name|  Summary| 
|---|---|
| [RealTime](-real-time/index.md)| [jvm]  <br>Content  <br>data class [RealTime](-real-time/index.md)(**rank**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **title**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **url**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br><br><br>
| [SearchedArticle](-searched-article/index.md)| [jvm]  <br>Content  <br>data class [SearchedArticle](-searched-article/index.md)(**title**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **content**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **gallId**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **gallName**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **articleId**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **regDate**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br><br><br>
| [TotalSearchResult](-total-search-result/index.md)| [jvm]  <br>Content  <br>data class [TotalSearchResult](-total-search-result/index.md)(**mainGallery**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Gallery](../../be.zvz.kotlininside.api.type/-gallery/index.md)>, **minorGallery**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Gallery](../../be.zvz.kotlininside.api.type/-gallery/index.md)>, **wiki**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[TotalSearch.Wiki](-wiki/index.md)>, **board**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[TotalSearch.SearchedArticle](-searched-article/index.md)>, **todayIssue**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[TotalSearch.SearchedArticle](-searched-article/index.md)>, **realTime**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[TotalSearch.RealTime](-real-time/index.md)>)  <br><br><br>
| [Wiki](-wiki/index.md)| [jvm]  <br>Content  <br>data class [Wiki](-wiki/index.md)(**title**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **gallName**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **url**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| [equals](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html)| [jvm]  <br>Content  <br>open operator override fun [equals](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| [hashCode](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/hash-code.html)| [jvm]  <br>Content  <br>open override fun [hashCode](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/hash-code.html)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| [search](search.md)| [jvm]  <br>Brief description  <br><br><br>통합 검색을 실행하고, 검색 결과를 받아옵니다.<br><br>  <br>Content  <br>fun [search](search.md)(): [TotalSearch.TotalSearchResult](-total-search-result/index.md)  <br><br><br>
| [toString](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/to-string.html)| [jvm]  <br>Content  <br>open override fun [toString](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/to-string.html)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>

