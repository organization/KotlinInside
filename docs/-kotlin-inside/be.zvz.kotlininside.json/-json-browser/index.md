---
title: JsonBrowser
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.json](../index.html)/[JsonBrowser](index.html)



# JsonBrowser



[jvm]\
open class [JsonBrowser](index.html)

Allows to easily navigate in decoded JSON data



## Functions


| Name | Summary |
|---|---|
| [as](as.html) | [jvm]<br>@NotNull<br>open fun &lt;[T](as.html)&gt; [as](as.html)(klass: [Class](https://docs.oracle.com/javase/7/docs/api/java/lang/Class.html)&lt;[T](as.html)&gt;): @NotNull[T](as.html)<br>Attempt to retrieve the value in the specified format |
| [asBoolean](as-boolean.html) | [jvm]<br>open fun [asBoolean](as-boolean.html)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>open fun [asBoolean](as-boolean.html)(defaultValue: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [asInteger](as-integer.html) | [jvm]<br>open fun [asInteger](as-integer.html)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>open fun [asInteger](as-integer.html)(defaultValue: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [asLong](as-long.html) | [jvm]<br>open fun [asLong](as-long.html)(): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)<br>open fun [asLong](as-long.html)(defaultValue: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| [asNullableBoolean](as-nullable-boolean.html) | [jvm]<br>@Nullable<br>open fun [asNullableBoolean](as-nullable-boolean.html)(): @Nullable[Boolean](https://docs.oracle.com/javase/7/docs/api/java/lang/Boolean.html) |
| [asNullableInteger](as-nullable-integer.html) | [jvm]<br>@Nullable<br>open fun [asNullableInteger](as-nullable-integer.html)(): @Nullable[Integer](https://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html) |
| [asNullableLong](as-nullable-long.html) | [jvm]<br>@Nullable<br>open fun [asNullableLong](as-nullable-long.html)(): @Nullable[Long](https://docs.oracle.com/javase/7/docs/api/java/lang/Long.html) |
| [create](create.html) | [jvm]<br>@NotNull<br>open fun [create](create.html)(node: JsonNode): @NotNull[JsonBrowser](index.html) |
| [format](format.html) | [jvm]<br>@Nullable<br>open fun [format](format.html)(): @Nullable[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) |
| [get](get.html) | [jvm]<br>@NotNull<br>open fun [get](get.html)(key: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): @NotNull[JsonBrowser](index.html)<br>Get an element by key from a map value |
| [index](--index--.html) | [jvm]<br>@NotNull<br>open fun [index](--index--.html)(index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): @NotNull[JsonBrowser](index.html)<br>Get an element at an index for a list value |
| [isList](is-list.html) | [jvm]<br>open fun [isList](is-list.html)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isMap](is-map.html) | [jvm]<br>open fun [isMap](is-map.html)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isNull](is-null.html) | [jvm]<br>open fun [isNull](is-null.html)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [parse](parse.html) | [jvm]<br>@NotNull<br>open fun [parse](parse.html)(stream: [InputStream](https://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html)): @NotNull[JsonBrowser](index.html)<br>@NotNull<br>open fun [parse](parse.html)(@Nullablejson: @Nullable[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)): @NotNull[JsonBrowser](index.html)<br>Parse from string. |
| [put](put.html) | [jvm]<br>open fun [put](put.html)(key: [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html), item: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html))<br>Put a value into the map if this instance contains a map. |
| [safeText](safe-text.html) | [jvm]<br>@NotNull<br>open fun [safeText](safe-text.html)(): @NotNull[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) |
| [stringify](stringify.html) | [jvm]<br>@Nullable<br>open fun [stringify](stringify.html)(): @Nullable[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) |
| [text](text.html) | [jvm]<br>@Nullable<br>open fun [text](text.html)(): @Nullable[String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) |
| [toMap](to-map.html) | [jvm]<br>@NotNull<br>open fun &lt;[K](to-map.html), [V](to-map.html)&gt; [toMap](to-map.html)(): @NotNull[Map](https://docs.oracle.com/javase/7/docs/api/java/util/Map.html)&lt;[K](to-map.html), [V](to-map.html)&gt; |
| [toString](to-string.html) | [jvm]<br>open fun [toString](to-string.html)(): [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) |
| [values](values.html) | [jvm]<br>@NotNull<br>open fun [values](values.html)(): @NotNull[List](https://docs.oracle.com/javase/7/docs/api/java/util/List.html)&lt;[JsonBrowser](index.html)&gt;<br>Returns a list of all the values in this element |


## Properties


| Name | Summary |
|---|---|
| [mapper](mapper.html) | [jvm]<br>@get:NotNull<br>private open var [mapper](mapper.html): ObjectMapper |
| [NULL_BROWSER](-n-u-l-l_-b-r-o-w-s-e-r.html) | [jvm]<br>val [NULL_BROWSER](-n-u-l-l_-b-r-o-w-s-e-r.html): [JsonBrowser](index.html) |

