---
title: DefaultHttpClient
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.http](../index.html)/[DefaultHttpClient](index.html)

# DefaultHttpClient

[jvm]\
open class [DefaultHttpClient](index.html) : [HttpInterface](../-http-interface/index.html)

## Constructors

| | |
|---|---|
| [DefaultHttpClient](-default-http-client.html) | [jvm]<br>open fun [DefaultHttpClient](-default-http-client.html)()<br>DefaultHttpClient의 constructor입니다. |
| [DefaultHttpClient](-default-http-client.html) | [jvm]<br>open fun [DefaultHttpClient](-default-http-client.html)(gzip: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html))<br>DefaultHttpClient의 constructor입니다. |
| [DefaultHttpClient](-default-http-client.html) | [jvm]<br>open fun [DefaultHttpClient](-default-http-client.html)(gzip: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), useCache: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html))<br>DefaultHttpClient의 constructor입니다. |
| [DefaultHttpClient](-default-http-client.html) | [jvm]<br>open fun [DefaultHttpClient](-default-http-client.html)(gzip: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), useCache: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), @Nullable()proxy: @Nullable()[DefaultHttpClient.Proxy](-proxy/index.html))<br>DefaultHttpClient의 constructor입니다. |

## Types

| Name | Summary |
|---|---|
| [Proxy](-proxy/index.html) | [jvm]<br>open class [Proxy](-proxy/index.html) |

## Functions

| Name | Summary |
|---|---|
| [delete](delete.html) | [jvm]<br>@Nullable()<br>open fun [delete](delete.html)(@NotNull()url: @NotNull()[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), @Nullable()option: @Nullable()[HttpInterface.Option](../-http-interface/-option/index.html)): @Nullable()[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) |
| [get](get.html) | [jvm]<br>@Nullable()<br>open fun [get](get.html)(@NotNull()url: @NotNull()[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), @Nullable()option: @Nullable()[HttpInterface.Option](../-http-interface/-option/index.html)): @Nullable()[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) |
| [head](head.html) | [jvm]<br>@Nullable()<br>open fun [head](head.html)(@NotNull()url: @NotNull()[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), @Nullable()option: @Nullable()[HttpInterface.Option](../-http-interface/-option/index.html)): @Nullable()[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) |
| [patch](patch.html) | [jvm]<br>@Nullable()<br>open fun [patch](patch.html)(@NotNull()url: @NotNull()[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), @Nullable()option: @Nullable()[HttpInterface.Option](../-http-interface/-option/index.html)): @Nullable()[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) |
| [post](post.html) | [jvm]<br>@Nullable()<br>open fun [post](post.html)(@NotNull()url: @NotNull()[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), @Nullable()option: @Nullable()[HttpInterface.Option](../-http-interface/-option/index.html)): @Nullable()[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) |
| [put](put.html) | [jvm]<br>@Nullable()<br>open fun [put](put.html)(@NotNull()url: @NotNull()[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), @Nullable()option: @Nullable()[HttpInterface.Option](../-http-interface/-option/index.html)): @Nullable()[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) |
| [upload](upload.html) | [jvm]<br>@Nullable()<br>open fun [upload](upload.html)(@NotNull()url: @NotNull()[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), @Nullable()option: @Nullable()[HttpInterface.Option](../-http-interface/-option/index.html)): @Nullable()[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) |

