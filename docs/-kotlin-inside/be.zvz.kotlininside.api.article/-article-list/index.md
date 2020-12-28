---
title: ArticleList -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.api.article](../index.md)/[ArticleList](index.md)



# ArticleList  
 [jvm] class [ArticleList](index.md)@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)()constructor(**gallId**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **searchKeyword**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **searchType**: [ArticleList.SearchType](-search-type/index.md), **page**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **recommend**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **notice**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **headId**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **session**: [Session](../../be.zvz.kotlininside.session/-session/index.md)?)   


## Constructors  
  
|  Name|  Summary| 
|---|---|
| <a name="be.zvz.kotlininside.api.article/ArticleList/ArticleList/#kotlin.String#kotlin.Int#kotlin.Boolean#kotlin.Boolean#kotlin.Int#be.zvz.kotlininside.session.Session?/PointingToDeclaration/"></a>[ArticleList](-article-list.md)| <a name="be.zvz.kotlininside.api.article/ArticleList/ArticleList/#kotlin.String#kotlin.Int#kotlin.Boolean#kotlin.Boolean#kotlin.Int#be.zvz.kotlininside.session.Session?/PointingToDeclaration/"></a> [jvm] @[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)()  <br>  <br>fun [ArticleList](-article-list.md)(gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), page: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 1, recommend: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, notice: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, headId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0, session: [Session](../../be.zvz.kotlininside.session/-session/index.md)? = null)   <br>
| <a name="be.zvz.kotlininside.api.article/ArticleList/ArticleList/#kotlin.String#kotlin.String#kotlin.Int#kotlin.Boolean#kotlin.Boolean#kotlin.Int#be.zvz.kotlininside.session.Session?/PointingToDeclaration/"></a>[ArticleList](-article-list.md)| <a name="be.zvz.kotlininside.api.article/ArticleList/ArticleList/#kotlin.String#kotlin.String#kotlin.Int#kotlin.Boolean#kotlin.Boolean#kotlin.Int#be.zvz.kotlininside.session.Session?/PointingToDeclaration/"></a> [jvm] fun [ArticleList](-article-list.md)(gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), searchKeyword: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), page: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 1, recommend: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, notice: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, headId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0, session: [Session](../../be.zvz.kotlininside.session/-session/index.md)? = null)   <br>


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="be.zvz.kotlininside.api.article/ArticleList.GallInfo///PointingToDeclaration/"></a>[GallInfo](-gall-info/index.md)| <a name="be.zvz.kotlininside.api.article/ArticleList.GallInfo///PointingToDeclaration/"></a>[jvm]  <br>Content  <br>data class [GallInfo](-gall-info/index.md)(**
title**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **
category**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **
fileCount**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **
fileSize**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **
noWrite**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **
captcha**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)?, **
codeCount**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)?, **
isMinor**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **
isMini**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **
isManager**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **
membership**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)?, **
profileImage**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, **
totalMember**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)?, **
memberJoin**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)?, **
useAutoDelete**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)?, **
useListFix**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)?, **
notifyRecent**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)?, **
relationGall**: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>, **
headText**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[HeadText](../../be.zvz.kotlininside.api.type/-head-text/index.md)>)  <br><br><br>
| <a name="be.zvz.kotlininside.api.article/ArticleList.GallList///PointingToDeclaration/"></a>[GallList](-gall-list/index.md)| <a name="be.zvz.kotlininside.api.article/ArticleList.GallList///PointingToDeclaration/"></a>[jvm]  <br>Content  <br>data class [GallList](-gall-list/index.md)(**
identifier**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **
views**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **
upvote**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **
imageIcon**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **
upvoteIcon**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **
bestCheck**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **
voiceIcon**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **
winnertaIcon**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **
level**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **
totalComment**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **
totalVoice**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **
userId**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **
memberIcon**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **
ip**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **
gallerCon**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, **
subject**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **
name**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **
dateTime**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **
headText**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?)  <br><br><br>
| <a name="be.zvz.kotlininside.api.article/ArticleList.SearchType///PointingToDeclaration/"></a>[SearchType](-search-type/index.md)| <a name="be.zvz.kotlininside.api.article/ArticleList.SearchType///PointingToDeclaration/"></a>[jvm]  <br>Content  <br>enum [SearchType](-search-type/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)<[ArticleList.SearchType](-search-type/index.md)>   <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../be.zvz.kotlininside.utils/-string-util/-companion/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F49489957)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open operator fun [equals](../../be.zvz.kotlininside.utils/-string-util/-companion/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F49489957)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="be.zvz.kotlininside.api.article/ArticleList/getGallInfo/#/PointingToDeclaration/"></a>[getGallInfo](get-gall-info.md)| <a name="be.zvz.kotlininside.api.article/ArticleList/getGallInfo/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>fun [getGallInfo](get-gall-info.md)(): [ArticleList.GallInfo](-gall-info/index.md)  <br><br><br>
| <a name="be.zvz.kotlininside.api.article/ArticleList/getGallList/#/PointingToDeclaration/"></a>[getGallList](get-gall-list.md)| <a name="be.zvz.kotlininside.api.article/ArticleList/getGallList/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>fun [getGallList](get-gall-list.md)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[ArticleList.GallList](-gall-list/index.md)>  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../be.zvz.kotlininside.utils/-string-util/-companion/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F49489957)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [hashCode](../../be.zvz.kotlininside.utils/-string-util/-companion/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F49489957)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="be.zvz.kotlininside.api.article/ArticleList/request/#/PointingToDeclaration/"></a>[request](request.md)| <a name="be.zvz.kotlininside.api.article/ArticleList/request/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>fun [request](request.md)()  <br>More info  <br>클래스의 메소드들을 사용하기 전, 이 메소드를 호출해주세요.  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../be.zvz.kotlininside.utils/-string-util/-companion/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F49489957)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [toString](../../be.zvz.kotlininside.utils/-string-util/-companion/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F49489957)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>

