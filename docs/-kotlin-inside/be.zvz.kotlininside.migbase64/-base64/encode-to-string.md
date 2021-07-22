---
title: encodeToString
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.migbase64](../index.html)/[Base64](index.html)
/[encodeToString](encode-to-string.html)

# encodeToString

[jvm]\
fun [encodeToString](encode-to-string.html)(
sArr: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)>
,
lineSep: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)): [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)

Encodes a raw byte array into a BASE64 String representation i accordance with RFC 2045.

#### Return

A BASE64 encoded array. Never null.

## Parameters

jvm

| | |
|---|---|
| sArr | The bytes to convert. If null or length 0 an empty array will be returned. |
| lineSep | Optional "\r\n" after 76 characters, unless end of file.No line separator will be in breach of RFC 2045 which specifies max 76 per line but will be a little faster. |




