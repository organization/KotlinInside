---
title: HttpException
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.http](../index.html)/[HttpException](index.html)



# HttpException



[jvm]\
class [HttpException](index.html) : [RuntimeException](https://docs.oracle.com/javase/7/docs/api/java/lang/RuntimeException.html)



## Constructors


| | |
|---|---|
| [HttpException](-http-exception.html) | [jvm]<br>fun [HttpException](-http-exception.html)(statusCode: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), errorMessage: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?) |
| [HttpException](-http-exception.html) | [jvm]<br>fun [HttpException](-http-exception.html)(cause: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)?) |


## Functions


| Name | Summary |
|---|---|
| [addSuppressed](../../be.zvz.kotlininside.exception/-insufficient-permission-exception/index.html#282858770%2FFunctions%2F863300109) | [jvm]<br>fun [addSuppressed](../../be.zvz.kotlininside.exception/-insufficient-permission-exception/index.html#282858770%2FFunctions%2F863300109)(p0: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) |
| [fillInStackTrace](../../be.zvz.kotlininside.exception/-insufficient-permission-exception/index.html#-1102069925%2FFunctions%2F863300109) | [jvm]<br>open fun [fillInStackTrace](../../be.zvz.kotlininside.exception/-insufficient-permission-exception/index.html#-1102069925%2FFunctions%2F863300109)(): [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) |
| [getLocalizedMessage](../../be.zvz.kotlininside.exception/-insufficient-permission-exception/index.html#1043865560%2FFunctions%2F863300109) | [jvm]<br>open fun [getLocalizedMessage](../../be.zvz.kotlininside.exception/-insufficient-permission-exception/index.html#1043865560%2FFunctions%2F863300109)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [getStackTrace](../../be.zvz.kotlininside.exception/-insufficient-permission-exception/index.html#2050903719%2FFunctions%2F863300109) | [jvm]<br>open fun [getStackTrace](../../be.zvz.kotlininside.exception/-insufficient-permission-exception/index.html#2050903719%2FFunctions%2F863300109)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[StackTraceElement](https://docs.oracle.com/javase/7/docs/api/java/lang/StackTraceElement.html)&gt; |
| [getSuppressed](../../be.zvz.kotlininside.exception/-insufficient-permission-exception/index.html#672492560%2FFunctions%2F863300109) | [jvm]<br>fun [getSuppressed](../../be.zvz.kotlininside.exception/-insufficient-permission-exception/index.html#672492560%2FFunctions%2F863300109)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)&gt; |
| [initCause](../../be.zvz.kotlininside.exception/-insufficient-permission-exception/index.html#-418225042%2FFunctions%2F863300109) | [jvm]<br>open fun [initCause](../../be.zvz.kotlininside.exception/-insufficient-permission-exception/index.html#-418225042%2FFunctions%2F863300109)(p0: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)): [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) |
| [printStackTrace](../../be.zvz.kotlininside.exception/-insufficient-permission-exception/index.html#-1769529168%2FFunctions%2F863300109) | [jvm]<br>open fun [printStackTrace](../../be.zvz.kotlininside.exception/-insufficient-permission-exception/index.html#-1769529168%2FFunctions%2F863300109)()<br>open fun [printStackTrace](../../be.zvz.kotlininside.exception/-insufficient-permission-exception/index.html#1841853697%2FFunctions%2F863300109)(p0: [PrintStream](https://docs.oracle.com/javase/7/docs/api/java/io/PrintStream.html))<br>open fun [printStackTrace](../../be.zvz.kotlininside.exception/-insufficient-permission-exception/index.html#1175535278%2FFunctions%2F863300109)(p0: [PrintWriter](https://docs.oracle.com/javase/7/docs/api/java/io/PrintWriter.html)) |
| [setStackTrace](../../be.zvz.kotlininside.exception/-insufficient-permission-exception/index.html#2135801318%2FFunctions%2F863300109) | [jvm]<br>open fun [setStackTrace](../../be.zvz.kotlininside.exception/-insufficient-permission-exception/index.html#2135801318%2FFunctions%2F863300109)(p0: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[StackTraceElement](https://docs.oracle.com/javase/7/docs/api/java/lang/StackTraceElement.html)&gt;) |


## Properties


| Name | Summary |
|---|---|
| [cause](../../be.zvz.kotlininside.exception/-insufficient-permission-exception/index.html#-654012527%2FProperties%2F863300109) | [jvm]<br>open val [cause](../../be.zvz.kotlininside.exception/-insufficient-permission-exception/index.html#-654012527%2FProperties%2F863300109): [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? |
| [message](../../be.zvz.kotlininside.exception/-insufficient-permission-exception/index.html#1824300659%2FProperties%2F863300109) | [jvm]<br>open val [message](../../be.zvz.kotlininside.exception/-insufficient-permission-exception/index.html#1824300659%2FProperties%2F863300109): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [statusCode](status-code.html) | [jvm]<br>val [statusCode](status-code.html): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

