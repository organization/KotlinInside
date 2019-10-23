---
title: HttpRequest.receive - 
---

[be.zvz.kotlininside.http](../index.html) / [HttpRequest](index.html) / [receive](./receive.html)

# receive

`open fun receive(file: File!): `[`HttpRequest`](index.html)`!`

Stream response body to file

### Parameters

`file` - File!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: this request

`open fun receive(output: OutputStream!): `[`HttpRequest`](index.html)`!`

Stream response to given output stream

### Parameters

`output` - OutputStream!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: this request

`open fun receive(output: PrintStream!): `[`HttpRequest`](index.html)`!`

Stream response to given print stream

### Parameters

`output` - PrintStream!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: this request

`open fun receive(appendable: Appendable!): `[`HttpRequest`](index.html)`!`

Receive response into the given appendable

### Parameters

`appendable` - Appendable!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: this request

`open fun receive(writer: Writer!): `[`HttpRequest`](index.html)`!`

Receive response into the given writer

### Parameters

`writer` - Writer!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: this request

