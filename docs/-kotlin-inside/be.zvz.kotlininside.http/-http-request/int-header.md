---
title: intHeader -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.http](../index.md)/[HttpRequest](index.md)/[intHeader](int-header.md)



# intHeader  
[jvm]  
Brief description  


Get an integer header from the response falling back to returning -1 if the header is missing or parsing fails



#### Return  


header value as an integer, -1 when missing or parsing fails



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| name| <br><br><br><br>
  
  
Content  
open fun [intHeader](int-header.md)(name: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  


[jvm]  
Brief description  


Get an integer header value from the response falling back to the given default value if the header is missing or if parsing fails



#### Return  


header value as an integer, default value when missing or parsing fails



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| defaultValue| <br><br><br><br>
| name| <br><br><br><br>
  
  
Content  
open fun [intHeader](int-header.md)(name: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), defaultValue: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  



