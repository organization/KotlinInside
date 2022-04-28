---
title: ChangeHeadText
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.api.management](../index.html)/[ChangeHeadText](index.html)



# ChangeHeadText



[jvm]\
class [ChangeHeadText](index.html)(gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), articleId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), headTextId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), session: [Session](../../be.zvz.kotlininside.session/-session/index.html))



## Constructors


| | |
|---|---|
| [ChangeHeadText](-change-head-text.html) | [jvm]<br>fun [ChangeHeadText](-change-head-text.html)(gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), articleId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), headTextId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), session: [Session](../../be.zvz.kotlininside.session/-session/index.html)) |


## Types


| Name | Summary |
|---|---|
| [ChangeResult](-change-result/index.html) | [jvm]<br>data class [ChangeResult](-change-result/index.html)(val result: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val cause: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val state: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |


## Functions


| Name | Summary |
|---|---|
| [request](request.html) | [jvm]<br>fun [request](request.html)(): [ChangeHeadText.ChangeResult](-change-result/index.html)<br>말머리 변경 요청을 전송합니다. |

