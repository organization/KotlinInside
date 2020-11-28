---
title: form -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.http](../index.md)/[HttpRequest](index.md)/[form](form.md)



# form  
[jvm]  
Content  
open fun [form](form.md)(values: [Map](https://docs.oracle.com/javase/7/docs/api/java/util/Map.html)<out [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), out [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>): [HttpRequest](index.md)  
More info  


Write the values in the map as form data to the request body 



 The pairs specified will be URL-encoded in UTF-8 and sent with the 'application/x-www-form-urlencoded' content-type



#### Return  


request



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| <a name="be.zvz.kotlininside.http/HttpRequest/form/#java.util.Map<?,?>/PointingToDeclaration/"></a>values| <a name="be.zvz.kotlininside.http/HttpRequest/form/#java.util.Map<?,?>/PointingToDeclaration/"></a>
  
  


[jvm]  
Content  
open fun [form](form.md)(entry: [Map.Entry](https://docs.oracle.com/javase/7/docs/api/java/util/Map.Entry.html)<out [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), out [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>): [HttpRequest](index.md)  
More info  


Write the key and value in the entry as form data to the request body 



 The pair specified will be URL-encoded in UTF-8 and sent with the 'application/x-www-form-urlencoded' content-type



#### Return  


request



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| <a name="be.zvz.kotlininside.http/HttpRequest/form/#java.util.Map.Entry<?,?>/PointingToDeclaration/"></a>entry| <a name="be.zvz.kotlininside.http/HttpRequest/form/#java.util.Map.Entry<?,?>/PointingToDeclaration/"></a>
  
  


[jvm]  
Content  
open fun [form](form.md)(entry: [Map.Entry](https://docs.oracle.com/javase/7/docs/api/java/util/Map.Entry.html)<out [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), out [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>, charset: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [HttpRequest](index.md)  
More info  


Write the key and value in the entry as form data to the request body 



 The pair specified will be URL-encoded and sent with the 'application/x-www-form-urlencoded' content-type



#### Return  


request



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| <a name="be.zvz.kotlininside.http/HttpRequest/form/#java.util.Map.Entry<?,?>#java.lang.String/PointingToDeclaration/"></a>charset| <a name="be.zvz.kotlininside.http/HttpRequest/form/#java.util.Map.Entry<?,?>#java.lang.String/PointingToDeclaration/"></a>
| <a name="be.zvz.kotlininside.http/HttpRequest/form/#java.util.Map.Entry<?,?>#java.lang.String/PointingToDeclaration/"></a>entry| <a name="be.zvz.kotlininside.http/HttpRequest/form/#java.util.Map.Entry<?,?>#java.lang.String/PointingToDeclaration/"></a>
  
  


[jvm]  
Content  
open fun [form](form.md)(name: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), value: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)): [HttpRequest](index.md)  
More info  


Write the name/value pair as form data to the request body 



 The pair specified will be URL-encoded in UTF-8 and sent with the 'application/x-www-form-urlencoded' content-type



#### Return  


request



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| <a name="be.zvz.kotlininside.http/HttpRequest/form/#java.lang.Object#java.lang.Object/PointingToDeclaration/"></a>name| <a name="be.zvz.kotlininside.http/HttpRequest/form/#java.lang.Object#java.lang.Object/PointingToDeclaration/"></a>
| <a name="be.zvz.kotlininside.http/HttpRequest/form/#java.lang.Object#java.lang.Object/PointingToDeclaration/"></a>value| <a name="be.zvz.kotlininside.http/HttpRequest/form/#java.lang.Object#java.lang.Object/PointingToDeclaration/"></a>
  
  


[jvm]  
Content  
open fun [form](form.md)(name: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), value: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), charset: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [HttpRequest](index.md)  
More info  


Write the name/value pair as form data to the request body 



 The values specified will be URL-encoded and sent with the 'application/x-www-form-urlencoded' content-type



#### Return  


request



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| <a name="be.zvz.kotlininside.http/HttpRequest/form/#java.lang.Object#java.lang.Object#java.lang.String/PointingToDeclaration/"></a>charset| <a name="be.zvz.kotlininside.http/HttpRequest/form/#java.lang.Object#java.lang.Object#java.lang.String/PointingToDeclaration/"></a>
| <a name="be.zvz.kotlininside.http/HttpRequest/form/#java.lang.Object#java.lang.Object#java.lang.String/PointingToDeclaration/"></a>name| <a name="be.zvz.kotlininside.http/HttpRequest/form/#java.lang.Object#java.lang.Object#java.lang.String/PointingToDeclaration/"></a>
| <a name="be.zvz.kotlininside.http/HttpRequest/form/#java.lang.Object#java.lang.Object#java.lang.String/PointingToDeclaration/"></a>value| <a name="be.zvz.kotlininside.http/HttpRequest/form/#java.lang.Object#java.lang.Object#java.lang.String/PointingToDeclaration/"></a>
  
  


[jvm]  
Content  
open fun [form](form.md)(values: [Map](https://docs.oracle.com/javase/7/docs/api/java/util/Map.html)<out [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), out [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>, charset: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [HttpRequest](index.md)  
More info  


Write the values in the map as encoded form data to the request body



#### Return  


request



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| <a name="be.zvz.kotlininside.http/HttpRequest/form/#java.util.Map<?,?>#java.lang.String/PointingToDeclaration/"></a>charset| <a name="be.zvz.kotlininside.http/HttpRequest/form/#java.util.Map<?,?>#java.lang.String/PointingToDeclaration/"></a>
| <a name="be.zvz.kotlininside.http/HttpRequest/form/#java.util.Map<?,?>#java.lang.String/PointingToDeclaration/"></a>values| <a name="be.zvz.kotlininside.http/HttpRequest/form/#java.util.Map<?,?>#java.lang.String/PointingToDeclaration/"></a>
  
  



