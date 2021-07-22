---
title: HttpRequest
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.http](../index.html)/[HttpRequest](index.html)
/[HttpRequest](-http-request.html)

# HttpRequest

[jvm]\
open fun [HttpRequest](-http-request.html)(
url: [CharSequence](https://docs.oracle.com/javase/7/docs/api/java/lang/CharSequence.html),
method: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html))

open fun [HttpRequest](-http-request.html)(url: [URL](https://docs.oracle.com/javase/7/docs/api/java/net/URL.html),
method: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html))

Create HTTP connection wrapper

## Parameters

jvm

| | |
|---|---|
| url | Remote resource URL. |
| method | HTTP request method (e.g., "GET", "POST"). |

#### Throws

| | |
|---|---|
| [be.zvz.kotlininside.http.HttpRequest.HttpRequestException](-http-request-exception/index.html) |  |



