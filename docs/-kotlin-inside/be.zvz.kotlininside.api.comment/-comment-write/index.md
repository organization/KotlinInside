---
title: CommentWrite - KotlinInside
---

[KotlinInside](../../index.html) / [be.zvz.kotlininside.api.comment](../index.html) / [CommentWrite](./index.html)

# CommentWrite

(JVM) `class CommentWrite`

### Types

| (JVM) [WriteResult](-write-result/index.html) | `data class WriteResult` |

### Constructors

| (JVM) [&lt;init&gt;](-init-.html) | `CommentWrite(gallId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, articleId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, comment: `[`Comment`](../../be.zvz.kotlininside.api.type.comment/-comment.html)`, session: `[`Session`](../../be.zvz.kotlininside.session/-session/index.html)`, fcmToken: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = Const.DEFAULT_FCM_TOKEN)` |

### Functions

| (JVM) [reply](reply.html) | 대댓글을 작성합니다.`fun reply(commentId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): WriteResult` |
| (JVM) [write](write.html) | 댓글을 작성합니다.`fun write(): WriteResult` |

