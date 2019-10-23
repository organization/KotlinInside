---
title: HttpRequest.post - 
---

[be.zvz.kotlininside.http](../index.html) / [HttpRequest](index.html) / [post](./post.html)

# post

`open static fun post(url: CharSequence!): `[`HttpRequest`](index.html)`!`

Start a 'POST' request to the given URL

### Parameters

`url` - CharSequence!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: request

`open static fun post(url: URL!): `[`HttpRequest`](index.html)`!`

Start a 'POST' request to the given URL

### Parameters

`url` - URL!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: request

`open static fun post(baseUrl: CharSequence!, params: MutableMap<*, *>!, encode: Boolean): `[`HttpRequest`](index.html)`!`

Start a 'POST' request to the given URL along with the query params

### Parameters

`baseUrl` - CharSequence!:

`params` - MutableMap&lt;*,&nbsp;*&gt;!: the query parameters to include as part of the baseUrl

`encode` - Boolean: true to encode the full URL

**Return**
[HttpRequest](index.html)!: request

**See Also**
[#append(CharSequence, Map)](append.html)[#encode(CharSequence)](encode.html)

`open static fun post(baseUrl: CharSequence!, encode: Boolean, vararg params: Any!): `[`HttpRequest`](index.html)`!`

Start a 'POST' request to the given URL along with the query params

### Parameters

`baseUrl` - CharSequence!:

`encode` - Boolean: true to encode the full URL

`params` - Any!: the name/value query parameter pairs to include as part of the baseUrl

**Return**
[HttpRequest](index.html)!: request

**See Also**
[#append(CharSequence, Object...)](append.html)[#encode(CharSequence)](encode.html)

