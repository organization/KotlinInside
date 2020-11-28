---
title: encodeBytesToBytes -
---
//[KotlinInside](../../../index.md)/[be.zvz.kotlininside.http](../../index.md)/[HttpRequest](../index.md)/[Base64](index.md)/[encodeBytesToBytes](encode-bytes-to-bytes.md)



# encodeBytesToBytes  
[jvm]  
Content  
open fun [encodeBytesToBytes](encode-bytes-to-bytes.md)(source: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)>, off: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), len: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)>  
More info  


Similar to [encodeBytes](encode-bytes.md) but returns a byte array instead of instantiating a String. This is more efficient if you're working with I/O streams and have large data sets to encode.



#### Return  


Base64-encoded data as a String if there is an error



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| <a name="be.zvz.kotlininside.http/HttpRequest.Base64/encodeBytesToBytes/#byte[]#int#int/PointingToDeclaration/"></a>len| <a name="be.zvz.kotlininside.http/HttpRequest.Base64/encodeBytesToBytes/#byte[]#int#int/PointingToDeclaration/"></a><br><br>Length of data to convert<br><br>
| <a name="be.zvz.kotlininside.http/HttpRequest.Base64/encodeBytesToBytes/#byte[]#int#int/PointingToDeclaration/"></a>off| <a name="be.zvz.kotlininside.http/HttpRequest.Base64/encodeBytesToBytes/#byte[]#int#int/PointingToDeclaration/"></a><br><br>Offset in array where conversion should begin<br><br>
| <a name="be.zvz.kotlininside.http/HttpRequest.Base64/encodeBytesToBytes/#byte[]#int#int/PointingToDeclaration/"></a>source| <a name="be.zvz.kotlininside.http/HttpRequest.Base64/encodeBytesToBytes/#byte[]#int#int/PointingToDeclaration/"></a><br><br>The data to convert<br><br>
  
  



