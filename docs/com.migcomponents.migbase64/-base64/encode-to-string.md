---
title: Base64.encodeToString - 
---

[be.zvz.kotlininside.migbase64](../index.html) / [Base64](index.html) / [encodeToString](./encode-to-string.html)

# encodeToString

`static fun encodeToString(sArr: ByteArray!, lineSep: Boolean): String!`

Encodes a raw byte array into a BASE64 `String` representation i accordance with RFC 2045.

### Parameters

`sArr` - ByteArray!: The bytes to convert. If `null` or length 0 an empty array will be returned.

`lineSep` - Boolean: Optional "\r\n" after 76 characters, unless end of file. No line separator will be in breach of RFC 2045 which specifies max 76 per line but will be a little faster.

**Return**
String!: A BASE64 encoded array. Never `null`.

