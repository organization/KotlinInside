---
title: HttpRequest.intHeader - 
---

[be.zvz.kotlininside.http](../index.html) / [HttpRequest](index.html) / [intHeader](./int-header.html)

# intHeader

`open fun intHeader(name: String!): Int`

Get an integer header from the response falling back to returning -1 if the header is missing or parsing fails

### Parameters

`name` - String!:

### Exceptions

`HttpRequestException` -

**Return**
Int: header value as an integer, -1 when missing or parsing fails

`open fun intHeader(name: String!, defaultValue: Int): Int`

Get an integer header value from the response falling back to the given default value if the header is missing or if parsing fails

### Parameters

`name` - String!:

`defaultValue` - Int:

### Exceptions

`HttpRequestException` -

**Return**
Int: header value as an integer, default value when missing or parsing fails

