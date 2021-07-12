package be.zvz.kotlininside.deserializer

import be.zvz.kotlininside.api.type.content.Content
import be.zvz.kotlininside.api.type.content.HtmlContent
import be.zvz.kotlininside.api.type.content.ImageContent
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer
import com.fasterxml.jackson.databind.JsonNode
import org.apache.commons.text.StringEscapeUtils
import java.io.BufferedInputStream
import java.net.URL

class ContentDeserializer : JsonDeserializer<Content>() {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): Content =
        p.readValueAsTree<JsonNode>().let {
            it.get("tag_value").let { tagValue ->
                when {
                    tagValue.isNull -> {
                        it.elements().forEach { value ->
                            return HtmlContent(
                                htmlString = StringEscapeUtils.unescapeHtml4(value)
                            )
                        }
                    }
                    else -> {
                        it.toMap<String, String>().forEach { (key, value) ->
                            if (key != "tag_value") {
                                val inputStream =
                                    BufferedInputStream(URL(StringEscapeUtils.unescapeHtml4(value)).openStream())
                                add(
                                    ImageContent(
                                        stream = inputStream
                                    )
                                )
                            }
                        }
                    }
                }
            }
        }
}