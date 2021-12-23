---
title: header
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.http](../index.html)/[HttpRequest](index.html)/[header](header.html)



# header



[jvm]\
open fun [header](header.html)(name: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), value: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [HttpRequest](index.html)

open fun [header](header.html)(name: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), value: [Number](https://docs.oracle.com/javase/7/docs/api/java/lang/Number.html)): [HttpRequest](index.html)



Set header name to given value



#### Return



this request



## Parameters


jvm

| | |
|---|---|
| name |  |
| value |  |





[jvm]\
open fun [header](header.html)(header: [Map.Entry](https://docs.oracle.com/javase/7/docs/api/java/util/Map.Entry.html)&lt;[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)&gt;): [HttpRequest](index.html)



Set header to have given entry's key as the name and value as the value



#### Return



this request



## Parameters


jvm

| | |
|---|---|
| header |  |





[jvm]\
open fun [header](header.html)(name: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)



Get a response header



#### Return



response header



## Parameters


jvm

| | |
|---|---|
| name |  |



## Throws


| | |
|---|---|
| [be.zvz.kotlininside.http.HttpRequest.HttpRequestException](-http-request-exception/index.html) |  |



