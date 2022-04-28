---
title: decodeFast
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.migbase64](../index.html)/[Base64](index.html)/[decodeFast](decode-fast.html)



# decodeFast



[jvm]\
fun [decodeFast](decode-fast.html)(sArr: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Char](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)&gt;): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)&gt;



Decodes a BASE64 encoded char array that is known to be resonably well formatted. The method is about twice as fast as [decode](decode.html). The preconditions are: + The array must have a line length of 76 chars OR no line separators at all (one line). + Line separator must be &quot;\r\n&quot;, as specified in RFC 2045 + The array must not contain illegal characters within the encoded string + The array CAN have illegal characters at the beginning and end, those will be dealt with appropriately.



#### Return



The decoded array of bytes. May be of length 0.



## Parameters


jvm

| | |
|---|---|
| sArr | The source array. Length 0 will return an empty array. null will throw an exception. |





[jvm]\
fun [decodeFast](decode-fast.html)(sArr: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)&gt;): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)&gt;



Decodes a BASE64 encoded byte array that is known to be resonably well formatted. The method is about twice as fast as [decode](decode.html). The preconditions are: + The array must have a line length of 76 chars OR no line separators at all (one line). + Line separator must be &quot;\r\n&quot;, as specified in RFC 2045 + The array must not contain illegal characters within the encoded string + The array CAN have illegal characters at the beginning and end, those will be dealt with appropriately.



#### Return



The decoded array of bytes. May be of length 0.



## Parameters


jvm

| | |
|---|---|
| sArr | The source array. Length 0 will return an empty array. null will throw an exception. |





[jvm]\
fun [decodeFast](decode-fast.html)(s: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)&gt;



Decodes a BASE64 encoded string that is known to be resonably well formatted. The method is about twice as fast as [decode](decode.html). The preconditions are: + The array must have a line length of 76 chars OR no line separators at all (one line). + Line separator must be &quot;\r\n&quot;, as specified in RFC 2045 + The array must not contain illegal characters within the encoded string + The array CAN have illegal characters at the beginning and end, those will be dealt with appropriately.



#### Return



The decoded array of bytes. May be of length 0.



## Parameters


jvm

| | |
|---|---|
| s | The source string. Length 0 will return an empty array. null will throw an exception. |




