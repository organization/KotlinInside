---
title: HttpException -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.http](../index.md)/[HttpException](index.md)



# HttpException  
 [jvm] open class [HttpException](index.md) : [RuntimeException](https://docs.oracle.com/javase/7/docs/api/java/lang/RuntimeException.html)   


## Constructors  
  
|  Name|  Summary| 
|---|---|
| [HttpException](-http-exception.md)|  [jvm] open fun [HttpException](-http-exception.md)(statusCode: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), errorMessage: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html))   <br>
| [HttpException](-http-exception.md)|  [jvm] open fun [HttpException](-http-exception.md)(cause: [Throwable](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html))   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| [addSuppressed](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html#addSuppressed(java.lang.Throwable))| [jvm]  <br>Content  <br>fun [addSuppressed](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html#addSuppressed(java.lang.Throwable))(exception: [Throwable](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html))  <br><br><br>
| [countDuplicates](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html#countDuplicates(java.lang.StackTraceElement[], java.lang.StackTraceElement[]))| [jvm]  <br>Content  <br>open fun [countDuplicates](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html#countDuplicates(java.lang.StackTraceElement[], java.lang.StackTraceElement[]))(currentStack: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[StackTraceElement](https://docs.oracle.com/javase/7/docs/api/java/lang/StackTraceElement.html)>, parentStack: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[StackTraceElement](https://docs.oracle.com/javase/7/docs/api/java/lang/StackTraceElement.html)>): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| [fillInStackTrace](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html#fillInStackTrace())| [jvm]  <br>Content  <br>open fun [fillInStackTrace](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html#fillInStackTrace())(): [Throwable](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html)  <br><br><br>
| [getCause](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html#getCause())| [jvm]  <br>Content  <br>open fun [getCause](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html#getCause())(): [Throwable](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html)  <br><br><br>
| [getInternalStackTrace](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html#getInternalStackTrace())| [jvm]  <br>Content  <br>open fun [getInternalStackTrace](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html#getInternalStackTrace())(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[StackTraceElement](https://docs.oracle.com/javase/7/docs/api/java/lang/StackTraceElement.html)>  <br><br><br>
| [getLocalizedMessage](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html#getLocalizedMessage())| [jvm]  <br>Content  <br>open fun [getLocalizedMessage](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html#getLocalizedMessage())(): [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)  <br><br><br>
| [getMessage](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html#getMessage())| [jvm]  <br>Content  <br>open fun [getMessage](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html#getMessage())(): [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)  <br><br><br>
| [getStackTrace](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html#getStackTrace())| [jvm]  <br>Content  <br>open fun [getStackTrace](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html#getStackTrace())(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[StackTraceElement](https://docs.oracle.com/javase/7/docs/api/java/lang/StackTraceElement.html)>  <br><br><br>
| [getSuppressed](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html#getSuppressed())| [jvm]  <br>Content  <br>fun [getSuppressed](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html#getSuppressed())(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Throwable](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html)>  <br><br><br>
| [initCause](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html#initCause(java.lang.Throwable))| [jvm]  <br>Content  <br>open fun [initCause](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html#initCause(java.lang.Throwable))(throwable: [Throwable](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html)): [Throwable](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html)  <br><br><br>
| [printStackTrace](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html#printStackTrace())| [jvm]  <br>Content  <br>open fun [printStackTrace](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html#printStackTrace())()  <br>open fun [printStackTrace](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html#printStackTrace(java.lang.Appendable, java.lang.StackTraceElement[], int, boolean, java.util.Set&lt;java.lang.Throwable&gt;))(err: [Appendable](https://docs.oracle.com/javase/7/docs/api/java/lang/Appendable.html), parentStack: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[StackTraceElement](https://docs.oracle.com/javase/7/docs/api/java/lang/StackTraceElement.html)>, indents: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), suppressed: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), exceptionChainSet: [Set](https://docs.oracle.com/javase/7/docs/api/java/util/Set.html)<[Throwable](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html)>): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[StackTraceElement](https://docs.oracle.com/javase/7/docs/api/java/lang/StackTraceElement.html)>  <br><br><br>
| [printStackTraceHelper](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html#printStackTraceHelper(java.lang.Appendable))| [jvm]  <br>Content  <br>open fun [printStackTraceHelper](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html#printStackTraceHelper(java.lang.Appendable))(appendable: [Appendable](https://docs.oracle.com/javase/7/docs/api/java/lang/Appendable.html))  <br><br><br>
| [readObject](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html#readObject(java.io.ObjectInputStream))| [jvm]  <br>Content  <br>open fun [readObject](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html#readObject(java.io.ObjectInputStream))(s: [ObjectInputStream](https://docs.oracle.com/javase/7/docs/api/java/io/ObjectInputStream.html))  <br><br><br>
| [setCause](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html#setCause(java.lang.Throwable))| [jvm]  <br>Content  <br>open fun [setCause](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html#setCause(java.lang.Throwable))(throwable: [Throwable](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html)): [Throwable](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html)  <br><br><br>
| [setStackTrace](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html#setStackTrace(java.lang.StackTraceElement[]))| [jvm]  <br>Content  <br>open fun [setStackTrace](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html#setStackTrace(java.lang.StackTraceElement[]))(trace: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[StackTraceElement](https://docs.oracle.com/javase/7/docs/api/java/lang/StackTraceElement.html)>)  <br><br><br>
| [toString](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html#toString())| [jvm]  <br>Content  <br>open fun [toString](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html#toString())(): [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)  <br><br><br>
| [writeObject](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html#writeObject(java.io.ObjectOutputStream))| [jvm]  <br>Content  <br>open fun [writeObject](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html#writeObject(java.io.ObjectOutputStream))(s: [ObjectOutputStream](https://docs.oracle.com/javase/7/docs/api/java/io/ObjectOutputStream.html))  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| [cause](index.md#be.zvz.kotlininside.http/HttpException/cause/#/PointingToDeclaration/)|  [jvm] @Nullable()  <br>  <br>private open val [cause](index.md#be.zvz.kotlininside.http/HttpException/cause/#/PointingToDeclaration/): [Throwable](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html)   <br>
| [errorMessage](index.md#be.zvz.kotlininside.http/HttpException/errorMessage/#/PointingToDeclaration/)|  [jvm] private val [errorMessage](index.md#be.zvz.kotlininside.http/HttpException/errorMessage/#/PointingToDeclaration/): [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)   <br>
| [statusCode](index.md#be.zvz.kotlininside.http/HttpException/statusCode/#/PointingToDeclaration/)|  [jvm] private val [statusCode](index.md#be.zvz.kotlininside.http/HttpException/statusCode/#/PointingToDeclaration/): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)   <br>

