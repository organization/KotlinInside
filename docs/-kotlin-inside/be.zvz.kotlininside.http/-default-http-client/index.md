---
title: DefaultHttpClient -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.http](../index.md)/[DefaultHttpClient](index.md)



# DefaultHttpClient  
 [jvm] open class [DefaultHttpClient](index.md) : [HttpInterface](../-http-interface/index.md)   


## Constructors  
  
|  Name|  Summary| 
|---|---|
| [DefaultHttpClient](-default-http-client.md)|  [jvm] <br><br>DefaultHttpClient의 constructor입니다.<br><br>open fun [DefaultHttpClient](-default-http-client.md)()   <br>
| [DefaultHttpClient](-default-http-client.md)|  [jvm] <br><br>DefaultHttpClient의 constructor입니다.<br><br>open fun [DefaultHttpClient](-default-http-client.md)(gzip: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html))   <br>
| [DefaultHttpClient](-default-http-client.md)|  [jvm] <br><br>DefaultHttpClient의 constructor입니다.<br><br>open fun [DefaultHttpClient](-default-http-client.md)(gzip: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), useCache: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html))   <br>
| [DefaultHttpClient](-default-http-client.md)|  [jvm] <br><br>DefaultHttpClient의 constructor입니다.<br><br>open fun [DefaultHttpClient](-default-http-client.md)(gzip: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), useCache: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), proxy: [DefaultHttpClient.Proxy](-proxy/index.md))   <br>


## Types  
  
|  Name|  Summary| 
|---|---|
| [Proxy](-proxy/index.md)| [jvm]  <br>Content  <br>open class [Proxy](-proxy/index.md)  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| [delete](delete.md)| [jvm]  <br>Content  <br>@Nullable()  <br>  <br>open fun [delete](delete.md)(url: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), option: [HttpInterface.Option](../-http-interface/-option/index.md)): [JsonBrowser](../../be.zvz.kotlininside.json/-json-browser/index.md)  <br><br><br>
| [get](get.md)| [jvm]  <br>Content  <br>@Nullable()  <br>  <br>open fun [get](get.md)(url: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), option: [HttpInterface.Option](../-http-interface/-option/index.md)): [JsonBrowser](../../be.zvz.kotlininside.json/-json-browser/index.md)  <br><br><br>
| [head](head.md)| [jvm]  <br>Content  <br>@Nullable()  <br>  <br>open fun [head](head.md)(url: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), option: [HttpInterface.Option](../-http-interface/-option/index.md)): [JsonBrowser](../../be.zvz.kotlininside.json/-json-browser/index.md)  <br><br><br>
| [patch](patch.md)| [jvm]  <br>Content  <br>@Nullable()  <br>  <br>open fun [patch](patch.md)(url: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), option: [HttpInterface.Option](../-http-interface/-option/index.md)): [JsonBrowser](../../be.zvz.kotlininside.json/-json-browser/index.md)  <br><br><br>
| [post](post.md)| [jvm]  <br>Content  <br>@Nullable()  <br>  <br>open fun [post](post.md)(url: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), option: [HttpInterface.Option](../-http-interface/-option/index.md)): [JsonBrowser](../../be.zvz.kotlininside.json/-json-browser/index.md)  <br><br><br>
| [put](put.md)| [jvm]  <br>Content  <br>@Nullable()  <br>  <br>open fun [put](put.md)(url: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), option: [HttpInterface.Option](../-http-interface/-option/index.md)): [JsonBrowser](../../be.zvz.kotlininside.json/-json-browser/index.md)  <br><br><br>
| [upload](upload.md)| [jvm]  <br>Content  <br>@Nullable()  <br>  <br>open fun [upload](upload.md)(url: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), option: [HttpInterface.Option](../-http-interface/-option/index.md)): [JsonBrowser](../../be.zvz.kotlininside.json/-json-browser/index.md)  <br><br><br>

