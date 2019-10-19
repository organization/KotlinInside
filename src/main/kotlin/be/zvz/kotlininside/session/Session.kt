package be.zvz.kotlininside.session

import be.zvz.kotlininside.session.user.User

data class Session(
    val user: User,
    val detail: SessionDetail?
)