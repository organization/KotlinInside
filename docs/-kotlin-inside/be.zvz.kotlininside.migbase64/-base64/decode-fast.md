---
title: Base64.decodeFast - KotlinInside
---

[KotlinInside](../../index.html) / [be.zvz.kotlininside.migbase64](../index.html) / [Base64](index.html) / [decodeFast](./decode-fast.html)

# decodeFast

(JVM) `static fun decodeFast(sArr: `[`CharArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-array/index.html)`!): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`!`

Decodes a BASE64 encoded char array that is known to be resonably well formatted. The method is about twice as fast as ``[`#decode(char[])`](decode.html). The preconditions are: + The array must have a line length of 76 chars OR no line separators at all (one line). + Line separator must be "\r\n", as specified in RFC 2045 + The array must not contain illegal characters within the encoded string + The array CAN have illegal characters at the beginning and end, those will be dealt with appropriately.

### Parameters

`sArr` - [CharArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-array/index.html)!: The source array. Length 0 will return an empty array. `null` will throw an exception.

**Return**
[ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)!: The decoded array of bytes. May be of length 0.

(JVM) `static fun decodeFast(sArr: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`!): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`!`

Decodes a BASE64 encoded byte array that is known to be resonably well formatted. The method is about twice as fast as ``[`#decode(byte[])`](decode.html). The preconditions are: + The array must have a line length of 76 chars OR no line separators at all (one line). + Line separator must be "\r\n", as specified in RFC 2045 + The array must not contain illegal characters within the encoded string + The array CAN have illegal characters at the beginning and end, those will be dealt with appropriately.

### Parameters

`sArr` - [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)!: The source array. Length 0 will return an empty array. `null` will throw an exception.

**Return**
[ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)!: The decoded array of bytes. May be of length 0.

(JVM) `static fun decodeFast(s: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`!`

Decodes a BASE64 encoded string that is known to be resonably well formatted. The method is about twice as fast as ``[`#decode(String)`](decode.html). The preconditions are: + The array must have a line length of 76 chars OR no line separators at all (one line). + Line separator must be "\r\n", as specified in RFC 2045 + The array must not contain illegal characters within the encoded string + The array CAN have illegal characters at the beginning and end, those will be dealt with appropriately.

### Parameters

`s` - [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)!: The source string. Length 0 will return an empty array. `null` will throw an exception.

**Return**
[ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)!: The decoded array of bytes. May be of length 0.

