package be.zvz.kotlininside.exception

import kotlin.reflect.KClass

class InsufficientPermissionException(val causeClass: KClass<*>) :
    IllegalStateException("Insufficient permission to use ${causeClass.simpleName}")
