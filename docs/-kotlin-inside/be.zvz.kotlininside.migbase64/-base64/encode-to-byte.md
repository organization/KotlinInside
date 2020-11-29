---
title: encodeToByte -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.migbase64](../index.md)/[Base64](index.md)/[encodeToByte](encode-to-byte.md)



# encodeToByte  
[jvm]  
Content  
fun [encodeToByte](encode-to-byte.md)(sArr: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)>, lineSep: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)>  
More info  


Encodes a raw byte array into a BASE64 byte[] representation i accordance with RFC 2045.



#### Return  


BASE64 encoded array. Never null.



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| <a name="be.zvz.kotlininside.migbase64/Base64/encodeToByte/#byte[]#boolean/PointingToDeclaration/"></a>lineSep| <a name="be.zvz.kotlininside.migbase64/Base64/encodeToByte/#byte[]#boolean/PointingToDeclaration/"></a><br><br>Optional "\r\n" after 76 characters, unless end of file. No line separator will be in breach of RFC 2045 which specifies max 76 per line but will be a little faster.<br><br>
| <a name="be.zvz.kotlininside.migbase64/Base64/encodeToByte/#byte[]#boolean/PointingToDeclaration/"></a>sArr| <a name="be.zvz.kotlininside.migbase64/Base64/encodeToByte/#byte[]#boolean/PointingToDeclaration/"></a><br><br>The bytes to convert. If null or length 0 an empty array will be returned.<br><br>
  
  


[jvm]  
Content  
fun [encodeToByte](encode-to-byte.md)(sArr: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)>, sOff: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), sLen: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), lineSep: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)>  
More info  


Encodes a raw byte array into a BASE64 byte[] representation i accordance with RFC 2045.



#### Return  


BASE64 encoded array. Never null.



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| <a name="be.zvz.kotlininside.migbase64/Base64/encodeToByte/#byte[]#int#int#boolean/PointingToDeclaration/"></a>lineSep| <a name="be.zvz.kotlininside.migbase64/Base64/encodeToByte/#byte[]#int#int#boolean/PointingToDeclaration/"></a><br><br>Optional "\r\n" after 76 characters, unless end of file. No line separator will be in breach of RFC 2045 which specifies max 76 per line but will be a little faster.<br><br>
| <a name="be.zvz.kotlininside.migbase64/Base64/encodeToByte/#byte[]#int#int#boolean/PointingToDeclaration/"></a>sArr| <a name="be.zvz.kotlininside.migbase64/Base64/encodeToByte/#byte[]#int#int#boolean/PointingToDeclaration/"></a><br><br>The bytes to convert. If null an empty array will be returned.<br><br>
| <a name="be.zvz.kotlininside.migbase64/Base64/encodeToByte/#byte[]#int#int#boolean/PointingToDeclaration/"></a>sLen| <a name="be.zvz.kotlininside.migbase64/Base64/encodeToByte/#byte[]#int#int#boolean/PointingToDeclaration/"></a><br><br>The number of bytes to convert. If 0 an empty array will be returned.<br><br>
| <a name="be.zvz.kotlininside.migbase64/Base64/encodeToByte/#byte[]#int#int#boolean/PointingToDeclaration/"></a>sOff| <a name="be.zvz.kotlininside.migbase64/Base64/encodeToByte/#byte[]#int#int#boolean/PointingToDeclaration/"></a><br><br>The starting position in the bytes to convert.<br><br>
  
  



