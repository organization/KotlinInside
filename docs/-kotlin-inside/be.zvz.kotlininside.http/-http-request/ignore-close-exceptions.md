---
title: ignoreCloseExceptions
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.http](../index.html)/[HttpRequest](index.html)/[ignoreCloseExceptions](ignore-close-exceptions.html)



# ignoreCloseExceptions



[jvm]\
open fun [ignoreCloseExceptions](ignore-close-exceptions.html)(ignore: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)): [HttpRequest](index.html)



Set whether or not to ignore exceptions that occur from calling [close](https://docs.oracle.com/javase/7/docs/api/java/io/Closeable.html#close())



 The default value of this setting is true



#### Return



this request



## Parameters


jvm

| | |
|---|---|
| ignore |  |





[jvm]\
open fun [ignoreCloseExceptions](ignore-close-exceptions.html)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)



Get whether or not exceptions thrown by [close](https://docs.oracle.com/javase/7/docs/api/java/io/Closeable.html#close()) are ignored



#### Return



true if ignoring, false if throwing




