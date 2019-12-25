---
title: HttpRequest.reader - KotlinInside
---

[KotlinInside](../../index.html) / [be.zvz.kotlininside.http](../index.html) / [HttpRequest](index.html) / [reader](./reader.html)

# reader

(JVM) `open fun reader(charset: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!): `[`InputStreamReader`](https://docs.oracle.com/javase/7/docs/api/java/io/InputStreamReader.html)`!`

Get reader to response body using given character set.

 This will fall back to using the UTF-8 character set if the given charset is null

### Parameters

`charset` - [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)!:

### Exceptions

`HttpRequestException` -

**Return**
[InputStreamReader](https://docs.oracle.com/javase/7/docs/api/java/io/InputStreamReader.html)!: reader

(JVM) `open fun reader(): `[`InputStreamReader`](https://docs.oracle.com/javase/7/docs/api/java/io/InputStreamReader.html)`!`

Get reader to response body using the character set returned from ``[`#charset()`](charset.html)

### Exceptions

`HttpRequestException` -

**Return**
[InputStreamReader](https://docs.oracle.com/javase/7/docs/api/java/io/InputStreamReader.html)!: reader

