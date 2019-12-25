---
title: HttpRequest.receive - KotlinInside
---

[KotlinInside](../../index.html) / [be.zvz.kotlininside.http](../index.html) / [HttpRequest](index.html) / [receive](./receive.html)

# receive

(JVM) `open fun receive(file: `[`File`](https://docs.oracle.com/javase/7/docs/api/java/io/File.html)`!): `[`HttpRequest`](index.html)`!`

Stream response body to file

### Parameters

`file` - [File](https://docs.oracle.com/javase/7/docs/api/java/io/File.html)!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: this request

(JVM) `open fun receive(output: `[`OutputStream`](https://docs.oracle.com/javase/7/docs/api/java/io/OutputStream.html)`!): `[`HttpRequest`](index.html)`!`

Stream response to given output stream

### Parameters

`output` - [OutputStream](https://docs.oracle.com/javase/7/docs/api/java/io/OutputStream.html)!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: this request

(JVM) `open fun receive(output: `[`PrintStream`](https://docs.oracle.com/javase/7/docs/api/java/io/PrintStream.html)`!): `[`HttpRequest`](index.html)`!`

Stream response to given print stream

### Parameters

`output` - [PrintStream](https://docs.oracle.com/javase/7/docs/api/java/io/PrintStream.html)!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: this request

(JVM) `open fun receive(appendable: `[`Appendable`](https://docs.oracle.com/javase/7/docs/api/java/lang/Appendable.html)`!): `[`HttpRequest`](index.html)`!`

Receive response into the given appendable

### Parameters

`appendable` - [Appendable](https://docs.oracle.com/javase/7/docs/api/java/lang/Appendable.html)!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: this request

(JVM) `open fun receive(writer: `[`Writer`](https://docs.oracle.com/javase/7/docs/api/java/io/Writer.html)`!): `[`HttpRequest`](index.html)`!`

Receive response into the given writer

### Parameters

`writer` - [Writer](https://docs.oracle.com/javase/7/docs/api/java/io/Writer.html)!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: this request

