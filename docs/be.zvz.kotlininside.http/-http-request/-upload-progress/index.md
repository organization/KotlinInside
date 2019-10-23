---
title: HttpRequest.UploadProgress - 
---

[be.zvz.kotlininside.http](../../index.html) / [HttpRequest](../index.html) / [UploadProgress](./index.html)

# UploadProgress

`interface UploadProgress`

Callback interface for reporting upload progress for a request.

### Properties

| [DEFAULT](-d-e-f-a-u-l-t.html) | `static val DEFAULT: UploadProgress!` |

### Functions

| [onUpload](on-upload.html) | Callback invoked as data is uploaded by the request.`abstract fun onUpload(uploaded: Long, total: Long): Unit` |

