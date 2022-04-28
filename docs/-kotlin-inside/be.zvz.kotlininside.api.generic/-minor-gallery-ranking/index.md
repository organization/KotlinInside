---
title: MinorGalleryRanking
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.api.generic](../index.html)/[MinorGalleryRanking](index.html)



# MinorGalleryRanking



[jvm]\
class [MinorGalleryRanking](index.html)



## Constructors


| | |
|---|---|
| [MinorGalleryRanking](-minor-gallery-ranking.html) | [jvm]<br>fun [MinorGalleryRanking](-minor-gallery-ranking.html)() |


## Types


| Name | Summary |
|---|---|
| [RankingItem](-ranking-item/index.html) | [jvm]<br>data class [RankingItem](-ranking-item/index.html)(val gallLink: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val gallName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val rankType: [MinorGalleryRanking.RankType](-rank-type/index.html), val rank: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val rankUpdown: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [RankType](-rank-type/index.html) | [jvm]<br>enum [RankType](-rank-type/index.html) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[MinorGalleryRanking.RankType](-rank-type/index.html)&gt; |


## Functions


| Name | Summary |
|---|---|
| [request](request.html) | [jvm]<br>fun [request](request.html)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[MinorGalleryRanking.RankingItem](-ranking-item/index.html)&gt;<br>마이너 갤러리 랭킹을 불러옵니다. |

