---
title: JsonBrowser.parse - KotlinInside
---

[KotlinInside](../../index.html) / [be.zvz.kotlininside.json](../index.html) / [JsonBrowser](index.html) / [parse](./parse.html)

# parse

(JVM) `@NotNull open static fun parse(json: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!): @NotNull `[`JsonBrowser`](index.html)

Parse from string.

### Parameters

`json` - [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)!: The JSON object as a string

### Exceptions

`IOException` - When parsing the JSON failed

**Return**
[JsonBrowser](index.html): JsonBrowser instance for navigating in the result

(JVM) `@NotNull open static fun parse(stream: `[`InputStream`](https://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html)`!): @NotNull `[`JsonBrowser`](index.html)

Parse from string.

### Parameters

`stream` - [InputStream](https://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html)!: The JSON object as a stream

### Exceptions

`IOException` - When parsing the JSON failed

**Return**
[JsonBrowser](index.html): JsonBrowser instance for navigating in the result

