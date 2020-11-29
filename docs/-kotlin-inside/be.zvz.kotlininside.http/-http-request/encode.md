---
title: encode -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.http](../index.md)/[HttpRequest](index.md)/[encode](encode.md)



# encode  
[jvm]  
Content  
open fun [encode](encode.md)(url: [CharSequence](https://docs.oracle.com/javase/7/docs/api/java/lang/CharSequence.html)): [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)  
More info  


Encode the given URL as an ASCII [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)



 This method ensures the path and query segments of the URL are properly encoded such as ' ' characters being encoded to '%20' or any UTF-8 characters that are non-ASCII. No encoding of URLs is done by default by the [HttpRequest](index.md) constructors and so if URL encoding is needed this method should be called before calling the [HttpRequest](index.md) constructor.



#### Return  


URL



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| <a name="be.zvz.kotlininside.http/HttpRequest/encode/#java.lang.CharSequence/PointingToDeclaration/"></a>url| <a name="be.zvz.kotlininside.http/HttpRequest/encode/#java.lang.CharSequence/PointingToDeclaration/"></a>
  
  



