---
title: HttpRequest.Operation - KotlinInside
---

[KotlinInside](../../../index.html) / [be.zvz.kotlininside.http](../../index.html) / [HttpRequest](../index.html) / [Operation](./index.html)

# Operation

(JVM) `protected abstract class Operation<V : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`!> : `[`Callable`](https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/Callable.html)`<V>`

Operation that handles executing a callback once complete and handling nested exceptions

### Constructors

| (JVM) [&lt;init&gt;](-init-.html) | Operation that handles executing a callback once complete and handling nested exceptions`Operation()` |

### Functions

| (JVM) [call](call.html) | `open fun call(): V` |
| (JVM) [done](done.html) | Operation complete callback`abstract fun done(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| (JVM) [run](run.html) | Run operation`abstract fun run(): V` |

