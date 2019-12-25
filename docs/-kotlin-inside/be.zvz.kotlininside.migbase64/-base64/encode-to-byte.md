---
title: Base64.encodeToByte - KotlinInside
---

[KotlinInside](../../index.html) / [be.zvz.kotlininside.migbase64](../index.html) / [Base64](index.html) / [encodeToByte](./encode-to-byte.html)

# encodeToByte

(JVM) `static fun encodeToByte(sArr: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`!, lineSep: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`!`

Encodes a raw byte array into a BASE64 `byte[]` representation i accordance with RFC 2045.

### Parameters

`sArr` - [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)!: The bytes to convert. If `null` or length 0 an empty array will be returned.

`lineSep` - [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html): Optional "\r\n" after 76 characters, unless end of file. No line separator will be in breach of RFC 2045 which specifies max 76 per line but will be a little faster.

**Return**
[ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)!: A BASE64 encoded array. Never `null`.

(JVM) `static fun encodeToByte(sArr: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`!, sOff: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, sLen: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, lineSep: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`!`

Encodes a raw byte array into a BASE64 `byte[]` representation i accordance with RFC 2045.

### Parameters

`sArr` - [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)!: The bytes to convert. If `null` an empty array will be returned.

`sOff` - [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html): The starting position in the bytes to convert.

`sLen` - [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html): The number of bytes to convert. If 0 an empty array will be returned.

`lineSep` - [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html): Optional "\r\n" after 76 characters, unless end of file. No line separator will be in breach of RFC 2045 which specifies max 76 per line but will be a little faster.

**Return**
[ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)!: A BASE64 encoded array. Never `null`.

