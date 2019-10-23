---
title: HttpRequest.UploadProgress.onUpload - 
---

[be.zvz.kotlininside.http](../../index.html) / [HttpRequest](../index.html) / [UploadProgress](index.html) / [onUpload](./on-upload.html)

# onUpload

`abstract fun onUpload(uploaded: Long, total: Long): Unit`

Callback invoked as data is uploaded by the request.

### Parameters

`uploaded` - Long: The number of bytes already uploaded

`total` - Long: The total number of bytes that will be uploaded or -1 if the length is unknown.