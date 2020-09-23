---
title: put -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.http](../index.md)/[HttpRequest](index.md)/[put](put.md)



# put  
[jvm]  
Brief description  


Start a 'PUT' request to the given URL



#### Return  


request



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| url| <br><br><br><br>
  
  
Content  
open fun [put](put.md)(url: [CharSequence](https://docs.oracle.com/javase/7/docs/api/java/lang/CharSequence.html)): [HttpRequest](index.md)  
open fun [put](put.md)(url: [URL](https://docs.oracle.com/javase/7/docs/api/java/net/URL.html)): [HttpRequest](index.md)  


[jvm]  
Brief description  


Start a 'PUT' request to the given URL along with the query params



#### Return  


request



## See also  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| [#append(CharSequence, Map)](append.md)| [append](append.md)
| [#encode(CharSequence)](encode.md)| [encode](encode.md)
  


## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| baseUrl| <br><br><br><br>
| encode| <br><br>true to encode the full URL<br><br>
| params| <br><br>the query parameters to include as part of the baseUrl<br><br>
  
  
Content  
open fun [put](put.md)(baseUrl: [CharSequence](https://docs.oracle.com/javase/7/docs/api/java/lang/CharSequence.html), params: [Map](https://docs.oracle.com/javase/7/docs/api/java/util/Map.html)<Out [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), Out [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>, encode: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)): [HttpRequest](index.md)  


[jvm]  
Brief description  


Start a 'PUT' request to the given URL along with the query params



#### Return  


request



## See also  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| [#append(CharSequence, Object...)](append.md)| [append](append.md)
| [#encode(CharSequence)](encode.md)| [encode](encode.md)
  


## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| baseUrl| <br><br><br><br>
| encode| <br><br>true to encode the full URL<br><br>
| params| <br><br>the name/value query parameter pairs to include as part of the baseUrl<br><br>
  
  
Content  
open fun [put](put.md)(baseUrl: [CharSequence](https://docs.oracle.com/javase/7/docs/api/java/lang/CharSequence.html), encode: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), params: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>): [HttpRequest](index.md)  



