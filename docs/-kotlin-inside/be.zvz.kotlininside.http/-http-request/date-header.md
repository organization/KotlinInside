---
title: dateHeader -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.http](../index.md)/[HttpRequest](index.md)/[dateHeader](date-header.md)



# dateHeader  
[jvm]  
Brief description  


Get a date header from the response falling back to returning -1 if the header is missing or parsing fails



#### Return  


date, -1 on failures



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| name| <br><br><br><br>
  
  
Content  
open fun [dateHeader](date-header.md)(name: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)  


[jvm]  
Brief description  


Get a date header from the response falling back to returning the given default value if the header is missing or parsing fails



#### Return  


date, default value on failures



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| defaultValue| <br><br><br><br>
| name| <br><br><br><br>
  
  
Content  
open fun [dateHeader](date-header.md)(name: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), defaultValue: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)  



