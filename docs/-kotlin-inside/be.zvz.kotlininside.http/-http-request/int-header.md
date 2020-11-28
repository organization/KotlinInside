---
title: intHeader -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.http](../index.md)/[HttpRequest](index.md)/[intHeader](int-header.md)



# intHeader  
[jvm]  
Content  
open fun [intHeader](int-header.md)(name: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  
More info  


Get an integer header from the response falling back to returning -1 if the header is missing or parsing fails



#### Return  


value as an integer, -1 when missing or parsing fails



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| <a name="be.zvz.kotlininside.http/HttpRequest/intHeader/#java.lang.String/PointingToDeclaration/"></a>name| <a name="be.zvz.kotlininside.http/HttpRequest/intHeader/#java.lang.String/PointingToDeclaration/"></a>
  
  


[jvm]  
Content  
open fun [intHeader](int-header.md)(name: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), defaultValue: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  
More info  


Get an integer header value from the response falling back to the given default value if the header is missing or if parsing fails



#### Return  


value as an integer, default value when missing or parsingfails



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| <a name="be.zvz.kotlininside.http/HttpRequest/intHeader/#java.lang.String#int/PointingToDeclaration/"></a>defaultValue| <a name="be.zvz.kotlininside.http/HttpRequest/intHeader/#java.lang.String#int/PointingToDeclaration/"></a>
| <a name="be.zvz.kotlininside.http/HttpRequest/intHeader/#java.lang.String#int/PointingToDeclaration/"></a>name| <a name="be.zvz.kotlininside.http/HttpRequest/intHeader/#java.lang.String#int/PointingToDeclaration/"></a>
  
  



