---
title: encodeBytes
---
//[KotlinInside](../../../../index.html)/[be.zvz.kotlininside.http](../../index.html)/[HttpRequest](../index.html)
/[Base64](index.html)/[encodeBytes](encode-bytes.html)

# encodeBytes

[jvm]\
open fun [encodeBytes](encode-bytes.html)(
source: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)>): [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)

Encodes a byte array into Base64 notation.

#### Return

The Base64-encoded data as a String



## Parameters


jvm

| | |
|---|---|
| source | The data to convert |

#### Throws

| | |
|---|---|
| [java.lang.NullPointerException](https://docs.oracle.com/javase/7/docs/api/java/lang/NullPointerException.html) | if source array is null |
| [java.lang.IllegalArgumentException](https://docs.oracle.com/javase/7/docs/api/java/lang/IllegalArgumentException.html) | if source array, offset, or length are invalid |

[jvm]\
open fun [encodeBytes](encode-bytes.html)(
source: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)>
, off: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html),
len: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)

Encodes a byte array into Base64 notation.

#### Return

The Base64-encoded data as a String

## Parameters

jvm

| | |
|---|---|
| source | The data to convert |
| off | Offset in array where conversion should begin |
| len | Length of data to convert |

#### Throws

| | |
|---|---|
| [java.lang.NullPointerException](https://docs.oracle.com/javase/7/docs/api/java/lang/NullPointerException.html) | if source array is null |
| [java.lang.IllegalArgumentException](https://docs.oracle.com/javase/7/docs/api/java/lang/IllegalArgumentException.html) | if source array, offset, or length are invalid |



