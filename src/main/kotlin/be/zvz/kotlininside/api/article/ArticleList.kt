package be.zvz.kotlininside.api.article

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.http.Request
import be.zvz.kotlininside.json.JsonBrowser
import be.zvz.kotlininside.api.type.HeadText
import be.zvz.kotlininside.http.HttpException
import be.zvz.kotlininside.utils.StringUtil
import be.zvz.kotlininside.value.ApiUrl
import kotlin.collections.List

class ArticleList(val gallId: String, val page: Int, val option: Option? = null) {
    var json: JsonBrowser? = null

    class Option {
        var recommand = false
        var notice = false
        var headid = 0
    }

    data class GallInfo(
        val title: String,
        val category: Int,
        val fileCount: Int,
        val fileSize: Int,
        val captcha: Boolean?,
        val codeCount: Int?,
        val isMinor: Boolean?,
        val notifyRecent: Int?,
        val relationGall: Map<String, String>,
        val headText: List<HeadText>
    )

    data class GallList(
        val identifier: Int,
        val views: Int,
        val upvote: Int,
        val imageIcon: Boolean,
        val upvoteIcon: Boolean,
        val bestCheck: Boolean,
        val voiceIcon: Boolean,
        val winnertaIcon: Boolean,
        val level: Int,
        val totalComment: Int,
        val totalVoice: Int,
        val userId: String,
        val memberIcon: Int,
        val ip: String,
        val gallerCon: String?,
        val subject: String,
        val name: String,
        val dateTime: String,
        val headText: String?
    )

    /**
     * 클래스의 메소드들을 사용하기 전, 반드시 이 메소드를 호출하여 JSON을 파싱해야합니다.
     * @exception [be.zvz.kotlininside.http.HttpException] 글 목록을 불러오지 못할 경우, HttpException 발생
     */
    @Throws(HttpException::class)
    fun request() {
        val url = "${ApiUrl.Article.LIST}?id=$gallId&page=$page&app_id=${KotlinInside.getInstance().auth.getAppId()}" +
                option?.let {
                    val s = ""
                    if (it.recommand)
                        s.plus("&recommand=").plus("1")
                    if (it.notice)
                        s.plus("&notice=").plus("1")
                    if (it.headid > 0)
                        s.plus("&headid=").plus(it.headid)
                    s
                }

        json = KotlinInside.getInstance().httpInterface.get(Request.redirectUrl(url), Request.getDefaultOption())
    }

    /**
     *
     * @return [be.zvz.kotlininside.article.ArticleList.GallInfo] gall_info 객체를 반환합니다. 글 목록이 비어있는 경우, null을 반환합니다.
     */
    fun getGallInfo(): GallInfo? {
        json?.let { jsonBrowser ->
            val gallInfo = jsonBrowser.index(0).get("gall_info")
            return GallInfo(
                title = gallInfo.get("gall_title").text(),
                category = gallInfo.get("category").`as`(Int::class.java),
                fileCount = gallInfo.get("file_cnt").`as`(Int::class.java),
                fileSize = gallInfo.get("file_size").`as`(Int::class.java),
                captcha = gallInfo.safeGet("captcha").run {
                    when {
                        isNull -> null
                        else -> `as`(Boolean::class.java)
                    }
                },
                codeCount = gallInfo.safeGet("code_count").run {
                    when {
                        isNull -> null
                        else -> `as`(Int::class.java)
                    }
                },
                isMinor = gallInfo.get("is_minor").run {
                    when {
                        isNull -> null
                        else -> `as`(Boolean::class.java)
                    }
                },
                notifyRecent = gallInfo.get("notify_recent").run {
                    when {
                        isNull -> null
                        else -> `as`(Int::class.java)
                    }
                },
                relationGall = run {
                    val map = LinkedHashMap<String, String>()

                    gallInfo.safeGet("relation_gall").let { relationGall ->
                        if (!relationGall.isNull)
                            relationGall.values().forEach {
                                val key = it.text()
                                map[key] = it.get(key).text()
                            }
                    }

                    map
                },
                headText = run {
                    val array = ArrayList<HeadText>()

                    gallInfo.safeGet("head_text").let { headText ->
                        if (!headText.isNull)
                            headText.values().forEach {
                                array.add(
                                    HeadText(
                                        identifier = it.get("no").`as`(Int::class.java),
                                        name = it.get("name").text(),
                                        level = it.get("level").`as`(Int::class.java),
                                        selected = it.get("selected").`as`(Boolean::class.java)
                                    )
                                )
                            }
                    }

                    array
                }
            )
        }
        return null
    }

    /**
     *
     * @return [be.zvz.kotlininside.article.ArticleList.GallList] 목록들을 반환합니다. 글 목록이 비어있을 경우, 빈 리스트를 반환합니다.
     */
    fun getGallList(): List<GallList> {
        val array = ArrayList<GallList>()

        json?.let {
            for (gallList in it.index(0).get("gall_list").values()) {
                array.add(
                    GallList(
                        identifier = gallList.get("no").`as`(Int::class.java),
                        views = gallList.get("hit").`as`(Int::class.java),
                        upvote = gallList.get("recommend").`as`(Int::class.java),
                        imageIcon = StringUtil.ynToBoolean(gallList.get("img_icon").text()),
                        upvoteIcon = StringUtil.ynToBoolean(gallList.get("recommend_icon").text()),
                        bestCheck = StringUtil.ynToBoolean(gallList.get("best_chk").text()),
                        level = gallList.get("level").`as`(Int::class.java),
                        totalComment = gallList.get("total_comment").`as`(Int::class.java),
                        totalVoice = gallList.get("total_voice").`as`(Int::class.java),
                        userId = gallList.get("user_id").text(),
                        voiceIcon = StringUtil.ynToBoolean(gallList.get("voice_icon").text()),
                        winnertaIcon = StringUtil.ynToBoolean(gallList.get("winnerta_icon").text()),
                        memberIcon = gallList.get("member_icon").`as`(Int::class.java),
                        ip = gallList.get("ip").text(),
                        gallerCon = gallList.safeGet("gallercon").run {
                            when {
                                isNull -> null
                                else -> text()
                            }
                        },
                        subject = gallList.get("subject").text(),
                        name = gallList.get("name").text(),
                        dateTime = gallList.get("date_time").text(),
                        headText = gallList.get("head_text").text()
                    )
                )
            }
        }

        return array
    }
}