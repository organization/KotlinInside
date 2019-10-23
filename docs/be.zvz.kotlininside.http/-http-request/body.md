---
title: HttpRequest.body - 
---

[be.zvz.kotlininside.http](../index.html) / [HttpRequest](index.html) / [body](./body.html)

# body

`open fun body(charset: String!): String!`

Get response as ``[`String`](#) in given character set

 This will fall back to using the UTF-8 character set if the given charset is null

### Parameters

`charset` - String!:

### Exceptions

`HttpRequestException` -

**Return**
String!: string

`open fun body(): String!`

Get response as ``[`String`](#) using character set returned from ``[`#charset()`](charset.html)

### Exceptions

`HttpRequestException` -

**Return**
String!: string

`open fun body(output: AtomicReference<String!>!): `[`HttpRequest`](index.html)`!`

Get the response body as a ``[`String`](#) and set it as the value of the given reference.

### Parameters

`output` - AtomicReference&lt;String!&gt;!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: this request

`open fun body(output: AtomicReference<String!>!, charset: String!): `[`HttpRequest`](index.html)`!`

Get the response body as a ``[`String`](#) and set it as the value of the given reference.

### Parameters

`output` - AtomicReference&lt;String!&gt;!:

`charset` - String!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: this request

