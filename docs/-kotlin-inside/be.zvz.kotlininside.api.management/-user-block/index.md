---
title: UserBlock
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.api.management](../index.html)/[UserBlock](index.html)



# UserBlock



[jvm]\
class [UserBlock](index.html)@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)constructor(gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), articleId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), session: [Session](../../be.zvz.kotlininside.session/-session/index.html), option: [UserBlock.BlockOption](-block-option/index.html))



## Types


| Name | Summary |
|---|---|
| [BlockCategory](-block-category/index.html) | [jvm]<br>enum [BlockCategory](-block-category/index.html) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[UserBlock.BlockCategory](-block-category/index.html)&gt; |
| [BlockOption](-block-option/index.html) | [jvm]<br>class [BlockOption](-block-option/index.html) |
| [BlockResult](-block-result/index.html) | [jvm]<br>data class [BlockResult](-block-result/index.html)(result: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), cause: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |


## Functions


| Name | Summary |
|---|---|
| [block](block.html) | [jvm]<br>fun [block](block.html)(): [UserBlock.BlockResult](-block-result/index.html) |
| [getLink](get-link.html) | [jvm]<br>fun [getLink](get-link.html)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>갤러리 유저 차단 링크를 반환합니다. |
| [getUserAgent](get-user-agent.html) | [jvm]<br>fun [getUserAgent](get-user-agent.html)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>User-Agent를 반환합니다. |

