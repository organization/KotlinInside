---
title: HttpRequest.send - 
---

[be.zvz.kotlininside.http](../index.html) / [HttpRequest](index.html) / [send](./send.html)

# send

`open fun send(input: File!): `[`HttpRequest`](index.html)`!`

Write contents of file to request body

### Parameters

`input` - File!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: this request

`open fun send(input: ByteArray!): `[`HttpRequest`](index.html)`!`

Write byte array to request body

### Parameters

`input` - ByteArray!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: this request

`open fun send(input: InputStream!): `[`HttpRequest`](index.html)`!`

Write stream to request body

 The given stream will be closed once sending completes

### Parameters

`input` - InputStream!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: this request

`open fun send(input: Reader!): `[`HttpRequest`](index.html)`!`

Write reader to request body

 The given reader will be closed once sending completes

### Parameters

`input` - Reader!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: this request

`open fun send(value: CharSequence!): `[`HttpRequest`](index.html)`!`

Write char sequence to request body

 The charset configured via ``[`#contentType(String)`](content-type.html) will be used and UTF-8 will be used if it is unset.

### Parameters

`value` - CharSequence!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: this request

