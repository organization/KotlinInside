---
title: HttpRequest.get - 
---

[be.zvz.kotlininside.http](../index.html) / [HttpRequest](index.html) / [get](./get.html)

# get

`open static fun get(url: CharSequence!): `[`HttpRequest`](index.html)`!`

Start a 'GET' request to the given URL

### Parameters

`url` - CharSequence!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: request

`open static fun get(url: URL!): `[`HttpRequest`](index.html)`!`

Start a 'GET' request to the given URL

### Parameters

`url` - URL!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: request

`open static fun get(baseUrl: CharSequence!, params: MutableMap<*, *>!, encode: Boolean): `[`HttpRequest`](index.html)`!`

Start a 'GET' request to the given URL along with the query params

### Parameters

`baseUrl` - CharSequence!:

`params` - MutableMap&lt;*,&nbsp;*&gt;!: The query parameters to include as part of the baseUrl

`encode` - Boolean: true to encode the full URL

**Return**
[HttpRequest](index.html)!: request

**See Also**
[#append(CharSequence, Map)](append.html)[#encode(CharSequence)](encode.html)

`open static fun get(baseUrl: CharSequence!, encode: Boolean, vararg params: Any!): `[`HttpRequest`](index.html)`!`

Start a 'GET' request to the given URL along with the query params

### Parameters

`baseUrl` - CharSequence!:

`encode` - Boolean: true to encode the full URL

`params` - Any!: the name/value query parameter pairs to include as part of the baseUrl

**Return**
[HttpRequest](index.html)!: request

**See Also**
[#append(CharSequence, Object...)](append.html)[#encode(CharSequence)](encode.html)

