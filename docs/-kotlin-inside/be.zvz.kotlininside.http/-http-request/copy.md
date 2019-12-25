---
title: HttpRequest.copy - KotlinInside
---

[KotlinInside](../../index.html) / [be.zvz.kotlininside.http](../index.html) / [HttpRequest](index.html) / [copy](./copy.html)

# copy

(JVM) `protected open fun copy(input: `[`InputStream`](https://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html)`!, output: `[`OutputStream`](https://docs.oracle.com/javase/7/docs/api/java/io/OutputStream.html)`!): `[`HttpRequest`](index.html)`!`

Copy from input stream to output stream

### Parameters

`input` - [InputStream](https://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html)!:

`output` - [OutputStream](https://docs.oracle.com/javase/7/docs/api/java/io/OutputStream.html)!:

### Exceptions

`IOException` -

**Return**
[HttpRequest](index.html)!: this request

(JVM) `protected open fun copy(input: `[`Reader`](https://docs.oracle.com/javase/7/docs/api/java/io/Reader.html)`!, output: `[`Writer`](https://docs.oracle.com/javase/7/docs/api/java/io/Writer.html)`!): `[`HttpRequest`](index.html)`!`

Copy from reader to writer

### Parameters

`input` - [Reader](https://docs.oracle.com/javase/7/docs/api/java/io/Reader.html)!:

`output` - [Writer](https://docs.oracle.com/javase/7/docs/api/java/io/Writer.html)!:

### Exceptions

`IOException` -

**Return**
[HttpRequest](index.html)!: this request

