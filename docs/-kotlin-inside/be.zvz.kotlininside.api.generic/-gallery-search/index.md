---
title: GallerySearch
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.api.generic](../index.html)/[GallerySearch](index.html)



# GallerySearch



[jvm]\
class [GallerySearch](index.html)(keyword: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))



## Constructors


| | |
|---|---|
| [GallerySearch](-gallery-search.html) | [jvm]<br>fun [GallerySearch](-gallery-search.html)(keyword: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |


## Types


| Name | Summary |
|---|---|
| [GallerySearchResult](-gallery-search-result/index.html) | [jvm]<br>data class [GallerySearchResult](-gallery-search-result/index.html)(val mainGallery: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Gallery](../../be.zvz.kotlininside.api.type/-gallery/index.html)&gt;, val minorGallery: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Gallery](../../be.zvz.kotlininside.api.type/-gallery/index.html)&gt;, val mainRecommendGallery: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Gallery](../../be.zvz.kotlininside.api.type/-gallery/index.html)&gt;, val minorRecommendGallery: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Gallery](../../be.zvz.kotlininside.api.type/-gallery/index.html)&gt;) |


## Functions


| Name | Summary |
|---|---|
| [search](search.html) | [jvm]<br>fun [search](search.html)(): [GallerySearch.GallerySearchResult](-gallery-search-result/index.html)<br>갤러리 목록을 검색하고, 검색 결과를 받아옵니다. |

