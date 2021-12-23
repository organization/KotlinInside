---
title: ConnectionFactory
---
//[KotlinInside](../../../../index.html)/[be.zvz.kotlininside.http](../../index.html)/[HttpRequest](../index.html)/[ConnectionFactory](index.html)



# ConnectionFactory



[jvm]\
interface [ConnectionFactory](index.html)

Creates [HTTP connections](https://docs.oracle.com/javase/7/docs/api/java/net/HttpURLConnection.html) for [urls](https://docs.oracle.com/javase/7/docs/api/java/net/URL.html).



## Functions


| Name | Summary |
|---|---|
| [create](create.html) | [jvm]<br>abstract fun [create](create.html)(url: [URL](https://docs.oracle.com/javase/7/docs/api/java/net/URL.html)): [HttpURLConnection](https://docs.oracle.com/javase/7/docs/api/java/net/HttpURLConnection.html)<br>Open an [HttpURLConnection](https://docs.oracle.com/javase/7/docs/api/java/net/HttpURLConnection.html) for the specified [URL](https://docs.oracle.com/javase/7/docs/api/java/net/URL.html).<br>[jvm]<br>abstract fun [create](create.html)(url: [URL](https://docs.oracle.com/javase/7/docs/api/java/net/URL.html), proxy: [Proxy](https://docs.oracle.com/javase/7/docs/api/java/net/Proxy.html)): [HttpURLConnection](https://docs.oracle.com/javase/7/docs/api/java/net/HttpURLConnection.html)<br>Open an [HttpURLConnection](https://docs.oracle.com/javase/7/docs/api/java/net/HttpURLConnection.html) for the specified [URL](https://docs.oracle.com/javase/7/docs/api/java/net/URL.html) and [Proxy](https://docs.oracle.com/javase/7/docs/api/java/net/Proxy.html). |


## Properties


| Name | Summary |
|---|---|
| [DEFAULT](-d-e-f-a-u-l-t.html) | [jvm]<br>val [DEFAULT](-d-e-f-a-u-l-t.html): [HttpRequest.ConnectionFactory](index.html)<br>A [ConnectionFactory](index.html) which uses the built-in [openConnection](https://docs.oracle.com/javase/7/docs/api/java/net/URL.html#openConnection()) |

