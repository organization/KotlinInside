---
title: HttpException - 
---

[be.zvz.kotlininside.http](../index.html) / [HttpException](./index.html)

# HttpException

`open class HttpException : RuntimeException`

### Constructors

| [&lt;init&gt;](-init-.html) | `HttpException(statusCode: Int, errorMessage: String!)`<br>`HttpException(cause: Throwable!)` |

### Properties

| [cause](cause.html) | `open val cause: Throwable?` |

### Functions

| [getErrorMessage](get-error-message.html) | `open fun getErrorMessage(): String!` |
| [getStatusCode](get-status-code.html) | `open fun getStatusCode(): Int` |

