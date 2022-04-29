---
title: be.zvz.kotlininside.api.type.content
---
//[KotlinInside](../../index.html)/[be.zvz.kotlininside.api.type.content](index.html)



# Package be.zvz.kotlininside.api.type.content



## Types


| Name | Summary |
|---|---|
| [Content](-content/index.html) | [jvm]<br>interface [Content](-content/index.html) |
| [DCConContent](-d-c-con-content/index.html) | [jvm]<br>data class [DCConContent](-d-c-con-content/index.html)(val dcCon: [DCCon](../be.zvz.kotlininside.api.type/-d-c-con/index.html), val dcConInsertResult: [DCConInsert.InsertResult](../be.zvz.kotlininside.api.dccon/-d-c-con-insert/-insert-result/index.html)) : [Content](-content/index.html) |
| [HtmlContent](-html-content/index.html) | [jvm]<br>data class [HtmlContent](-html-content/index.html)(val htmlString: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [Content](-content/index.html) |
| [ImageContent](-image-content/index.html) | [jvm]<br>data class [ImageContent](-image-content/index.html)(val stream: [InputStream](https://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html)) : [Content](-content/index.html), [AutoCloseable](https://docs.oracle.com/javase/7/docs/api/java/lang/AutoCloseable.html) |
| [MarkdownContent](-markdown-content/index.html) | [jvm]<br>data class [MarkdownContent](-markdown-content/index.html)(val markdownString: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [Content](-content/index.html) |
| [MovieContent](-movie-content/index.html) | [jvm]<br>data class [MovieContent](-movie-content/index.html)(val info: [MovieContent.MovieInfo](-movie-content/-movie-info/index.html), val stream: [InputStream](https://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html)) : [Content](-content/index.html), [AutoCloseable](https://docs.oracle.com/javase/7/docs/api/java/lang/AutoCloseable.html)<br>[MovieContent](-movie-content/index.html)를 사용한 글을 작성해야 할 경우, 글 작성 전에 [be.zvz.kotlininside.api.generic.MovieUpload](../be.zvz.kotlininside.api.generic/-movie-upload/index.html)를 사용하여 [MovieContent](-movie-content/index.html)를 업로드 해놓아야 합니다. |
| [StringContent](-string-content/index.html) | [jvm]<br>data class [StringContent](-string-content/index.html)(val string: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [Content](-content/index.html) |

