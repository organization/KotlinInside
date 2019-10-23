---
title: Base64.encodeToChar - 
---

[be.zvz.kotlininside.migbase64](../index.html) / [Base64](index.html) / [encodeToChar](./encode-to-char.html)

# encodeToChar

`static fun encodeToChar(sArr: ByteArray!, lineSep: Boolean): CharArray!`

Encodes a raw byte array into a BASE64 `char[]` representation i accordance with RFC 2045.

### Parameters

`sArr` - ByteArray!: The bytes to convert. If `null` or length 0 an empty array will be returned.

`lineSep` - Boolean: Optional "\r\n" after 76 characters, unless end of file. No line separator will be in breach of RFC 2045 which specifies max 76 per line but will be a little faster.

**Return**
CharArray!: A BASE64 encoded array. Never `null`.

