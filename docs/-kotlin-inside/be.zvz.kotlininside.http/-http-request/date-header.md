---
title: dateHeader
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.http](../index.html)/[HttpRequest](index.html)/[dateHeader](date-header.html)



# dateHeader



[jvm]\
open fun [dateHeader](date-header.html)(name: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)



Get a date header from the response falling back to returning -1 if the header is missing or parsing fails



#### Return



date, -1 on failures



## Parameters


jvm

| | |
|---|---|
| name |  |



## Throws


| | |
|---|---|
| [be.zvz.kotlininside.http.HttpRequest.HttpRequestException](-http-request-exception/index.html) |  |




[jvm]\
open fun [dateHeader](date-header.html)(name: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), defaultValue: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)



Get a date header from the response falling back to returning the given default value if the header is missing or parsing fails



#### Return



date, default value on failures



## Parameters


jvm

| | |
|---|---|
| name |  |
| defaultValue |  |



## Throws


| | |
|---|---|
| [be.zvz.kotlininside.http.HttpRequest.HttpRequestException](-http-request-exception/index.html) |  |



