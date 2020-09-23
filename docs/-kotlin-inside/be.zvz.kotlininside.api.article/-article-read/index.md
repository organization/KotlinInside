---
title: ArticleRead -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.api.article](../index.md)/[ArticleRead](index.md)



# ArticleRead  
 [jvm] class [ArticleRead](index.md)@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)()constructor(**gallId**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **articleId**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **session**: [Session](../../be.zvz.kotlininside.session/-session/index.md)?)   


## Types  
  
|  Name|  Summary| 
|---|---|
| [ViewInfo](-view-info/index.md)| [jvm]  <br>Content  <br>data class [ViewInfo](-view-info/index.md)(**gallTitle**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **category**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **subject**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **identifier**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **name**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **level**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **memberIcon**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **totalComment**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **ip**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **imageCheck**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **recommendCheck**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **winnertaCheck**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **voiceCheck**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **views**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **writeType**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **userId**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **previousLink**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **previousSubject**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **headTitle**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **nextLink**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **nextSubject**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **bestCheck**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **isNotice**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **gallerCon**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, **dateTime**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **isMinor**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **headText**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[HeadText](../../be.zvz.kotlininside.api.type/-head-text/index.md)>)  <br><br><br>
| [ViewMain](-view-main/index.md)| [jvm]  <br>Content  <br>data class [ViewMain](-view-main/index.md)(**content**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **upvote**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **upvoteMember**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **downvote**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **isManager**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html))  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| [equals](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html)| [jvm]  <br>Content  <br>open operator override fun [equals](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| [getViewInfo](get-view-info.md)| [jvm]  <br>Content  <br>fun [getViewInfo](get-view-info.md)(): [ArticleRead.ViewInfo](-view-info/index.md)  <br><br><br>
| [getViewMain](get-view-main.md)| [jvm]  <br>Content  <br>fun [getViewMain](get-view-main.md)(): [ArticleRead.ViewMain](-view-main/index.md)  <br><br><br>
| [hashCode](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/hash-code.html)| [jvm]  <br>Content  <br>open override fun [hashCode](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/hash-code.html)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| [request](request.md)| [jvm]  <br>Brief description  <br><br><br>클래스의 메소드들을 사용하기 전, 이 메소드를 호출해주세요. (권장)<br><br>  <br>Content  <br>fun [request](request.md)()  <br><br><br>
| [toString](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/to-string.html)| [jvm]  <br>Content  <br>open override fun [toString](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/to-string.html)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>

