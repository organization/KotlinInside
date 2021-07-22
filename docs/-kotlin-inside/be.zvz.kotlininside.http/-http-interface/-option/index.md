---
title: Option
---
//[KotlinInside](../../../../index.html)/[be.zvz.kotlininside.http](../../index.html)/[HttpInterface](../index.html)
/[Option](index.html)

# Option

[jvm]\
class [Option](index.html)

## Functions

| Name | Summary |
|---|---|
| [addBodyParameter](add-body-parameter.html) | [jvm]<br>@NotNull()<br>open fun [addBodyParameter](add-body-parameter.html)(@NotNull()key: @NotNull()[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), @NotNull()value: @NotNull()[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): @NotNull()[HttpInterface.Option](index.html)<br>매개변수 Key |
| [addHeader](add-header.html) | [jvm]<br>@NotNull()<br>open fun [addHeader](add-header.html)(@NotNull()key: @NotNull()[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), @NotNull()value: @NotNull()[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): @NotNull()[HttpInterface.Option](index.html)<br>매개변수 Key |
| [addMultipartFile](add-multipart-file.html) | [jvm]<br>@NotNull()<br>open fun [addMultipartFile](add-multipart-file.html)(@NotNull()key: @NotNull()[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), @NotNull()value: @NotNull()[InputStream](https://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html)): @NotNull()[HttpInterface.Option](index.html)<br>매개변수 Key |
| [addMultipartFileList](add-multipart-file-list.html) | [jvm]<br>@NotNull()<br>open fun [addMultipartFileList](add-multipart-file-list.html)(@NotNull()key: @NotNull()[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), @NotNull()value: @NotNull()[List](https://docs.oracle.com/javase/7/docs/api/java/util/List.html)<[InputStream](https://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html)>): @NotNull()[HttpInterface.Option](index.html)<br>매개변수 Key |
| [addMultipartParameter](add-multipart-parameter.html) | [jvm]<br>@NotNull()<br>open fun [addMultipartParameter](add-multipart-parameter.html)(@NotNull()key: @NotNull()[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), @NotNull()value: @NotNull()[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): @NotNull()[HttpInterface.Option](index.html)<br>매개변수 Key |
| [addPathParameter](add-path-parameter.html) | [jvm]<br>@NotNull()<br>open fun [addPathParameter](add-path-parameter.html)(@NotNull()key: @NotNull()[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), @NotNull()value: @NotNull()[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): @NotNull()[HttpInterface.Option](index.html)<br>매개변수 Key |
| [addQueryParameter](add-query-parameter.html) | [jvm]<br>@NotNull()<br>open fun [addQueryParameter](add-query-parameter.html)(@NotNull()key: @NotNull()[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), @NotNull()value: @NotNull()[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): @NotNull()[HttpInterface.Option](index.html)<br>매개변수 Key |
| [getBody](get-body.html) | [jvm]<br>@Nullable()<br>open fun [getBody](get-body.html)(): @Nullable()[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) |
| [setContentTypeAndBody](set-content-type-and-body.html) | [jvm]<br>@NotNull()<br>open fun [setContentTypeAndBody](set-content-type-and-body.html)(@NotNull()contentType: @NotNull()[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), @NotNull()body: @NotNull()[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): @NotNull()[HttpInterface.Option](index.html)<br>body의 content-type |

## Properties

| Name | Summary |
|---|---|
| [bodyParameter](body-parameter.html) | [jvm]<br>@NotNull()<br>private val [bodyParameter](body-parameter.html): @NotNull()[Map](https://docs.oracle.com/javase/7/docs/api/java/util/Map.html)<[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)> |
| [contentType](content-type.html) | [jvm]<br>@Nullable()<br>private open val [contentType](content-type.html): @Nullable()[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) |
| [headers](headers.html) | [jvm]<br>@NotNull()<br>private val [headers](headers.html): @NotNull()[Map](https://docs.oracle.com/javase/7/docs/api/java/util/Map.html)<[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)> |
| [multipartContentType](multipart-content-type.html) | [jvm]<br>@Nullable()<br>private open var [multipartContentType](multipart-content-type.html): @Nullable()[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) |
| [multipartFile](multipart-file.html) | [jvm]<br>@NotNull()<br>private val [multipartFile](multipart-file.html): @NotNull()[Map](https://docs.oracle.com/javase/7/docs/api/java/util/Map.html)<[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), [InputStream](https://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html)> |
| [multipartFileList](multipart-file-list.html) | [jvm]<br>@NotNull()<br>private val [multipartFileList](multipart-file-list.html): @NotNull()[Map](https://docs.oracle.com/javase/7/docs/api/java/util/Map.html)<[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), [List](https://docs.oracle.com/javase/7/docs/api/java/util/List.html)<[InputStream](https://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html)>> |
| [multipartParameter](multipart-parameter.html) | [jvm]<br>@NotNull()<br>private val [multipartParameter](multipart-parameter.html): @NotNull()[Map](https://docs.oracle.com/javase/7/docs/api/java/util/Map.html)<[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)> |
| [pathParameter](path-parameter.html) | [jvm]<br>@NotNull()<br>private val [pathParameter](path-parameter.html): @NotNull()[Map](https://docs.oracle.com/javase/7/docs/api/java/util/Map.html)<[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)> |
| [queryParameter](query-parameter.html) | [jvm]<br>@NotNull()<br>private val [queryParameter](query-parameter.html): @NotNull()[Map](https://docs.oracle.com/javase/7/docs/api/java/util/Map.html)<[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)> |
| [userAgent](user-agent.html) | [jvm]<br>@Nullable()<br>private open var [userAgent](user-agent.html): @Nullable()[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) |

