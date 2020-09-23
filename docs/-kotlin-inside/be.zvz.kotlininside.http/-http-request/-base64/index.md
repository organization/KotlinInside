---
title: Base64 -
---
//[KotlinInside](../../../index.md)/[be.zvz.kotlininside.http](../../index.md)/[HttpRequest](../index.md)/[Base64](index.md)



# Base64  
 [jvm] 



 Encodes and decodes to and from Base64 notation. 



 I am placing this code in the Public Domain. Do with it as you will. This software comes with no guarantees or warranties but with plenty of well-wishing instead! Please visit [http://iharder.net/base64](http://iharder.net/base64) periodically to check for updates or to contribute improvements. 





#### Author  


rob @iharder.net

open class [Base64](index.md)   


## Functions  
  
|  Name|  Summary| 
|---|---|
| [encode](encode.md)| [jvm]  <br>Brief description  <br><br><br>Encode string as a byte array in Base64 annotation.<br><br>  <br>Content  <br>open fun [encode](encode.md)(string: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)  <br><br><br>
| [encodeBytes](encode-bytes.md)| [jvm]  <br>Brief description  <br><br><br>Encodes a byte array into Base64 notation.<br><br>  <br>Content  <br>open fun [encodeBytes](encode-bytes.md)(source: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)>): [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)  <br>open fun [encodeBytes](encode-bytes.md)(source: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)>, off: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), len: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)  <br><br><br>
| [encodeBytesToBytes](encode-bytes-to-bytes.md)| [jvm]  <br>Brief description  <br><br><br>Similar to [encodeBytes](encode-bytes.md) but returns a byte array instead of instantiating a String. This is more efficient if you're working with I/O streams and have large data sets to encode.<br><br>  <br>Content  <br>open fun [encodeBytesToBytes](encode-bytes-to-bytes.md)(source: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)>, off: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), len: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)>  <br><br><br>

