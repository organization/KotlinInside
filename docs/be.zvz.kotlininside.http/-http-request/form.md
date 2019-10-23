---
title: HttpRequest.form - 
---

[be.zvz.kotlininside.http](../index.html) / [HttpRequest](index.html) / [form](./form.html)

# form

`open fun form(values: MutableMap<*, *>!): `[`HttpRequest`](index.html)`!`

Write the values in the map as form data to the request body

 The pairs specified will be URL-encoded in UTF-8 and sent with the 'application/x-www-form-urlencoded' content-type

### Parameters

`values` - MutableMap&lt;*,&nbsp;*&gt;!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: this request

`open fun form(entry: MutableEntry<*, *>!): `[`HttpRequest`](index.html)`!`

Write the key and value in the entry as form data to the request body

 The pair specified will be URL-encoded in UTF-8 and sent with the 'application/x-www-form-urlencoded' content-type

### Parameters

`entry` - MutableEntry&lt;*,&nbsp;*&gt;!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: this request

`open fun form(entry: MutableEntry<*, *>!, charset: String!): `[`HttpRequest`](index.html)`!`

Write the key and value in the entry as form data to the request body

 The pair specified will be URL-encoded and sent with the 'application/x-www-form-urlencoded' content-type

### Parameters

`entry` - MutableEntry&lt;*,&nbsp;*&gt;!:

`charset` - String!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: this request

`open fun form(name: Any!, value: Any!): `[`HttpRequest`](index.html)`!`

Write the name/value pair as form data to the request body

 The pair specified will be URL-encoded in UTF-8 and sent with the 'application/x-www-form-urlencoded' content-type

### Parameters

`name` - Any!:

`value` - Any!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: this request

`open fun form(name: Any!, value: Any!, charset: String!): `[`HttpRequest`](index.html)`!`

Write the name/value pair as form data to the request body

 The values specified will be URL-encoded and sent with the 'application/x-www-form-urlencoded' content-type

### Parameters

`name` - Any!:

`value` - Any!:

`charset` - String!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: this request

`open fun form(values: MutableMap<*, *>!, charset: String!): `[`HttpRequest`](index.html)`!`

Write the values in the map as encoded form data to the request body

### Parameters

`values` - MutableMap&lt;*,&nbsp;*&gt;!:

`charset` - String!:

### Exceptions

`HttpRequestException` -

**Return**
[HttpRequest](index.html)!: this request

