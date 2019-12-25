---
title: HttpRequest.trustAllHosts - KotlinInside
---

[KotlinInside](../../index.html) / [be.zvz.kotlininside.http](../index.html) / [HttpRequest](index.html) / [trustAllHosts](./trust-all-hosts.html)

# trustAllHosts

(JVM) `open fun trustAllHosts(): `[`HttpRequest`](index.html)`!`

Configure HTTPS connection to trust all hosts using a custom ``[`HostnameVerifier`](https://docs.oracle.com/javase/7/docs/api/javax/net/ssl/HostnameVerifier.html) that always returns `true` for each host verified

 This method does nothing if the current request is not a HTTPS request

**Return**
[HttpRequest](index.html)!: this request

