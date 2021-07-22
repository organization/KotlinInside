---
title: HttpException
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.http](../index.html)/[HttpException](index.html)

# HttpException

[jvm]\
open
class [HttpException](index.html) : [RuntimeException](https://docs.oracle.com/javase/7/docs/api/java/lang/RuntimeException.html)

## Constructors

| | |
|---|---|
| [HttpException](-http-exception.html) | [jvm]<br>open fun [HttpException](-http-exception.html)(statusCode: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), errorMessage: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)) |
| [HttpException](-http-exception.html) | [jvm]<br>open fun [HttpException](-http-exception.html)(cause: [Throwable](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html)) |

## Functions

| Name | Summary |
|---|---|
| [addSuppressed](../-http-request/-http-request-exception/index.html#-1898257014%2FFunctions%2F863300109) | [jvm]<br>fun [addSuppressed](../-http-request/-http-request-exception/index.html#-1898257014%2FFunctions%2F863300109)(exception: [Throwable](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html)) |
| [fillInStackTrace](../-http-request/-http-request-exception/index.html#-1207709164%2FFunctions%2F863300109) | [jvm]<br>open fun [fillInStackTrace](../-http-request/-http-request-exception/index.html#-1207709164%2FFunctions%2F863300109)(): [Throwable](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html) |
| [getCause](index.html#-252564762%2FFunctions%2F863300109) | [jvm]<br>open fun [getCause](index.html#-252564762%2FFunctions%2F863300109)(): [Throwable](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html) |
| [getLocalizedMessage](../-http-request/-http-request-exception/index.html#-2138642817%2FFunctions%2F863300109) | [jvm]<br>open fun [getLocalizedMessage](../-http-request/-http-request-exception/index.html#-2138642817%2FFunctions%2F863300109)(): [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) |
| [getMessage](../-http-request/-http-request-exception/index.html#1068546184%2FFunctions%2F863300109) | [jvm]<br>open fun [getMessage](../-http-request/-http-request-exception/index.html#1068546184%2FFunctions%2F863300109)(): [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) |
| [getStackTrace](../-http-request/-http-request-exception/index.html#-1238049138%2FFunctions%2F863300109) | [jvm]<br>open fun [getStackTrace](../-http-request/-http-request-exception/index.html#-1238049138%2FFunctions%2F863300109)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[StackTraceElement](https://docs.oracle.com/javase/7/docs/api/java/lang/StackTraceElement.html)> |
| [getSuppressed](../-http-request/-http-request-exception/index.html#1678506999%2FFunctions%2F863300109) | [jvm]<br>fun [getSuppressed](../-http-request/-http-request-exception/index.html#1678506999%2FFunctions%2F863300109)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Throwable](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html)> |
| [initCause](../-http-request/-http-request-exception/index.html#-104903378%2FFunctions%2F863300109) | [jvm]<br>open fun [initCause](../-http-request/-http-request-exception/index.html#-104903378%2FFunctions%2F863300109)(throwable: [Throwable](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html)): [Throwable](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html) |
| [printStackTrace](../-http-request/-http-request-exception/index.html#-1357294889%2FFunctions%2F863300109) | [jvm]<br>open fun [printStackTrace](../-http-request/-http-request-exception/index.html#-1357294889%2FFunctions%2F863300109)() |
| [setStackTrace](../-http-request/-http-request-exception/index.html#-1146009933%2FFunctions%2F863300109) | [jvm]<br>open fun [setStackTrace](../-http-request/-http-request-exception/index.html#-1146009933%2FFunctions%2F863300109)(trace: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[StackTraceElement](https://docs.oracle.com/javase/7/docs/api/java/lang/StackTraceElement.html)>) |
| [toString](../-http-request/-http-request-exception/index.html#1869833549%2FFunctions%2F863300109) | [jvm]<br>open fun [toString](../-http-request/-http-request-exception/index.html#1869833549%2FFunctions%2F863300109)(): [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) |

## Properties

| Name | Summary |
|---|---|
| [cause](cause.html) | [jvm]<br>@Nullable()<br>private open val [cause](cause.html): @Nullable()[Throwable](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html) |
| [errorMessage](error-message.html) | [jvm]<br>private val [errorMessage](error-message.html): [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) |
| [statusCode](status-code.html) | [jvm]<br>private val [statusCode](status-code.html): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

