package be.zvz.kotlininside.session

import be.zvz.kotlininside.session.user.LoginUser

data class LoggedSession(
    override val user: LoginUser,
    val detail: SessionDetail
) : Session
