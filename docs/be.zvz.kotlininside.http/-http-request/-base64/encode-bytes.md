---
title: HttpRequest.Base64.encodeBytes - 
---

[be.zvz.kotlininside.http](../../index.html) / [HttpRequest](../index.html) / [Base64](index.html) / [encodeBytes](./encode-bytes.html)

# encodeBytes

`open static fun encodeBytes(source: ByteArray!): String!`

Encodes a byte array into Base64 notation.

### Parameters

`source` - ByteArray!: The data to convert

### Exceptions

`NullPointerException` - if source array is null

`IllegalArgumentException` - if source array, offset, or length are invalid

**Return**
String!: The Base64-encoded data as a String

**Since**
2.0

`open static fun encodeBytes(source: ByteArray!, off: Int, len: Int): String!`

Encodes a byte array into Base64 notation.

### Parameters

`source` - ByteArray!: The data to convert

`off` - Int: Offset in array where conversion should begin

`len` - Int: Length of data to convert

### Exceptions

`NullPointerException` - if source array is null

`IllegalArgumentException` - if source array, offset, or length are invalid

**Return**
String!: The Base64-encoded data as a String

**Since**
2.0

