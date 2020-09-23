---
title: send -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.http](../index.md)/[HttpRequest](index.md)/[send](send.md)



# send  
[jvm]  
Brief description  


Write contents of file to request body



#### Return  


this request



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| input| <br><br><br><br>
  
  
Content  
open fun [send](send.md)(input: [File](https://docs.oracle.com/javase/7/docs/api/java/io/File.html)): [HttpRequest](index.md)  


[jvm]  
Brief description  


Write byte array to request body



#### Return  


this request



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| input| <br><br><br><br>
  
  
Content  
open fun [send](send.md)(input: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)>): [HttpRequest](index.md)  


[jvm]  
Brief description  




Write stream to request body 



 The given stream will be closed once sending completes





#### Return  


this request



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| input| <br><br><br><br>
  
  
Content  
open fun [send](send.md)(input: [InputStream](https://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html)): [HttpRequest](index.md)  


[jvm]  
Brief description  




Write reader to request body 



 The given reader will be closed once sending completes





#### Return  


this request



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| input| <br><br><br><br>
  
  
Content  
open fun [send](send.md)(input: [Reader](https://docs.oracle.com/javase/7/docs/api/java/io/Reader.html)): [HttpRequest](index.md)  


[jvm]  
Brief description  




Write char sequence to request body 



 The charset configured via [contentType](content-type.md) will be used and UTF-8 will be used if it is unset.





#### Return  


this request



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| value| <br><br><br><br>
  
  
Content  
open fun [send](send.md)(value: [CharSequence](https://docs.oracle.com/javase/7/docs/api/java/lang/CharSequence.html)): [HttpRequest](index.md)  



