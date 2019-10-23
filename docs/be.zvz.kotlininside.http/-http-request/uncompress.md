---
title: HttpRequest.uncompress - 
---

[be.zvz.kotlininside.http](../index.html) / [HttpRequest](index.html) / [uncompress](./uncompress.html)

# uncompress

`open fun uncompress(uncompress: Boolean): `[`HttpRequest`](index.html)`!`

Set whether or not the response body should be automatically uncompressed when read from.

 This will only affect requests that have the 'Content-Encoding' response header set to 'gzip'.

 This causes all receive methods to use a ``[`GZIPInputStream`](#) when applicable so that higher level streams and readers can read the data uncompressed.

 Setting this option does not cause any request headers to be set automatically so ``[`#acceptGzipEncoding()`](accept-gzip-encoding.html) should be used in conjunction with this setting to tell the server to gzip the response.

### Parameters

`uncompress` - Boolean:

**Return**
[HttpRequest](index.html)!: this request

