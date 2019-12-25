---
title: HttpRequest.encode - KotlinInside
---

[KotlinInside](../../index.html) / [be.zvz.kotlininside.http](../index.html) / [HttpRequest](index.html) / [encode](./encode.html)

# encode

(JVM) `open static fun encode(url: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`!): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!`

Encode the given URL as an ASCII ``[`String`](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)

 This method ensures the path and query segments of the URL are properly encoded such as ' ' characters being encoded to '%20' or any UTF-8 characters that are non-ASCII. No encoding of URLs is done by default by the ``[`HttpRequest`](index.html) constructors and so if URL encoding is needed this method should be called before calling the ``[`HttpRequest`](index.html) constructor.

### Parameters

`url` - [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)!:

### Exceptions

`HttpRequestException` -

**Return**
[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)!: encoded URL

