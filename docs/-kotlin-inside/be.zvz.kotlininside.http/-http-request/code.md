---
title: HttpRequest.code - KotlinInside
---

[KotlinInside](../../index.html) / [be.zvz.kotlininside.http](../index.html) / [HttpRequest](index.html) / [code](./code.html)

# code

(JVM) `open fun code(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)

Get the status code of the response

### Exceptions

`HttpRequestException` -

**Return**
[Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html): the response code

(JVM) `open fun code(output: `[`AtomicInteger`](https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/atomic/AtomicInteger.html)`!): `[`HttpRequest`](index.html)`!`

Set the value of the given ``[`AtomicInteger`](https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/atomic/AtomicInteger.html) to the status code of the response

### Parameters

`output` - [AtomicInteger](https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/atomic/AtomicInteger.html)!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: this request

