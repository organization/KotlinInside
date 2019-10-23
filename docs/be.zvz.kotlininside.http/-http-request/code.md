---
title: HttpRequest.code - 
---

[be.zvz.kotlininside.http](../index.html) / [HttpRequest](index.html) / [code](./code.html)

# code

`open fun code(): Int`

Get the status code of the response

### Exceptions

`HttpRequestException` -

**Return**
Int: the response code

`open fun code(output: AtomicInteger!): `[`HttpRequest`](index.html)`!`

Set the value of the given ``[`AtomicInteger`](#) to the status code of the response

### Parameters

`output` - AtomicInteger!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: this request

