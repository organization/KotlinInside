package be.zvz.kotlininside.session.user.named

import be.zvz.kotlininside.session.user.LoginUser

internal data class DuplicateNamed(
    override val id: String,
    override val password: String
) : LoginUser(id, password)
