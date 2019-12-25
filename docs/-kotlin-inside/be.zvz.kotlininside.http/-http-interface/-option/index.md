---
title: HttpInterface.Option - KotlinInside
---

[KotlinInside](../../../index.html) / [be.zvz.kotlininside.http](../../index.html) / [HttpInterface](../index.html) / [Option](./index.html)

# Option

(JVM) `class Option`

### Constructors

| (JVM) [&lt;init&gt;](-init-.html) | `Option()` |

### Functions

| (JVM) [addBodyParameter](add-body-parameter.html) | `fun addBodyParameter(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, value: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): Option` |
| (JVM) [addHeader](add-header.html) | `fun addHeader(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, value: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): Option` |
| (JVM) [addMultipartFile](add-multipart-file.html) | `fun addMultipartFile(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, value: `[`InputStream`](https://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html)`): Option` |
| (JVM) [addMultipartFileList](add-multipart-file-list.html) | `fun addMultipartFileList(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, value: `[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<`[`InputStream`](https://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html)`!>): Option` |
| (JVM) [addMultipartParameter](add-multipart-parameter.html) | `fun addMultipartParameter(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, value: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): Option` |
| (JVM) [addPathParameter](add-path-parameter.html) | `fun addPathParameter(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, value: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): Option` |
| (JVM) [addQueryParameter](add-query-parameter.html) | `fun addQueryParameter(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, value: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): Option` |
| (JVM) [getBodyParameter](get-body-parameter.html) | `fun getBodyParameter(): `[`MutableMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!>` |
| (JVM) [getHeaders](get-headers.html) | `fun getHeaders(): `[`MutableMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!>` |
| (JVM) [getMultipartContentType](get-multipart-content-type.html) | `fun getMultipartContentType(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| (JVM) [getMultipartFile](get-multipart-file.html) | `fun getMultipartFile(): `[`MutableMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!, `[`InputStream`](https://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html)`!>` |
| (JVM) [getMultipartFileList](get-multipart-file-list.html) | `fun getMultipartFileList(): `[`MutableMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!, `[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<`[`InputStream`](https://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html)`!>!>` |
| (JVM) [getMultipartParameter](get-multipart-parameter.html) | `fun getMultipartParameter(): `[`MutableMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!>` |
| (JVM) [getPathParameter](get-path-parameter.html) | `fun getPathParameter(): `[`MutableMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!>` |
| (JVM) [getQueryParameter](get-query-parameter.html) | `fun getQueryParameter(): `[`MutableMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!>` |
| (JVM) [getUserAgent](get-user-agent.html) | `fun getUserAgent(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| (JVM) [setMultipartContentType](set-multipart-content-type.html) | `fun setMultipartContentType(contentType: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?): Option` |
| (JVM) [setUserAgent](set-user-agent.html) | `fun setUserAgent(userAgent: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): Option` |

