---
title: JsonBrowser - KotlinInside
---

[KotlinInside](../../index.html) / [be.zvz.kotlininside.json](../index.html) / [JsonBrowser](./index.html)

# JsonBrowser

(JVM) `open class JsonBrowser`

Allows to easily navigate in decoded JSON data

### Functions

| (JVM) [as](as.html) | Attempt to retrieve the value in the specified format`open fun <T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`!> as(klass: `[`Class`](https://docs.oracle.com/javase/7/docs/api/java/lang/Class.html)`<T>!): T` |
| (JVM) [format](format.html) | `open fun format(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!` |
| (JVM) [get](get.html) | Get an element by key from a map value`open fun get(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!): `[`JsonBrowser`](./index.html)`!` |
| (JVM) [index](--index--.html) | Get an element at an index for a list value`open fun index(index: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`JsonBrowser`](./index.html)`!` |
| (JVM) [isList](is-list.html) | `open fun isList(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| (JVM) [isMap](is-map.html) | `open fun isMap(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| (JVM) [isNull](is-null.html) | `open fun isNull(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| (JVM) [parse](parse.html) | Parse from string.`open static fun parse(json: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!): `[`JsonBrowser`](./index.html)`!`<br>`open static fun parse(stream: `[`InputStream`](https://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html)`!): `[`JsonBrowser`](./index.html)`!` |
| (JVM) [put](put.html) | Put a value into the map if this instance contains a map.`open fun put(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!, item: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`!): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| (JVM) [safeGet](safe-get.html) | Get an element by key from a map value`open fun safeGet(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!): `[`JsonBrowser`](./index.html)`!` |
| (JVM) [text](text.html) | `open fun text(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!` |
| (JVM) [toMap](to-map.html) | `open fun <K : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`!, V : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`!> toMap(): `[`MutableMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/index.html)`<K, V>!` |
| (JVM) [toString](to-string.html) | `open fun toString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| (JVM) [values](values.html) | Returns a list of all the values in this element`open fun values(): `[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<`[`JsonBrowser`](./index.html)`!>!` |

