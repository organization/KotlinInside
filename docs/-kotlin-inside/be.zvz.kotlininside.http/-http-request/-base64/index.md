---
title: Base64 -
---
//[KotlinInside](../../../index.md)/[be.zvz.kotlininside.http](../../index.md)/[HttpRequest](../index.md)/[Base64](index.md)



# Base64  
 [jvm] open class [Base64](index.md)

 Encodes and decodes to and from Base64 notation. 



 I am placing this code in the Public Domain. Do with it as you will. This software comes with no guarantees or warranties but with plenty of well-wishing instead! Please visit [http://iharder.net/base64](http://iharder.net/base64) periodically to check for updates or to contribute improvements. 



#### Author  


Robert Harder



rob@iharder.net

   


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="be.zvz.kotlininside.http/HttpRequest.Base64/encode/#java.lang.String/PointingToDeclaration/"></a>[encode](encode.md)| <a name="be.zvz.kotlininside.http/HttpRequest.Base64/encode/#java.lang.String/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [encode](encode.md)(string: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)  <br>More info  <br>Encode string as a byte array in Base64 annotation.  <br><br><br>
| <a name="be.zvz.kotlininside.http/HttpRequest.Base64/encodeBytes/#byte[]/PointingToDeclaration/"></a>[encodeBytes](encode-bytes.md)| <a name="be.zvz.kotlininside.http/HttpRequest.Base64/encodeBytes/#byte[]/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [encodeBytes](encode-bytes.md)(source: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)>): [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)  <br>open fun [encodeBytes](encode-bytes.md)(source: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)>, off: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), len: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)  <br>More info  <br>Encodes a byte array into Base64 notation.  <br><br><br>
| <a name="be.zvz.kotlininside.http/HttpRequest.Base64/encodeBytesToBytes/#byte[]#int#int/PointingToDeclaration/"></a>[encodeBytesToBytes](encode-bytes-to-bytes.md)| <a name="be.zvz.kotlininside.http/HttpRequest.Base64/encodeBytesToBytes/#byte[]#int#int/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [encodeBytesToBytes](encode-bytes-to-bytes.md)(source: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)>, off: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), len: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)>  <br>More info  <br>Similar to [encodeBytes](encode-bytes.md) but returns a byte array instead of instantiating a String.  <br><br><br>

