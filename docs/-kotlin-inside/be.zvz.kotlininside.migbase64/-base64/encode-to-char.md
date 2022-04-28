---
title: encodeToChar
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.migbase64](../index.html)/[Base64](index.html)/[encodeToChar](encode-to-char.html)



# encodeToChar



[jvm]\
fun [encodeToChar](encode-to-char.html)(sArr: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)&gt;, lineSep: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Char](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)&gt;



Encodes a raw byte array into a BASE64 char[] representation i accordance with RFC 2045.



#### Return



A BASE64 encoded array. Never null.



## Parameters


jvm

| | |
|---|---|
| sArr | The bytes to convert. If null or length 0 an empty array will be returned. |
| lineSep | Optional &quot;\r\n&quot; after 76 characters, unless end of file.No line separator will be in breach of RFC 2045 which specifies max 76 per line but will be a little faster. |




