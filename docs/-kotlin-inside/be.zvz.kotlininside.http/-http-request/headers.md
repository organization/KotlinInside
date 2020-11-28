---
title: headers -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.http](../index.md)/[HttpRequest](index.md)/[headers](headers.md)



# headers  
[jvm]  
Content  
open fun [headers](headers.md)(headers: [Map](https://docs.oracle.com/javase/7/docs/api/java/util/Map.html)<[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)>): [HttpRequest](index.md)  
More info  


Set all headers found in given map where the keys are the header names and the values are the header values



#### Return  


request



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| <a name="be.zvz.kotlininside.http/HttpRequest/headers/#java.util.Map<java.lang.String,java.lang.String>/PointingToDeclaration/"></a>headers| <a name="be.zvz.kotlininside.http/HttpRequest/headers/#java.util.Map<java.lang.String,java.lang.String>/PointingToDeclaration/"></a>
  
  


[jvm]  
Content  
open fun [headers](headers.md)(): [Map](https://docs.oracle.com/javase/7/docs/api/java/util/Map.html)<[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), [List](https://docs.oracle.com/javase/7/docs/api/java/util/List.html)<[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)>>  
More info  


Get all the response headers



#### Return  


of response header names to their value(s)

  


[jvm]  
Content  
open fun [headers](headers.md)(name: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)>  
More info  


Get all values of the given header from the response



#### Return  


-null but possibly empty array of header values



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| <a name="be.zvz.kotlininside.http/HttpRequest/headers/#java.lang.String/PointingToDeclaration/"></a>name| <a name="be.zvz.kotlininside.http/HttpRequest/headers/#java.lang.String/PointingToDeclaration/"></a>
  
  



