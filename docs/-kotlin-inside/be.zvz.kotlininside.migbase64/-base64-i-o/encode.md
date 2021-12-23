---
title: encode
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.migbase64](../index.html)/[Base64IO](index.html)/[encode](encode.html)



# encode



[jvm]\
fun [encode](encode.html)(in: [InputStream](https://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html), out: [OutputStream](https://docs.oracle.com/javase/7/docs/api/java/io/OutputStream.html), lineSep: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html))



Encodes a raw InputStream into a BASE64 OutputStream representation in accordance with RFC 2045. This implementation was inspired by MIG Base64 [encodeToByte](../-base64/encode-to-byte.html)



## Parameters


jvm

| | |
|---|---|
| in |  |
| out |  |
| lineSep | Optional "\r\n" after 76 characters, unless end of file.No line separator will be in breach of RFC 2045 which specifies max 76 per line but will be a little faster. |



## Throws


| | |
|---|---|
| [java.io.IOException](https://docs.oracle.com/javase/7/docs/api/java/io/IOException.html) |  |



