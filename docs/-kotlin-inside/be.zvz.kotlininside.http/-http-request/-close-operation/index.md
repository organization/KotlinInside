---
title: HttpRequest.CloseOperation - KotlinInside
---

[KotlinInside](../../../index.html) / [be.zvz.kotlininside.http](../../index.html) / [HttpRequest](../index.html) / [CloseOperation](./index.html)

# CloseOperation

(JVM) `protected abstract class CloseOperation<V : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`!> : Operation<V>`

Class that ensures a ``[`Closeable`](https://docs.oracle.com/javase/7/docs/api/java/io/Closeable.html) gets closed with proper exception handling.

### Constructors

| (JVM) [&lt;init&gt;](-init-.html) | Create closer for operation`CloseOperation(closeable: `[`Closeable`](https://docs.oracle.com/javase/7/docs/api/java/io/Closeable.html)`!, ignoreCloseExceptions: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`)` |

### Functions

| (JVM) [done](done.html) | `open fun done(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

