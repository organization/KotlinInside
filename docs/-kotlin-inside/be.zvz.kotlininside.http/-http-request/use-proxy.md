---
title: HttpRequest.useProxy - KotlinInside
---

[KotlinInside](../../index.html) / [be.zvz.kotlininside.http](../index.html) / [HttpRequest](index.html) / [useProxy](./use-proxy.html)

# useProxy

(JVM) `open fun useProxy(proxyHost: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!, proxyPort: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`HttpRequest`](index.html)`!`

Configure an HTTP proxy on this connection. Use {``[`#proxyBasic(String, String)`](proxy-basic.html) if this proxy requires basic authentication.

### Parameters

`proxyHost` - [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)!:

`proxyPort` - [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html):

**Return**
[HttpRequest](index.html)!: this request

