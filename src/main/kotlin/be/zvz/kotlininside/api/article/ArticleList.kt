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
        val noWrite: Boolean,
        val captcha: Boolean?,
        val codeCount: Int?,
        val isMinor: Boolean,
        val isMini: Boolean,
        val isManager: Boolean,
        val membership: Boolean?,
        val profileImage: String?,
        val totalMember: Int?,
        val memberJoin: Boolean?,
        val useAutoDelete: Int?,
        val useListFix: Boolean?,
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
            title = gallInfo.get("gall_title").safeText(),
            category = gallInfo.get("category").asInteger(),
            fileCount = gallInfo.get("file_cnt").asInteger(),
            fileSize = gallInfo.get("file_size").asInteger(),
            noWrite = gallInfo.get("no_write").asBoolean(),
            captcha = gallInfo.get("captcha").asNullableBoolean(),
            codeCount = gallInfo.get("code_count").asNullableInteger(),
            isMinor = gallInfo.get("is_minor").asBoolean(),
            isMini = gallInfo.get("is_mini").asBoolean(),
            isManager = gallInfo.get("managerskill").asBoolean(),
            membership = gallInfo.get("membership").asNullableBoolean(),
            memberJoin = gallInfo.get("member_join").asNullableBoolean(),
            profileImage = gallInfo.get("profile_img").text(),
            totalMember = gallInfo.get("total_member").asNullableInteger(),
            useAutoDelete = gallInfo.get("use_auto_delete").asNullableInteger(),
            useListFix = gallInfo.get("use_list_fix").text()?.let {
                StringUtil.ynToBoolean(it)
            },
            notifyRecent = gallInfo.get("notify_recent").asNullableInteger(),
            relationGall = gallInfo.get("relation_gall").run {
                when {
                    !isNull -> toMap()
                    else -> mutableMapOf()
                }
            },
            headText = mutableListOf<HeadText>().apply {
                gallInfo.get("head_text").values().forEach {
                    add(
                        HeadText(
                            identifier = it.get("no").asInteger(),
                            name = it.get("name").safeText(),
                            level = it.get("level").asInteger(),
                            selected = it.get("selected").asBoolean()
                        )
                    )
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
            json.index(0).get("gall_list").values().forEach { gallList ->
                add(
                    GallList(
                        identifier = gallList.get("no").asInteger(),
                        views = gallList.get("hit").asInteger(),
                        upvote = gallList.get("recommend").asInteger(),
                        imageIcon = StringUtil.ynToBoolean(gallList.get("img_icon").safeText()),
                        upvoteIcon = StringUtil.ynToBoolean(gallList.get("recommend_icon").safeText()),
                        bestCheck = StringUtil.ynToBoolean(gallList.get("best_chk").safeText()),
                        level = gallList.get("level").asInteger(),
                        totalComment = gallList.get("total_comment").asInteger(),
                        totalVoice = gallList.get("total_voice").asInteger(),
                        userId = gallList.get("user_id").safeText(),
                        voiceIcon = StringUtil.ynToBoolean(gallList.get("voice_icon").safeText()),
                        winnertaIcon = StringUtil.ynToBoolean(gallList.get("winnerta_icon").safeText()),
                        memberIcon = gallList.get("member_icon").asInteger(),
                        ip = gallList.get("ip").safeText(),
                        gallerCon = gallList.get("gallercon").text(),
                        subject = gallList.get("subject").safeText(),
                        name = gallList.get("name").safeText(),
                        dateTime = gallList.get("date_time").safeText(),
                        headText = gallList.get("head_text").text()
                    )
                )
            }
        }
    }
}
