---
title: bufferSize -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.http](../index.md)/[HttpRequest](index.md)/[bufferSize](buffer-size.md)



# bufferSize  
[jvm]  
Brief description  




Set the size used when buffering and copying between streams 



 This size is also used for send and receive buffers created for both char and byte arrays 



 The default buffer size is 8,192 bytes





#### Return  


this request



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| size| <br><br><br><br>
  
  
Content  
open fun [bufferSize](buffer-size.md)(size: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [HttpRequest](index.md)  


[jvm]  
Brief description  




Get the configured buffer size 



 The default buffer size is 8,192 bytes





#### Return  


buffer size

  
Content  
open fun [bufferSize](buffer-size.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  



