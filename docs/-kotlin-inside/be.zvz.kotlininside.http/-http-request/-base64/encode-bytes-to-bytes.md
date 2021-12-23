---
title: encodeBytesToBytes
---
//[KotlinInside](../../../../index.html)/[be.zvz.kotlininside.http](../../index.html)/[HttpRequest](../index.html)/[Base64](index.html)/[encodeBytesToBytes](encode-bytes-to-bytes.html)



# encodeBytesToBytes



[jvm]\
open fun [encodeBytesToBytes](encode-bytes-to-bytes.html)(source: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)&gt;, off: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), len: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)&gt;



Similar to [encodeBytes](encode-bytes.html) but returns a byte array instead of instantiating a String. This is more efficient if you're working with I/O streams and have large data sets to encode.



#### Return



The Base64-encoded data as a String if there is an error



## Parameters


jvm

| | |
|---|---|
| source | The data to convert |
| off | Offset in array where conversion should begin |
| len | Length of data to convert |



## Throws


| | |
|---|---|
| [java.lang.NullPointerException](https://docs.oracle.com/javase/7/docs/api/java/lang/NullPointerException.html) | if source array is null |
| [java.lang.IllegalArgumentException](https://docs.oracle.com/javase/7/docs/api/java/lang/IllegalArgumentException.html) | if source array, offset, or length are invalid |



