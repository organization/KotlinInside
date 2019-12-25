---
title: HttpRequest.ConnectionFactory - KotlinInside
---

[KotlinInside](../../../index.html) / [be.zvz.kotlininside.http](../../index.html) / [HttpRequest](../index.html) / [ConnectionFactory](./index.html)

# ConnectionFactory

(JVM) `interface ConnectionFactory`

Creates ``[`HTTP connections`](https://docs.oracle.com/javase/7/docs/api/java/net/HttpURLConnection.html) for ``[`urls`](https://docs.oracle.com/javase/7/docs/api/java/net/URL.html).

### Properties

| (JVM) [DEFAULT](-d-e-f-a-u-l-t.html) | A ``[`ConnectionFactory`](./index.html) which uses the built-in ``[`URL#openConnection()`](https://docs.oracle.com/javase/7/docs/api/java/net/URL.html#openConnection())`static val DEFAULT: ConnectionFactory!` |

### Functions

| (JVM) [create](create.html) | Open an ``[`HttpURLConnection`](https://docs.oracle.com/javase/7/docs/api/java/net/HttpURLConnection.html) for the specified ``[`URL`](https://docs.oracle.com/javase/7/docs/api/java/net/URL.html).`abstract fun create(url: `[`URL`](https://docs.oracle.com/javase/7/docs/api/java/net/URL.html)`!): `[`HttpURLConnection`](https://docs.oracle.com/javase/7/docs/api/java/net/HttpURLConnection.html)`!`<br>Open an ``[`HttpURLConnection`](https://docs.oracle.com/javase/7/docs/api/java/net/HttpURLConnection.html) for the specified ``[`URL`](https://docs.oracle.com/javase/7/docs/api/java/net/URL.html) and ``[`Proxy`](https://docs.oracle.com/javase/7/docs/api/java/net/Proxy.html).`abstract fun create(url: `[`URL`](https://docs.oracle.com/javase/7/docs/api/java/net/URL.html)`!, proxy: `[`Proxy`](https://docs.oracle.com/javase/7/docs/api/java/net/Proxy.html)`!): `[`HttpURLConnection`](https://docs.oracle.com/javase/7/docs/api/java/net/HttpURLConnection.html)`!` |

