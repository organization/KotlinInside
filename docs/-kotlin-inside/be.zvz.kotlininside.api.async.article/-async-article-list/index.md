---
title: AsyncArticleList
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.api.async.article](../index.html)
/[AsyncArticleList](index.html)

# AsyncArticleList

[jvm]\
class [AsyncArticleList](index.html)
@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)constructor(gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)
, searchKeyword: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html),
searchType: [ArticleList.SearchType](../../be.zvz.kotlininside.api.article/-article-list/-search-type/index.html),
page: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html),
recommend: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html),
notice: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html),
headId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html),
session: [Session](../../be.zvz.kotlininside.session/-session/index.html)?)

## Constructors

| | |
|---|---|
| [AsyncArticleList](-async-article-list.html) | [jvm]<br>@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)<br>fun [AsyncArticleList](-async-article-list.html)(gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), page: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 1, recommend: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, notice: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, headId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0, session: [Session](../../be.zvz.kotlininside.session/-session/index.html)? = null) |
| [AsyncArticleList](-async-article-list.html) | [jvm]<br>fun [AsyncArticleList](-async-article-list.html)(gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), searchKeyword: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), page: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 1, recommend: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, notice: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, headId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0, session: [Session](../../be.zvz.kotlininside.session/-session/index.html)? = null) |

## Functions

| Name | Summary |
|---|---|
| [getGallInfoAsync](get-gall-info-async.html) | [jvm]<br>suspend fun [getGallInfoAsync](get-gall-info-async.html)(): Deferred&lt;[ArticleList.GallInfo](../../be.zvz.kotlininside.api.article/-article-list/-gall-info/index.html)&gt; |
| [getGallListAsync](get-gall-list-async.html) | [jvm]<br>suspend fun [getGallListAsync](get-gall-list-async.html)(): Deferred&lt;[List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ArticleList.GallList](../../be.zvz.kotlininside.api.article/-article-list/-gall-list/index.html)&gt;&gt; |
| [requestAsync](request-async.html) | [jvm]<br>suspend fun [requestAsync](request-async.html)(): Deferred&lt;[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)&gt; |

