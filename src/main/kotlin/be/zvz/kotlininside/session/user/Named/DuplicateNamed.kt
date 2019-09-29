package be.zvz.kotlininside.session.user.named

import be.zvz.kotlininside.session.user.UserType

class DuplicateNamed(override val id: String,
                     override val password: String,
                     override val userType: UserType = UserType.DUPLICATE_NAMED
) : Named(id, password, userType)