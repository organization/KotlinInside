---
title: RequestOutputStream
---
//[KotlinInside](../../../../index.html)/[be.zvz.kotlininside.http](../../index.html)/[HttpRequest](../index.html)/[RequestOutputStream](index.html)



# RequestOutputStream



[jvm]\
open class [RequestOutputStream](index.html) : [BufferedOutputStream](https://docs.oracle.com/javase/7/docs/api/java/io/BufferedOutputStream.html)

Request output stream



## Constructors


| | |
|---|---|
| [RequestOutputStream](-request-output-stream.html) | [jvm]<br>open fun [RequestOutputStream](-request-output-stream.html)(stream: [OutputStream](https://docs.oracle.com/javase/7/docs/api/java/io/OutputStream.html), charset: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), bufferSize: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))<br>Create request output stream |


## Functions


| Name | Summary |
|---|---|
| [close](index.html#610912670%2FFunctions%2F863300109) | [jvm]<br>open fun [close](index.html#610912670%2FFunctions%2F863300109)() |
| [flush](index.html#-1250583157%2FFunctions%2F863300109) | [jvm]<br>open fun [flush](index.html#-1250583157%2FFunctions%2F863300109)() |
| [nullOutputStream](index.html#-935828636%2FFunctions%2F863300109) | [jvm]<br>open fun [nullOutputStream](index.html#-935828636%2FFunctions%2F863300109)(): [OutputStream](https://docs.oracle.com/javase/7/docs/api/java/io/OutputStream.html) |
| [write](write.html) | [jvm]<br>open fun [write](write.html)(value: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [HttpRequest.RequestOutputStream](index.html)<br>Write string to stream<br>[jvm]<br>open fun [write](index.html#669723107%2FFunctions%2F863300109)(b: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |

