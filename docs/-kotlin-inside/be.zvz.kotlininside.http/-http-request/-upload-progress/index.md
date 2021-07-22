---
title: UploadProgress
---
//[KotlinInside](../../../../index.html)/[be.zvz.kotlininside.http](../../index.html)/[HttpRequest](../index.html)
/[UploadProgress](index.html)

# UploadProgress

[jvm]\
interface [UploadProgress](index.html)

Callback interface for reporting upload progress for a request.

## Functions

| Name | Summary |
|---|---|
| [onUpload](on-upload.html) | [jvm]<br>abstract fun [onUpload](on-upload.html)(uploaded: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), total: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html))<br>Callback invoked as data is uploaded by the request. |

## Properties

| Name | Summary |
|---|---|
| [DEFAULT](-d-e-f-a-u-l-t.html) | [jvm]<br>val [DEFAULT](-d-e-f-a-u-l-t.html): [HttpRequest.UploadProgress](index.html) |

