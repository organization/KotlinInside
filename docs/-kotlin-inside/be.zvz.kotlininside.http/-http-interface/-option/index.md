---
title: Option -
---
//[KotlinInside](../../../index.md)/[be.zvz.kotlininside.http](../../index.md)/[HttpInterface](../index.md)/[Option](index.md)



# Option  
 [jvm] class [Option](index.md)   


## Functions  
  
|  Name|  Summary| 
|---|---|
| [addBodyParameter](add-body-parameter.md)| [jvm]  <br>Brief description  <br><br><br>매개변수 Key<br><br>  <br>Content  <br>@NotNull()  <br>  <br>open fun [addBodyParameter](add-body-parameter.md)(key: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), value: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [HttpInterface.Option](index.md)  <br><br><br>
| [addHeader](add-header.md)| [jvm]  <br>Brief description  <br><br><br>매개변수 Key<br><br>  <br>Content  <br>@NotNull()  <br>  <br>open fun [addHeader](add-header.md)(key: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), value: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [HttpInterface.Option](index.md)  <br><br><br>
| [addMultipartFile](add-multipart-file.md)| [jvm]  <br>Brief description  <br><br><br>매개변수 Key<br><br>  <br>Content  <br>@NotNull()  <br>  <br>open fun [addMultipartFile](add-multipart-file.md)(key: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), value: [InputStream](https://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html)): [HttpInterface.Option](index.md)  <br><br><br>
| [addMultipartFileList](add-multipart-file-list.md)| [jvm]  <br>Brief description  <br><br><br>매개변수 Key<br><br>  <br>Content  <br>@NotNull()  <br>  <br>open fun [addMultipartFileList](add-multipart-file-list.md)(key: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), value: [List](https://docs.oracle.com/javase/7/docs/api/java/util/List.html)<[InputStream](https://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html)>): [HttpInterface.Option](index.md)  <br><br><br>
| [addMultipartParameter](add-multipart-parameter.md)| [jvm]  <br>Brief description  <br><br><br>매개변수 Key<br><br>  <br>Content  <br>@NotNull()  <br>  <br>open fun [addMultipartParameter](add-multipart-parameter.md)(key: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), value: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [HttpInterface.Option](index.md)  <br><br><br>
| [addPathParameter](add-path-parameter.md)| [jvm]  <br>Brief description  <br><br><br>매개변수 Key<br><br>  <br>Content  <br>@NotNull()  <br>  <br>open fun [addPathParameter](add-path-parameter.md)(key: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), value: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [HttpInterface.Option](index.md)  <br><br><br>
| [addQueryParameter](add-query-parameter.md)| [jvm]  <br>Brief description  <br><br><br>매개변수 Key<br><br>  <br>Content  <br>@NotNull()  <br>  <br>open fun [addQueryParameter](add-query-parameter.md)(key: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), value: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [HttpInterface.Option](index.md)  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| [bodyParameter](index.md#be.zvz.kotlininside.http/HttpInterface.Option/bodyParameter/#/PointingToDeclaration/)|  [jvm] @NotNull()  <br>  <br>private val [bodyParameter](index.md#be.zvz.kotlininside.http/HttpInterface.Option/bodyParameter/#/PointingToDeclaration/): [Map](https://docs.oracle.com/javase/7/docs/api/java/util/Map.html)<[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)>   <br>
| [headers](index.md#be.zvz.kotlininside.http/HttpInterface.Option/headers/#/PointingToDeclaration/)|  [jvm] @NotNull()  <br>  <br>private val [headers](index.md#be.zvz.kotlininside.http/HttpInterface.Option/headers/#/PointingToDeclaration/): [Map](https://docs.oracle.com/javase/7/docs/api/java/util/Map.html)<[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)>   <br>
| [multipartContentType](index.md#be.zvz.kotlininside.http/HttpInterface.Option/multipartContentType/#/PointingToDeclaration/)|  [jvm] @Nullable()  <br>  <br>private open var [multipartContentType](index.md#be.zvz.kotlininside.http/HttpInterface.Option/multipartContentType/#/PointingToDeclaration/): [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)   <br>
| [multipartFile](index.md#be.zvz.kotlininside.http/HttpInterface.Option/multipartFile/#/PointingToDeclaration/)|  [jvm] @NotNull()  <br>  <br>private val [multipartFile](index.md#be.zvz.kotlininside.http/HttpInterface.Option/multipartFile/#/PointingToDeclaration/): [Map](https://docs.oracle.com/javase/7/docs/api/java/util/Map.html)<[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), [InputStream](https://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html)>   <br>
| [multipartFileList](index.md#be.zvz.kotlininside.http/HttpInterface.Option/multipartFileList/#/PointingToDeclaration/)|  [jvm] @NotNull()  <br>  <br>private val [multipartFileList](index.md#be.zvz.kotlininside.http/HttpInterface.Option/multipartFileList/#/PointingToDeclaration/): [Map](https://docs.oracle.com/javase/7/docs/api/java/util/Map.html)<[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), [List](https://docs.oracle.com/javase/7/docs/api/java/util/List.html)<[InputStream](https://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html)>>   <br>
| [multipartParameter](index.md#be.zvz.kotlininside.http/HttpInterface.Option/multipartParameter/#/PointingToDeclaration/)|  [jvm] @NotNull()  <br>  <br>private val [multipartParameter](index.md#be.zvz.kotlininside.http/HttpInterface.Option/multipartParameter/#/PointingToDeclaration/): [Map](https://docs.oracle.com/javase/7/docs/api/java/util/Map.html)<[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)>   <br>
| [pathParameter](index.md#be.zvz.kotlininside.http/HttpInterface.Option/pathParameter/#/PointingToDeclaration/)|  [jvm] @NotNull()  <br>  <br>private val [pathParameter](index.md#be.zvz.kotlininside.http/HttpInterface.Option/pathParameter/#/PointingToDeclaration/): [Map](https://docs.oracle.com/javase/7/docs/api/java/util/Map.html)<[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)>   <br>
| [queryParameter](index.md#be.zvz.kotlininside.http/HttpInterface.Option/queryParameter/#/PointingToDeclaration/)|  [jvm] @NotNull()  <br>  <br>private val [queryParameter](index.md#be.zvz.kotlininside.http/HttpInterface.Option/queryParameter/#/PointingToDeclaration/): [Map](https://docs.oracle.com/javase/7/docs/api/java/util/Map.html)<[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)>   <br>
| [userAgent](index.md#be.zvz.kotlininside.http/HttpInterface.Option/userAgent/#/PointingToDeclaration/)|  [jvm] @Nullable()  <br>  <br>private open var [userAgent](index.md#be.zvz.kotlininside.http/HttpInterface.Option/userAgent/#/PointingToDeclaration/): [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)   <br>

