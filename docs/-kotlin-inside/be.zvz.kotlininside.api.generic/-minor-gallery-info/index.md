---
title: MinorGalleryInfo
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.api.generic](../index.html)/[MinorGalleryInfo](index.html)



# MinorGalleryInfo



[jvm]\
class [MinorGalleryInfo](index.html)(gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))



## Types


| Name | Summary |
|---|---|
| [InfoResult](-info-result/index.html) | [jvm]<br>data class [InfoResult](-info-result/index.html)(id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), koName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), image: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, description: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, manager: [MinorGalleryInfo.Manager](-manager/index.html), subManager: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[MinorGalleryInfo.Manager](-manager/index.html)&gt;, createDate: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), new: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), hotState: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), totalCount: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), categoryName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), mini: [MinorGalleryInfo.MiniGalleryInfo](-mini-gallery-info/index.html)?) |
| [Manager](-manager/index.html) | [jvm]<br>data class [Manager](-manager/index.html)(isMaster: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
| [MiniGalleryInfo](-mini-gallery-info/index.html) | [jvm]<br>data class [MiniGalleryInfo](-mini-gallery-info/index.html)(hide: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), totalMember: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), memberLimit: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), isMember: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) |


## Functions


| Name | Summary |
|---|---|
| [request](request.html) | [jvm]<br>fun [request](request.html)(): [MinorGalleryInfo.InfoResult](-info-result/index.html)<br>갤러리 정보를 받아옵니다. |

