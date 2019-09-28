package be.zvz.kotlininside.session.user

class Anonymous(override val id: String,
                override val password: String,
                override val userType: UserType = UserType.ANONYMOUS
) : User {
}