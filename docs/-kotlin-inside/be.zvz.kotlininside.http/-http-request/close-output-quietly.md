---
title: HttpRequest.closeOutputQuietly - KotlinInside
---

[KotlinInside](../../index.html) / [be.zvz.kotlininside.http](../index.html) / [HttpRequest](index.html) / [closeOutputQuietly](./close-output-quietly.html)

# closeOutputQuietly

(JVM) `protected open fun closeOutputQuietly(): `[`HttpRequest`](index.html)`!`

Call ``[`#closeOutput()`](close-output.html) and re-throw a caught ``[`IOException`](https://docs.oracle.com/javase/7/docs/api/java/io/IOException.html)s as an ``[`HttpRequestException`](-http-request-exception/index.html)

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: this request

