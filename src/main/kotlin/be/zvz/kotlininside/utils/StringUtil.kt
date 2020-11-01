package be.zvz.kotlininside.utils

import com.vladsch.flexmark.ext.gfm.strikethrough.StrikethroughExtension
import com.vladsch.flexmark.ext.gfm.tasklist.TaskListExtension
import com.vladsch.flexmark.ext.tables.TablesExtension
import com.vladsch.flexmark.html.HtmlRenderer
import com.vladsch.flexmark.parser.Parser
import com.vladsch.flexmark.util.data.MutableDataSet

class StringUtil {
    companion object {
        private val OPTIONS = MutableDataSet()
                .set(Parser.EXTENSIONS, listOf(
                        TablesExtension.create(),
                        StrikethroughExtension.create(),
                        TaskListExtension.create()
                ))
                .toImmutable()

        private val MD_PARSER = Parser.builder(OPTIONS).build()
        private val HTML_RENDERER = HtmlRenderer.builder(OPTIONS).escapeHtml(true).build()

        @JvmStatic
        fun ynToBoolean(s: String): Boolean = when (s) {
            "Y" -> true
            else -> false
        }

        @JvmStatic
        fun mdToHtml(s: String): String = HTML_RENDERER.render(MD_PARSER.parse(s))

        @JvmStatic
        fun toHtml(s: String): String = StringBuilder().apply {
            var previousWasASpace = false

            s.toCharArray().forEach { c ->
                if (c == ' ') {
                    if (previousWasASpace) {
                        append("&nbsp;")
                        previousWasASpace = false
                        return@forEach
                    }
                    previousWasASpace = true
                } else {
                    previousWasASpace = false
                }

                when (c) {
                    '<' -> append("&lt;")
                    '>' -> append("&gt;")
                    '&' -> append("&amp;")
                    '"' -> append("&quot;")
                    '\n' -> append("<br>")
                    '\t' -> append("&nbsp; &nbsp; &nbsp;")
                    else -> append(c)
                }
            }
        }.toString()
    }
}
