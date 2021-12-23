---
title: HttpRequestException
---
//[KotlinInside](../../../../index.html)/[be.zvz.kotlininside.http](../../index.html)/[HttpRequest](../index.html)/[HttpRequestException](index.html)



# HttpRequestException



[jvm]\
open class [HttpRequestException](index.html) : [RuntimeException](https://docs.oracle.com/javase/7/docs/api/java/lang/RuntimeException.html)

HTTP request exception whose cause is always an [IOException](https://docs.oracle.com/javase/7/docs/api/java/io/IOException.html)



## Constructors


| | |
|---|---|
| [HttpRequestException](-http-request-exception.html) | [jvm]<br>open fun [HttpRequestException](-http-request-exception.html)(cause: [IOException](https://docs.oracle.com/javase/7/docs/api/java/io/IOException.html))<br>Create a new HttpRequestException with the given cause |


## Functions


| Name | Summary |
|---|---|
| [addSuppressed](index.html#-1898257014%2FFunctions%2F863300109) | [jvm]<br>fun [addSuppressed](index.html#-1898257014%2FFunctions%2F863300109)(exception: [Throwable](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html)) |
| [fillInStackTrace](index.html#-1207709164%2FFunctions%2F863300109) | [jvm]<br>open fun [fillInStackTrace](index.html#-1207709164%2FFunctions%2F863300109)(): [Throwable](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html) |
| [getCause](get-cause.html) | [jvm]<br>open fun [getCause](get-cause.html)(): [IOException](https://docs.oracle.com/javase/7/docs/api/java/io/IOException.html)<br>Get [IOException](https://docs.oracle.com/javase/7/docs/api/java/io/IOException.html) that triggered this request exception |
| [getLocalizedMessage](index.html#-2138642817%2FFunctions%2F863300109) | [jvm]<br>open fun [getLocalizedMessage](index.html#-2138642817%2FFunctions%2F863300109)(): [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) |
| [getMessage](index.html#1068546184%2FFunctions%2F863300109) | [jvm]<br>open fun [getMessage](index.html#1068546184%2FFunctions%2F863300109)(): [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) |
| [getStackTrace](index.html#-1238049138%2FFunctions%2F863300109) | [jvm]<br>open fun [getStackTrace](index.html#-1238049138%2FFunctions%2F863300109)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[StackTraceElement](https://docs.oracle.com/javase/7/docs/api/java/lang/StackTraceElement.html)&gt; |
| [getSuppressed](index.html#1678506999%2FFunctions%2F863300109) | [jvm]<br>fun [getSuppressed](index.html#1678506999%2FFunctions%2F863300109)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Throwable](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html)&gt; |
| [initCause](index.html#-104903378%2FFunctions%2F863300109) | [jvm]<br>open fun [initCause](index.html#-104903378%2FFunctions%2F863300109)(throwable: [Throwable](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html)): [Throwable](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html) |
| [printStackTrace](index.html#-1357294889%2FFunctions%2F863300109) | [jvm]<br>open fun [printStackTrace](index.html#-1357294889%2FFunctions%2F863300109)() |
| [setStackTrace](index.html#-1146009933%2FFunctions%2F863300109) | [jvm]<br>open fun [setStackTrace](index.html#-1146009933%2FFunctions%2F863300109)(trace: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[StackTraceElement](https://docs.oracle.com/javase/7/docs/api/java/lang/StackTraceElement.html)&gt;) |
| [toString](index.html#1869833549%2FFunctions%2F863300109) | [jvm]<br>open fun [toString](index.html#1869833549%2FFunctions%2F863300109)(): [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) |

