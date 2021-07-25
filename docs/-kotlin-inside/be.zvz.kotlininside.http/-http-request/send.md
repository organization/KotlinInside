---
title: send
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.http](../index.html)/[HttpRequest](index.html)
/[send](send.html)

# send

[jvm]\
open fun [send](send.html)(
input: [File](https://docs.oracle.com/javase/7/docs/api/java/io/File.html)): [HttpRequest](index.html)

Write contents of file to request body

#### Return

this request



## Parameters


jvm

| | |
|---|---|
| input |  |

#### Throws

| | |
|---|---|
| [be.zvz.kotlininside.http.HttpRequest.HttpRequestException](-http-request-exception/index.html) |  |

[jvm]\
open fun [send](send.html)(
input: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)>): [HttpRequest](index.html)

Write byte array to request body

#### Return

this request



## Parameters


jvm

| | |
|---|---|
| input |  |

#### Throws

| | |
|---|---|
| [be.zvz.kotlininside.http.HttpRequest.HttpRequestException](-http-request-exception/index.html) |  |

[jvm]\
open fun [send](send.html)(
input: [InputStream](https://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html)): [HttpRequest](index.html)

Write stream to request body

The given stream will be closed once sending completes

#### Return

this request

## Parameters


jvm

| | |
|---|---|
| input |  |

#### Throws

| | |
|---|---|
| [be.zvz.kotlininside.http.HttpRequest.HttpRequestException](-http-request-exception/index.html) |  |

[jvm]\
open fun [send](send.html)(
input: [Reader](https://docs.oracle.com/javase/7/docs/api/java/io/Reader.html)): [HttpRequest](index.html)

Write reader to request body

The given reader will be closed once sending completes

#### Return

this request

## Parameters

jvm

| | |
|---|---|
| input |  |

#### Throws

| | |
|---|---|
| [be.zvz.kotlininside.http.HttpRequest.HttpRequestException](-http-request-exception/index.html) |  |

[jvm]\
open fun [send](send.html)(
value: [CharSequence](https://docs.oracle.com/javase/7/docs/api/java/lang/CharSequence.html)): [HttpRequest](index.html)

Write char sequence to request body

The charset configured via [contentType](content-type.html) will be used and UTF-8 will be used if it is unset.

#### Return

this request

## Parameters

jvm

| | |
|---|---|
| value |  |

#### Throws

| | |
|---|---|
| [be.zvz.kotlininside.http.HttpRequest.HttpRequestException](-http-request-exception/index.html) |  |



