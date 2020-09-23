---
title: header -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.http](../index.md)/[HttpRequest](index.md)/[header](header.md)



# header  
[jvm]  
Brief description  


Set header name to given value



#### Return  


this request



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| name| <br><br><br><br>
| value| <br><br><br><br>
  
  
Content  
open fun [header](header.md)(name: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), value: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [HttpRequest](index.md)  
open fun [header](header.md)(name: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), value: [Number](https://docs.oracle.com/javase/7/docs/api/java/lang/Number.html)): [HttpRequest](index.md)  


[jvm]  
Brief description  


Set header to have given entry's key as the name and value as the value



#### Return  


this request



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| header| <br><br><br><br>
  
  
Content  
open fun [header](header.md)(header: [Map.Entry](https://docs.oracle.com/javase/7/docs/api/java/util/Map.Entry.html)<[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)>): [HttpRequest](index.md)  


[jvm]  
Brief description  


Get a response header



#### Return  


response header



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| name| <br><br><br><br>
  
  
Content  
open fun [header](header.md)(name: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)  



