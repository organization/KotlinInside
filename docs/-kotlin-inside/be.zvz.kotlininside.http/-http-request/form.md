---
title: HttpRequest.form - KotlinInside
---

[KotlinInside](../../index.html) / [be.zvz.kotlininside.http](../index.html) / [HttpRequest](index.html) / [form](./form.html)

# form

(JVM) `open fun form(values: `[`MutableMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/index.html)`<*, *>!): `[`HttpRequest`](index.html)`!`

Write the values in the map as form data to the request body

 The pairs specified will be URL-encoded in UTF-8 and sent with the 'application/x-www-form-urlencoded' content-type

### Parameters

`values` - [MutableMap](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/index.html)&lt;*,&nbsp;*&gt;!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: this request

(JVM) `open fun form(entry: `[`MutableEntry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/-mutable-entry/index.html)`<*, *>!): `[`HttpRequest`](index.html)`!`

Write the key and value in the entry as form data to the request body

 The pair specified will be URL-encoded in UTF-8 and sent with the 'application/x-www-form-urlencoded' content-type

### Parameters

`entry` - [MutableEntry](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/-mutable-entry/index.html)&lt;*,&nbsp;*&gt;!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: this request

(JVM) `open fun form(entry: `[`MutableEntry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/-mutable-entry/index.html)`<*, *>!, charset: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!): `[`HttpRequest`](index.html)`!`

Write the key and value in the entry as form data to the request body

 The pair specified will be URL-encoded and sent with the 'application/x-www-form-urlencoded' content-type

### Parameters

`entry` - [MutableEntry](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/-mutable-entry/index.html)&lt;*,&nbsp;*&gt;!:

`charset` - [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: this request

(JVM) `open fun form(name: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`!, value: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`!): `[`HttpRequest`](index.html)`!`

Write the name/value pair as form data to the request body

 The pair specified will be URL-encoded in UTF-8 and sent with the 'application/x-www-form-urlencoded' content-type

### Parameters

`name` - [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)!:

`value` - [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: this request

(JVM) `open fun form(name: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`!, value: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`!, charset: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!): `[`HttpRequest`](index.html)`!`

Write the name/value pair as form data to the request body

 The values specified will be URL-encoded and sent with the 'application/x-www-form-urlencoded' content-type

### Parameters

`name` - [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)!:

`value` - [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)!:

`charset` - [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: this request

(JVM) `open fun form(values: `[`MutableMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/index.html)`<*, *>!, charset: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!): `[`HttpRequest`](index.html)`!`

Write the values in the map as encoded form data to the request body

### Parameters

`values` - [MutableMap](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/index.html)&lt;*,&nbsp;*&gt;!:

`charset` - [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: this request

