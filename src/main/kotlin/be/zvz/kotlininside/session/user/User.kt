package be.zvz.kotlininside.session.user

interface User {
    public val id: String
    public val password: String
    public val userType: UserType
}