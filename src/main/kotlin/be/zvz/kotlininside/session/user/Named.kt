package be.zvz.kotlininside.session.user

open class Named(
    override val id: String,
    override val password: String,
    override val userType: UserType = UserType.NAMED) : User