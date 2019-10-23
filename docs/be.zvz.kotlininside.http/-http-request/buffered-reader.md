---
title: HttpRequest.bufferedReader - 
---

[be.zvz.kotlininside.http](../index.html) / [HttpRequest](index.html) / [bufferedReader](./buffered-reader.html)

# bufferedReader

`open fun bufferedReader(charset: String!): BufferedReader!`

Get buffered reader to response body using the given character set r and the configured buffer size

### Parameters

`charset` - String!:

### Exceptions

`HttpRequestException` -

**Return**
BufferedReader!: reader

**See Also**
[#bufferSize(int)](buffer-size.html)

`open fun bufferedReader(): BufferedReader!`

Get buffered reader to response body using the character set returned from ``[`#charset()`](charset.html) and the configured buffer size

### Exceptions

`HttpRequestException` -

**Return**
BufferedReader!: reader

**See Also**
[#bufferSize(int)](buffer-size.html)

