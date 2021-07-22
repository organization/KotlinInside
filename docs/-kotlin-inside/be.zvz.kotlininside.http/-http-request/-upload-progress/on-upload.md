---
title: onUpload
---
//[KotlinInside](../../../../index.html)/[be.zvz.kotlininside.http](../../index.html)/[HttpRequest](../index.html)
/[UploadProgress](index.html)/[onUpload](on-upload.html)

# onUpload

[jvm]\
abstract fun [onUpload](on-upload.html)(
uploaded: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html),
total: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html))

Callback invoked as data is uploaded by the request.

## Parameters

jvm

| | |
|---|---|
| uploaded | The number of bytes already uploaded |
| total | The total number of bytes that will be uploaded or -1 if the length is unknown. |




