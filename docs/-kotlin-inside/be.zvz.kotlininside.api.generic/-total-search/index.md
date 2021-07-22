---
title: TotalSearch
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.api.generic](../index.html)/[TotalSearch](index.html)

# TotalSearch

[jvm]\
class [TotalSearch](index.html)(**
keyword**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))

## Types

| Name | Summary |
|---|---|
| [RealTime](-real-time/index.html) | [jvm]<br>data class [RealTime](-real-time/index.html)(**
rank**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **
title**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **
url**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
| [SearchedArticle](-searched-article/index.html) | [jvm]<br>data class [SearchedArticle](-searched-article/index.html)(**
title**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **
content**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **
gallId**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **
gallName**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **
articleId**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **
regDate**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
| [TotalSearchResult](-total-search-result/index.html) | [jvm]<br>data class [TotalSearchResult](-total-search-result/index.html)(**
mainGallery**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Gallery](../../be.zvz.kotlininside.api.type/-gallery/index.html)>, **
minorGallery**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Gallery](../../be.zvz.kotlininside.api.type/-gallery/index.html)>, **
wiki**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[TotalSearch.Wiki](-wiki/index.html)>, **
board**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[TotalSearch.SearchedArticle](-searched-article/index.html)>, **
todayIssue**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[TotalSearch.SearchedArticle](-searched-article/index.html)>, **
realTime**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[TotalSearch.RealTime](-real-time/index.html)>) |
| [Wiki](-wiki/index.html) | [jvm]<br>data class [Wiki](-wiki/index.html)(**
title**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **
gallName**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **
url**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |

## Functions

| Name | Summary |
|---|---|
| [search](search.html) | [jvm]<br>fun [search](search.html)(): [TotalSearch.TotalSearchResult](-total-search-result/index.html)<br>통합 검색을 실행하고, 검색 결과를 받아옵니다. |

