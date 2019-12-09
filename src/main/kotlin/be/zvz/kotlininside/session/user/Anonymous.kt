package be.zvz.kotlininside.session.user

data class Anonymous(
        override val id: String,
        override val password: String
) : User