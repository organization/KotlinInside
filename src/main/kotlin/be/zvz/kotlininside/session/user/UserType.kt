package be.zvz.kotlininside.session.user

enum class UserType(stype: String) {
    ANONYMOUS("C"),
    NAMED("A"),
    DUPLICATE_NAMED("B")
}