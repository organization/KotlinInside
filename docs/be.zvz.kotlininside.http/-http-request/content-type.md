---
title: HttpRequest.contentType - 
---

[be.zvz.kotlininside.http](../index.html) / [HttpRequest](index.html) / [contentType](./content-type.html)

# contentType

`open fun contentType(contentType: String!): `[`HttpRequest`](index.html)`!`

Set the 'Content-Type' request header to the given value

### Parameters

`contentType` - String!:

**Return**
[HttpRequest](index.html)!: this request

`open fun contentType(contentType: String!, charset: String!): `[`HttpRequest`](index.html)`!`

Set the 'Content-Type' request header to the given value and charset

### Parameters

`contentType` - String!:

`charset` - String!:

**Return**
[HttpRequest](index.html)!: this request

`open fun contentType(): String!`

Get the 'Content-Type' header from the response

**Return**
String!: response header value

