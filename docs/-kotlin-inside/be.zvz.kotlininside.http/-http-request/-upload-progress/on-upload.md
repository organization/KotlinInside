---
title: onUpload -
---
//[KotlinInside](../../../index.md)/[be.zvz.kotlininside.http](../../index.md)/[HttpRequest](../index.md)/[UploadProgress](index.md)/[onUpload](on-upload.md)



# onUpload  
[jvm]  
Brief description  


Callback invoked as data is uploaded by the request.



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| total| <br><br>The total number of bytes that will be uploaded or -1 if the length is unknown.<br><br>
| uploaded| <br><br>The number of bytes already uploaded<br><br>
  
  
Content  
abstract fun [onUpload](on-upload.md)(uploaded: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), total: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html))  



