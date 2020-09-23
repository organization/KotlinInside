---
title: ArticleModify -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.api.article](../index.md)/[ArticleModify](index.md)



# ArticleModify  
 [jvm] class [ArticleModify](index.md)(**gallId**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **articleId**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **session**: [Session](../../be.zvz.kotlininside.session/-session/index.md))   


## Types  
  
|  Name|  Summary| 
|---|---|
| [FileData](-file-data/index.md)| [jvm]  <br>Content  <br>data class [FileData](-file-data/index.md)(**block**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **fileSize**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br><br><br>
| [ModifyResult](-modify-result/index.md)| [jvm]  <br>Content  <br>data class [ModifyResult](-modify-result/index.md)(**result**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **gallId**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, **articleId**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **fileCount**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **fileSize**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **subject**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, **content**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Content](../../be.zvz.kotlininside.api.type.content/-content/index.md)>, **file**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[ArticleModify.FileData](-file-data/index.md)>, **headText**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[HeadText](../../be.zvz.kotlininside.api.type/-head-text/index.md)>, **currentHeadText**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, **cause**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?)  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| [equals](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html)| [jvm]  <br>Content  <br>open operator override fun [equals](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| [hashCode](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/hash-code.html)| [jvm]  <br>Content  <br>open override fun [hashCode](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/hash-code.html)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| [modify](modify.md)| [jvm]  <br>Content  <br>@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)()  <br>  <br>fun [modify](modify.md)(article: [Article](../../be.zvz.kotlininside.api.type/-article/index.md), fcmToken: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [ArticleWrite.WriteResult](../-article-write/-write-result/index.md)  <br><br><br>
| [modifyInfo](modify-info.md)| [jvm]  <br>Content  <br>fun [modifyInfo](modify-info.md)(): [ArticleModify.ModifyResult](-modify-result/index.md)  <br><br><br>
| [toString](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/to-string.html)| [jvm]  <br>Content  <br>open override fun [toString](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/to-string.html)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>

