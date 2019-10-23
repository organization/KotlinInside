---
title: HttpRequest.trustAllHosts - 
---

[be.zvz.kotlininside.http](../index.html) / [HttpRequest](index.html) / [trustAllHosts](./trust-all-hosts.html)

# trustAllHosts

`open fun trustAllHosts(): `[`HttpRequest`](index.html)`!`

Configure HTTPS connection to trust all hosts using a custom ``[`HostnameVerifier`](#) that always returns `true` for each host verified

 This method does nothing if the current request is not a HTTPS request

**Return**
[HttpRequest](index.html)!: this request

