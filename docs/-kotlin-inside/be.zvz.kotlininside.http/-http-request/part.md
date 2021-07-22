---
title: part
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.http](../index.html)/[HttpRequest](index.html)
/[part](part.html)

# part

[jvm]\
open fun [part](part.html)(name: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html),
part: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [HttpRequest](index.html)

Write part of a multipart request to the request body

#### Return

this request

## Parameters

jvm

| | |
|---|---|
| name |  |
| part |  |

[jvm]\
open fun [part](part.html)(name: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html),
filename: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html),
part: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [HttpRequest](index.html)

open fun [part](part.html)(name: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html),
filename: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html),
part: [Number](https://docs.oracle.com/javase/7/docs/api/java/lang/Number.html)): [HttpRequest](index.html)

open fun [part](part.html)(name: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html),
filename: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html),
part: [File](https://docs.oracle.com/javase/7/docs/api/java/io/File.html)): [HttpRequest](index.html)

Write part of a multipart request to the request body

#### Return

this request

## Parameters

jvm

| | |
|---|---|
| name |  |
| filename |  |
| part |  |

#### Throws

| | |
|---|---|
| [be.zvz.kotlininside.http.HttpRequest.HttpRequestException](-http-request-exception/index.html) |  |

[jvm]\
open fun [part](part.html)(name: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html),
filename: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html),
contentType: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html),
part: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [HttpRequest](index.html)

open fun [part](part.html)(name: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html),
filename: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html),
contentType: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html),
part: [File](https://docs.oracle.com/javase/7/docs/api/java/io/File.html)): [HttpRequest](index.html)

open fun [part](part.html)(name: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html),
filename: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html),
contentType: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html),
part: [InputStream](https://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html)): [HttpRequest](index.html)

Write part of a multipart request to the request body

#### Return

this request

## Parameters

jvm

| | |
|---|---|
| name |  |
| filename |  |
| contentType | value of the Content-Type part header |
| part |  |

#### Throws

| | |
|---|---|
| [be.zvz.kotlininside.http.HttpRequest.HttpRequestException](-http-request-exception/index.html) |  |

[jvm]\
open fun [part](part.html)(name: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html),
part: [Number](https://docs.oracle.com/javase/7/docs/api/java/lang/Number.html)): [HttpRequest](index.html)

open fun [part](part.html)(name: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html),
part: [File](https://docs.oracle.com/javase/7/docs/api/java/io/File.html)): [HttpRequest](index.html)

open fun [part](part.html)(name: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html),
part: [InputStream](https://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html)): [HttpRequest](index.html)

Write part of a multipart request to the request body

#### Return

this request

## Parameters

jvm

| | |
|---|---|
| name |  |
| part |  |

#### Throws

| | |
|---|---|
| [be.zvz.kotlininside.http.HttpRequest.HttpRequestException](-http-request-exception/index.html) |  |



