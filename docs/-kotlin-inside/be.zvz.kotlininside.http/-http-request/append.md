---
title: HttpRequest.append - KotlinInside
---

[KotlinInside](../../index.html) / [be.zvz.kotlininside.http](../index.html) / [HttpRequest](index.html) / [append](./append.html)

# append

(JVM) `open static fun append(url: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`!, params: `[`MutableMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/index.html)`<*, *>!): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!`

Append given map as query parameters to the base URL

 Each map entry's key will be a parameter name and the value's ``[`Object#toString()`](https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html#toString()) will be the parameter value.

### Parameters

`url` - [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)!:

`params` - [MutableMap](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/index.html)&lt;*,&nbsp;*&gt;!:

**Return**
[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)!: URL with appended query params

(JVM) `open static fun append(url: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`!, vararg params: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`!): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!`

Append given name/value pairs as query parameters to the base URL

 The params argument is interpreted as a sequence of name/value pairs so the given number of params must be divisible by 2.

### Parameters

`url` - [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)!:

`params` - [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)!: name/value pairs

**Return**
[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)!: URL with appended query params

