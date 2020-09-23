---
title: JsonBrowser -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.json](../index.md)/[JsonBrowser](index.md)



# JsonBrowser  
 [jvm] 

Allows to easily navigate in decoded JSON data

open class [JsonBrowser](index.md)   


## Functions  
  
|  Name|  Summary| 
|---|---|
| [as](as.md)| [jvm]  <br>Brief description  <br><br><br>Attempt to retrieve the value in the specified format<br><br>  <br>Content  <br>@NotNull()  <br>  <br>open fun <[T](as.md)> [as](as.md)(klass: [Class](https://docs.oracle.com/javase/7/docs/api/java/lang/Class.html)<[T](as.md)>): [T](as.md)  <br><br><br>
| [asBoolean](as-boolean.md)| [jvm]  <br>Content  <br>open fun [asBoolean](as-boolean.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br>open fun [asBoolean](as-boolean.md)(defaultValue: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| [asInteger](as-integer.md)| [jvm]  <br>Content  <br>open fun [asInteger](as-integer.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br>open fun [asInteger](as-integer.md)(defaultValue: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| [asLong](as-long.md)| [jvm]  <br>Content  <br>open fun [asLong](as-long.md)(): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)  <br>open fun [asLong](as-long.md)(defaultValue: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)  <br><br><br>
| [asNullableBoolean](as-nullable-boolean.md)| [jvm]  <br>Content  <br>@Nullable()  <br>  <br>open fun [asNullableBoolean](as-nullable-boolean.md)(): [Boolean](https://docs.oracle.com/javase/7/docs/api/java/lang/Boolean.html)  <br><br><br>
| [asNullableInteger](as-nullable-integer.md)| [jvm]  <br>Content  <br>@Nullable()  <br>  <br>open fun [asNullableInteger](as-nullable-integer.md)(): [Integer](https://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html)  <br><br><br>
| [asNullableLong](as-nullable-long.md)| [jvm]  <br>Content  <br>@Nullable()  <br>  <br>open fun [asNullableLong](as-nullable-long.md)(): [Long](https://docs.oracle.com/javase/7/docs/api/java/lang/Long.html)  <br><br><br>
| [format](format.md)| [jvm]  <br>Content  <br>@Nullable()  <br>  <br>open fun [format](format.md)(): [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)  <br><br><br>
| [get](get.md)| [jvm]  <br>Brief description  <br><br><br>Get an element by key from a map value<br><br>  <br>Content  <br>@NotNull()  <br>  <br>open fun [get](get.md)(key: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [JsonBrowser](index.md)  <br><br><br>
| [index](--index--.md)| [jvm]  <br>Brief description  <br><br><br>Get an element at an index for a list value<br><br>  <br>Content  <br>@NotNull()  <br>  <br>open fun [index](--index--.md)(index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [JsonBrowser](index.md)  <br><br><br>
| [isList](is-list.md)| [jvm]  <br>Brief description  <br><br><br>True if the value represents a list.<br><br>  <br>Content  <br>open fun [isList](is-list.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| [isMap](is-map.md)| [jvm]  <br>Brief description  <br><br><br>True if the value represents a map.<br><br>  <br>Content  <br>open fun [isMap](is-map.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| [isNull](is-null.md)| [jvm]  <br>Brief description  <br><br><br>The value of the element as text<br><br>  <br>Content  <br>open fun [isNull](is-null.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| [parse](parse.md)| [jvm]  <br>Brief description  <br><br><br>Parse from string.<br><br>  <br>Content  <br>@NotNull()  <br>  <br>open fun [parse](parse.md)(stream: [InputStream](https://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html)): [JsonBrowser](index.md)  <br>@NotNull()  <br>  <br>open fun [parse](parse.md)(json: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): [JsonBrowser](index.md)  <br><br><br>
| [put](put.md)| [jvm]  <br>Brief description  <br><br><br>Put a value into the map if this instance contains a map.<br><br>  <br>Content  <br>open fun [put](put.md)(key: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), item: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html))  <br><br><br>
| [safeText](safe-text.md)| [jvm]  <br>Content  <br>@NotNull()  <br>  <br>open fun [safeText](safe-text.md)(): [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)  <br><br><br>
| [text](text.md)| [jvm]  <br>Brief description  <br><br><br>The value of the element as text<br><br>  <br>Content  <br>@Nullable()  <br>  <br>open fun [text](text.md)(): [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)  <br><br><br>
| [toMap](to-map.md)| [jvm]  <br>Content  <br>@NotNull()  <br>  <br>open fun <[K](to-map.md), [V](to-map.md)> [toMap](to-map.md)(): [Map](https://docs.oracle.com/javase/7/docs/api/java/util/Map.html)<[K](to-map.md), V>  <br><br><br>
| [toString](to-string.md)| [jvm]  <br>Content  <br>open fun [toString](to-string.md)(): [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)  <br><br><br>
| [values](values.md)| [jvm]  <br>Brief description  <br><br><br>Returns a list of all the values in this element<br><br>  <br>Content  <br>@NotNull()  <br>  <br>open fun [values](values.md)(): [List](https://docs.oracle.com/javase/7/docs/api/java/util/List.html)<[JsonBrowser](index.md)>  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| [NULL_BROWSER](index.md#be.zvz.kotlininside.json/JsonBrowser/NULL_BROWSER/#/PointingToDeclaration/)|  [jvm] val [NULL_BROWSER](index.md#be.zvz.kotlininside.json/JsonBrowser/NULL_BROWSER/#/PointingToDeclaration/): [JsonBrowser](index.md)   <br>

