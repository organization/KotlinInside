---
title: post
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.http](../index.html)/[HttpRequest](index.html)/[post](post.html)



# post



[jvm]\
open fun [post](post.html)(url: [CharSequence](https://docs.oracle.com/javase/7/docs/api/java/lang/CharSequence.html)): [HttpRequest](index.html)

open fun [post](post.html)(url: [URL](https://docs.oracle.com/javase/7/docs/api/java/net/URL.html)): [HttpRequest](index.html)



Start a 'POST' request to the given URL



#### Return



request



## Parameters


jvm

| | |
|---|---|
| url |  |



## Throws


| | |
|---|---|
| [be.zvz.kotlininside.http.HttpRequest.HttpRequestException](-http-request-exception/index.html) |  |




[jvm]\
open fun [post](post.html)(baseUrl: [CharSequence](https://docs.oracle.com/javase/7/docs/api/java/lang/CharSequence.html), params: [Map](https://docs.oracle.com/javase/7/docs/api/java/util/Map.html)&lt;out [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), out [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt;, encode: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)): [HttpRequest](index.html)



Start a 'POST' request to the given URL along with the query params



#### Return



request



## See also


jvm

| | |
|---|---|
| [append(CharSequence, Map)](append.html) |  |
| [encode(CharSequence)](encode.html) |  |



## Parameters


jvm

| | |
|---|---|
| baseUrl |  |
| params | the query parameters to include as part of the baseUrl |
| encode | true to encode the full URL |





[jvm]\
open fun [post](post.html)(baseUrl: [CharSequence](https://docs.oracle.com/javase/7/docs/api/java/lang/CharSequence.html), encode: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), params: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt;): [HttpRequest](index.html)



Start a 'POST' request to the given URL along with the query params



#### Return



request



## See also


jvm

| | |
|---|---|
| [append(CharSequence, Object...)](append.html) |  |
| [encode(CharSequence)](encode.html) |  |



## Parameters


jvm

| | |
|---|---|
| baseUrl |  |
| encode | true to encode the full URL |
| params | the name/value query parameter pairs to include as part of the baseUrl |




