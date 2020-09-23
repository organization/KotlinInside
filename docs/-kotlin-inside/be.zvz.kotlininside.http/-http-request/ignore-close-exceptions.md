---
title: ignoreCloseExceptions -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.http](../index.md)/[HttpRequest](index.md)/[ignoreCloseExceptions](ignore-close-exceptions.md)



# ignoreCloseExceptions  
[jvm]  
Brief description  




Set whether or not to ignore exceptions that occur from calling [close](https://docs.oracle.com/javase/7/docs/api/java/io/Closeable.html#close())



 The default value of this setting is true





#### Return  


this request



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| ignore| <br><br><br><br>
  
  
Content  
open fun [ignoreCloseExceptions](ignore-close-exceptions.md)(ignore: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)): [HttpRequest](index.md)  


[jvm]  
Brief description  


Get whether or not exceptions thrown by [close](https://docs.oracle.com/javase/7/docs/api/java/io/Closeable.html#close()) are ignored



#### Return  


true if ignoring, false if throwing

  
Content  
open fun [ignoreCloseExceptions](ignore-close-exceptions.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  



