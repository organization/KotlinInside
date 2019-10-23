---
title: HttpRequest.ignoreCloseExceptions - 
---

[be.zvz.kotlininside.http](../index.html) / [HttpRequest](index.html) / [ignoreCloseExceptions](./ignore-close-exceptions.html)

# ignoreCloseExceptions

`open fun ignoreCloseExceptions(ignore: Boolean): `[`HttpRequest`](index.html)`!`

Set whether or not to ignore exceptions that occur from calling ``[`Closeable#close()`](#)

 The default value of this setting is `true`

### Parameters

`ignore` - Boolean:

**Return**
[HttpRequest](index.html)!: this request

`open fun ignoreCloseExceptions(): Boolean`

Get whether or not exceptions thrown by ``[`Closeable#close()`](#) are ignored

**Return**
Boolean: true if ignoring, false if throwing

