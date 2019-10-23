---
title: HttpRequest.reader - 
---

[be.zvz.kotlininside.http](../index.html) / [HttpRequest](index.html) / [reader](./reader.html)

# reader

`open fun reader(charset: String!): InputStreamReader!`

Get reader to response body using given character set.

 This will fall back to using the UTF-8 character set if the given charset is null

### Parameters

`charset` - String!:

### Exceptions

`HttpRequestException` -

**Return**
InputStreamReader!: reader

`open fun reader(): InputStreamReader!`

Get reader to response body using the character set returned from ``[`#charset()`](charset.html)

### Exceptions

`HttpRequestException` -

**Return**
InputStreamReader!: reader

