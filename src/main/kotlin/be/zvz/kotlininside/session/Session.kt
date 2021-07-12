package be.zvz.kotlininside.session

import be.zvz.kotlininside.session.user.User

interface Session {
    val user: User
}
