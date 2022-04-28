---
title: CheckManagedGallery
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.api.generic.userinfo](../index.html)/[CheckManagedGallery](index.html)



# CheckManagedGallery



[jvm]\
class [CheckManagedGallery](index.html)(session: [Session](../../be.zvz.kotlininside.session/-session/index.html))



## Constructors


| | |
|---|---|
| [CheckManagedGallery](-check-managed-gallery.html) | [jvm]<br>fun [CheckManagedGallery](-check-managed-gallery.html)(session: [Session](../../be.zvz.kotlininside.session/-session/index.html)) |


## Types


| Name | Summary |
|---|---|
| [CheckResult](-check-result/index.html) | [jvm]<br>data class [CheckResult](-check-result/index.html)(val myManageList: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[CheckManagedGallery.Gallery](-gallery/index.html)&gt;) |
| [Gallery](-gallery/index.html) | [jvm]<br>data class [Gallery](-gallery/index.html)(val hide: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val title: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val type: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val managerType: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |


## Functions


| Name | Summary |
|---|---|
| [request](request.html) | [jvm]<br>fun [request](request.html)(): [CheckManagedGallery.CheckResult](-check-result/index.html)<br>내 갤러리 정보를 받아옵니다. |

