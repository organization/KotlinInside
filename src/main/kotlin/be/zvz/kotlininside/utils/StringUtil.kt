package be.zvz.kotlininside.utils

import com.vladsch.flexmark.html.HtmlRenderer
import com.vladsch.flexmark.parser.Parser
import com.vladsch.flexmark.ext.tables.TablesExtension
import com.vladsch.flexmark.ext.gfm.strikethrough.StrikethroughExtension
import com.vladsch.flexmark.ext.gfm.tasklist.TaskListExtension
import com.vladsch.flexmark.util.data.MutableDataSet

class StringUtil {
    companion object {
        private val OPTIONS = MutableDataSet()
            .set(Parser.EXTENSIONS, listOf(TablesExtension.create(), StrikethroughExtension.create(), TaskListExtension.create()))
            .toImmutable();

        private val MD_PARSER = Parser.builder(OPTIONS).build();
        private val HTML_RENDERER = HtmlRenderer.builder(OPTIONS).escapeHtml(true).build();

        @JvmStatic
        fun ynToBoolean(s: String): Boolean = when (s) {
            "Y" -> true
            else -> false
        }

        @JvmStatic
        fun mdToHtml(s: String): String = HTML_RENDERER.render(MD_PARSER.parse(s))

        @JvmStatic
        fun toHtml(s: String): String {
            val builder = StringBuilder()
            var previousWasASpace = false

            for (c in s.toCharArray()) {

                if (c == ' ') {
                    if (previousWasASpace) {
                        builder.append("&nbsp;")
                        previousWasASpace = false
                        continue
                    }
                    previousWasASpace = true
                } else {
                    previousWasASpace = false
                }

                when (c) {
                    '<' -> builder.append("&lt;")
                    '>' -> builder.append("&gt;")
                    '&' -> builder.append("&amp;")
                    '"' -> builder.append("&quot;")
                    '\n' -> builder.append("<br>")
                    '\t' -> builder.append("&nbsp; &nbsp; &nbsp;")
                    else -> builder.append(c)
                    /*if (c.toInt() < 128) {
                        builder.append(c)
                    } else {
                        builder.append("&#").append(c.toInt()).append(";")
                    }*/
                }

            }
            return builder.toString()
        }
    }
}
