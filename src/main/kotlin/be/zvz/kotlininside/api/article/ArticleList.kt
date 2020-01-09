package be.zvz.kotlininside.api.article

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.api.type.HeadText
import be.zvz.kotlininside.http.HttpException
import be.zvz.kotlininside.http.Request
import be.zvz.kotlininside.json.JsonBrowser
import be.zvz.kotlininside.session.Session
import be.zvz.kotlininside.session.user.Anonymous
import be.zvz.kotlininside.utils.StringUtil
import be.zvz.kotlininside.value.ApiUrl
import java.net.URLEncoder

class ArticleList @JvmOverloads constructor(
        private val gallId: String,
        private val searchKeyword: String,
        private val searchType: SearchType = SearchType.ALL,
        private val page: Int = 1,
        private val recommend: Boolean = false,
        private val notice: Boolean = false,
        private val headId: Int = 0,
        private val session: Session? = null
) {
    @JvmOverloads
    constructor(
            gallId: String,
            page: Int = 1,
            recommend: Boolean = false,
            notice: Boolean = false,
            headId: Int = 0,
            session: Session? = null
    ) : this(
            gallId = gallId,
            searchKeyword = "",
            searchType = SearchType.ALL,
            page = page,
            recommend = recommend,
            notice = notice,
            headId = headId,
            session = session
    )

    constructor(
            gallId: String,
            searchKeyword: String,
            page: Int = 1,
            recommend: Boolean = false,
            notice: Boolean = false,
            headId: Int = 0,
            session: Session? = null
    ) : this(
            gallId = gallId,
            searchKeyword = searchKeyword,
            searchType = SearchType.ALL,
            page = page,
            recommend = recommend,
            notice = notice,
            headId = headId,
            session = session
    )

    enum class SearchType(val type: String) {
        ALL("all"),
        SUBJECT("subject"),
        CONTENT("memo"),
        NAME("name"),
        SUBJECT_AND_CONTENT("subject_m")
    }

    private lateinit var json: JsonBrowser

    data class GallInfo(
            val title: String,
            val category: Int,
            val fileCount: Int,
            val fileSize: Int,
            val captcha: Boolean?,
            val codeCount: Int?,
            val isMinor: Boolean,
            val isManager: Boolean,
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
     * 클래스의 메소드들을 사용하기 전, 이 메소드를 호출해주세요. (권장)
     * @exception [be.zvz.kotlininside.http.HttpException] 글 목록을 불러오지 못할 경우, HttpException 발생
     */
    @Throws(HttpException::class)
    fun request() {
        val url = "${ApiUrl.Article.LIST}?id=$gallId&page=$page&app_id=${KotlinInside.getInstance().auth.getAppId()}" +
                StringBuilder().apply {
                    if (searchKeyword.isNotEmpty()) {
                        append("&s_type=")
                        append(searchType.type)
                        append("&serVal=").append(URLEncoder.encode(searchKeyword, "UTF-8").replace("+", "%20"))
                    }
                    if (recommend)
                        append("&recommend=1")
                    if (notice)
                        append("&notice=1")
                    if (headId > 0)
                        append("&headid=").append(headId)
                    session?.let {
                        if (it.user !is Anonymous) {
                            append("&confirm_id=").append(it.detail!!.userId)
                        }
                    }
                }.toString()
        json = KotlinInside.getInstance().httpInterface.get(Request.redirectUrl(url), Request.getDefaultOption())!!
    }

    /**
     *
     * @return [be.zvz.kotlininside.api.article.ArticleList.GallInfo] gall_info 객체를 반환합니다.
     * @exception [be.zvz.kotlininside.http.HttpException] 글 목록을 불러오지 못할 경우, HttpException 발생
     */
    fun getGallInfo(): GallInfo {
        if (!::json.isInitialized)
            request()

        val gallInfo = json.index(0).get("gall_info").index(0)

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
                isMinor = gallInfo.safeGet("is_minor").run {
                    when {
                        isNull -> false
                        else -> `as`(Boolean::class.java)
                    }
                },
                isManager = gallInfo.safeGet("managerskill").run {
                    when {
                        isNull -> false
                        else -> `as`(Boolean::class.java)
                    }
                },
                notifyRecent = gallInfo.get("notify_recent").run {
                    when {
                        isNull -> null
                        else -> `as`(Int::class.java)
                    }
                },
                relationGall = gallInfo.safeGet("relation_gall").run {
                    when {
                        !isNull -> toMap<String, String>()
                        else -> mutableMapOf<String, String>()
                    }
                },
                headText = mutableListOf<HeadText>().apply {
                    gallInfo.safeGet("head_text").run {
                        when {
                            !isNull -> values().forEach {
                                add(
                                        HeadText(
                                                identifier = it.get("no").`as`(Int::class.java),
                                                name = it.get("name").text(),
                                                level = it.get("level").`as`(Int::class.java),
                                                selected = it.get("selected").`as`(Boolean::class.java)
                                        )
                                )
                            }
                        }
                    }
                }
        )
    }

    /**
     *
     * @return [be.zvz.kotlininside.api.article.ArticleList.GallList] 목록들을 반환합니다.
     * @exception [be.zvz.kotlininside.http.HttpException] 글 목록을 불러오지 못할 경우, HttpException 발생
     */
    fun getGallList(): List<GallList> {
        if (!::json.isInitialized)
            request()

        return mutableListOf<GallList>().apply {
            for (gallList in json.index(0).get("gall_list").values()) {
                add(
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
    }
}
