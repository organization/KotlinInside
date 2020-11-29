---
title: uncompress -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.http](../index.md)/[HttpRequest](index.md)/[uncompress](uncompress.md)



# uncompress  
[jvm]  
Content  
open fun [uncompress](uncompress.md)(uncompress: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)): [HttpRequest](index.md)  
More info  


Set whether or not the response body should be automatically uncompressed when read from. 



 This will only affect requests that have the 'Content-Encoding' response header set to 'gzip'. 



 This causes all receive methods to use a [GZIPInputStream](https://docs.oracle.com/javase/7/docs/api/java/util/zip/GZIPInputStream.html) when applicable so that higher level streams and readers can read the data uncompressed. 



 Setting this option does not cause any request headers to be set automatically so [acceptGzipEncoding](accept-gzip-encoding.md) should be used in conjunction with this setting to tell the server to gzip the response.



#### Return  


request



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| <a name="be.zvz.kotlininside.http/HttpRequest/uncompress/#boolean/PointingToDeclaration/"></a>uncompress| <a name="be.zvz.kotlininside.http/HttpRequest/uncompress/#boolean/PointingToDeclaration/"></a>
  
  



