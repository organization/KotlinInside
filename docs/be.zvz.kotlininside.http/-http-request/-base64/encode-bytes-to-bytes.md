---
title: HttpRequest.Base64.encodeBytesToBytes - 
---

[be.zvz.kotlininside.http](../../index.html) / [HttpRequest](../index.html) / [Base64](index.html) / [encodeBytesToBytes](./encode-bytes-to-bytes.html)

# encodeBytesToBytes

`open static fun encodeBytesToBytes(source: ByteArray!, off: Int, len: Int): ByteArray!`

Similar to ``[`#encodeBytes(byte[], int, int)`](encode-bytes.html) but returns a byte array instead of instantiating a String. This is more efficient if you're working with I/O streams and have large data sets to encode.

### Parameters

`source` - ByteArray!: The data to convert

`off` - Int: Offset in array where conversion should begin

`len` - Int: Length of data to convert

### Exceptions

`NullPointerException` - if source array is null

`IllegalArgumentException` - if source array, offset, or length are invalid

**Return**
ByteArray!: The Base64-encoded data as a String if there is an error

**Since**
2.3.1

