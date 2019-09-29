package be.zvz.kotlininside.session.user

enum class UserType(val stype: String) {
    ANONYMOUS("C"),
    NAMED("A"),
    DUPLICATE_NAMED("B")
}