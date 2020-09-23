---
title: UploadProgress -
---
//[KotlinInside](../../../index.md)/[be.zvz.kotlininside.http](../../index.md)/[HttpRequest](../index.md)/[UploadProgress](index.md)



# UploadProgress  
 [jvm] 

Callback interface for reporting upload progress for a request.

interface [UploadProgress](index.md)   


## Functions  
  
|  Name|  Summary| 
|---|---|
| [onUpload](on-upload.md)| [jvm]  <br>Brief description  <br><br><br>Callback invoked as data is uploaded by the request.<br><br>  <br>Content  <br>abstract fun [onUpload](on-upload.md)(uploaded: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), total: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html))  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| [DEFAULT](index.md#be.zvz.kotlininside.http/HttpRequest.UploadProgress/DEFAULT/#/PointingToDeclaration/)|  [jvm] val [DEFAULT](index.md#be.zvz.kotlininside.http/HttpRequest.UploadProgress/DEFAULT/#/PointingToDeclaration/): [HttpRequest.UploadProgress](index.md)   <br>

