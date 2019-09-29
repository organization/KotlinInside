package be.zvz.kotlininside.session.user

abstract class LoginUser(override val id: String, override val password: String) : User