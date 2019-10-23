---
title: HttpRequest.part - 
---

[be.zvz.kotlininside.http](../index.html) / [HttpRequest](index.html) / [part](./part.html)

# part

`open fun part(name: String!, part: String!): `[`HttpRequest`](index.html)`!`

Write part of a multipart request to the request body

### Parameters

`name` - String!:

`part` - String!:

**Return**
[HttpRequest](index.html)!: this request

`open fun part(name: String!, filename: String!, part: String!): `[`HttpRequest`](index.html)`!`

Write part of a multipart request to the request body

### Parameters

`name` - String!:

`filename` - String!:

`part` - String!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: this request

`open fun part(name: String!, filename: String!, contentType: String!, part: String!): `[`HttpRequest`](index.html)`!`

Write part of a multipart request to the request body

### Parameters

`name` - String!:

`filename` - String!:

`contentType` - String!: value of the Content-Type part header

`part` - String!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: this request

`open fun part(name: String!, part: Number!): `[`HttpRequest`](index.html)`!`

Write part of a multipart request to the request body

### Parameters

`name` - String!:

`part` - Number!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: this request

`open fun part(name: String!, filename: String!, part: Number!): `[`HttpRequest`](index.html)`!`

Write part of a multipart request to the request body

### Parameters

`name` - String!:

`filename` - String!:

`part` - Number!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: this request

`open fun part(name: String!, part: File!): `[`HttpRequest`](index.html)`!`

Write part of a multipart request to the request body

### Parameters

`name` - String!:

`part` - File!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: this request

`open fun part(name: String!, filename: String!, part: File!): `[`HttpRequest`](index.html)`!`

Write part of a multipart request to the request body

### Parameters

`name` - String!:

`filename` - String!:

`part` - File!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: this request

`open fun part(name: String!, filename: String!, contentType: String!, part: File!): `[`HttpRequest`](index.html)`!`

Write part of a multipart request to the request body

### Parameters

`name` - String!:

`filename` - String!:

`contentType` - String!: value of the Content-Type part header

`part` - File!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: this request

`open fun part(name: String!, part: InputStream!): `[`HttpRequest`](index.html)`!`

Write part of a multipart request to the request body

### Parameters

`name` - String!:

`part` - InputStream!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: this request

`open fun part(name: String!, filename: String!, contentType: String!, part: InputStream!): `[`HttpRequest`](index.html)`!`

Write part of a multipart request to the request body

### Parameters

`name` - String!:

`filename` - String!:

`contentType` - String!: value of the Content-Type part header

`part` - InputStream!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: this request

