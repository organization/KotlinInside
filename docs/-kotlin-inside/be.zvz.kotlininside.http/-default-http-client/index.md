---
title: DefaultHttpClient -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.http](../index.md)/[DefaultHttpClient](index.md)



# DefaultHttpClient  
 [jvm] open class [DefaultHttpClient](index.md) : [HttpInterface](../-http-interface/index.md)   


## Constructors  
  
|  Name|  Summary| 
|---|---|
| <a name="be.zvz.kotlininside.http/DefaultHttpClient/DefaultHttpClient/#/PointingToDeclaration/"></a>[DefaultHttpClient](-default-http-client.md)| <a name="be.zvz.kotlininside.http/DefaultHttpClient/DefaultHttpClient/#/PointingToDeclaration/"></a> [jvm] open fun [DefaultHttpClient](-default-http-client.md)()DefaultHttpClient의 constructor입니다.   <br>
| <a name="be.zvz.kotlininside.http/DefaultHttpClient/DefaultHttpClient/#boolean/PointingToDeclaration/"></a>[DefaultHttpClient](-default-http-client.md)| <a name="be.zvz.kotlininside.http/DefaultHttpClient/DefaultHttpClient/#boolean/PointingToDeclaration/"></a> [jvm] open fun [DefaultHttpClient](-default-http-client.md)(gzip: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html))DefaultHttpClient의 constructor입니다.   <br>
| <a name="be.zvz.kotlininside.http/DefaultHttpClient/DefaultHttpClient/#boolean#boolean/PointingToDeclaration/"></a>[DefaultHttpClient](-default-http-client.md)| <a name="be.zvz.kotlininside.http/DefaultHttpClient/DefaultHttpClient/#boolean#boolean/PointingToDeclaration/"></a> [jvm] open fun [DefaultHttpClient](-default-http-client.md)(gzip: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), useCache: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html))DefaultHttpClient의 constructor입니다.   <br>
| <a name="be.zvz.kotlininside.http/DefaultHttpClient/DefaultHttpClient/#boolean#boolean#be.zvz.kotlininside.http.DefaultHttpClient.Proxy/PointingToDeclaration/"></a>[DefaultHttpClient](-default-http-client.md)| <a name="be.zvz.kotlininside.http/DefaultHttpClient/DefaultHttpClient/#boolean#boolean#be.zvz.kotlininside.http.DefaultHttpClient.Proxy/PointingToDeclaration/"></a> [jvm] open fun [DefaultHttpClient](-default-http-client.md)(gzip: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), useCache: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), proxy: [DefaultHttpClient.Proxy](-proxy/index.md))DefaultHttpClient의 constructor입니다.   <br>


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="be.zvz.kotlininside.http/DefaultHttpClient.Proxy///PointingToDeclaration/"></a>[Proxy](-proxy/index.md)| <a name="be.zvz.kotlininside.http/DefaultHttpClient.Proxy///PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open class [Proxy](-proxy/index.md)  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="be.zvz.kotlininside.http/DefaultHttpClient/delete/#java.lang.String#be.zvz.kotlininside.http.HttpInterface.Option/PointingToDeclaration/"></a>[delete](delete.md)| <a name="be.zvz.kotlininside.http/DefaultHttpClient/delete/#java.lang.String#be.zvz.kotlininside.http.HttpInterface.Option/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>@Nullable()  <br>  <br>open fun [delete](delete.md)(url: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), option: [HttpInterface.Option](../-http-interface/-option/index.md)): [JsonBrowser](../../be.zvz.kotlininside.json/-json-browser/index.md)  <br><br><br>
| <a name="be.zvz.kotlininside.http/DefaultHttpClient/get/#java.lang.String#be.zvz.kotlininside.http.HttpInterface.Option/PointingToDeclaration/"></a>[get](get.md)| <a name="be.zvz.kotlininside.http/DefaultHttpClient/get/#java.lang.String#be.zvz.kotlininside.http.HttpInterface.Option/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>@Nullable()  <br>  <br>open fun [get](get.md)(url: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), option: [HttpInterface.Option](../-http-interface/-option/index.md)): [JsonBrowser](../../be.zvz.kotlininside.json/-json-browser/index.md)  <br><br><br>
| <a name="be.zvz.kotlininside.http/DefaultHttpClient/head/#java.lang.String#be.zvz.kotlininside.http.HttpInterface.Option/PointingToDeclaration/"></a>[head](head.md)| <a name="be.zvz.kotlininside.http/DefaultHttpClient/head/#java.lang.String#be.zvz.kotlininside.http.HttpInterface.Option/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>@Nullable()  <br>  <br>open fun [head](head.md)(url: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), option: [HttpInterface.Option](../-http-interface/-option/index.md)): [JsonBrowser](../../be.zvz.kotlininside.json/-json-browser/index.md)  <br><br><br>
| <a name="be.zvz.kotlininside.http/DefaultHttpClient/patch/#java.lang.String#be.zvz.kotlininside.http.HttpInterface.Option/PointingToDeclaration/"></a>[patch](patch.md)| <a name="be.zvz.kotlininside.http/DefaultHttpClient/patch/#java.lang.String#be.zvz.kotlininside.http.HttpInterface.Option/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>@Nullable()  <br>  <br>open fun [patch](patch.md)(url: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), option: [HttpInterface.Option](../-http-interface/-option/index.md)): [JsonBrowser](../../be.zvz.kotlininside.json/-json-browser/index.md)  <br><br><br>
| <a name="be.zvz.kotlininside.http/DefaultHttpClient/post/#java.lang.String#be.zvz.kotlininside.http.HttpInterface.Option/PointingToDeclaration/"></a>[post](post.md)| <a name="be.zvz.kotlininside.http/DefaultHttpClient/post/#java.lang.String#be.zvz.kotlininside.http.HttpInterface.Option/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>@Nullable()  <br>  <br>open fun [post](post.md)(url: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), option: [HttpInterface.Option](../-http-interface/-option/index.md)): [JsonBrowser](../../be.zvz.kotlininside.json/-json-browser/index.md)  <br><br><br>
| <a name="be.zvz.kotlininside.http/DefaultHttpClient/put/#java.lang.String#be.zvz.kotlininside.http.HttpInterface.Option/PointingToDeclaration/"></a>[put](put.md)| <a name="be.zvz.kotlininside.http/DefaultHttpClient/put/#java.lang.String#be.zvz.kotlininside.http.HttpInterface.Option/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>@Nullable()  <br>  <br>open fun [put](put.md)(url: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), option: [HttpInterface.Option](../-http-interface/-option/index.md)): [JsonBrowser](../../be.zvz.kotlininside.json/-json-browser/index.md)  <br><br><br>
| <a name="be.zvz.kotlininside.http/DefaultHttpClient/upload/#java.lang.String#be.zvz.kotlininside.http.HttpInterface.Option/PointingToDeclaration/"></a>[upload](upload.md)| <a name="be.zvz.kotlininside.http/DefaultHttpClient/upload/#java.lang.String#be.zvz.kotlininside.http.HttpInterface.Option/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>@Nullable()  <br>  <br>open fun [upload](upload.md)(url: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), option: [HttpInterface.Option](../-http-interface/-option/index.md)): [JsonBrowser](../../be.zvz.kotlininside.json/-json-browser/index.md)  <br><br><br>

