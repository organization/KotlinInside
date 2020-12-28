package be.zvz.kotlininside.api.type

data class DCCon @JvmOverloads constructor(
    val packageIndex: Int = 0,
    val detailIndex: Int = 0,
    val imgLink: String = "",
    val memo: String = "",
    val title: String = ""
)