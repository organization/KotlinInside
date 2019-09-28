package be.zvz.kotlininside.session

import be.zvz.kotlininside.session.user.User

data class Session(public val user: User, public val detail: SessionDetail?)