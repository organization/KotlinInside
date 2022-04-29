---
title: ImageContent
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.api.type.content](../index.html)/[ImageContent](index.html)



# ImageContent



[jvm]\
data class [ImageContent](index.html)(val stream: [InputStream](https://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html)) : [Content](../-content/index.html), [AutoCloseable](https://docs.oracle.com/javase/7/docs/api/java/lang/AutoCloseable.html)



## Constructors


| | |
|---|---|
| [ImageContent](-image-content.html) | [jvm]<br>fun [ImageContent](-image-content.html)(file: [File](https://docs.oracle.com/javase/7/docs/api/java/io/File.html)) |
| [ImageContent](-image-content.html) | [jvm]<br>fun [ImageContent](-image-content.html)(stream: [InputStream](https://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html)) |


## Functions


| Name | Summary |
|---|---|
| [close](close.html) | [jvm]<br>open override fun [close](close.html)() |


## Properties


| Name | Summary |
|---|---|
| [stream](stream.html) | [jvm]<br>val [stream](stream.html): [InputStream](https://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html) |

