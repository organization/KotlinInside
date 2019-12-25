---
title: HttpRequest.intHeader - KotlinInside
---

[KotlinInside](../../index.html) / [be.zvz.kotlininside.http](../index.html) / [HttpRequest](index.html) / [intHeader](./int-header.html)

# intHeader

(JVM) `open fun intHeader(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)

Get an integer header from the response falling back to returning -1 if the header is missing or parsing fails

### Parameters

`name` - [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)!:

### Exceptions

`HttpRequestException` -

**Return**
[Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html): header value as an integer, -1 when missing or parsing fails

(JVM) `open fun intHeader(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!, defaultValue: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)

Get an integer header value from the response falling back to the given default value if the header is missing or if parsing fails

### Parameters

`name` - [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)!:

`defaultValue` - [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html):

### Exceptions

`HttpRequestException` -

**Return**
[Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html): header value as an integer, default value when missing or parsing fails

