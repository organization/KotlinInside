---
title: HttpRequest.contentType - KotlinInside
---

[KotlinInside](../../index.html) / [be.zvz.kotlininside.http](../index.html) / [HttpRequest](index.html) / [contentType](./content-type.html)

# contentType

(JVM) `open fun contentType(contentType: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!): `[`HttpRequest`](index.html)`!`

Set the 'Content-Type' request header to the given value

### Parameters

`contentType` - [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)!:

**Return**
[HttpRequest](index.html)!: this request

(JVM) `open fun contentType(contentType: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!, charset: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!): `[`HttpRequest`](index.html)`!`

Set the 'Content-Type' request header to the given value and charset

### Parameters

`contentType` - [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)!:

`charset` - [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)!:

**Return**
[HttpRequest](index.html)!: this request

(JVM) `open fun contentType(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!`

Get the 'Content-Type' header from the response

**Return**
[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)!: response header value

