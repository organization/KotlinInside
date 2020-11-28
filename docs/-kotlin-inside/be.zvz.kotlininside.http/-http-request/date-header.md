---
title: dateHeader -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.http](../index.md)/[HttpRequest](index.md)/[dateHeader](date-header.md)



# dateHeader  
[jvm]  
Content  
open fun [dateHeader](date-header.md)(name: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)  
More info  


Get a date header from the response falling back to returning -1 if the header is missing or parsing fails



#### Return  


-1 on failures



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| <a name="be.zvz.kotlininside.http/HttpRequest/dateHeader/#java.lang.String/PointingToDeclaration/"></a>name| <a name="be.zvz.kotlininside.http/HttpRequest/dateHeader/#java.lang.String/PointingToDeclaration/"></a>
  
  


[jvm]  
Content  
open fun [dateHeader](date-header.md)(name: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), defaultValue: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)  
More info  


Get a date header from the response falling back to returning the given default value if the header is missing or parsing fails



#### Return  


default value on failures



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| <a name="be.zvz.kotlininside.http/HttpRequest/dateHeader/#java.lang.String#long/PointingToDeclaration/"></a>defaultValue| <a name="be.zvz.kotlininside.http/HttpRequest/dateHeader/#java.lang.String#long/PointingToDeclaration/"></a>
| <a name="be.zvz.kotlininside.http/HttpRequest/dateHeader/#java.lang.String#long/PointingToDeclaration/"></a>name| <a name="be.zvz.kotlininside.http/HttpRequest/dateHeader/#java.lang.String#long/PointingToDeclaration/"></a>
  
  



