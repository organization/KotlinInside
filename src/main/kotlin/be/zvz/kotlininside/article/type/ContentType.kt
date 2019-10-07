package be.zvz.kotlininside.article.type

import java.io.File

data class ContentType(
    val isImage: Boolean = false,
    val content: String,
    val image: File? = null
)