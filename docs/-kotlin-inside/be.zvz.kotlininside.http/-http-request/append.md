---
title: append -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.http](../index.md)/[HttpRequest](index.md)/[append](append.md)



# append  
[jvm]  
Brief description  




Append given map as query parameters to the base URL 



 Each map entry's key will be a parameter name and the value's [toString](https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html#toString()) will be the parameter value.





#### Return  


URL with appended query params



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| params| <br><br><br><br>
| url| <br><br><br><br>
  
  
Content  
open fun [append](append.md)(url: [CharSequence](https://docs.oracle.com/javase/7/docs/api/java/lang/CharSequence.html), params: [Map](https://docs.oracle.com/javase/7/docs/api/java/util/Map.html)<Out [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), Out [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>): [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)  


[jvm]  
Brief description  




Append given name/value pairs as query parameters to the base URL 



 The params argument is interpreted as a sequence of name/value pairs so the given number of params must be divisible by 2.





#### Return  


URL with appended query params



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| params| <br><br>name/value pairs<br><br>
| url| <br><br><br><br>
  
  
Content  
open fun [append](append.md)(url: [CharSequence](https://docs.oracle.com/javase/7/docs/api/java/lang/CharSequence.html), params: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>): [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)  



