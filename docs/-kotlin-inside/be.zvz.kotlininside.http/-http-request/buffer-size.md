---
title: HttpRequest.bufferSize - KotlinInside
---

[KotlinInside](../../index.html) / [be.zvz.kotlininside.http](../index.html) / [HttpRequest](index.html) / [bufferSize](./buffer-size.html)

# bufferSize

(JVM) `open fun bufferSize(size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`HttpRequest`](index.html)`!`

Set the size used when buffering and copying between streams

 This size is also used for send and receive buffers created for both char and byte arrays

 The default buffer size is 8,192 bytes

### Parameters

`size` - [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html):

**Return**
[HttpRequest](index.html)!: this request

(JVM) `open fun bufferSize(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)

Get the configured buffer size

 The default buffer size is 8,192 bytes

**Return**
[Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html): buffer size

