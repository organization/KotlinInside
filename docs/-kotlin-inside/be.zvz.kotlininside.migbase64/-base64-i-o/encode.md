---
title: Base64IO.encode - KotlinInside
---

[KotlinInside](../../index.html) / [be.zvz.kotlininside.migbase64](../index.html) / [Base64IO](index.html) / [encode](./encode.html)

# encode

(JVM) `static fun encode(in: `[`InputStream`](https://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html)`!, out: `[`OutputStream`](https://docs.oracle.com/javase/7/docs/api/java/io/OutputStream.html)`!, lineSep: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Encodes a raw InputStream into a BASE64 OutputStream representation in accordance with RFC 2045. This implementation was inspired by MIG Base64 ``[`Base64#encodeToByte(byte[], boolean)`](../-base64/encode-to-byte.html)

### Parameters

`in` - [InputStream](https://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html)!:

`out` - [OutputStream](https://docs.oracle.com/javase/7/docs/api/java/io/OutputStream.html)!:

`lineSep` - [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html): Optional "\r\n" after 76 characters, unless end of file. No line separator will be in breach of RFC 2045 which specifies max 76 per line but will be a little faster.

### Exceptions

`IOException` - 