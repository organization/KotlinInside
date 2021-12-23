---
title: decode
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.migbase64](../index.html)/[Base64](index.html)/[decode](decode.html)



# decode



[jvm]\
fun [decode](decode.html)(sArr: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Char](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)&gt;): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)&gt;



Decodes a BASE64 encoded char array. All illegal characters will be ignored and can handle both arrays with and without line separators.



#### Return



The decoded array of bytes. May be of length 0. Will be null if the legal characters (including '=') isn't divideable by 4. (I.e. definitely corrupted).



## Parameters


jvm

| | |
|---|---|
| sArr | The source array. null or length 0 will return an empty array. |





[jvm]\
fun [decode](decode.html)(sArr: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)&gt;): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)&gt;



Decodes a BASE64 encoded byte array. All illegal characters will be ignored and can handle both arrays with and without line separators.



#### Return



The decoded array of bytes. May be of length 0. Will be null if the legal characters (including '=') isn't divideable by 4. (I.e. definitely corrupted).



## Parameters


jvm

| | |
|---|---|
| sArr | The source array. Length 0 will return an empty array. null will throw an exception. |





[jvm]\
fun [decode](decode.html)(sArr: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)&gt;, sOff: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), sLen: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)&gt;



Decodes a BASE64 encoded byte array. All illegal characters will be ignored and can handle both arrays with and without line separators.



#### Return



The decoded array of bytes. May be of length 0. Will be null if the legal characters (including '=') isn't divideable by 4. (I.e. definitely corrupted).



## Parameters


jvm

| | |
|---|---|
| sArr | The source array. null will throw an exception. |
| sOff | The starting position in the source array. |
| sLen | The number of bytes to decode from the source array. Length 0 will return an empty array. |





[jvm]\
fun [decode](decode.html)(str: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)&gt;



Decodes a BASE64 encoded String. All illegal characters will be ignored and can handle both strings with and without line separators.**Note!** It can be up to about 2x the speed to call decode(str.toCharArray()) instead. That will create a temporary array though. This version will use str.charAt(i) to iterate the string.



#### Return



The decoded array of bytes. May be of length 0. Will be null if the legal characters (including '=') isn't divideable by 4. (I.e. definitely corrupted).



## Parameters


jvm

| | |
|---|---|
| str | The source string. null or length 0 will return an empty array. |




