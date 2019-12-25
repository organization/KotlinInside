---
title: HttpException - KotlinInside
---

[KotlinInside](../../index.html) / [be.zvz.kotlininside.http](../index.html) / [HttpException](./index.html)

# HttpException

(JVM) `open class HttpException : `[`RuntimeException`](https://docs.oracle.com/javase/7/docs/api/java/lang/RuntimeException.html)

### Constructors

| (JVM) [&lt;init&gt;](-init-.html) | `HttpException(statusCode: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, errorMessage: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!)`<br>`HttpException(cause: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`!)` |

### Properties

| (JVM) [cause](cause.html) | `open val cause: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`?` |

### Functions

| (JVM) [getErrorMessage](get-error-message.html) | `open fun getErrorMessage(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!` |
| (JVM) [getStatusCode](get-status-code.html) | `open fun getStatusCode(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

