---
title: contentType
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.http](../index.html)/[HttpRequest](index.html)
/[contentType](content-type.html)

# contentType

[jvm]\
open fun [contentType](content-type.html)(
contentType: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [HttpRequest](index.html)

Set the 'Content-Type' request header to the given value

#### Return

this request

## Parameters

jvm

| | |
|---|---|
| contentType |  |

[jvm]\
open fun [contentType](content-type.html)(
contentType: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html),
charset: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [HttpRequest](index.html)

Set the 'Content-Type' request header to the given value and charset

#### Return

this request

## Parameters

jvm

| | |
|---|---|
| contentType |  |
| charset |  |

[jvm]\
open fun [contentType](content-type.html)(): [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)

Get the 'Content-Type' header from the response

#### Return

response header value




