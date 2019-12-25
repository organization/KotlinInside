---
title: HttpRequest.send - KotlinInside
---

[KotlinInside](../../index.html) / [be.zvz.kotlininside.http](../index.html) / [HttpRequest](index.html) / [send](./send.html)

# send

(JVM) `open fun send(input: `[`File`](https://docs.oracle.com/javase/7/docs/api/java/io/File.html)`!): `[`HttpRequest`](index.html)`!`

Write contents of file to request body

### Parameters

`input` - [File](https://docs.oracle.com/javase/7/docs/api/java/io/File.html)!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: this request

(JVM) `open fun send(input: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`!): `[`HttpRequest`](index.html)`!`

Write byte array to request body

### Parameters

`input` - [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: this request

(JVM) `open fun send(input: `[`InputStream`](https://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html)`!): `[`HttpRequest`](index.html)`!`

Write stream to request body

 The given stream will be closed once sending completes

### Parameters

`input` - [InputStream](https://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html)!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: this request

(JVM) `open fun send(input: `[`Reader`](https://docs.oracle.com/javase/7/docs/api/java/io/Reader.html)`!): `[`HttpRequest`](index.html)`!`

Write reader to request body

 The given reader will be closed once sending completes

### Parameters

`input` - [Reader](https://docs.oracle.com/javase/7/docs/api/java/io/Reader.html)!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: this request

(JVM) `open fun send(value: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`!): `[`HttpRequest`](index.html)`!`

Write char sequence to request body

 The charset configured via ``[`#contentType(String)`](content-type.html) will be used and UTF-8 will be used if it is unset.

### Parameters

`value` - [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: this request

