---
title: HttpRequest.post - KotlinInside
---

[KotlinInside](../../index.html) / [be.zvz.kotlininside.http](../index.html) / [HttpRequest](index.html) / [post](./post.html)

# post

(JVM) `open static fun post(url: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`!): `[`HttpRequest`](index.html)`!`

Start a 'POST' request to the given URL

### Parameters

`url` - [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: request

(JVM) `open static fun post(url: `[`URL`](https://docs.oracle.com/javase/7/docs/api/java/net/URL.html)`!): `[`HttpRequest`](index.html)`!`

Start a 'POST' request to the given URL

### Parameters

`url` - [URL](https://docs.oracle.com/javase/7/docs/api/java/net/URL.html)!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: request

(JVM) `open static fun post(baseUrl: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`!, params: `[`MutableMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/index.html)`<*, *>!, encode: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`HttpRequest`](index.html)`!`

Start a 'POST' request to the given URL along with the query params

### Parameters

`baseUrl` - [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)!:

`params` - [MutableMap](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/index.html)&lt;*,&nbsp;*&gt;!: the query parameters to include as part of the baseUrl

`encode` - [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html): true to encode the full URL

**Return**
[HttpRequest](index.html)!: request

**See Also**
[#append(CharSequence, Map)](append.html)[#encode(CharSequence)](encode.html)

(JVM) `open static fun post(baseUrl: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`!, encode: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, vararg params: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`!): `[`HttpRequest`](index.html)`!`

Start a 'POST' request to the given URL along with the query params

### Parameters

`baseUrl` - [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)!:

`encode` - [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html): true to encode the full URL

`params` - [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)!: the name/value query parameter pairs to include as part of the baseUrl

**Return**
[HttpRequest](index.html)!: request

**See Also**
[#append(CharSequence, Object...)](append.html)[#encode(CharSequence)](encode.html)

