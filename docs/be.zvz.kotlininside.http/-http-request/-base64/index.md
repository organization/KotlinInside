---
title: HttpRequest.Base64 - 
---

[be.zvz.kotlininside.http](../../index.html) / [HttpRequest](../index.html) / [Base64](./index.html)

# Base64

`open class Base64`

 Encodes and decodes to and from Base64 notation.



 I am placing this code in the Public Domain. Do with it as you will. This software comes with no guarantees or warranties but with plenty of well-wishing instead! Please visit [http://iharder.net/base64](http://iharder.net/base64) periodically to check for updates or to contribute improvements.

**Author**
Robert Harder

**Author**
rob@iharder.net

**Version**
2.3.7

### Functions

| [encode](encode.html) | Encode string as a byte array in Base64 annotation.`open static fun encode(string: String!): String!` |
| [encodeBytes](encode-bytes.html) | Encodes a byte array into Base64 notation.`open static fun encodeBytes(source: ByteArray!): String!`<br>`open static fun encodeBytes(source: ByteArray!, off: Int, len: Int): String!` |
| [encodeBytesToBytes](encode-bytes-to-bytes.html) | Similar to ``[`#encodeBytes(byte[], int, int)`](encode-bytes.html) but returns a byte array instead of instantiating a String. This is more efficient if you're working with I/O streams and have large data sets to encode.`open static fun encodeBytesToBytes(source: ByteArray!, off: Int, len: Int): ByteArray!` |

