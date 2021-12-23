---
title: Base64
---
//[KotlinInside](../../../../index.html)/[be.zvz.kotlininside.http](../../index.html)/[HttpRequest](../index.html)/[Base64](index.html)



# Base64



[jvm]\
open class [Base64](index.html)

 Encodes and decodes to and from Base64 notation. 



 I am placing this code in the Public Domain. Do with it as you will. This software comes with no guarantees or warranties but with plenty of well-wishing instead! Please visit [http://iharder.net/base64](http://iharder.net/base64) periodically to check for updates or to contribute improvements. 



#### Author



Robert Harder



rob@iharder.net



## Functions


| Name | Summary |
|---|---|
| [encode](encode.html) | [jvm]<br>open fun [encode](encode.html)(string: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)<br>Encode string as a byte array in Base64 annotation. |
| [encodeBytes](encode-bytes.html) | [jvm]<br>open fun [encodeBytes](encode-bytes.html)(source: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)&gt;): [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)<br>open fun [encodeBytes](encode-bytes.html)(source: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)&gt;, off: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), len: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)<br>Encodes a byte array into Base64 notation. |
| [encodeBytesToBytes](encode-bytes-to-bytes.html) | [jvm]<br>open fun [encodeBytesToBytes](encode-bytes-to-bytes.html)(source: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)&gt;, off: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), len: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)&gt;<br>Similar to [encodeBytes](encode-bytes.html) but returns a byte array instead of instantiating a String. |

