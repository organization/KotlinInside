---
title: ArticleList
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.api.article](../index.html)/[ArticleList](index.html)



# ArticleList



[jvm]\
class [ArticleList](index.html)@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)constructor(gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), searchKeyword: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), searchType: [ArticleList.SearchType](-search-type/index.html) = SearchType.ALL, page: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 1, recommend: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, notice: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, headId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0, session: [Session](../../be.zvz.kotlininside.session/-session/index.html)? = null)



## Constructors


| | |
|---|---|
| [ArticleList](-article-list.html) | [jvm]<br>@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)<br>fun [ArticleList](-article-list.html)(gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), page: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 1, recommend: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, notice: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, headId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0, session: [Session](../../be.zvz.kotlininside.session/-session/index.html)? = null) |
| [ArticleList](-article-list.html) | [jvm]<br>fun [ArticleList](-article-list.html)(gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), searchKeyword: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), page: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 1, recommend: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, notice: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, headId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0, session: [Session](../../be.zvz.kotlininside.session/-session/index.html)? = null) |
| [ArticleList](-article-list.html) | [jvm]<br>@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)<br>fun [ArticleList](-article-list.html)(gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), searchKeyword: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), searchType: [ArticleList.SearchType](-search-type/index.html) = SearchType.ALL, page: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 1, recommend: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, notice: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, headId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0, session: [Session](../../be.zvz.kotlininside.session/-session/index.html)? = null) |


## Types


| Name | Summary |
|---|---|
| [GallInfo](-gall-info/index.html) | [jvm]<br>data class [GallInfo](-gall-info/index.html)(val title: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val category: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val fileCount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val fileSize: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val noWrite: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val captcha: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)?, val codeCount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)?, val isMinor: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val isMini: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val isManager: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val membership: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)?, val profileImage: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, val totalMember: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)?, val memberJoin: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)?, val useAutoDelete: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)?, val useListFix: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)?, val notifyRecent: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)?, val relationGall: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;, val headText: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[HeadText](../../be.zvz.kotlininside.api.type/-head-text/index.html)&gt;) |
| [GallList](-gall-list/index.html) | [jvm]<br>data class [GallList](-gall-list/index.html)(val identifier: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val views: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val upvote: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val imageIcon: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val upvoteIcon: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val bestCheck: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val voiceIcon: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val winnertaIcon: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val level: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val totalComment: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val totalVoice: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val userId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val memberIcon: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val ip: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val gallerCon: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, val subject: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val dateTime: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val headText: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?) |
| [SearchType](-search-type/index.html) | [jvm]<br>enum [SearchType](-search-type/index.html) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[ArticleList.SearchType](-search-type/index.html)&gt; |


## Functions


| Name | Summary |
|---|---|
| [getGallInfo](get-gall-info.html) | [jvm]<br>fun [getGallInfo](get-gall-info.html)(): [ArticleList.GallInfo](-gall-info/index.html) |
| [getGallList](get-gall-list.html) | [jvm]<br>fun [getGallList](get-gall-list.html)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ArticleList.GallList](-gall-list/index.html)&gt; |
| [request](request.html) | [jvm]<br>fun [request](request.html)()<br>클래스의 메소드들을 사용하기 전, 이 메소드를 호출해주세요. (권장) |

