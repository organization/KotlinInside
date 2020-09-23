---
title: encodeBytesToBytes -
---
//[KotlinInside](../../../index.md)/[be.zvz.kotlininside.http](../../index.md)/[HttpRequest](../index.md)/[Base64](index.md)/[encodeBytesToBytes](encode-bytes-to-bytes.md)



# encodeBytesToBytes  
[jvm]  
Brief description  


Similar to [encodeBytes](encode-bytes.md) but returns a byte array instead of instantiating a String. This is more efficient if you're working with I/O streams and have large data sets to encode.



#### Return  


The Base64-encoded data as a String if there is an error



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| len| <br><br>Length of data to convert<br><br>
| off| <br><br>Offset in array where conversion should begin<br><br>
| source| <br><br>The data to convert<br><br>
  
  
Content  
open fun [encodeBytesToBytes](encode-bytes-to-bytes.md)(source: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)>, off: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), len: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)>  



