---
title: HttpRequest.Base64 - KotlinInside
---

[KotlinInside](../../../index.html) / [be.zvz.kotlininside.http](../../index.html) / [HttpRequest](../index.html) / [Base64](./index.html)

# Base64

(JVM) `open class Base64`

 Encodes and decodes to and from Base64 notation.



 I am placing this code in the Public Domain. Do with it as you will. This software comes with no guarantees or warranties but with plenty of well-wishing instead! Please visit [http://iharder.net/base64](http://iharder.net/base64) periodically to check for updates or to contribute improvements.

**Author**
Robert Harder

**Author**
rob@iharder.net

**Version**
2.3.7

### Functions

| (JVM) [encode](encode.html) | Encode string as a byte array in Base64 annotation.`open static fun encode(string: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!` |
| (JVM) [encodeBytes](encode-bytes.html) | Encodes a byte array into Base64 notation.`open static fun encodeBytes(source: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`!): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!`<br>`open static fun encodeBytes(source: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`!, off: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, len: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!` |
| (JVM) [encodeBytesToBytes](encode-bytes-to-bytes.html) | Similar to ``[`#encodeBytes(byte[], int, int)`](encode-bytes.html) but returns a byte array instead of instantiating a String. This is more efficient if you're working with I/O streams and have large data sets to encode.`open static fun encodeBytesToBytes(source: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`!, off: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, len: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`!` |

