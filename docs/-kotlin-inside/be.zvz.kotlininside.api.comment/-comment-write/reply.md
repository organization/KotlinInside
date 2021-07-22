---
title: reply
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.api.comment](../index.html)/[CommentWrite](index.html)
/[reply](reply.html)

# reply

[jvm]\
fun [reply](reply.html)(
commentId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [CommentWrite.WriteResult](-write-result/index.html)

대댓글을 작성합니다.

## Parameters

jvm

| | |
|---|---|
| commentId | 대댓글을 작성할 코멘트 ID입니다. |

#### Throws

| | |
|---|---|
| [be.zvz.kotlininside.http.HttpException](../../be.zvz.kotlininside.http/-http-exception/index.html) | 대댓글을 작성하지 못할 경우, HttpException 발생 |



