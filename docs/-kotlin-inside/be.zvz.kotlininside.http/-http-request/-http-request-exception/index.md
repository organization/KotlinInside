---
title: HttpRequest.HttpRequestException - KotlinInside
---

[KotlinInside](../../../index.html) / [be.zvz.kotlininside.http](../../index.html) / [HttpRequest](../index.html) / [HttpRequestException](./index.html)

# HttpRequestException

(JVM) `open class HttpRequestException : `[`RuntimeException`](https://docs.oracle.com/javase/7/docs/api/java/lang/RuntimeException.html)

HTTP request exception whose cause is always an ``[`IOException`](https://docs.oracle.com/javase/7/docs/api/java/io/IOException.html)

### Constructors

| (JVM) [&lt;init&gt;](-init-.html) | Create a new HttpRequestException with the given cause`HttpRequestException(cause: `[`IOException`](https://docs.oracle.com/javase/7/docs/api/java/io/IOException.html)`!)` |

### Properties

| (JVM) [cause](cause.html) | Get ``[`IOException`](https://docs.oracle.com/javase/7/docs/api/java/io/IOException.html) that triggered this request exception`open val cause: `[`IOException`](https://docs.oracle.com/javase/7/docs/api/java/io/IOException.html)`?` |

