---
title: DCConInsert
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.api.dccon](../index.html)/[DCConInsert](index.html)



# DCConInsert



[jvm]\
class [DCConInsert](index.html)(val dcCon: [DCCon](../../be.zvz.kotlininside.api.type/-d-c-con/index.html), val session: [Session](../../be.zvz.kotlininside.session/-session/index.html))



## Constructors


| | |
|---|---|
| [DCConInsert](-d-c-con-insert.html) | [jvm]<br>fun [DCConInsert](-d-c-con-insert.html)(dcCon: [DCCon](../../be.zvz.kotlininside.api.type/-d-c-con/index.html), session: [Session](../../be.zvz.kotlininside.session/-session/index.html)) |


## Types


| Name | Summary |
|---|---|
| [InsertResult](-insert-result/index.html) | [jvm]<br>data class [InsertResult](-insert-result/index.html)(val result: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val newList: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, val imageSource: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, val alternativeText: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, val imageTag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?) |


## Functions


| Name | Summary |
|---|---|
| [request](request.html) | [jvm]<br>fun [request](request.html)(): [DCConInsert.InsertResult](-insert-result/index.html) |


## Properties


| Name | Summary |
|---|---|
| [dcCon](dc-con.html) | [jvm]<br>val [dcCon](dc-con.html): [DCCon](../../be.zvz.kotlininside.api.type/-d-c-con/index.html) |
| [session](session.html) | [jvm]<br>val [session](session.html): [Session](../../be.zvz.kotlininside.session/-session/index.html) |

