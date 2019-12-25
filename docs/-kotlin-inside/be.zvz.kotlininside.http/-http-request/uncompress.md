---
title: HttpRequest.uncompress - KotlinInside
---

[KotlinInside](../../index.html) / [be.zvz.kotlininside.http](../index.html) / [HttpRequest](index.html) / [uncompress](./uncompress.html)

# uncompress

(JVM) `open fun uncompress(uncompress: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`HttpRequest`](index.html)`!`

Set whether or not the response body should be automatically uncompressed when read from.

 This will only affect requests that have the 'Content-Encoding' response header set to 'gzip'.

 This causes all receive methods to use a ``[`GZIPInputStream`](https://docs.oracle.com/javase/7/docs/api/java/util/zip/GZIPInputStream.html) when applicable so that higher level streams and readers can read the data uncompressed.

 Setting this option does not cause any request headers to be set automatically so ``[`#acceptGzipEncoding()`](accept-gzip-encoding.html) should be used in conjunction with this setting to tell the server to gzip the response.

### Parameters

`uncompress` - [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html):

**Return**
[HttpRequest](index.html)!: this request

