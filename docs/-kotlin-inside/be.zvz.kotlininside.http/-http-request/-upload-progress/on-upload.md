---
title: HttpRequest.UploadProgress.onUpload - KotlinInside
---

[KotlinInside](../../../index.html) / [be.zvz.kotlininside.http](../../index.html) / [HttpRequest](../index.html) / [UploadProgress](index.html) / [onUpload](./on-upload.html)

# onUpload

(JVM) `abstract fun onUpload(uploaded: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, total: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Callback invoked as data is uploaded by the request.

### Parameters

`uploaded` - [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html): The number of bytes already uploaded

`total` - [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html): The total number of bytes that will be uploaded or -1 if the length is unknown.