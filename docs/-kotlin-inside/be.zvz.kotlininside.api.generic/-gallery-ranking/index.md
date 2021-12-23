---
title: GalleryRanking
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.api.generic](../index.html)/[GalleryRanking](index.html)



# GalleryRanking



[jvm]\
class [GalleryRanking](index.html)



## Types


| Name | Summary |
|---|---|
| [RankingItem](-ranking-item/index.html) | [jvm]<br>data class [RankingItem](-ranking-item/index.html)(gallLink: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), gallName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), rankType: [GalleryRanking.RankType](-rank-type/index.html), rank: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), rankUpdown: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [RankType](-rank-type/index.html) | [jvm]<br>enum [RankType](-rank-type/index.html) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[GalleryRanking.RankType](-rank-type/index.html)&gt; |


## Functions


| Name | Summary |
|---|---|
| [request](request.html) | [jvm]<br>fun [request](request.html)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[GalleryRanking.RankingItem](-ranking-item/index.html)&gt;<br>정식 갤러리 랭킹을 불러옵니다. |

