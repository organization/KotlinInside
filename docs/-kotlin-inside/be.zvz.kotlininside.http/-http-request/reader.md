---
title: reader
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.http](../index.html)/[HttpRequest](index.html)
/[reader](reader.html)

# reader

[jvm]\
open fun [reader](reader.html)(
charset: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [InputStreamReader](https://docs.oracle.com/javase/7/docs/api/java/io/InputStreamReader.html)

Get reader to response body using given character set.

This will fall back to using the UTF-8 character set if the given charset is null

#### Return

reader

## Parameters

jvm

| | |
|---|---|
| charset |  |

#### Throws

| | |
|---|---|
| [be.zvz.kotlininside.http.HttpRequest.HttpRequestException](-http-request-exception/index.html) |  |

[jvm]\
open
fun [reader](reader.html)(): [InputStreamReader](https://docs.oracle.com/javase/7/docs/api/java/io/InputStreamReader.html)

Get reader to response body using the character set returned from [charset](charset.html)

#### Return

reader

#### Throws

| | |
|---|---|
| [be.zvz.kotlininside.http.HttpRequest.HttpRequestException](-http-request-exception/index.html) |  |



