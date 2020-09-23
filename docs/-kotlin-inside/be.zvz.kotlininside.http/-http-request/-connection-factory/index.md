---
title: ConnectionFactory -
---
//[KotlinInside](../../../index.md)/[be.zvz.kotlininside.http](../../index.md)/[HttpRequest](../index.md)/[ConnectionFactory](index.md)



# ConnectionFactory  
 [jvm] 

Creates [HTTP connections](https://docs.oracle.com/javase/7/docs/api/java/net/HttpURLConnection.html) for [urls](https://docs.oracle.com/javase/7/docs/api/java/net/URL.html) .

interface [ConnectionFactory](index.md)   


## Functions  
  
|  Name|  Summary| 
|---|---|
| [create](create.md)| [jvm]  <br>Brief description  <br><br><br>Open an [HttpURLConnection](https://docs.oracle.com/javase/7/docs/api/java/net/HttpURLConnection.html) for the specified [URL](https://docs.oracle.com/javase/7/docs/api/java/net/URL.html) .<br><br>  <br>Content  <br>abstract fun [create](create.md)(url: [URL](https://docs.oracle.com/javase/7/docs/api/java/net/URL.html)): [HttpURLConnection](https://docs.oracle.com/javase/7/docs/api/java/net/HttpURLConnection.html)  <br><br><br>[jvm]  <br>Brief description  <br><br><br>Open an [HttpURLConnection](https://docs.oracle.com/javase/7/docs/api/java/net/HttpURLConnection.html) for the specified [URL](https://docs.oracle.com/javase/7/docs/api/java/net/URL.html) and [Proxy](https://docs.oracle.com/javase/7/docs/api/java/net/Proxy.html) .<br><br>  <br>Content  <br>abstract fun [create](create.md)(url: [URL](https://docs.oracle.com/javase/7/docs/api/java/net/URL.html), proxy: [Proxy](https://docs.oracle.com/javase/7/docs/api/java/net/Proxy.html)): [HttpURLConnection](https://docs.oracle.com/javase/7/docs/api/java/net/HttpURLConnection.html)  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| [DEFAULT](index.md#be.zvz.kotlininside.http/HttpRequest.ConnectionFactory/DEFAULT/#/PointingToDeclaration/)|  [jvm] <br><br>A [ConnectionFactory](index.md) which uses the built-in [openConnection](https://docs.oracle.com/javase/7/docs/api/java/net/URL.html#openConnection())<br><br>val [DEFAULT](index.md#be.zvz.kotlininside.http/HttpRequest.ConnectionFactory/DEFAULT/#/PointingToDeclaration/): [HttpRequest.ConnectionFactory](index.md)   <br>

