package be.zvz.kotlininside.api.type

import be.zvz.kotlininside.api.type.content.Content

data class Article @JvmOverloads constructor(
        val subject: String,
        val content: List<Content>,
        val headText: HeadText? = null
)