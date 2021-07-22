---
title: append
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.http](../index.html)/[HttpRequest](index.html)
/[append](append.html)

# append

[jvm]\
open fun [append](append.html)(
url: [CharSequence](https://docs.oracle.com/javase/7/docs/api/java/lang/CharSequence.html),
params: [Map](https://docs.oracle.com/javase/7/docs/api/java/util/Map.html)<out [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)
,
out [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>): [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)

Append given map as query parameters to the base URL

Each map entry's key will be a parameter name and the value'
s [toString](https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html#toString()) will be the parameter value.

#### Return

URL with appended query params

## Parameters

jvm

| | |
|---|---|
| url |  |
| params |  |

[jvm]\
open fun [append](append.html)(
url: [CharSequence](https://docs.oracle.com/javase/7/docs/api/java/lang/CharSequence.html),
params: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>): [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)

Append given name/value pairs as query parameters to the base URL

The params argument is interpreted as a sequence of name/value pairs so the given number of params must be divisible by
2.

#### Return

URL with appended query params

## Parameters

jvm

| | |
|---|---|
| url |  |
| params | name/value pairs |




