---
title: HttpRequest.encode - 
---

[be.zvz.kotlininside.http](../index.html) / [HttpRequest](index.html) / [encode](./encode.html)

# encode

`open static fun encode(url: CharSequence!): String!`

Encode the given URL as an ASCII ``[`String`](#)

 This method ensures the path and query segments of the URL are properly encoded such as ' ' characters being encoded to '%20' or any UTF-8 characters that are non-ASCII. No encoding of URLs is done by default by the ``[`HttpRequest`](index.html) constructors and so if URL encoding is needed this method should be called before calling the ``[`HttpRequest`](index.html) constructor.

### Parameters

`url` - CharSequence!:

### Exceptions

`HttpRequestException` -

**Return**
String!: encoded URL

