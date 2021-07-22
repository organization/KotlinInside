---
title: Base64
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.migbase64](../index.html)/[Base64](index.html)

# Base64

[jvm]\
open class [Base64](index.html)

A very fast and memory efficient class to encode and decode to and from BASE64 in full accordance with RFC 2045. On
Windows XP sp1 with 1.4.2_04 and later ;), this encoder and decoder is about 10 times faster on small arrays (10 - 1000
bytes) and 2-3 times as fast on larger arrays (10000 - 1000000 bytes) compared to sun.misc.Encoder()/Decoder().

On byte arrays the encoder is about 20% faster than Jakarta Commons Base64 Codec for encode and about 50% faster for
decoding large arrays. This implementation is about twice as fast on very small arrays (< 30 bytes). If
source/destination is a String this version is about three times as fast due to the fact that the Commons Codec result
has to be recoded to a String from byte[], which is very expensive.

This encode/decode algorithm doesn't create any temporary arrays as many other codecs do, it only allocates the
resulting array. This produces less garbage and it is possible to handle arrays twice as large as algorithms that create
a temporary array. (E.g. Jakarta Commons Codec). It is unknown whether Sun's sun.misc.Encoder()/Decoder() produce
temporary arrays but since performance is quite low it probably does.



 The encoder produces the same output as the Sun one except that the Sun's encoder appends a trailing line separator if the last character isn't a pad. Unclear why but it only adds to the length and is probably a side effect. Both are in conformance with RFC 2045 though. Commons codec seem to always att a trailing line separator.**Note!** The encode/decode method pairs (types) come in three versions with the **exact** same algorithm and thus a lot of code redundancy. This is to not create any temporary arrays for transcoding to/from different format types. The methods not used can simply be commented out.



 There is also a "fast" version of all decode methods that works the same way as the normal ones, but har a few demands on the decoded input. Normally though, these fast verions should be used if the source if the input is known and it hasn't bee tampered with.



 If you find the code useful or you find a bug, please send me a note at base64 @ miginfocom . com. 



 Licence (BSD): ============== 



 Copyright (c) 2004, Mikael Grev, MiG InfoCom AB. (base64 @ miginfocom . com) All rights reserved. 



 Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met: Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution. Neither the name of the MiG InfoCom AB nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES,
INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

#### Author

Mikael Grev Date: 2004-aug-02 Time: 11:31:11

## Functions

| Name | Summary |
|---|---|
| [decode](decode.html) | [jvm]<br>fun [decode](decode.html)(sArr: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)>): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)><br>fun [decode](decode.html)(sArr: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)>, sOff: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), sLen: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)><br>Decodes a BASE64 encoded byte array.<br>[jvm]<br>fun [decode](decode.html)(sArr: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Char](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)>): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)><br>Decodes a BASE64 encoded char array.<br>[jvm]<br>fun [decode](decode.html)(str: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)><br>Decodes a BASE64 encoded String. |
| [decodeFast](decode-fast.html) | [jvm]<br>fun [decodeFast](decode-fast.html)(sArr: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)>): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)><br>Decodes a BASE64 encoded byte array that is known to be resonably well formatted.<br>[jvm]<br>fun [decodeFast](decode-fast.html)(sArr: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Char](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)>): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)><br>Decodes a BASE64 encoded char array that is known to be resonably well formatted.<br>[jvm]<br>fun [decodeFast](decode-fast.html)(s: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)><br>Decodes a BASE64 encoded string that is known to be resonably well formatted. |
| [encodeToByte](encode-to-byte.html) | [jvm]<br>fun [encodeToByte](encode-to-byte.html)(sArr: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)>, lineSep: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)><br>fun [encodeToByte](encode-to-byte.html)(sArr: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)>, sOff: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), sLen: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), lineSep: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)><br>Encodes a raw byte array into a BASE64 byte[] representation i accordance with RFC 2045. |
| [encodeToChar](encode-to-char.html) | [jvm]<br>fun [encodeToChar](encode-to-char.html)(sArr: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)>, lineSep: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Char](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)><br>Encodes a raw byte array into a BASE64 char[] representation i accordance with RFC 2045. |
| [encodeToString](encode-to-string.html) | [jvm]<br>fun [encodeToString](encode-to-string.html)(sArr: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)>, lineSep: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)): [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)<br>Encodes a raw byte array into a BASE64 String representation i accordance with RFC 2045. |

