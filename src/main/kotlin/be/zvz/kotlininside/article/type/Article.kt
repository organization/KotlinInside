package be.zvz.kotlininside.article.type

data class Article(
    val subject: String,
    val content: List<ContentType>,
    val headText: HeadText? = null
)