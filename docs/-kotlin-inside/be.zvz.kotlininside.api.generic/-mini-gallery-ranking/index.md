---
title: MiniGalleryRanking
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.api.generic](../index.html)/[MiniGalleryRanking](index.html)



# MiniGalleryRanking



[jvm]\
class [MiniGalleryRanking](index.html)



## Constructors


| | |
|---|---|
| [MiniGalleryRanking](-mini-gallery-ranking.html) | [jvm]<br>fun [MiniGalleryRanking](-mini-gallery-ranking.html)() |


## Types


| Name | Summary |
|---|---|
| [RankingItem](-ranking-item/index.html) | [jvm]<br>data class [RankingItem](-ranking-item/index.html)(val gallLink: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val gallName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val rankType: [MiniGalleryRanking.RankType](-rank-type/index.html), val rank: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val rankUpdown: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [RankType](-rank-type/index.html) | [jvm]<br>enum [RankType](-rank-type/index.html) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[MiniGalleryRanking.RankType](-rank-type/index.html)&gt; |


## Functions


| Name | Summary |
|---|---|
| [request](request.html) | [jvm]<br>fun [request](request.html)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[MiniGalleryRanking.RankingItem](-ranking-item/index.html)&gt;<br>미니 갤러리 랭킹을 불러옵니다. |

