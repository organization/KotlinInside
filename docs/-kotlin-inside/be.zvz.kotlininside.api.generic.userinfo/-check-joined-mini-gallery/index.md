---
title: CheckJoinedMiniGallery
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.api.generic.userinfo](../index.html)/[CheckJoinedMiniGallery](index.html)



# CheckJoinedMiniGallery



[jvm]\
class [CheckJoinedMiniGallery](index.html)(session: [Session](../../be.zvz.kotlininside.session/-session/index.html))



## Constructors


| | |
|---|---|
| [CheckJoinedMiniGallery](-check-joined-mini-gallery.html) | [jvm]<br>fun [CheckJoinedMiniGallery](-check-joined-mini-gallery.html)(session: [Session](../../be.zvz.kotlininside.session/-session/index.html)) |


## Types


| Name | Summary |
|---|---|
| [CheckResult](-check-result/index.html) | [jvm]<br>data class [CheckResult](-check-result/index.html)(val myJoinMiniIn: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[CheckJoinedMiniGallery.Gallery](-gallery/index.html)&gt;, val myJoinMiniHold: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[CheckJoinedMiniGallery.Gallery](-gallery/index.html)&gt;, val myJoinMiniOut: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[CheckJoinedMiniGallery.Gallery](-gallery/index.html)&gt;) |
| [Gallery](-gallery/index.html) | [jvm]<br>data class [Gallery](-gallery/index.html)(val title: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val hide: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Functions


| Name | Summary |
|---|---|
| [request](request.html) | [jvm]<br>fun [request](request.html)(): [CheckJoinedMiniGallery.CheckResult](-check-result/index.html)<br>내 갤러리 정보를 받아옵니다. |

