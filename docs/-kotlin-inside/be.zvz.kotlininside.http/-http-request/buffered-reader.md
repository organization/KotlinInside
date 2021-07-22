---
title: bufferedReader
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.http](../index.html)/[HttpRequest](index.html)
/[bufferedReader](buffered-reader.html)

# bufferedReader

[jvm]\
open fun [bufferedReader](buffered-reader.html)(
charset: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [BufferedReader](https://docs.oracle.com/javase/7/docs/api/java/io/BufferedReader.html)

Get buffered reader to response body using the given character set r and the configured buffer size

#### Return

reader

## See also

jvm

| | |
|---|---|
| [#bufferSize(int)](buffer-size.html) | #bufferSize(int) |

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
fun [bufferedReader](buffered-reader.html)(): [BufferedReader](https://docs.oracle.com/javase/7/docs/api/java/io/BufferedReader.html)

Get buffered reader to response body using the character set returned from [charset](charset.html) and the configured
buffer size

#### Return

reader

## See also

jvm

| | |
|---|---|
| [#bufferSize(int)](buffer-size.html) | #bufferSize(int) |

#### Throws

| | |
|---|---|
| [be.zvz.kotlininside.http.HttpRequest.HttpRequestException](-http-request-exception/index.html) |  |



