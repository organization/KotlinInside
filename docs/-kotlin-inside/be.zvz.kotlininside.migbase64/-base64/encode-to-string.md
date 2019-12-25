---
title: Base64.encodeToString - KotlinInside
---

[KotlinInside](../../index.html) / [be.zvz.kotlininside.migbase64](../index.html) / [Base64](index.html) / [encodeToString](./encode-to-string.html)

# encodeToString

(JVM) `static fun encodeToString(sArr: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`!, lineSep: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!`

Encodes a raw byte array into a BASE64 `String` representation i accordance with RFC 2045.

### Parameters

`sArr` - [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)!: The bytes to convert. If `null` or length 0 an empty array will be returned.

`lineSep` - [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html): Optional "\r\n" after 76 characters, unless end of file. No line separator will be in breach of RFC 2045 which specifies max 76 per line but will be a little faster.

**Return**
[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)!: A BASE64 encoded array. Never `null`.

