---
title: Base64IO.encode - 
---

[com.migcomponents.migbase64](../index.html) / [Base64IO](index.html) / [encode](./encode.html)

# encode

`static fun encode(in: InputStream!, out: OutputStream!, lineSep: Boolean): Unit`

Encodes a raw InputStream into a BASE64 OutputStream representation in accordance with RFC 2045. This implementation was inspired by MIG Base64 ``[`Base64#encodeToByte(byte[], boolean)`](../-base64/encode-to-byte.html)

### Parameters

`in` - InputStream!:

`out` - OutputStream!:

`lineSep` - Boolean: Optional "\r\n" after 76 characters, unless end of file. No line separator will be in breach of RFC 2045 which specifies max 76 per line but will be a little faster.

### Exceptions

`IOException` - 