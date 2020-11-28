---
title: body -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.http](../index.md)/[HttpRequest](index.md)/[body](body.md)



# body  
[jvm]  
Content  
open fun [body](body.md)(charset: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)  
More info  


Get response as [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) in given character set 



 This will fall back to using the UTF-8 character set if the given charset is null



#### Return  


## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| <a name="be.zvz.kotlininside.http/HttpRequest/body/#java.lang.String/PointingToDeclaration/"></a>charset| <a name="be.zvz.kotlininside.http/HttpRequest/body/#java.lang.String/PointingToDeclaration/"></a>
  
  


[jvm]  
Content  
open fun [body](body.md)(): [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)  
More info  


Get response as [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) using character set returned from [charset](charset.md)



#### Return  
  


[jvm]  
Content  
open fun [body](body.md)(output: [AtomicReference](https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/atomic/AtomicReference.html)<[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)>): [HttpRequest](index.md)  
More info  


Get the response body as a [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) and set it as the value of the given reference.



#### Return  


request



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| <a name="be.zvz.kotlininside.http/HttpRequest/body/#java.util.concurrent.atomic.AtomicReference<java.lang.String>/PointingToDeclaration/"></a>output| <a name="be.zvz.kotlininside.http/HttpRequest/body/#java.util.concurrent.atomic.AtomicReference<java.lang.String>/PointingToDeclaration/"></a>
  
  


[jvm]  
Content  
open fun [body](body.md)(output: [AtomicReference](https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/atomic/AtomicReference.html)<[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)>, charset: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [HttpRequest](index.md)  
More info  


Get the response body as a [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) and set it as the value of the given reference.



#### Return  


request



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| <a name="be.zvz.kotlininside.http/HttpRequest/body/#java.util.concurrent.atomic.AtomicReference<java.lang.String>#java.lang.String/PointingToDeclaration/"></a>charset| <a name="be.zvz.kotlininside.http/HttpRequest/body/#java.util.concurrent.atomic.AtomicReference<java.lang.String>#java.lang.String/PointingToDeclaration/"></a>
| <a name="be.zvz.kotlininside.http/HttpRequest/body/#java.util.concurrent.atomic.AtomicReference<java.lang.String>#java.lang.String/PointingToDeclaration/"></a>output| <a name="be.zvz.kotlininside.http/HttpRequest/body/#java.util.concurrent.atomic.AtomicReference<java.lang.String>#java.lang.String/PointingToDeclaration/"></a>
  
  



