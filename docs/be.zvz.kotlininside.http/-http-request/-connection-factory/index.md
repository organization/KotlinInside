---
title: HttpRequest.ConnectionFactory - 
---

[be.zvz.kotlininside.http](../../index.html) / [HttpRequest](../index.html) / [ConnectionFactory](./index.html)

# ConnectionFactory

`interface ConnectionFactory`

Creates ``[`HTTP connections`](#) for ``[`urls`](#).

### Properties

| [DEFAULT](-d-e-f-a-u-l-t.html) | A ``[`ConnectionFactory`](./index.html) which uses the built-in ``[`URL#openConnection()`](#)`static val DEFAULT: ConnectionFactory!` |

### Functions

| [create](create.html) | Open an ``[`HttpURLConnection`](#) for the specified ``[`URL`](#).`abstract fun create(url: URL!): HttpURLConnection!`<br>Open an ``[`HttpURLConnection`](#) for the specified ``[`URL`](#) and ``[`Proxy`](#).`abstract fun create(url: URL!, proxy: Proxy!): HttpURLConnection!` |

