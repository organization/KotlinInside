---
title: Base64.decode - 
---

[com.migcomponents.migbase64](../index.html) / [Base64](index.html) / [decode](./decode.html)

# decode

`static fun decode(sArr: CharArray!): ByteArray!`

Decodes a BASE64 encoded char array. All illegal characters will be ignored and can handle both arrays with and without line separators.

### Parameters

`sArr` - CharArray!: The source array. `null` or length 0 will return an empty array.

**Return**
ByteArray!: The decoded array of bytes. May be of length 0. Will be `null` if the legal characters (including '=') isn't divideable by 4. (I.e. definitely corrupted).

`static fun decode(sArr: ByteArray!): ByteArray!`

Decodes a BASE64 encoded byte array. All illegal characters will be ignored and can handle both arrays with and without line separators.

### Parameters

`sArr` - ByteArray!: The source array. Length 0 will return an empty array. `null` will throw an exception.

**Return**
ByteArray!: The decoded array of bytes. May be of length 0. Will be `null` if the legal characters (including '=') isn't divideable by 4. (I.e. definitely corrupted).

`static fun decode(sArr: ByteArray!, sOff: Int, sLen: Int): ByteArray!`

Decodes a BASE64 encoded byte array. All illegal characters will be ignored and can handle both arrays with and without line separators.

### Parameters

`sArr` - ByteArray!: The source array. `null` will throw an exception.

`sOff` - Int: The starting position in the source array.

`sLen` - Int: The number of bytes to decode from the source array. Length 0 will return an empty array.

**Return**
ByteArray!: The decoded array of bytes. May be of length 0. Will be `null` if the legal characters (including '=') isn't divideable by 4. (I.e. definitely corrupted).

`static fun decode(str: String!): ByteArray!`

Decodes a BASE64 encoded `String`. All illegal characters will be ignored and can handle both strings with and without line separators. **Note!** It can be up to about 2x the speed to call `decode(str.toCharArray())` instead. That will create a temporary array though. This version will use `str.charAt(i)` to iterate the string.

### Parameters

`str` - String!: The source string. `null` or length 0 will return an empty array.

**Return**
ByteArray!: The decoded array of bytes. May be of length 0. Will be `null` if the legal characters (including '=') isn't divideable by 4. (I.e. definitely corrupted).

