---
title: HttpRequest.bufferedReader - KotlinInside
---

[KotlinInside](../../index.html) / [be.zvz.kotlininside.http](../index.html) / [HttpRequest](index.html) / [bufferedReader](./buffered-reader.html)

# bufferedReader

(JVM) `open fun bufferedReader(charset: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!): `[`BufferedReader`](https://docs.oracle.com/javase/7/docs/api/java/io/BufferedReader.html)`!`

Get buffered reader to response body using the given character set r and the configured buffer size

### Parameters

`charset` - [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)!:

### Exceptions

`HttpRequestException` -

**Return**
[BufferedReader](https://docs.oracle.com/javase/7/docs/api/java/io/BufferedReader.html)!: reader

**See Also**
[#bufferSize(int)](buffer-size.html)

(JVM) `open fun bufferedReader(): `[`BufferedReader`](https://docs.oracle.com/javase/7/docs/api/java/io/BufferedReader.html)`!`

Get buffered reader to response body using the character set returned from ``[`#charset()`](charset.html) and the configured buffer size

### Exceptions

`HttpRequestException` -

**Return**
[BufferedReader](https://docs.oracle.com/javase/7/docs/api/java/io/BufferedReader.html)!: reader

**See Also**
[#bufferSize(int)](buffer-size.html)

