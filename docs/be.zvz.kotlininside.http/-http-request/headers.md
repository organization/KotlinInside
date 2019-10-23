---
title: HttpRequest.headers - 
---

[be.zvz.kotlininside.http](../index.html) / [HttpRequest](index.html) / [headers](./headers.html)

# headers

`open fun headers(headers: MutableMap<String!, String!>!): `[`HttpRequest`](index.html)`!`

Set all headers found in given map where the keys are the header names and the values are the header values

### Parameters

`headers` - MutableMap&lt;String!,&nbsp;String!&gt;!:

**Return**
[HttpRequest](index.html)!: this request

`open fun headers(): MutableMap<String!, MutableList<String!>!>!`

Get all the response headers

### Exceptions

`HttpRequestException` -

**Return**
MutableMap&lt;String!,&nbsp;MutableList&lt;String!&gt;!&gt;!: map of response header names to their value(s)

`open fun headers(name: String!): Array<String!>!`

Get all values of the given header from the response

### Parameters

`name` - String!:

**Return**
Array&lt;String!&gt;!: non-null but possibly empty array of ``[`String`](#) header values

