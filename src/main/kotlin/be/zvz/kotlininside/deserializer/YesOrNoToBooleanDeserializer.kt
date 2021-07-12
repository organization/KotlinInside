package be.zvz.kotlininside.deserializer

import be.zvz.kotlininside.utils.StringUtil
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer

class YesOrNoToBooleanDeserializer : JsonDeserializer<Boolean>() {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): Boolean =
        StringUtil.ynToBoolean(p.valueAsString)
}
