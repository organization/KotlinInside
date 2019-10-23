---
title: HttpRequest.delete - 
---

[be.zvz.kotlininside.http](../index.html) / [HttpRequest](index.html) / [delete](./delete.html)

# delete

`open static fun delete(url: CharSequence!): `[`HttpRequest`](index.html)`!`

Start a 'DELETE' request to the given URL

### Parameters

`url` - CharSequence!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: request

`open static fun delete(url: URL!): `[`HttpRequest`](index.html)`!`

Start a 'DELETE' request to the given URL

### Parameters

`url` - URL!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: request

`open static fun delete(baseUrl: CharSequence!, params: MutableMap<*, *>!, encode: Boolean): `[`HttpRequest`](index.html)`!`

Start a 'DELETE' request to the given URL along with the query params

### Parameters

`baseUrl` - CharSequence!:

`params` - MutableMap&lt;*,&nbsp;*&gt;!: The query parameters to include as part of the baseUrl

`encode` - Boolean: true to encode the full URL

**Return**
[HttpRequest](index.html)!: request

**See Also**
[#append(CharSequence, Map)](append.html)[#encode(CharSequence)](encode.html)

`open static fun delete(baseUrl: CharSequence!, encode: Boolean, vararg params: Any!): `[`HttpRequest`](index.html)`!`

Start a 'DELETE' request to the given URL along with the query params

### Parameters

`baseUrl` - CharSequence!:

`encode` - Boolean: true to encode the full URL

`params` - Any!: the name/value query parameter pairs to include as part of the baseUrl

**Return**
[HttpRequest](index.html)!: request

**See Also**
[#append(CharSequence, Object...)](append.html)[#encode(CharSequence)](encode.html)

