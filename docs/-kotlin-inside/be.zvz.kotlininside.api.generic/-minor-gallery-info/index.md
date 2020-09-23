---
title: MinorGalleryInfo -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.api.generic](../index.md)/[MinorGalleryInfo](index.md)



# MinorGalleryInfo  
 [jvm] class [MinorGalleryInfo](index.md)(**gallId**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))   


## Types  
  
|  Name|  Summary| 
|---|---|
| [InfoResult](-info-result/index.md)| [jvm]  <br>Content  <br>data class [InfoResult](-info-result/index.md)(**id**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **koName**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **image**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, **description**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, **manager**: [MinorGalleryInfo.Manager](-manager/index.md), **subManager**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[MinorGalleryInfo.Manager](-manager/index.md)>, **createDate**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **new**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **hotState**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br><br><br>
| [Manager](-manager/index.md)| [jvm]  <br>Content  <br>data class [Manager](-manager/index.md)(**isMaster**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **id**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **name**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| [equals](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html)| [jvm]  <br>Content  <br>open operator override fun [equals](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| [get](get.md)| [jvm]  <br>Brief description  <br><br><br>갤러리 정보를 받아옵니다.<br><br>  <br>Content  <br>fun [get](get.md)(): [MinorGalleryInfo.InfoResult](-info-result/index.md)  <br><br><br>
| [hashCode](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/hash-code.html)| [jvm]  <br>Content  <br>open override fun [hashCode](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/hash-code.html)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| [toString](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/to-string.html)| [jvm]  <br>Content  <br>open override fun [toString](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/to-string.html)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>

