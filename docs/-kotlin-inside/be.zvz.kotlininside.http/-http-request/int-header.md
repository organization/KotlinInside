---
title: intHeader
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.http](../index.html)/[HttpRequest](index.html)/[intHeader](int-header.html)



# intHeader



[jvm]\
open fun [intHeader](int-header.html)(name: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)



Get an integer header from the response falling back to returning -1 if the header is missing or parsing fails



#### Return



header value as an integer, -1 when missing or parsing fails



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
open fun [intHeader](int-header.html)(name: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), defaultValue: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)



Get an integer header value from the response falling back to the given default value if the header is missing or if parsing fails



#### Return



header value as an integer, default value when missing or parsing fails



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



