---
title: decodeFast -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.migbase64](../index.md)/[Base64](index.md)/[decodeFast](decode-fast.md)



# decodeFast  
[jvm]  
Brief description  


Decodes a BASE64 encoded char array that is known to be resonably well formatted. The method is about twice as fast as [decode](decode.md) . The preconditions are: + The array must have a line length of 76 chars OR no line separators at all (one line). + Line separator must be "\r\n", as specified in RFC 2045 + The array must not contain illegal characters within the encoded string + The array CAN have illegal characters at the beginning and end, those will be dealt with appropriately.



#### Return  


The decoded array of bytes. May be of length 0.



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| sArr| <br><br>The source array. Length 0 will return an empty array. null will throw an exception.<br><br>
  
  
Content  
fun [decodeFast](decode-fast.md)(sArr: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Char](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)>): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)>  


[jvm]  
Brief description  


Decodes a BASE64 encoded byte array that is known to be resonably well formatted. The method is about twice as fast as [decode](decode.md) . The preconditions are: + The array must have a line length of 76 chars OR no line separators at all (one line). + Line separator must be "\r\n", as specified in RFC 2045 + The array must not contain illegal characters within the encoded string + The array CAN have illegal characters at the beginning and end, those will be dealt with appropriately.



#### Return  


The decoded array of bytes. May be of length 0.



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| sArr| <br><br>The source array. Length 0 will return an empty array. null will throw an exception.<br><br>
  
  
Content  
fun [decodeFast](decode-fast.md)(sArr: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)>): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)>  


[jvm]  
Brief description  


Decodes a BASE64 encoded string that is known to be resonably well formatted. The method is about twice as fast as [decode](decode.md) . The preconditions are: + The array must have a line length of 76 chars OR no line separators at all (one line). + Line separator must be "\r\n", as specified in RFC 2045 + The array must not contain illegal characters within the encoded string + The array CAN have illegal characters at the beginning and end, those will be dealt with appropriately.



#### Return  


The decoded array of bytes. May be of length 0.



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| s| <br><br>The source string. Length 0 will return an empty array. null will throw an exception.<br><br>
  
  
Content  
fun [decodeFast](decode-fast.md)(s: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)>  



