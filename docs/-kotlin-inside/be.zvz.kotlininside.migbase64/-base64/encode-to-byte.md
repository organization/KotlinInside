---
title: encodeToByte
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.migbase64](../index.html)/[Base64](index.html)
/[encodeToByte](encode-to-byte.html)

# encodeToByte

[jvm]\
fun [encodeToByte](encode-to-byte.html)(
sArr: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)>
,
lineSep: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)>

Encodes a raw byte array into a BASE64 byte[] representation i accordance with RFC 2045.

#### Return

A BASE64 encoded array. Never null.

## Parameters

jvm

| | |
|---|---|
| sArr | The bytes to convert. If null or length 0 an empty array will be returned. |
| lineSep | Optional "\r\n" after 76 characters, unless end of file.No line separator will be in breach of RFC 2045 which specifies max 76 per line but will be a little faster. |

[jvm]\
fun [encodeToByte](encode-to-byte.html)(
sArr: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)>
, sOff: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html),
sLen: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html),
lineSep: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)>

Encodes a raw byte array into a BASE64 byte[] representation i accordance with RFC 2045.

#### Return

A BASE64 encoded array. Never null.

## Parameters

jvm

| | |
|---|---|
| sArr | The bytes to convert. If null an empty array will be returned. |
| sOff | The starting position in the bytes to convert. |
| sLen | The number of bytes to convert. If 0 an empty array will be returned. |
| lineSep | Optional "\r\n" after 76 characters, unless end of file.No line separator will be in breach of RFC 2045 which specifies max 76 per line but will be a little faster. |




