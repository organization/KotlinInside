---
title: Base64.decode - KotlinInside
---

[KotlinInside](../../index.html) / [be.zvz.kotlininside.migbase64](../index.html) / [Base64](index.html) / [decode](./decode.html)

# decode

(JVM) `static fun decode(sArr: `[`CharArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-array/index.html)`!): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`!`

Decodes a BASE64 encoded char array. All illegal characters will be ignored and can handle both arrays with and without line separators.

### Parameters

`sArr` - [CharArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-array/index.html)!: The source array. `null` or length 0 will return an empty array.

**Return**
[ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)!: The decoded array of bytes. May be of length 0. Will be `null` if the legal characters (including '=') isn't divideable by 4. (I.e. definitely corrupted).

(JVM) `static fun decode(sArr: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`!): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`!`

Decodes a BASE64 encoded byte array. All illegal characters will be ignored and can handle both arrays with and without line separators.

### Parameters

`sArr` - [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)!: The source array. Length 0 will return an empty array. `null` will throw an exception.

**Return**
[ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)!: The decoded array of bytes. May be of length 0. Will be `null` if the legal characters (including '=') isn't divideable by 4. (I.e. definitely corrupted).

(JVM) `static fun decode(sArr: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`!, sOff: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, sLen: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`!`

Decodes a BASE64 encoded byte array. All illegal characters will be ignored and can handle both arrays with and without line separators.

### Parameters

`sArr` - [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)!: The source array. `null` will throw an exception.

`sOff` - [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html): The starting position in the source array.

`sLen` - [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html): The number of bytes to decode from the source array. Length 0 will return an empty array.

**Return**
[ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)!: The decoded array of bytes. May be of length 0. Will be `null` if the legal characters (including '=') isn't divideable by 4. (I.e. definitely corrupted).

(JVM) `static fun decode(str: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`!`

Decodes a BASE64 encoded `String`. All illegal characters will be ignored and can handle both strings with and without line separators. **Note!** It can be up to about 2x the speed to call `decode(str.toCharArray())` instead. That will create a temporary array though. This version will use `str.charAt(i)` to iterate the string.

### Parameters

`str` - [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)!: The source string. `null` or length 0 will return an empty array.

**Return**
[ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)!: The decoded array of bytes. May be of length 0. Will be `null` if the legal characters (including '=') isn't divideable by 4. (I.e. definitely corrupted).

