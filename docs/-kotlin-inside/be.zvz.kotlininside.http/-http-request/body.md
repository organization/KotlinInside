---
title: body -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.http](../index.md)/[HttpRequest](index.md)/[body](body.md)



# body  
[jvm]  
Brief description  




Get response as [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) in given character set 



 This will fall back to using the UTF-8 character set if the given charset is null





#### Return  


string



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| charset| <br><br><br><br>
  
  
Content  
open fun [body](body.md)(charset: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)  


[jvm]  
Brief description  


Get response as [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) using character set returned from [charset](charset.md)



#### Return  


string

  
Content  
open fun [body](body.md)(): [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)  


[jvm]  
Brief description  


Get the response body as a [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) and set it as the value of the given reference.



#### Return  


this request



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| output| <br><br><br><br>
  
  
Content  
open fun [body](body.md)(output: [AtomicReference](https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/atomic/AtomicReference.html)<[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)>): [HttpRequest](index.md)  


[jvm]  
Brief description  


Get the response body as a [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) and set it as the value of the given reference.



#### Return  


this request



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| charset| <br><br><br><br>
| output| <br><br><br><br>
  
  
Content  
open fun [body](body.md)(output: [AtomicReference](https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/atomic/AtomicReference.html)<[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)>, charset: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [HttpRequest](index.md)  



