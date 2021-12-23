---
title: ArticleList
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.api.article](../index.html)/[ArticleList](index.html)



# ArticleList



[jvm]\
class [ArticleList](index.html)@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)constructor(gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), searchKeyword: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), searchType: [ArticleList.SearchType](-search-type/index.html), page: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), recommend: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), notice: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), headId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), session: [Session](../../be.zvz.kotlininside.session/-session/index.html)?)



## Constructors


| | |
|---|---|
| [ArticleList](-article-list.html) | [jvm]<br>@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)<br>fun [ArticleList](-article-list.html)(gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), page: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 1, recommend: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, notice: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, headId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0, session: [Session](../../be.zvz.kotlininside.session/-session/index.html)? = null) |
| [ArticleList](-article-list.html) | [jvm]<br>fun [ArticleList](-article-list.html)(gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), searchKeyword: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), page: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 1, recommend: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, notice: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, headId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0, session: [Session](../../be.zvz.kotlininside.session/-session/index.html)? = null) |


## Types


| Name | Summary |
|---|---|
| [GallInfo](-gall-info/index.html) | [jvm]<br>data class [GallInfo](-gall-info/index.html)(title: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), category: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), fileCount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), fileSize: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), noWrite: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), captcha: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)?, codeCount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)?, isMinor: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), isMini: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), isManager: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), membership: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)?, profileImage: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, totalMember: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)?, memberJoin: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)?, useAutoDelete: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)?, useListFix: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)?, notifyRecent: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)?, relationGall: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;, headText: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[HeadText](../../be.zvz.kotlininside.api.type/-head-text/index.html)&gt;) |
| [GallList](-gall-list/index.html) | [jvm]<br>data class [GallList](-gall-list/index.html)(identifier: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), views: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), upvote: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), imageIcon: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), upvoteIcon: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), bestCheck: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), voiceIcon: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), winnertaIcon: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), level: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), totalComment: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), totalVoice: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), userId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), memberIcon: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), ip: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), gallerCon: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, subject: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), dateTime: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), headText: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?) |
| [SearchType](-search-type/index.html) | [jvm]<br>enum [SearchType](-search-type/index.html) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[ArticleList.SearchType](-search-type/index.html)&gt; |


## Functions


| Name | Summary |
|---|---|
| [getGallInfo](get-gall-info.html) | [jvm]<br>fun [getGallInfo](get-gall-info.html)(): [ArticleList.GallInfo](-gall-info/index.html) |
| [getGallList](get-gall-list.html) | [jvm]<br>fun [getGallList](get-gall-list.html)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ArticleList.GallList](-gall-list/index.html)&gt; |
| [request](request.html) | [jvm]<br>fun [request](request.html)()<br>클래스의 메소드들을 사용하기 전, 이 메소드를 호출해주세요. (권장) |

