---
title: form -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.http](../index.md)/[HttpRequest](index.md)/[form](form.md)



# form  
[jvm]  
Brief description  




Write the values in the map as form data to the request body 



 The pairs specified will be URL-encoded in UTF-8 and sent with the 'application/x-www-form-urlencoded' content-type





#### Return  


this request



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| values| <br><br><br><br>
  
  
Content  
open fun [form](form.md)(values: [Map](https://docs.oracle.com/javase/7/docs/api/java/util/Map.html)<Out [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), Out [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>): [HttpRequest](index.md)  


[jvm]  
Brief description  




Write the key and value in the entry as form data to the request body 



 The pair specified will be URL-encoded in UTF-8 and sent with the 'application/x-www-form-urlencoded' content-type





#### Return  


this request



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| entry| <br><br><br><br>
  
  
Content  
open fun [form](form.md)(entry: [Map.Entry](https://docs.oracle.com/javase/7/docs/api/java/util/Map.Entry.html)<Out [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), Out [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>): [HttpRequest](index.md)  


[jvm]  
Brief description  




Write the key and value in the entry as form data to the request body 



 The pair specified will be URL-encoded and sent with the 'application/x-www-form-urlencoded' content-type





#### Return  


this request



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| charset| <br><br><br><br>
| entry| <br><br><br><br>
  
  
Content  
open fun [form](form.md)(entry: [Map.Entry](https://docs.oracle.com/javase/7/docs/api/java/util/Map.Entry.html)<Out [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), Out [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>, charset: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [HttpRequest](index.md)  


[jvm]  
Brief description  




Write the name/value pair as form data to the request body 



 The pair specified will be URL-encoded in UTF-8 and sent with the 'application/x-www-form-urlencoded' content-type





#### Return  


this request



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| name| <br><br><br><br>
| value| <br><br><br><br>
  
  
Content  
open fun [form](form.md)(name: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), value: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)): [HttpRequest](index.md)  


[jvm]  
Brief description  




Write the name/value pair as form data to the request body 



 The values specified will be URL-encoded and sent with the 'application/x-www-form-urlencoded' content-type





#### Return  


this request



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| charset| <br><br><br><br>
| name| <br><br><br><br>
| value| <br><br><br><br>
  
  
Content  
open fun [form](form.md)(name: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), value: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), charset: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [HttpRequest](index.md)  


[jvm]  
Brief description  


Write the values in the map as encoded form data to the request body



#### Return  


this request



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| charset| <br><br><br><br>
| values| <br><br><br><br>
  
  
Content  
open fun [form](form.md)(values: [Map](https://docs.oracle.com/javase/7/docs/api/java/util/Map.html)<Out [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), Out [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>, charset: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [HttpRequest](index.md)  



