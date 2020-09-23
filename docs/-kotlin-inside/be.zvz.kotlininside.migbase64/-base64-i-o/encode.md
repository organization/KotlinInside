---
title: encode -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.migbase64](../index.md)/[Base64IO](index.md)/[encode](encode.md)



# encode  
[jvm]  
Brief description  


Encodes a raw InputStream into a BASE64 OutputStream representation in accordance with RFC 2045. This implementation was inspired by MIG Base64 [encodeToByte](../-base64/encode-to-byte.md)



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| in| <br><br><br><br>
| lineSep| <br><br>Optional "\r\n" after 76 characters, unless end of file. No line separator will be in breach of RFC 2045 which specifies max 76 per line but will be a little faster.<br><br>
| out| <br><br><br><br>
  
  
Content  
fun [encode](encode.md)(in: [InputStream](https://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html), out: [OutputStream](https://docs.oracle.com/javase/7/docs/api/java/io/OutputStream.html), lineSep: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html))  



