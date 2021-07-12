package be.zvz.kotlininside.api.article

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.api.type.HeadText
import be.zvz.kotlininside.deserializer.HeadTextDeserializer
import be.zvz.kotlininside.deserializer.YesOrNoToBooleanDeserializer
import be.zvz.kotlininside.http.HttpException
import be.zvz.kotlininside.http.Request
import be.zvz.kotlininside.session.LoggedSession
import be.zvz.kotlininside.session.Session
import be.zvz.kotlininside.utils.StringUtil
import be.zvz.kotlininside.value.ApiUrl
import be.zvz.kotlininside.value.Const
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.module.kotlin.convertValue
import java.net.URLEncoder

class ArticleList @JvmOverloads constructor(
    private val gallId: String,
    private val searchKeyword: String,
    private val searchType: SearchType = SearchType.ALL,
    private val page: Int = 1,
    private val recommend: Boolean = false,
    private val notice: Boolean = false,
    private val headId: Int = 0,
    private val session: Session? = null,
    private val mapper: ObjectMapper = Const.DEFAULT_JSON_MAPPER
) {
    @JvmOverloads
    constructor(
        gallId: String,
        page: Int = 1,
        recommend: Boolean = false,
        notice: Boolean = false,
        headId: Int = 0,
        session: Session? = null,
        mapper: ObjectMapper = Const.DEFAULT_JSON_MAPPER
    ) : this(
        gallId = gallId,
        searchKeyword = "",
        searchType = SearchType.ALL,
        page = page,
        recommend = recommend,
        notice = notice,
        headId = headId,
        session = session,
        mapper = mapper
    )

    constructor(
        gallId: String,
        searchKeyword: String,
        page: Int = 1,
        recommend: Boolean = false,
        notice: Boolean = false,
        headId: Int = 0,
        session: Session? = null,
        mapper: ObjectMapper = Const.DEFAULT_JSON_MAPPER
    ) : this(
        gallId = gallId,
        searchKeyword = searchKeyword,
        searchType = SearchType.ALL,
        page = page,
        recommend = recommend,
        notice = notice,
        headId = headId,
        session = session,
        mapper = mapper
    )

    enum class SearchType(val type: String) {
        ALL("all"),
        SUBJECT("subject"),
        CONTENT("memo"),
        NAME("name"),
        SUBJECT_AND_CONTENT("subject_m")
    }

    private lateinit var json: JsonNode

    data class GalleryInfo(
        @JsonProperty("gall_title")
        val title: String,
        val category: Int,
        @JsonProperty("file_cnt")
        val fileCount: Int,
        val fileSize: Int,
        val noWrite: Boolean,
        val captcha: Boolean?,
        val codeCount: Int?,
        val isMinor: Boolean,
        val isMini: Boolean,
        @JsonProperty("managerskill")
        val isManager: Boolean,
        val membership: Boolean?,
        @JsonProperty("profile_img")
        val profileImage: String?,
        val totalMember: Int?,
        val memberJoin: Boolean?,
        val useAutoDelete: Int?,
        @JsonDeserialize(using = YesOrNoToBooleanDeserializer::class)
        val useListFix: Boolean?,
        val notifyRecent: Int?,
        val relationGallery: Map<String, String>,
        @JsonDeserialize(using = HeadTextDeserializer::class)
        val headText: List<HeadText>
    )

    data class GalleryArticleList(
        @JsonProperty("no")
        val identifier: Int,
        @JsonProperty("hit")
        val views: Int,
        @JsonProperty("recommend")
        val upvote: Int,
        @JsonProperty("img_icon")
        @JsonDeserialize(using = YesOrNoToBooleanDeserializer::class)
        val imageIcon: Boolean,
        @JsonProperty("recommend_icon")
        @JsonDeserialize(using = YesOrNoToBooleanDeserializer::class)
        val upvoteIcon: Boolean,
        @JsonProperty("best_chk")
        @JsonDeserialize(using = YesOrNoToBooleanDeserializer::class)
        val bestCheck: Boolean,
        @JsonDeserialize(using = YesOrNoToBooleanDeserializer::class)
        val voiceIcon: Boolean,
        @JsonDeserialize(using = YesOrNoToBooleanDeserializer::class)
        val winnertaIcon: Boolean,
        val level: Int,
        val totalComment: Int,
        val totalVoice: Int,
        val userId: String,
        val memberIcon: Int,
        val ip: String,
        @JsonProperty("gallercon")
        val gallerIcon: String?,
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
                    if (it is LoggedSession) {
                        append("&confirm_id=").append(it.detail.userId)
                    }
                }
            }.toString()
        json = mapper.readTree(KotlinInside.getInstance().httpInterface.get(Request.redirectUrl(url), Request.getDefaultOption()))
    }

    /**
     *
     * @return [be.zvz.kotlininside.api.article.ArticleList.GalleryInfo] gall_info 객체를 반환합니다.
     * @exception [be.zvz.kotlininside.http.HttpException] 글 목록을 불러오지 못할 경우, HttpException 발생
     */
    fun getGallInfo(): GalleryInfo {
        if (!::json.isInitialized)
            request()

        return mapper.convertValue(json.get("gall_info").get(0))
    }

    /**
     *
     * @return [be.zvz.kotlininside.api.article.ArticleList.GalleryArticleList] 목록들을 반환합니다.
     * @exception [be.zvz.kotlininside.http.HttpException] 글 목록을 불러오지 못할 경우, HttpException 발생
     */
    fun getGallList(): List<GalleryArticleList> {
        if (!::json.isInitialized)
            request()

        return mapper.convertValue(json.get(0).get("gall_list"))
    }
}
