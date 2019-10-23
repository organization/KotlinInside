---
title: HttpRequest.append - 
---

[be.zvz.kotlininside.http](../index.html) / [HttpRequest](index.html) / [append](./append.html)

# append

`open static fun append(url: CharSequence!, params: MutableMap<*, *>!): String!`

Append given map as query parameters to the base URL

 Each map entry's key will be a parameter name and the value's ``[`Object#toString()`](#) will be the parameter value.

### Parameters

`url` - CharSequence!:

`params` - MutableMap&lt;*,&nbsp;*&gt;!:

**Return**
String!: URL with appended query params

`open static fun append(url: CharSequence!, vararg params: Any!): String!`

Append given name/value pairs as query parameters to the base URL

 The params argument is interpreted as a sequence of name/value pairs so the given number of params must be divisible by 2.

### Parameters

`url` - CharSequence!:

`params` - Any!: name/value pairs

**Return**
String!: URL with appended query params

