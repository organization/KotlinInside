---
title: ArticleRead
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.api.article](../index.html)/[ArticleRead](index.html)



# ArticleRead



[jvm]\
class [ArticleRead](index.html)@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)constructor(gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), articleId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), session: [Session](../../be.zvz.kotlininside.session/-session/index.html)? = null)



## Constructors


| | |
|---|---|
| [ArticleRead](-article-read.html) | [jvm]<br>@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)<br>fun [ArticleRead](-article-read.html)(gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), articleId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), session: [Session](../../be.zvz.kotlininside.session/-session/index.html)? = null) |


## Types


| Name | Summary |
|---|---|
| [ViewInfo](-view-info/index.html) | [jvm]<br>data class [ViewInfo](-view-info/index.html)(val gallTitle: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val category: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val subject: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val identifier: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val level: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val memberIcon: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val totalComment: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val ip: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val imageCheck: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val recommendCheck: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val winnertaCheck: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val voiceCheck: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val views: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val writeType: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val userId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val previousLink: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val previousSubject: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val headTitle: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val nextLink: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val nextSubject: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val bestCheck: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val isNotice: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val gallerCon: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, val dateTime: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val isMinor: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val isMini: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val useAutoDelete: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)?, val useListFix: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)?, val membership: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)?, val memberGrant: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)?, val headText: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[HeadText](../../be.zvz.kotlininside.api.type/-head-text/index.html)&gt;, val commentDeleteScope: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) |
| [ViewMain](-view-main/index.html) | [jvm]<br>data class [ViewMain](-view-main/index.html)(val content: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val upvote: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val upvoteMember: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val downvote: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val isManager: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) |


## Functions


| Name | Summary |
|---|---|
| [getViewInfo](get-view-info.html) | [jvm]<br>fun [getViewInfo](get-view-info.html)(): [ArticleRead.ViewInfo](-view-info/index.html) |
| [getViewMain](get-view-main.html) | [jvm]<br>fun [getViewMain](get-view-main.html)(): [ArticleRead.ViewMain](-view-main/index.html) |
| [request](request.html) | [jvm]<br>fun [request](request.html)()<br>클래스의 메소드들을 사용하기 전, 이 메소드를 호출해주세요. (권장) |

