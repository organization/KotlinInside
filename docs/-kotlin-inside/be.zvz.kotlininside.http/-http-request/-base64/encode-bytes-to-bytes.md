---
title: HttpRequest.Base64.encodeBytesToBytes - KotlinInside
---

[KotlinInside](../../../index.html) / [be.zvz.kotlininside.http](../../index.html) / [HttpRequest](../index.html) / [Base64](index.html) / [encodeBytesToBytes](./encode-bytes-to-bytes.html)

# encodeBytesToBytes

(JVM) `open static fun encodeBytesToBytes(source: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`!, off: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, len: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`!`

Similar to ``[`#encodeBytes(byte[], int, int)`](encode-bytes.html) but returns a byte array instead of instantiating a String. This is more efficient if you're working with I/O streams and have large data sets to encode.

### Parameters

`source` - [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)!: The data to convert

`off` - [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html): Offset in array where conversion should begin

`len` - [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html): Length of data to convert

### Exceptions

`NullPointerException` - if source array is null

`IllegalArgumentException` - if source array, offset, or length are invalid

**Return**
[ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)!: The Base64-encoded data as a String if there is an error

**Since**
2.3.1

