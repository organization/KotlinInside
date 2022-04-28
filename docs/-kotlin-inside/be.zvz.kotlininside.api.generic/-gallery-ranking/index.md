---
title: GalleryRanking
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.api.generic](../index.html)/[GalleryRanking](index.html)



# GalleryRanking



[jvm]\
class [GalleryRanking](index.html)



## Constructors


| | |
|---|---|
| [GalleryRanking](-gallery-ranking.html) | [jvm]<br>fun [GalleryRanking](-gallery-ranking.html)() |


## Types


| Name | Summary |
|---|---|
| [RankingItem](-ranking-item/index.html) | [jvm]<br>data class [RankingItem](-ranking-item/index.html)(val gallLink: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val gallName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val rankType: [GalleryRanking.RankType](-rank-type/index.html), val rank: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val rankUpdown: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [RankType](-rank-type/index.html) | [jvm]<br>enum [RankType](-rank-type/index.html) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[GalleryRanking.RankType](-rank-type/index.html)&gt; |


## Functions


| Name | Summary |
|---|---|
| [request](request.html) | [jvm]<br>fun [request](request.html)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[GalleryRanking.RankingItem](-ranking-item/index.html)&gt;<br>정식 갤러리 랭킹을 불러옵니다. |

