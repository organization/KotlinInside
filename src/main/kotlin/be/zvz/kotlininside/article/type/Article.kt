package be.zvz.kotlininside.article.type

data class Article(
    val subject: String,
    val content: List<Content>,
    val headText: HeadText? = null
)