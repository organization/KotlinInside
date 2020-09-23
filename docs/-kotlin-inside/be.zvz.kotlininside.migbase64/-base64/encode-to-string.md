---
title: encodeToString -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.migbase64](../index.md)/[Base64](index.md)/[encodeToString](encode-to-string.md)



# encodeToString  
[jvm]  
Brief description  


Encodes a raw byte array into a BASE64 String representation i accordance with RFC 2045.



#### Return  


A BASE64 encoded array. Never null.



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| lineSep| <br><br>Optional "\r\n" after 76 characters, unless end of file. No line separator will be in breach of RFC 2045 which specifies max 76 per line but will be a little faster.<br><br>
| sArr| <br><br>The bytes to convert. If null or length 0 an empty array will be returned.<br><br>
  
  
Content  
fun [encodeToString](encode-to-string.md)(sArr: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)>, lineSep: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)): [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)  



