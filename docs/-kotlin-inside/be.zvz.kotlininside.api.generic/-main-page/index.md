---
title: MainPage -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.api.generic](../index.md)/[MainPage](index.md)



# MainPage  
 [jvm] class [MainPage](index.md)   


## Types  
  
|  Name|  Summary| 
|---|---|
| [Article](-article/index.md)| [jvm]  <br>Content  <br>data class [Article](-article/index.md)(**gallId**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **articleId**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **gallName**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, **title**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **thumbnail**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br><br><br>
| [NewGallery](-new-gallery/index.md)| [jvm]  <br>Content  <br>data class [NewGallery](-new-gallery/index.md)(**id**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **title**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| [equals](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html)| [jvm]  <br>Content  <br>open operator override fun [equals](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| [getBest](get-best.md)| [jvm]  <br>Brief description  <br><br><br>메인 화면에 표시되어 있는 베스트 게시물 목록을 가져옵니다.<br><br>  <br>Content  <br>fun [getBest](get-best.md)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[MainPage.Article](-article/index.md)>  <br><br><br>
| [getHit](get-hit.md)| [jvm]  <br>Brief description  <br><br><br>메인 화면에 표시되어 있는 Hit갤 게시물 목록을 가져옵니다.<br><br>  <br>Content  <br>fun [getHit](get-hit.md)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[MainPage.Article](-article/index.md)>  <br><br><br>
| [getIssueZoom](get-issue-zoom.md)| [jvm]  <br>Brief description  <br><br><br>메인 화면에 표시되어 있는 이슈줌갤 게시물 목록을 가져옵니다.<br><br>  <br>Content  <br>fun [getIssueZoom](get-issue-zoom.md)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[MainPage.Article](-article/index.md)>  <br><br><br>
| [getNewGallery](get-new-gallery.md)| [jvm]  <br>Brief description  <br><br><br>메인 화면에 표시되어 있는 신규 갤러리 목록을 가져옵니다.<br><br>  <br>Content  <br>fun [getNewGallery](get-new-gallery.md)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[MainPage.NewGallery](-new-gallery/index.md)>  <br><br><br>
| [hashCode](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/hash-code.html)| [jvm]  <br>Content  <br>open override fun [hashCode](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/hash-code.html)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| [request](request.md)| [jvm]  <br>Brief description  <br><br><br>클래스의 메소드들을 사용하기 전, 이 메소드를 호출해주세요. (권장)<br><br>  <br>Content  <br>fun [request](request.md)()  <br><br><br>
| [toString](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/to-string.html)| [jvm]  <br>Content  <br>open override fun [toString](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/to-string.html)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>

