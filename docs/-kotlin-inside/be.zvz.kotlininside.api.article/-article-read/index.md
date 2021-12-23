---
title: ArticleRead
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.api.article](../index.html)/[ArticleRead](index.html)



# ArticleRead



[jvm]\
class [ArticleRead](index.html)@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)constructor(gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), articleId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), session: [Session](../../be.zvz.kotlininside.session/-session/index.html)?)



## Types


| Name | Summary |
|---|---|
| [ViewInfo](-view-info/index.html) | [jvm]<br>data class [ViewInfo](-view-info/index.html)(gallTitle: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), category: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), subject: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), identifier: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), level: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), memberIcon: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), totalComment: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), ip: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), imageCheck: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), recommendCheck: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), winnertaCheck: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), voiceCheck: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), views: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), writeType: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), userId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), previousLink: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), previousSubject: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), headTitle: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), nextLink: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), nextSubject: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), bestCheck: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), isNotice: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), gallerCon: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, dateTime: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), isMinor: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), isMini: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), useAutoDelete: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)?, useListFix: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)?, membership: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)?, memberGrant: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)?, headText: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[HeadText](../../be.zvz.kotlininside.api.type/-head-text/index.html)&gt;, commentDeleteScope: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) |
| [ViewMain](-view-main/index.html) | [jvm]<br>data class [ViewMain](-view-main/index.html)(content: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), upvote: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), upvoteMember: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), downvote: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), isManager: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) |


## Functions


| Name | Summary |
|---|---|
| [getViewInfo](get-view-info.html) | [jvm]<br>fun [getViewInfo](get-view-info.html)(): [ArticleRead.ViewInfo](-view-info/index.html) |
| [getViewMain](get-view-main.html) | [jvm]<br>fun [getViewMain](get-view-main.html)(): [ArticleRead.ViewMain](-view-main/index.html) |
| [request](request.html) | [jvm]<br>fun [request](request.html)()<br>클래스의 메소드들을 사용하기 전, 이 메소드를 호출해주세요. (권장) |

