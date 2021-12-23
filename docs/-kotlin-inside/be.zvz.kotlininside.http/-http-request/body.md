---
title: body
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.http](../index.html)/[HttpRequest](index.html)/[body](body.html)



# body



[jvm]\
open fun [body](body.html)(charset: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)



Get response as [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) in given character set 



 This will fall back to using the UTF-8 character set if the given charset is null



#### Return



string



## Parameters


jvm

| | |
|---|---|
| charset |  |



## Throws


| | |
|---|---|
| [be.zvz.kotlininside.http.HttpRequest.HttpRequestException](-http-request-exception/index.html) |  |




[jvm]\
open fun [body](body.html)(): [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)



Get response as [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) using character set returned from [charset](charset.html)



#### Return



string



## Throws


| | |
|---|---|
| [be.zvz.kotlininside.http.HttpRequest.HttpRequestException](-http-request-exception/index.html) |  |




[jvm]\
open fun [body](body.html)(output: [AtomicReference](https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/atomic/AtomicReference.html)&lt;[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)&gt;): [HttpRequest](index.html)



Get the response body as a [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) and set it as the value of the given reference.



#### Return



this request



## Parameters


jvm

| | |
|---|---|
| output |  |



## Throws


| | |
|---|---|
| [be.zvz.kotlininside.http.HttpRequest.HttpRequestException](-http-request-exception/index.html) |  |




[jvm]\
open fun [body](body.html)(output: [AtomicReference](https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/atomic/AtomicReference.html)&lt;[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)&gt;, charset: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [HttpRequest](index.html)



Get the response body as a [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) and set it as the value of the given reference.



#### Return



this request



## Parameters


jvm

| | |
|---|---|
| output |  |
| charset |  |



## Throws


| | |
|---|---|
| [be.zvz.kotlininside.http.HttpRequest.HttpRequestException](-http-request-exception/index.html) |  |



