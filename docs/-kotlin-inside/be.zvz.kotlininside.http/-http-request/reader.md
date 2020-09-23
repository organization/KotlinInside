---
title: reader -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.http](../index.md)/[HttpRequest](index.md)/[reader](reader.md)



# reader  
[jvm]  
Brief description  




Get reader to response body using given character set. 



 This will fall back to using the UTF-8 character set if the given charset is null





#### Return  


reader



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| charset| <br><br><br><br>
  
  
Content  
open fun [reader](reader.md)(charset: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [InputStreamReader](https://docs.oracle.com/javase/7/docs/api/java/io/InputStreamReader.html)  


[jvm]  
Brief description  


Get reader to response body using the character set returned from [charset](charset.md)



#### Return  


reader

  
Content  
open fun [reader](reader.md)(): [InputStreamReader](https://docs.oracle.com/javase/7/docs/api/java/io/InputStreamReader.html)  



