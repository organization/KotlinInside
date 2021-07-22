---
title: parse
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.json](../index.html)/[JsonBrowser](index.html)
/[parse](parse.html)

# parse

[jvm]\

@NotNull()

open fun [parse](parse.html)(json: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)):
@NotNull()[JsonBrowser](index.html)

Parse from string.

#### Return

JsonBrowser instance for navigating in the result

## Parameters

jvm

| | |
|---|---|
| json | The JSON object as a string |

#### Throws

| | |
|---|---|
| [java.io.IOException](https://docs.oracle.com/javase/7/docs/api/java/io/IOException.html) | When parsing the JSON failed |

[jvm]\

@NotNull()

open fun [parse](parse.html)(stream: [InputStream](https://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html)):
@NotNull()[JsonBrowser](index.html)

Parse from string.

#### Return

JsonBrowser instance for navigating in the result

## Parameters

jvm

| | |
|---|---|
| stream | The JSON object as a stream |

#### Throws

| | |
|---|---|
| [java.io.IOException](https://docs.oracle.com/javase/7/docs/api/java/io/IOException.html) | When parsing the JSON failed |



