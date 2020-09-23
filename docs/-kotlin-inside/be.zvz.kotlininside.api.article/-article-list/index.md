---
title: ArticleList -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.api.article](../index.md)/[ArticleList](index.md)



# ArticleList  
 [jvm] class [ArticleList](index.md)@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)()constructor(**gallId**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **searchKeyword**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **searchType**: [ArticleList.SearchType](-search-type/index.md), **page**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **recommend**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **notice**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **headId**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **session**: [Session](../../be.zvz.kotlininside.session/-session/index.md)?)   


## Constructors  
  
|  Name|  Summary| 
|---|---|
| [ArticleList](-article-list.md)|  [jvm] @[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)()  <br>  <br>fun [ArticleList](-article-list.md)(gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), page: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), recommend: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), notice: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), headId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), session: [Session](../../be.zvz.kotlininside.session/-session/index.md)?)   <br>
| [ArticleList](-article-list.md)|  [jvm] fun [ArticleList](-article-list.md)(gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), searchKeyword: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), page: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), recommend: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), notice: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), headId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), session: [Session](../../be.zvz.kotlininside.session/-session/index.md)?)   <br>


## Types  
  
|  Name|  Summary| 
|---|---|
| [GallInfo](-gall-info/index.md)| [jvm]  <br>Content  <br>data class [GallInfo](-gall-info/index.md)(**title**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **category**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **fileCount**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **fileSize**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **captcha**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)?, **codeCount**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)?, **isMinor**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **isManager**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **notifyRecent**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)?, **relationGall**: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>, **headText**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[HeadText](../../be.zvz.kotlininside.api.type/-head-text/index.md)>)  <br><br><br>
| [GallList](-gall-list/index.md)| [jvm]  <br>Content  <br>data class [GallList](-gall-list/index.md)(**identifier**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **views**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **upvote**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **imageIcon**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **upvoteIcon**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **bestCheck**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **voiceIcon**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **winnertaIcon**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **level**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **totalComment**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **totalVoice**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **userId**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **memberIcon**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **ip**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **gallerCon**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, **subject**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **name**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **dateTime**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **headText**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?)  <br><br><br>
| [SearchType](-search-type/index.md)| [jvm]  <br>Content  <br>enum [SearchType](-search-type/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)<[ArticleList.SearchType](-search-type/index.md)>   <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| [equals](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html)| [jvm]  <br>Content  <br>open operator override fun [equals](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| [getGallInfo](get-gall-info.md)| [jvm]  <br>Content  <br>fun [getGallInfo](get-gall-info.md)(): [ArticleList.GallInfo](-gall-info/index.md)  <br><br><br>
| [getGallList](get-gall-list.md)| [jvm]  <br>Content  <br>fun [getGallList](get-gall-list.md)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[ArticleList.GallList](-gall-list/index.md)>  <br><br><br>
| [hashCode](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/hash-code.html)| [jvm]  <br>Content  <br>open override fun [hashCode](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/hash-code.html)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| [request](request.md)| [jvm]  <br>Brief description  <br><br><br>클래스의 메소드들을 사용하기 전, 이 메소드를 호출해주세요. (권장)<br><br>  <br>Content  <br>fun [request](request.md)()  <br><br><br>
| [toString](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/to-string.html)| [jvm]  <br>Content  <br>open override fun [toString](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/to-string.html)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>

