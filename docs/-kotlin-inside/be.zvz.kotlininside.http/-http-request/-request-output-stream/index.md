---
title: RequestOutputStream -
---
//[KotlinInside](../../../index.md)/[be.zvz.kotlininside.http](../../index.md)/[HttpRequest](../index.md)/[RequestOutputStream](index.md)



# RequestOutputStream  
 [jvm] 

Request output stream

open class [RequestOutputStream](index.md) : [BufferedOutputStream](https://docs.oracle.com/javase/7/docs/api/java/io/BufferedOutputStream.html)   


## Constructors  
  
|  Name|  Summary| 
|---|---|
| [RequestOutputStream](-request-output-stream.md)|  [jvm] <br><br>Create request output stream<br><br>open fun [RequestOutputStream](-request-output-stream.md)(stream: [OutputStream](https://docs.oracle.com/javase/7/docs/api/java/io/OutputStream.html), charset: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), bufferSize: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| [close](https://docs.oracle.com/javase/7/docs/api/java/io/FilterOutputStream.html#close())| [jvm]  <br>Content  <br>open fun [close](https://docs.oracle.com/javase/7/docs/api/java/io/FilterOutputStream.html#close())()  <br><br><br>
| [flush](https://docs.oracle.com/javase/7/docs/api/java/io/BufferedOutputStream.html#flush())| [jvm]  <br>Content  <br>open fun [flush](https://docs.oracle.com/javase/7/docs/api/java/io/BufferedOutputStream.html#flush())()  <br><br><br>
| [flushBuffer](https://docs.oracle.com/javase/7/docs/api/java/io/BufferedOutputStream.html#flushBuffer())| [jvm]  <br>Content  <br>open fun [flushBuffer](https://docs.oracle.com/javase/7/docs/api/java/io/BufferedOutputStream.html#flushBuffer())()  <br><br><br>
| [nullOutputStream](https://docs.oracle.com/javase/7/docs/api/java/io/OutputStream.html#nullOutputStream())| [jvm]  <br>Content  <br>open fun [nullOutputStream](https://docs.oracle.com/javase/7/docs/api/java/io/OutputStream.html#nullOutputStream())(): [OutputStream](https://docs.oracle.com/javase/7/docs/api/java/io/OutputStream.html)  <br><br><br>
| [write](write.md)| [jvm]  <br>Brief description  <br><br><br>Write string to stream<br><br>  <br>Content  <br>open fun [write](write.md)(value: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [HttpRequest.RequestOutputStream](index.md)  <br><br><br>[jvm]  <br>Content  <br>open fun [write](https://docs.oracle.com/javase/7/docs/api/java/io/BufferedOutputStream.html#write(int))(b: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br><br><br>

