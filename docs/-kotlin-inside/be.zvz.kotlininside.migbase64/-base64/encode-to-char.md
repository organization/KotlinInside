---
title: Base64.encodeToChar - KotlinInside
---

[KotlinInside](../../index.html) / [be.zvz.kotlininside.migbase64](../index.html) / [Base64](index.html) / [encodeToChar](./encode-to-char.html)

# encodeToChar

(JVM) `static fun encodeToChar(sArr: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`!, lineSep: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`CharArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-array/index.html)`!`

Encodes a raw byte array into a BASE64 `char[]` representation i accordance with RFC 2045.

### Parameters

`sArr` - [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)!: The bytes to convert. If `null` or length 0 an empty array will be returned.

`lineSep` - [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html): Optional "\r\n" after 76 characters, unless end of file. No line separator will be in breach of RFC 2045 which specifies max 76 per line but will be a little faster.

**Return**
[CharArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-array/index.html)!: A BASE64 encoded array. Never `null`.

