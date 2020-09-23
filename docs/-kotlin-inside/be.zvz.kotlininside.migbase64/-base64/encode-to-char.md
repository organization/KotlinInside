---
title: encodeToChar -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.migbase64](../index.md)/[Base64](index.md)/[encodeToChar](encode-to-char.md)



# encodeToChar  
[jvm]  
Brief description  


Encodes a raw byte array into a BASE64 char[] representation i accordance with RFC 2045.



#### Return  


A BASE64 encoded array. Never null.



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| lineSep| <br><br>Optional "\r\n" after 76 characters, unless end of file. No line separator will be in breach of RFC 2045 which specifies max 76 per line but will be a little faster.<br><br>
| sArr| <br><br>The bytes to convert. If null or length 0 an empty array will be returned.<br><br>
  
  
Content  
fun [encodeToChar](encode-to-char.md)(sArr: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)>, lineSep: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Char](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)>  



