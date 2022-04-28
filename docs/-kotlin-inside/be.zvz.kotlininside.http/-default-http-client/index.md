---
title: DefaultHttpClient
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.http](../index.html)/[DefaultHttpClient](index.html)



# DefaultHttpClient



[jvm]\
class [DefaultHttpClient](index.html)@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)constructor(enableGzipCompression: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true, enableCache: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true, proxy: [DefaultHttpClient.Proxy](-proxy/index.html)? = null) : [HttpInterface](../-http-interface/index.html)

DefaultHttpClient의 constructor입니다.



## Parameters


jvm

| | |
|---|---|
| enableGzipCompression | GZIP 압축 사용 유무 |
| enableCache | 캐시 사용 유무 |
| proxy | Proxy 설정 |



## Constructors


| | |
|---|---|
| [DefaultHttpClient](-default-http-client.html) | [jvm]<br>@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)<br>fun [DefaultHttpClient](-default-http-client.html)(enableGzipCompression: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true, enableCache: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true, proxy: [DefaultHttpClient.Proxy](-proxy/index.html)? = null) |


## Types


| Name | Summary |
|---|---|
| [Proxy](-proxy/index.html) | [jvm]<br>class [Proxy](-proxy/index.html) |


## Functions


| Name | Summary |
|---|---|
| [delete](delete.html) | [jvm]<br>open override fun [delete](delete.html)(url: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), option: [HttpInterface.Option](../-http-interface/-option/index.html)?): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [get](get.html) | [jvm]<br>open operator override fun [get](get.html)(url: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), option: [HttpInterface.Option](../-http-interface/-option/index.html)?): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [head](head.html) | [jvm]<br>open override fun [head](head.html)(url: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), option: [HttpInterface.Option](../-http-interface/-option/index.html)?): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [patch](patch.html) | [jvm]<br>open override fun [patch](patch.html)(url: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), option: [HttpInterface.Option](../-http-interface/-option/index.html)?): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [post](post.html) | [jvm]<br>open override fun [post](post.html)(url: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), option: [HttpInterface.Option](../-http-interface/-option/index.html)?): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [put](put.html) | [jvm]<br>open override fun [put](put.html)(url: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), option: [HttpInterface.Option](../-http-interface/-option/index.html)?): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [upload](upload.html) | [jvm]<br>open override fun [upload](upload.html)(url: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), option: [HttpInterface.Option](../-http-interface/-option/index.html)?): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |

