---
title: HttpRequest.UploadProgress - KotlinInside
---

[KotlinInside](../../../index.html) / [be.zvz.kotlininside.http](../../index.html) / [HttpRequest](../index.html) / [UploadProgress](./index.html)

# UploadProgress

(JVM) `interface UploadProgress`

Callback interface for reporting upload progress for a request.

### Properties

| (JVM) [DEFAULT](-d-e-f-a-u-l-t.html) | `static val DEFAULT: UploadProgress!` |

### Functions

| (JVM) [onUpload](on-upload.html) | Callback invoked as data is uploaded by the request.`abstract fun onUpload(uploaded: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, total: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

