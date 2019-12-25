---
title: HttpRequest.dateHeader - KotlinInside
---

[KotlinInside](../../index.html) / [be.zvz.kotlininside.http](../index.html) / [HttpRequest](index.html) / [dateHeader](./date-header.html)

# dateHeader

(JVM) `open fun dateHeader(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!): `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)

Get a date header from the response falling back to returning -1 if the header is missing or parsing fails

### Parameters

`name` - [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)!:

### Exceptions

`HttpRequestException` -

**Return**
[Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html): date, -1 on failures

(JVM) `open fun dateHeader(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!, defaultValue: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`): `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)

Get a date header from the response falling back to returning the given default value if the header is missing or parsing fails

### Parameters

`name` - [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)!:

`defaultValue` - [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html):

### Exceptions

`HttpRequestException` -

**Return**
[Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html): date, default value on failures

