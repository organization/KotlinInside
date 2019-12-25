---
title: HttpRequest.body - KotlinInside
---

[KotlinInside](../../index.html) / [be.zvz.kotlininside.http](../index.html) / [HttpRequest](index.html) / [body](./body.html)

# body

(JVM) `open fun body(charset: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!`

Get response as ``[`String`](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) in given character set

 This will fall back to using the UTF-8 character set if the given charset is null

### Parameters

`charset` - [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)!:

### Exceptions

`HttpRequestException` -

**Return**
[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)!: string

(JVM) `open fun body(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!`

Get response as ``[`String`](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) using character set returned from ``[`#charset()`](charset.html)

### Exceptions

`HttpRequestException` -

**Return**
[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)!: string

(JVM) `open fun body(output: `[`AtomicReference`](https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/atomic/AtomicReference.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!>!): `[`HttpRequest`](index.html)`!`

Get the response body as a ``[`String`](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) and set it as the value of the given reference.

### Parameters

`output` - [AtomicReference](https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/atomic/AtomicReference.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)!&gt;!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: this request

(JVM) `open fun body(output: `[`AtomicReference`](https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/atomic/AtomicReference.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!>!, charset: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!): `[`HttpRequest`](index.html)`!`

Get the response body as a ``[`String`](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) and set it as the value of the given reference.

### Parameters

`output` - [AtomicReference](https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/atomic/AtomicReference.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)!&gt;!:

`charset` - [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: this request

