---
title: delete
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.http](../index.html)/[HttpRequest](index.html)
/[delete](delete.html)

# delete

[jvm]\
open fun [delete](delete.html)(
url: [CharSequence](https://docs.oracle.com/javase/7/docs/api/java/lang/CharSequence.html)): [HttpRequest](index.html)

open fun [delete](delete.html)(
url: [URL](https://docs.oracle.com/javase/7/docs/api/java/net/URL.html)): [HttpRequest](index.html)

Start a 'DELETE' request to the given URL

#### Return

request



## Parameters


jvm

| | |
|---|---|
| url |  |

#### Throws

| | |
|---|---|
| [be.zvz.kotlininside.http.HttpRequest.HttpRequestException](-http-request-exception/index.html) |  |

[jvm]\
open fun [delete](delete.html)(
baseUrl: [CharSequence](https://docs.oracle.com/javase/7/docs/api/java/lang/CharSequence.html),
params: [Map](https://docs.oracle.com/javase/7/docs/api/java/util/Map.html)<out [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)
, out [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>,
encode: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)): [HttpRequest](index.html)

Start a 'DELETE' request to the given URL along with the query params

#### Return

request

## See also

jvm

| | |
|---|---|
| [#append(CharSequence, Map)](append.html) | #append(CharSequence, Map) |
| [#encode(CharSequence)](encode.html) | #encode(CharSequence) |

## Parameters

jvm

| | |
|---|---|
| baseUrl |  |
| params | The query parameters to include as part of the baseUrl |
| encode | true to encode the full URL |

[jvm]\
open fun [delete](delete.html)(
baseUrl: [CharSequence](https://docs.oracle.com/javase/7/docs/api/java/lang/CharSequence.html),
encode: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html),
params: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>): [HttpRequest](index.html)

Start a 'DELETE' request to the given URL along with the query params

#### Return

request

## See also

jvm

| | |
|---|---|
| [#append(CharSequence, Object...)](append.html) | #append(CharSequence, Object...) |
| [#encode(CharSequence)](encode.html) | #encode(CharSequence) |

## Parameters

jvm

| | |
|---|---|
| baseUrl |  |
| encode | true to encode the full URL |
| params | the name/value query parameter pairs to include as part of the baseUrl |




