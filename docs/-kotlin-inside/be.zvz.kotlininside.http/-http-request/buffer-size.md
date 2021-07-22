---
title: bufferSize
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.http](../index.html)/[HttpRequest](index.html)
/[bufferSize](buffer-size.html)

# bufferSize

[jvm]\
open fun [bufferSize](buffer-size.html)(
size: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [HttpRequest](index.html)

Set the size used when buffering and copying between streams

This size is also used for send and receive buffers created for both char and byte arrays

The default buffer size is 8,192 bytes

#### Return

this request

## Parameters

jvm

| | |
|---|---|
| size |  |

[jvm]\
open fun [bufferSize](buffer-size.html)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)

Get the configured buffer size

The default buffer size is 8,192 bytes

#### Return

buffer size




