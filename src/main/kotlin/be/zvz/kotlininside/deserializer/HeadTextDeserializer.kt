package be.zvz.kotlininside.deserializer

import be.zvz.kotlininside.api.type.HeadText
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer
import com.fasterxml.jackson.databind.JsonNode

class HeadTextDeserializer : JsonDeserializer<HeadText>() {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): HeadText =
        p.readValueAsTree<JsonNode>().run {
            HeadText(
                identifier = get("no").asInt(),
                name = get("name").textValue(),
                level = get("level").asInt(),
                selected = get("selected").asBoolean()
            )
        }

}
