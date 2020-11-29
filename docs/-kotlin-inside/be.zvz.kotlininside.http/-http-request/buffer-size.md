---
title: bufferSize -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.http](../index.md)/[HttpRequest](index.md)/[bufferSize](buffer-size.md)



# bufferSize  
[jvm]  
Content  
open fun [bufferSize](buffer-size.md)(size: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [HttpRequest](index.md)  
More info  


Set the size used when buffering and copying between streams 



 This size is also used for send and receive buffers created for both char and byte arrays 



 The default buffer size is 8,192 bytes



#### Return  


request



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| <a name="be.zvz.kotlininside.http/HttpRequest/bufferSize/#int/PointingToDeclaration/"></a>size| <a name="be.zvz.kotlininside.http/HttpRequest/bufferSize/#int/PointingToDeclaration/"></a>
  
  


[jvm]  
Content  
open fun [bufferSize](buffer-size.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  
More info  


Get the configured buffer size 



 The default buffer size is 8,192 bytes



#### Return  


size

  



