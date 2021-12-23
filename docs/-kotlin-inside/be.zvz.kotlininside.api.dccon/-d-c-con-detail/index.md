---
title: DCConDetail
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.api.dccon](../index.html)/[DCConDetail](index.html)



# DCConDetail



[jvm]\
class [DCConDetail](index.html)(dcCon: [DCCon](../../be.zvz.kotlininside.api.type/-d-c-con/index.html))



## Types


| Name | Summary |
|---|---|
| [DCConInfo](-d-c-con-info/index.html) | [jvm]<br>data class [DCConInfo](-d-c-con-info/index.html)(packageIndex: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), mainImg: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), title: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), description: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), mandu: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), getState: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) |
| [DetailResult](-detail-result/index.html) | [jvm]<br>data class [DetailResult](-detail-result/index.html)(info: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[DCConDetail.DCConInfo](-d-c-con-info/index.html)&gt;, detail: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[DCCon](../../be.zvz.kotlininside.api.type/-d-c-con/index.html)&gt;) |


## Functions


| Name | Summary |
|---|---|
| [request](request.html) | [jvm]<br>fun [request](request.html)(): [DCConDetail.DetailResult](-detail-result/index.html)<br>디시콘 정보를 받아오는 메소드입니다. |

