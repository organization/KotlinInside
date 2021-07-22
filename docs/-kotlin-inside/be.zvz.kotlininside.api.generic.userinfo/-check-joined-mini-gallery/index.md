---
title: CheckJoinedMiniGallery
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.api.generic.userinfo](../index.html)
/[CheckJoinedMiniGallery](index.html)

# CheckJoinedMiniGallery

[jvm]\
class [CheckJoinedMiniGallery](index.html)(**
session**: [Session](../../be.zvz.kotlininside.session/-session/index.html))

## Types

| Name | Summary |
|---|---|
| [CheckResult](-check-result/index.html) | [jvm]<br>data class [CheckResult](-check-result/index.html)(**
myJoinMiniIn**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[CheckJoinedMiniGallery.Gallery](-gallery/index.html)>, **
myJoinMiniHold**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[CheckJoinedMiniGallery.Gallery](-gallery/index.html)>, **
myJoinMiniOut**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[CheckJoinedMiniGallery.Gallery](-gallery/index.html)>) |
| [Gallery](-gallery/index.html) | [jvm]<br>data class [Gallery](-gallery/index.html)(**
title**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **
id**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **
hide**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |

## Functions

| Name | Summary |
|---|---|
| [request](request.html) | [jvm]<br>fun [request](request.html)(): [CheckJoinedMiniGallery.CheckResult](-check-result/index.html)<br>내 갤러리 정보를 받아옵니다. |

