---
title: HttpRequest.bufferSize - 
---

[be.zvz.kotlininside.http](../index.html) / [HttpRequest](index.html) / [bufferSize](./buffer-size.html)

# bufferSize

`open fun bufferSize(size: Int): `[`HttpRequest`](index.html)`!`

Set the size used when buffering and copying between streams

 This size is also used for send and receive buffers created for both char and byte arrays

 The default buffer size is 8,192 bytes

### Parameters

`size` - Int:

**Return**
[HttpRequest](index.html)!: this request

`open fun bufferSize(): Int`

Get the configured buffer size

 The default buffer size is 8,192 bytes

**Return**
Int: buffer size

