---
title: MainPage
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.api.generic](../index.html)/[MainPage](index.html)



# MainPage



[jvm]\
class [MainPage](index.html)



## Constructors


| | |
|---|---|
| [MainPage](-main-page.html) | [jvm]<br>fun [MainPage](-main-page.html)() |


## Types


| Name | Summary |
|---|---|
| [Article](-article/index.html) | [jvm]<br>data class [Article](-article/index.html)(val gallId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val articleId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val gallName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, val title: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val thumbnail: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
| [NewGallery](-new-gallery/index.html) | [jvm]<br>data class [NewGallery](-new-gallery/index.html)(val id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val title: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |


## Functions


| Name | Summary |
|---|---|
| [getBest](get-best.html) | [jvm]<br>fun [getBest](get-best.html)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[MainPage.Article](-article/index.html)&gt;<br>메인 화면에 표시되어 있는 베스트 게시물 목록을 가져옵니다. |
| [getHit](get-hit.html) | [jvm]<br>fun [getHit](get-hit.html)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[MainPage.Article](-article/index.html)&gt;<br>메인 화면에 표시되어 있는 Hit갤 게시물 목록을 가져옵니다. |
| [getIssueZoom](get-issue-zoom.html) | [jvm]<br>fun [getIssueZoom](get-issue-zoom.html)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[MainPage.Article](-article/index.html)&gt;<br>메인 화면에 표시되어 있는 이슈줌갤 게시물 목록을 가져옵니다. |
| [getNewGallery](get-new-gallery.html) | [jvm]<br>fun [getNewGallery](get-new-gallery.html)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[MainPage.NewGallery](-new-gallery/index.html)&gt;<br>메인 화면에 표시되어 있는 신규 갤러리 목록을 가져옵니다. |
| [request](request.html) | [jvm]<br>fun [request](request.html)()<br>클래스의 메소드들을 사용하기 전, 이 메소드를 호출해주세요. (권장) |

