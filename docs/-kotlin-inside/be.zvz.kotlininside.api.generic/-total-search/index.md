---
title: TotalSearch
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.api.generic](../index.html)/[TotalSearch](index.html)



# TotalSearch



[jvm]\
class [TotalSearch](index.html)(keyword: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))



## Constructors


| | |
|---|---|
| [TotalSearch](-total-search.html) | [jvm]<br>fun [TotalSearch](-total-search.html)(keyword: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |


## Types


| Name | Summary |
|---|---|
| [RealTime](-real-time/index.html) | [jvm]<br>data class [RealTime](-real-time/index.html)(val rank: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val title: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val url: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
| [SearchedArticle](-searched-article/index.html) | [jvm]<br>data class [SearchedArticle](-searched-article/index.html)(val title: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val content: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val gallName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val articleId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val regDate: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
| [TotalSearchResult](-total-search-result/index.html) | [jvm]<br>data class [TotalSearchResult](-total-search-result/index.html)(val mainGallery: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Gallery](../../be.zvz.kotlininside.api.type/-gallery/index.html)&gt;, val minorGallery: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Gallery](../../be.zvz.kotlininside.api.type/-gallery/index.html)&gt;, val wiki: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[TotalSearch.Wiki](-wiki/index.html)&gt;, val board: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[TotalSearch.SearchedArticle](-searched-article/index.html)&gt;, val todayIssue: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[TotalSearch.SearchedArticle](-searched-article/index.html)&gt;, val realTime: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[TotalSearch.RealTime](-real-time/index.html)&gt;) |
| [Wiki](-wiki/index.html) | [jvm]<br>data class [Wiki](-wiki/index.html)(val title: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val gallName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val url: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |


## Functions


| Name | Summary |
|---|---|
| [search](search.html) | [jvm]<br>fun [search](search.html)(): [TotalSearch.TotalSearchResult](-total-search-result/index.html)<br>통합 검색을 실행하고, 검색 결과를 받아옵니다. |

