package be.zvz.kotlininside.value

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.module.kotlin.kotlinModule
import org.apache.commons.lang3.RandomStringUtils

object Const {
    const val DC_APP_SIGNATURE = "ReOo4u96nnv8Njd7707KpYiIVYQ3FlcKHDJE046Pg6s="
    const val DC_APP_PACKAGE = "com.dcinside.app"
    const val DC_APP_VERSION_CODE = "30516"
    const val DC_APP_VERSION_NAME = "4.2.13"
    const val USER_AGENT = "dcinside.app"

    @JvmStatic
    val DEFAULT_JSON_MAPPER = JsonMapper
        .builder()
        .addModule(kotlinModule())
        .enable(JsonParser.Feature.ALLOW_COMMENTS)
        .enable(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES)
        .propertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE)
        .build()

    @JvmStatic
    val DEFAULT_FCM_TOKEN =
        RandomStringUtils.randomAlphanumeric(11) + ":APA91bFMI-0d1b0wJmlIWoDPVa_V5Nv0OWnAefN7fGLegy6D76TN_CRo5RSUO-6V7Wnq44t7Rzx0A4kICVZ7wX-hJd3mrczE5NnLud722k5c-XRjIxYGVM9yZBScqE3oh4xbJOe2AvDe"
}
