---
title: HttpRequest.header - 
---

[be.zvz.kotlininside.http](../index.html) / [HttpRequest](index.html) / [header](./header.html)

# header

`open fun header(name: String!, value: String!): `[`HttpRequest`](index.html)`!`

Set header name to given value

### Parameters

`name` - String!:

`value` - String!:

**Return**
[HttpRequest](index.html)!: this request

`open fun header(name: String!, value: Number!): `[`HttpRequest`](index.html)`!`

Set header name to given value

### Parameters

`name` - String!:

`value` - Number!:

**Return**
[HttpRequest](index.html)!: this request

`open fun header(header: MutableEntry<String!, String!>!): `[`HttpRequest`](index.html)`!`

Set header to have given entry's key as the name and value as the value

### Parameters

`header` - MutableEntry&lt;String!,&nbsp;String!&gt;!:

**Return**
[HttpRequest](index.html)!: this request

`open fun header(name: String!): String!`

Get a response header

### Parameters

`name` - String!:

### Exceptions

`HttpRequestException` -

**Return**
String!: response header

