---
title: ConnectionFactory -
---
//[KotlinInside](../../../index.md)/[be.zvz.kotlininside.http](../../index.md)/[HttpRequest](../index.md)/[ConnectionFactory](index.md)



# ConnectionFactory  
 [jvm] interface [ConnectionFactory](index.md)

Creates [HTTP connections](https://docs.oracle.com/javase/7/docs/api/java/net/HttpURLConnection.html) for [urls](https://docs.oracle.com/javase/7/docs/api/java/net/URL.html).

   


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="be.zvz.kotlininside.http/HttpRequest.ConnectionFactory/create/#java.net.URL/PointingToDeclaration/"></a>[create](create.md)| <a name="be.zvz.kotlininside.http/HttpRequest.ConnectionFactory/create/#java.net.URL/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>abstract fun [create](create.md)(url: [URL](https://docs.oracle.com/javase/7/docs/api/java/net/URL.html)): [HttpURLConnection](https://docs.oracle.com/javase/7/docs/api/java/net/HttpURLConnection.html)  <br>More info  <br>Open an [HttpURLConnection](https://docs.oracle.com/javase/7/docs/api/java/net/HttpURLConnection.html) for the specified [URL](https://docs.oracle.com/javase/7/docs/api/java/net/URL.html).  <br><br><br>[jvm]  <br>Content  <br>abstract fun [create](create.md)(url: [URL](https://docs.oracle.com/javase/7/docs/api/java/net/URL.html), proxy: [Proxy](https://docs.oracle.com/javase/7/docs/api/java/net/Proxy.html)): [HttpURLConnection](https://docs.oracle.com/javase/7/docs/api/java/net/HttpURLConnection.html)  <br>More info  <br>Open an [HttpURLConnection](https://docs.oracle.com/javase/7/docs/api/java/net/HttpURLConnection.html) for the specified [URL](https://docs.oracle.com/javase/7/docs/api/java/net/URL.html) and [Proxy](https://docs.oracle.com/javase/7/docs/api/java/net/Proxy.html).  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| <a name="be.zvz.kotlininside.http/HttpRequest.ConnectionFactory/DEFAULT/#/PointingToDeclaration/"></a>[DEFAULT](-d-e-f-a-u-l-t.md)| <a name="be.zvz.kotlininside.http/HttpRequest.ConnectionFactory/DEFAULT/#/PointingToDeclaration/"></a> [jvm] val [DEFAULT](-d-e-f-a-u-l-t.md): [HttpRequest.ConnectionFactory](index.md)A [ConnectionFactory](index.md) which uses the built-in [openConnection](https://docs.oracle.com/javase/7/docs/api/java/net/URL.html#openConnection())   <br>

