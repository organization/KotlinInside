---
title: MinorGalleryInfo
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.api.generic](../index.html)/[MinorGalleryInfo](index.html)



# MinorGalleryInfo



[jvm]\
class [MinorGalleryInfo](index.html)(gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))



## Constructors


| | |
|---|---|
| [MinorGalleryInfo](-minor-gallery-info.html) | [jvm]<br>fun [MinorGalleryInfo](-minor-gallery-info.html)(gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |


## Types


| Name | Summary |
|---|---|
| [InfoResult](-info-result/index.html) | [jvm]<br>data class [InfoResult](-info-result/index.html)(val id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val koName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val image: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, val description: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, val manager: [MinorGalleryInfo.Manager](-manager/index.html), val subManager: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[MinorGalleryInfo.Manager](-manager/index.html)&gt;, val createDate: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val new: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val hotState: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val totalCount: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val categoryName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val mini: [MinorGalleryInfo.MiniGalleryInfo](-mini-gallery-info/index.html)? = null) |
| [Manager](-manager/index.html) | [jvm]<br>data class [Manager](-manager/index.html)(val isMaster: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
| [MiniGalleryInfo](-mini-gallery-info/index.html) | [jvm]<br>data class [MiniGalleryInfo](-mini-gallery-info/index.html)(val hide: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val totalMember: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val memberLimit: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val isMember: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) |


## Functions


| Name | Summary |
|---|---|
| [request](request.html) | [jvm]<br>fun [request](request.html)(): [MinorGalleryInfo.InfoResult](-info-result/index.html)<br>갤러리 정보를 받아옵니다. |

