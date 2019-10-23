---
title: HttpRequest.Operation - 
---

[be.zvz.kotlininside.http](../../index.html) / [HttpRequest](../index.html) / [Operation](./index.html)

# Operation

`protected abstract class Operation<V : Any!> : Callable<V>`

Operation that handles executing a callback once complete and handling nested exceptions

### Constructors

| [&lt;init&gt;](-init-.html) | Operation that handles executing a callback once complete and handling nested exceptions`Operation()` |

### Functions

| [call](call.html) | `open fun call(): V` |
| [done](done.html) | Operation complete callback`abstract fun done(): Unit` |
| [run](run.html) | Run operation`abstract fun run(): V` |

