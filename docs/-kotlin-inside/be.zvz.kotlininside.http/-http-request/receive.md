---
title: receive
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.http](../index.html)/[HttpRequest](index.html)
/[receive](receive.html)

# receive

[jvm]\
open fun [receive](receive.html)(
file: [File](https://docs.oracle.com/javase/7/docs/api/java/io/File.html)): [HttpRequest](index.html)

Stream response body to file

#### Return

this request

## Parameters

jvm

| | |
|---|---|
| file |  |

#### Throws

| | |
|---|---|
| [be.zvz.kotlininside.http.HttpRequest.HttpRequestException](-http-request-exception/index.html) |  |

[jvm]\
open fun [receive](receive.html)(
output: [OutputStream](https://docs.oracle.com/javase/7/docs/api/java/io/OutputStream.html)): [HttpRequest](index.html)

Stream response to given output stream

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

[jvm]\
open fun [receive](receive.html)(
output: [PrintStream](https://docs.oracle.com/javase/7/docs/api/java/io/PrintStream.html)): [HttpRequest](index.html)

Stream response to given print stream

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

[jvm]\
open fun [receive](receive.html)(
appendable: [Appendable](https://docs.oracle.com/javase/7/docs/api/java/lang/Appendable.html)): [HttpRequest](index.html)

Receive response into the given appendable

#### Return

this request

## Parameters

jvm

| | |
|---|---|
| appendable |  |

#### Throws

| | |
|---|---|
| [be.zvz.kotlininside.http.HttpRequest.HttpRequestException](-http-request-exception/index.html) |  |

[jvm]\
open fun [receive](receive.html)(
writer: [Writer](https://docs.oracle.com/javase/7/docs/api/java/io/Writer.html)): [HttpRequest](index.html)

Receive response into the given writer

#### Return

this request

## Parameters

jvm

| | |
|---|---|
| writer |  |

#### Throws

| | |
|---|---|
| [be.zvz.kotlininside.http.HttpRequest.HttpRequestException](-http-request-exception/index.html) |  |



