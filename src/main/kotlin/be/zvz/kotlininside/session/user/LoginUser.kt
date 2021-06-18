package be.zvz.kotlininside.session.user

open class LoginUser(
    override val id: String,
    override val password: String
) : User
