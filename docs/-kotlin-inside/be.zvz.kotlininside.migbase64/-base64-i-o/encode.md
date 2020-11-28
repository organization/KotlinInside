---
title: encode -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.migbase64](../index.md)/[Base64IO](index.md)/[encode](encode.md)



# encode  
[jvm]  
Content  
fun [encode](encode.md)(in: [InputStream](https://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html), out: [OutputStream](https://docs.oracle.com/javase/7/docs/api/java/io/OutputStream.html), lineSep: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html))  
More info  


Encodes a raw InputStream into a BASE64 OutputStream representation in accordance with RFC 2045. This implementation was inspired by MIG Base64 [encodeToByte](../-base64/encode-to-byte.md)



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| <a name="be.zvz.kotlininside.migbase64/Base64IO/encode/#java.io.InputStream#java.io.OutputStream#boolean/PointingToDeclaration/"></a>in| <a name="be.zvz.kotlininside.migbase64/Base64IO/encode/#java.io.InputStream#java.io.OutputStream#boolean/PointingToDeclaration/"></a>
| <a name="be.zvz.kotlininside.migbase64/Base64IO/encode/#java.io.InputStream#java.io.OutputStream#boolean/PointingToDeclaration/"></a>lineSep| <a name="be.zvz.kotlininside.migbase64/Base64IO/encode/#java.io.InputStream#java.io.OutputStream#boolean/PointingToDeclaration/"></a><br><br>Optional "\r\n" after 76 characters, unless end of file. No line separator will be in breach of RFC 2045 which specifies max 76 per line but will be a little faster.<br><br>
| <a name="be.zvz.kotlininside.migbase64/Base64IO/encode/#java.io.InputStream#java.io.OutputStream#boolean/PointingToDeclaration/"></a>out| <a name="be.zvz.kotlininside.migbase64/Base64IO/encode/#java.io.InputStream#java.io.OutputStream#boolean/PointingToDeclaration/"></a>
  
  



