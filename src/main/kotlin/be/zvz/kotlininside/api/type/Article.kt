package be.zvz.kotlininside.api.type

data class Article(
    val subject: String,
    val content: List<Content>,
    val headText: HeadText? = null
)