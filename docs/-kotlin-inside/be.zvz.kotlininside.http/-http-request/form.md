---
title: form
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.http](../index.html)/[HttpRequest](index.html)
/[form](form.html)

# form

[jvm]\
open fun [form](form.html)(
values: [Map](https://docs.oracle.com/javase/7/docs/api/java/util/Map.html)<out [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)
, out [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>): [HttpRequest](index.html)

Write the values in the map as form data to the request body

The pairs specified will be URL-encoded in UTF-8 and sent with the 'application/x-www-form-urlencoded' content-type

#### Return

this request

## Parameters


jvm

| | |
|---|---|
| values |  |

#### Throws

| | |
|---|---|
| [be.zvz.kotlininside.http.HttpRequest.HttpRequestException](-http-request-exception/index.html) |  |

[jvm]\
open fun [form](form.html)(
entry: [Map.Entry](https://docs.oracle.com/javase/7/docs/api/java/util/Map.Entry.html)<out [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)
, out [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>): [HttpRequest](index.html)

Write the key and value in the entry as form data to the request body

The pair specified will be URL-encoded in UTF-8 and sent with the 'application/x-www-form-urlencoded' content-type

#### Return

this request

## Parameters


jvm

| | |
|---|---|
| entry |  |

#### Throws

| | |
|---|---|
| [be.zvz.kotlininside.http.HttpRequest.HttpRequestException](-http-request-exception/index.html) |  |

[jvm]\
open fun [form](form.html)(
entry: [Map.Entry](https://docs.oracle.com/javase/7/docs/api/java/util/Map.Entry.html)<out [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)
, out [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>,
charset: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [HttpRequest](index.html)

Write the key and value in the entry as form data to the request body

The pair specified will be URL-encoded and sent with the 'application/x-www-form-urlencoded' content-type

#### Return

this request

## Parameters


jvm

| | |
|---|---|
| entry |  |
| charset |  |

#### Throws

| | |
|---|---|
| [be.zvz.kotlininside.http.HttpRequest.HttpRequestException](-http-request-exception/index.html) |  |

[jvm]\
open fun [form](form.html)(name: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html),
value: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)): [HttpRequest](index.html)

Write the name/value pair as form data to the request body

The pair specified will be URL-encoded in UTF-8 and sent with the 'application/x-www-form-urlencoded' content-type

#### Return

this request

## Parameters

jvm

| | |
|---|---|
| name |  |
| value |  |

#### Throws

| | |
|---|---|
| [be.zvz.kotlininside.http.HttpRequest.HttpRequestException](-http-request-exception/index.html) |  |

[jvm]\
open fun [form](form.html)(name: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html),
value: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html),
charset: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [HttpRequest](index.html)

Write the name/value pair as form data to the request body

The values specified will be URL-encoded and sent with the 'application/x-www-form-urlencoded' content-type

#### Return

this request

## Parameters

jvm

| | |
|---|---|
| name |  |
| value |  |
| charset |  |

#### Throws

| | |
|---|---|
| [be.zvz.kotlininside.http.HttpRequest.HttpRequestException](-http-request-exception/index.html) |  |

[jvm]\
open fun [form](form.html)(
values: [Map](https://docs.oracle.com/javase/7/docs/api/java/util/Map.html)<out [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)
, out [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>,
charset: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [HttpRequest](index.html)

Write the values in the map as encoded form data to the request body

#### Return

this request

## Parameters

jvm

| | |
|---|---|
| values |  |
| charset |  |

#### Throws

| | |
|---|---|
| [be.zvz.kotlininside.http.HttpRequest.HttpRequestException](-http-request-exception/index.html) |  |



