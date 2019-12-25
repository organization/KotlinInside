---
title: HttpRequest.ignoreCloseExceptions - KotlinInside
---

[KotlinInside](../../index.html) / [be.zvz.kotlininside.http](../index.html) / [HttpRequest](index.html) / [ignoreCloseExceptions](./ignore-close-exceptions.html)

# ignoreCloseExceptions

(JVM) `open fun ignoreCloseExceptions(ignore: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`HttpRequest`](index.html)`!`

Set whether or not to ignore exceptions that occur from calling ``[`Closeable#close()`](https://docs.oracle.com/javase/7/docs/api/java/io/Closeable.html#close())

 The default value of this setting is `true`

### Parameters

`ignore` - [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html):

**Return**
[HttpRequest](index.html)!: this request

(JVM) `open fun ignoreCloseExceptions(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Get whether or not exceptions thrown by ``[`Closeable#close()`](https://docs.oracle.com/javase/7/docs/api/java/io/Closeable.html#close()) are ignored

**Return**
[Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html): true if ignoring, false if throwing

