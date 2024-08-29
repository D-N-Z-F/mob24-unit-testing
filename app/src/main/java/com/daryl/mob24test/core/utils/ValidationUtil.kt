package com.daryl.mob24test.core.utils

object ValidationUtil {
    fun validateEmail(email: String): Boolean =
        Regex("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.(com)\$").matches(email)
}