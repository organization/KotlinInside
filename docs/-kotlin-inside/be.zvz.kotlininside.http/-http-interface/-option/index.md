---
title: Option
---
//[KotlinInside](../../../../index.html)/[be.zvz.kotlininside.http](../../index.html)/[HttpInterface](../index.html)/[Option](index.html)



# Option



[jvm]\
class [Option](index.html)



## Functions


| Name | Summary |
|---|---|
| [addBodyParameter](add-body-parameter.html) | [jvm]<br>@NotNull<br>open fun [addBodyParameter](add-body-parameter.html)(@NotNullkey: @NotNull[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), @NotNullvalue: @NotNull[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): @NotNull[HttpInterface.Option](index.html) |
| [addHeader](add-header.html) | [jvm]<br>@NotNull<br>open fun [addHeader](add-header.html)(@NotNullkey: @NotNull[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), @NotNullvalue: @NotNull[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): @NotNull[HttpInterface.Option](index.html) |
| [addMultipartFile](add-multipart-file.html) | [jvm]<br>@NotNull<br>open fun [addMultipartFile](add-multipart-file.html)(@NotNullkey: @NotNull[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), @NotNullvalue: @NotNull[InputStream](https://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html)): @NotNull[HttpInterface.Option](index.html) |
| [addMultipartFileList](add-multipart-file-list.html) | [jvm]<br>@NotNull<br>open fun [addMultipartFileList](add-multipart-file-list.html)(@NotNullkey: @NotNull[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), @NotNullvalue: @NotNull[List](https://docs.oracle.com/javase/7/docs/api/java/util/List.html)&lt;[InputStream](https://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html)&gt;): @NotNull[HttpInterface.Option](index.html) |
| [addMultipartParameter](add-multipart-parameter.html) | [jvm]<br>@NotNull<br>open fun [addMultipartParameter](add-multipart-parameter.html)(@NotNullkey: @NotNull[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), @NotNullvalue: @NotNull[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): @NotNull[HttpInterface.Option](index.html) |
| [addPathParameter](add-path-parameter.html) | [jvm]<br>@NotNull<br>open fun [addPathParameter](add-path-parameter.html)(@NotNullkey: @NotNull[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), @NotNullvalue: @NotNull[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): @NotNull[HttpInterface.Option](index.html) |
| [addQueryParameter](add-query-parameter.html) | [jvm]<br>@NotNull<br>open fun [addQueryParameter](add-query-parameter.html)(@NotNullkey: @NotNull[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), @NotNullvalue: @NotNull[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): @NotNull[HttpInterface.Option](index.html) |
| [getBody](get-body.html) | [jvm]<br>@Nullable<br>open fun [getBody](get-body.html)(): @Nullable[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) |
| [setContentTypeAndBody](set-content-type-and-body.html) | [jvm]<br>@NotNull<br>open fun [setContentTypeAndBody](set-content-type-and-body.html)(@NotNullcontentType: @NotNull[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), @NotNullbody: @NotNull[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): @NotNull[HttpInterface.Option](index.html) |


## Properties


| Name | Summary |
|---|---|
| [bodyParameter](body-parameter.html) | [jvm]<br>@NotNull<br>@get:NotNull<br>private val [bodyParameter](body-parameter.html): @NotNull[Map](https://docs.oracle.com/javase/7/docs/api/java/util/Map.html)&lt;[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)&gt; |
| [contentType](content-type.html) | [jvm]<br>@Nullable<br>@get:Nullable<br>private open val [contentType](content-type.html): @Nullable[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) |
| [headers](headers.html) | [jvm]<br>@NotNull<br>@get:NotNull<br>private val [headers](headers.html): @NotNull[Map](https://docs.oracle.com/javase/7/docs/api/java/util/Map.html)&lt;[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)&gt; |
| [multipartContentType](multipart-content-type.html) | [jvm]<br>@Nullable<br>@get:Nullable<br>@set:NotNull<br>private open var [multipartContentType](multipart-content-type.html): @Nullable[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) |
| [multipartFile](multipart-file.html) | [jvm]<br>@NotNull<br>@get:NotNull<br>private val [multipartFile](multipart-file.html): @NotNull[Map](https://docs.oracle.com/javase/7/docs/api/java/util/Map.html)&lt;[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), [InputStream](https://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html)&gt; |
| [multipartFileList](multipart-file-list.html) | [jvm]<br>@NotNull<br>@get:NotNull<br>private val [multipartFileList](multipart-file-list.html): @NotNull[Map](https://docs.oracle.com/javase/7/docs/api/java/util/Map.html)&lt;[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), [List](https://docs.oracle.com/javase/7/docs/api/java/util/List.html)&lt;[InputStream](https://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html)&gt;&gt; |
| [multipartParameter](multipart-parameter.html) | [jvm]<br>@NotNull<br>@get:NotNull<br>private val [multipartParameter](multipart-parameter.html): @NotNull[Map](https://docs.oracle.com/javase/7/docs/api/java/util/Map.html)&lt;[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)&gt; |
| [pathParameter](path-parameter.html) | [jvm]<br>@NotNull<br>@get:NotNull<br>private val [pathParameter](path-parameter.html): @NotNull[Map](https://docs.oracle.com/javase/7/docs/api/java/util/Map.html)&lt;[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)&gt; |
| [queryParameter](query-parameter.html) | [jvm]<br>@NotNull<br>@get:NotNull<br>private val [queryParameter](query-parameter.html): @NotNull[Map](https://docs.oracle.com/javase/7/docs/api/java/util/Map.html)&lt;[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)&gt; |
| [userAgent](user-agent.html) | [jvm]<br>@Nullable<br>@get:Nullable<br>@set:NotNull<br>private open var [userAgent](user-agent.html): @Nullable[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) |

