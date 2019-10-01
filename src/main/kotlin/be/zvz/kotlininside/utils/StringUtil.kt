package be.zvz.kotlininside.utils

class StringUtil {
    companion object {
        @JvmStatic
        fun ynToBoolean(s: String): Boolean = when (s) {
            "Y" -> true
            else -> false
        }
    }
}