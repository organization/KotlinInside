package be.zvz.kotlininside.session

import be.zvz.kotlininside.session.user.Anonymous

data class AnonymousSession(
    override val user: Anonymous
) : Session
