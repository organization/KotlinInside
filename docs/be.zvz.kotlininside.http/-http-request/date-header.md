---
title: HttpRequest.dateHeader - 
---

[be.zvz.kotlininside.http](../index.html) / [HttpRequest](index.html) / [dateHeader](./date-header.html)

# dateHeader

`open fun dateHeader(name: String!): Long`

Get a date header from the response falling back to returning -1 if the header is missing or parsing fails

### Parameters

`name` - String!:

### Exceptions

`HttpRequestException` -

**Return**
Long: date, -1 on failures

`open fun dateHeader(name: String!, defaultValue: Long): Long`

Get a date header from the response falling back to returning the given default value if the header is missing or parsing fails

### Parameters

`name` - String!:

`defaultValue` - Long:

### Exceptions

`HttpRequestException` -

**Return**
Long: date, default value on failures

