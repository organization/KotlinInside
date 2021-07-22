---
title: headers
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.http](../index.html)/[HttpRequest](index.html)
/[headers](headers.html)

# headers

[jvm]\
open fun [headers](headers.html)(
headers: [Map](https://docs.oracle.com/javase/7/docs/api/java/util/Map.html)<[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)
, [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)>): [HttpRequest](index.html)

Set all headers found in given map where the keys are the header names and the values are the header values

#### Return

this request

## Parameters

jvm

| | |
|---|---|
| headers |  |

[jvm]\
open
fun [headers](headers.html)(): [Map](https://docs.oracle.com/javase/7/docs/api/java/util/Map.html)<[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)
, [List](https://docs.oracle.com/javase/7/docs/api/java/util/List.html)<[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)>>

Get all the response headers

#### Return

map of response header names to their value(s)

#### Throws

| | |
|---|---|
| [be.zvz.kotlininside.http.HttpRequest.HttpRequestException](-http-request-exception/index.html) |  |

[jvm]\
open fun [headers](headers.html)(
name: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)>

Get all values of the given header from the response

#### Return

non-null but possibly empty array of [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) header
values

## Parameters

jvm

| | |
|---|---|
| name |  |




