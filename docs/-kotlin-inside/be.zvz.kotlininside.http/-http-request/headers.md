---
title: headers -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.http](../index.md)/[HttpRequest](index.md)/[headers](headers.md)



# headers  
[jvm]  
Brief description  


Set all headers found in given map where the keys are the header names and the values are the header values



#### Return  


this request



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| headers| <br><br><br><br>
  
  
Content  
open fun [headers](headers.md)(headers: [Map](https://docs.oracle.com/javase/7/docs/api/java/util/Map.html)<[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)>): [HttpRequest](index.md)  


[jvm]  
Brief description  


Get all the response headers



#### Return  


map of response header names to their value(s)

  
Content  
open fun [headers](headers.md)(): [Map](https://docs.oracle.com/javase/7/docs/api/java/util/Map.html)<[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), [List](https://docs.oracle.com/javase/7/docs/api/java/util/List.html)<[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)>>  


[jvm]  
Brief description  


Get all values of the given header from the response



#### Return  


non -null but possibly empty array of [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) header values



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| name| <br><br><br><br>
  
  
Content  
open fun [headers](headers.md)(name: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)>  



