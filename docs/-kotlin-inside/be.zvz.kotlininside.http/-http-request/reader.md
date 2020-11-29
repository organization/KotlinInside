---
title: reader -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.http](../index.md)/[HttpRequest](index.md)/[reader](reader.md)



# reader  
[jvm]  
Content  
open fun [reader](reader.md)(charset: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [InputStreamReader](https://docs.oracle.com/javase/7/docs/api/java/io/InputStreamReader.html)  
More info  


Get reader to response body using given character set. 



 This will fall back to using the UTF-8 character set if the given charset is null



#### Return  


## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| <a name="be.zvz.kotlininside.http/HttpRequest/reader/#java.lang.String/PointingToDeclaration/"></a>charset| <a name="be.zvz.kotlininside.http/HttpRequest/reader/#java.lang.String/PointingToDeclaration/"></a>
  
  


[jvm]  
Content  
open fun [reader](reader.md)(): [InputStreamReader](https://docs.oracle.com/javase/7/docs/api/java/io/InputStreamReader.html)  
More info  


Get reader to response body using the character set returned from [charset](charset.md)



#### Return  
  



