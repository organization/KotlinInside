---
title: AsyncUserBlock
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.api.async.management](../index.html)/[AsyncUserBlock](index.html)



# AsyncUserBlock



[jvm]\
class [AsyncUserBlock](index.html)@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)constructor(gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), articleId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), session: [Session](../../be.zvz.kotlininside.session/-session/index.html), option: [UserBlock.BlockOption](../../be.zvz.kotlininside.api.management/-user-block/-block-option/index.html) = UserBlock.BlockOption())



## Constructors


| | |
|---|---|
| [AsyncUserBlock](-async-user-block.html) | [jvm]<br>@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)<br>fun [AsyncUserBlock](-async-user-block.html)(gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), articleId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), session: [Session](../../be.zvz.kotlininside.session/-session/index.html), option: [UserBlock.BlockOption](../../be.zvz.kotlininside.api.management/-user-block/-block-option/index.html) = UserBlock.BlockOption()) |


## Functions


| Name | Summary |
|---|---|
| [blockAsync](block-async.html) | [jvm]<br>suspend fun [blockAsync](block-async.html)(): Deferred&lt;[UserBlock.BlockResult](../../be.zvz.kotlininside.api.management/-user-block/-block-result/index.html)&gt; |
| [getLinkAsync](get-link-async.html) | [jvm]<br>suspend fun [getLinkAsync](get-link-async.html)(): Deferred&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; |

