---
title: HttpRequest.parameters - 
---

[be.zvz.kotlininside.http](../index.html) / [HttpRequest](index.html) / [parameters](./parameters.html)

# parameters

`open fun parameters(headerName: String!): MutableMap<String!, String!>!`

Get all parameters from header value in response

 This will be all key=value pairs after the first ';' that are separated by a ';'

### Parameters

`headerName` - String!:

**Return**
MutableMap&lt;String!,&nbsp;String!&gt;!: non-null but possibly empty map of parameter headers

