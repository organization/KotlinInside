package be.zvz.kotlininside.session.user.named

import be.zvz.kotlininside.session.user.LoginUser
import be.zvz.kotlininside.session.user.UserType

open class Named(
    override val id: String,
    override val password: String,
    override val userType: UserType = UserType.NAMED
) : LoginUser(id, password)