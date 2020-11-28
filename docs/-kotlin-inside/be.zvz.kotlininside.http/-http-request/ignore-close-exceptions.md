---
title: ignoreCloseExceptions -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.http](../index.md)/[HttpRequest](index.md)/[ignoreCloseExceptions](ignore-close-exceptions.md)



# ignoreCloseExceptions  
[jvm]  
Content  
open fun [ignoreCloseExceptions](ignore-close-exceptions.md)(ignore: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)): [HttpRequest](index.md)  
More info  


Set whether or not to ignore exceptions that occur from calling [close](https://docs.oracle.com/javase/7/docs/api/java/io/Closeable.html#close())



 The default value of this setting is true



#### Return  


request



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| <a name="be.zvz.kotlininside.http/HttpRequest/ignoreCloseExceptions/#boolean/PointingToDeclaration/"></a>ignore| <a name="be.zvz.kotlininside.http/HttpRequest/ignoreCloseExceptions/#boolean/PointingToDeclaration/"></a>
  
  


[jvm]  
Content  
open fun [ignoreCloseExceptions](ignore-close-exceptions.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  
More info  


Get whether or not exceptions thrown by [close](https://docs.oracle.com/javase/7/docs/api/java/io/Closeable.html#close()) are ignored



#### Return  


if ignoring, false if throwing

  



