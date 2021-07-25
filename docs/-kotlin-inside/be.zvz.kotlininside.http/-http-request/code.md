---
title: code
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.http](../index.html)/[HttpRequest](index.html)
/[code](code.html)

# code

[jvm]\
open fun [code](code.html)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)

Get the status code of the response



#### Return



the response code

#### Throws

| | |
|---|---|
| [be.zvz.kotlininside.http.HttpRequest.HttpRequestException](-http-request-exception/index.html) |  |

[jvm]\
open fun [code](code.html)(
output: [AtomicInteger](https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/atomic/AtomicInteger.html)): [HttpRequest](index.html)

Set the value of the
given [AtomicInteger](https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/atomic/AtomicInteger.html) to the
status code of the response

#### Return

this request

## Parameters

jvm

| | |
|---|---|
| output |  |

#### Throws

| | |
|---|---|
| [be.zvz.kotlininside.http.HttpRequest.HttpRequestException](-http-request-exception/index.html) |  |



