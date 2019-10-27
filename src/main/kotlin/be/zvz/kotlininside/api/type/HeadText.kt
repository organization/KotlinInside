package be.zvz.kotlininside.api.type

data class HeadText @JvmOverloads constructor(
        val identifier: Int,
        val name: String,
        val level: Int = 0,
        val selected: Boolean = false
)