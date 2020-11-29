---
title: decode -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.migbase64](../index.md)/[Base64](index.md)/[decode](decode.md)



# decode  
[jvm]  
Content  
fun [decode](decode.md)(sArr: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Char](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)>): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)>  
More info  


Decodes a BASE64 encoded char array. All illegal characters will be ignored and can handle both arrays with and without line separators.



#### Return  


decoded array of bytes. May be of length 0. Will be null if the legal characters(including '=') isn't divideable by 4. (I.e. definitely corrupted).



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| <a name="be.zvz.kotlininside.migbase64/Base64/decode/#char[]/PointingToDeclaration/"></a>sArr| <a name="be.zvz.kotlininside.migbase64/Base64/decode/#char[]/PointingToDeclaration/"></a><br><br>The source array. null or length 0 will return an empty array.<br><br>
  
  


[jvm]  
Content  
fun [decode](decode.md)(sArr: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)>): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)>  
More info  


Decodes a BASE64 encoded byte array. All illegal characters will be ignored and can handle both arrays with and without line separators.



#### Return  


decoded array of bytes. May be of length 0. Will be null if the legal characters(including '=') isn't divideable by 4. (I.e. definitely corrupted).



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| <a name="be.zvz.kotlininside.migbase64/Base64/decode/#byte[]/PointingToDeclaration/"></a>sArr| <a name="be.zvz.kotlininside.migbase64/Base64/decode/#byte[]/PointingToDeclaration/"></a><br><br>The source array. Length 0 will return an empty array. null will throw an exception.<br><br>
  
  


[jvm]  
Content  
fun [decode](decode.md)(sArr: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)>, sOff: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), sLen: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)>  
More info  


Decodes a BASE64 encoded byte array. All illegal characters will be ignored and can handle both arrays with and without line separators.



#### Return  


decoded array of bytes. May be of length 0. Will be null if the legal characters(including '=') isn't divideable by 4. (I.e. definitely corrupted).



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| <a name="be.zvz.kotlininside.migbase64/Base64/decode/#byte[]#int#int/PointingToDeclaration/"></a>sArr| <a name="be.zvz.kotlininside.migbase64/Base64/decode/#byte[]#int#int/PointingToDeclaration/"></a><br><br>The source array. null will throw an exception.<br><br>
| <a name="be.zvz.kotlininside.migbase64/Base64/decode/#byte[]#int#int/PointingToDeclaration/"></a>sLen| <a name="be.zvz.kotlininside.migbase64/Base64/decode/#byte[]#int#int/PointingToDeclaration/"></a><br><br>The number of bytes to decode from the source array. Length 0 will return an empty array.<br><br>
| <a name="be.zvz.kotlininside.migbase64/Base64/decode/#byte[]#int#int/PointingToDeclaration/"></a>sOff| <a name="be.zvz.kotlininside.migbase64/Base64/decode/#byte[]#int#int/PointingToDeclaration/"></a><br><br>The starting position in the source array.<br><br>
  
  


[jvm]  
Content  
fun [decode](decode.md)(str: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)>  
More info  


Decodes a BASE64 encoded String. All illegal characters will be ignored and can handle both strings with and without line separators.**Note!** It can be up to about 2x the speed to call decode(str.toCharArray()) instead. That will create a temporary array though. This version will use str.charAt(i) to iterate the string.



#### Return  


decoded array of bytes. May be of length 0. Will be null if the legal characters(including '=') isn't divideable by 4. (I.e. definitely corrupted).



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| <a name="be.zvz.kotlininside.migbase64/Base64/decode/#java.lang.String/PointingToDeclaration/"></a>str| <a name="be.zvz.kotlininside.migbase64/Base64/decode/#java.lang.String/PointingToDeclaration/"></a><br><br>The source string. null or length 0 will return an empty array.<br><br>
  
  



