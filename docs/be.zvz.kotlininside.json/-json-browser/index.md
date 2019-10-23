---
title: JsonBrowser - 
---

[be.zvz.kotlininside.json](../index.html) / [JsonBrowser](./index.html)

# JsonBrowser

`open class JsonBrowser`

Allows to easily navigate in decoded JSON data

### Functions

| [as](as.html) | Attempt to retrieve the value in the specified format`open fun <T : Any!> as(klass: Class<T>!): T` |
| [format](format.html) | `open fun format(): String!` |
| [get](get.html) | Get an element by key from a map value`open fun get(key: String!): `[`JsonBrowser`](./index.html)`!` |
| [index](--index--.html) | Get an element at an index for a list value`open fun index(index: Int): `[`JsonBrowser`](./index.html)`!` |
| [isList](is-list.html) | `open fun isList(): Boolean` |
| [isMap](is-map.html) | `open fun isMap(): Boolean` |
| [isNull](is-null.html) | `open fun isNull(): Boolean` |
| [parse](parse.html) | Parse from string.`open static fun parse(json: String!): `[`JsonBrowser`](./index.html)`!`<br>`open static fun parse(stream: InputStream!): `[`JsonBrowser`](./index.html)`!` |
| [put](put.html) | Put a value into the map if this instance contains a map.`open fun put(key: String!, item: Any!): Unit` |
| [safeGet](safe-get.html) | Get an element by key from a map value`open fun safeGet(key: String!): `[`JsonBrowser`](./index.html)`!` |
| [text](text.html) | `open fun text(): String!` |
| [values](values.html) | Returns a list of all the values in this element`open fun values(): MutableList<`[`JsonBrowser`](./index.html)`!>!` |

