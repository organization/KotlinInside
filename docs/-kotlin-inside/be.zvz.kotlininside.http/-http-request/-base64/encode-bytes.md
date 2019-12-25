---
title: HttpRequest.Base64.encodeBytes - KotlinInside
---

[KotlinInside](../../../index.html) / [be.zvz.kotlininside.http](../../index.html) / [HttpRequest](../index.html) / [Base64](index.html) / [encodeBytes](./encode-bytes.html)

# encodeBytes

(JVM) `open static fun encodeBytes(source: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`!): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!`

Encodes a byte array into Base64 notation.

### Parameters

`source` - [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)!: The data to convert

### Exceptions

`NullPointerException` - if source array is null

`IllegalArgumentException` - if source array, offset, or length are invalid

**Return**
[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)!: The Base64-encoded data as a String

**Since**
2.0

(JVM) `open static fun encodeBytes(source: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`!, off: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, len: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!`

Encodes a byte array into Base64 notation.

### Parameters

`source` - [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)!: The data to convert

`off` - [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html): Offset in array where conversion should begin

`len` - [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html): Length of data to convert

### Exceptions

`NullPointerException` - if source array is null

`IllegalArgumentException` - if source array, offset, or length are invalid

**Return**
[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)!: The Base64-encoded data as a String

**Since**
2.0

