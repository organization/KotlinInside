---
title: Base64.encodeToByte - 
---

[com.migcomponents.migbase64](../index.html) / [Base64](index.html) / [encodeToByte](./encode-to-byte.html)

# encodeToByte

`static fun encodeToByte(sArr: ByteArray!, lineSep: Boolean): ByteArray!`

Encodes a raw byte array into a BASE64 `byte[]` representation i accordance with RFC 2045.

### Parameters

`sArr` - ByteArray!: The bytes to convert. If `null` or length 0 an empty array will be returned.

`lineSep` - Boolean: Optional "\r\n" after 76 characters, unless end of file. No line separator will be in breach of RFC 2045 which specifies max 76 per line but will be a little faster.

**Return**
ByteArray!: A BASE64 encoded array. Never `null`.

`static fun encodeToByte(sArr: ByteArray!, sOff: Int, sLen: Int, lineSep: Boolean): ByteArray!`

Encodes a raw byte array into a BASE64 `byte[]` representation i accordance with RFC 2045.

### Parameters

`sArr` - ByteArray!: The bytes to convert. If `null` an empty array will be returned.

`sOff` - Int: The starting position in the bytes to convert.

`sLen` - Int: The number of bytes to convert. If 0 an empty array will be returned.

`lineSep` - Boolean: Optional "\r\n" after 76 characters, unless end of file. No line separator will be in breach of RFC 2045 which specifies max 76 per line but will be a little faster.

**Return**
ByteArray!: A BASE64 encoded array. Never `null`.

