package be.zvz.kotlininside.article.type

data class Article(
    val headText: HeadText,
    val subject: String,
    val content: String = "",
    val image: String?
)