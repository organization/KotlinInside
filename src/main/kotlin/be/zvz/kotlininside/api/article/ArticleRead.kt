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

class ArticleRead @JvmOverloads constructor(
    private val gallId: String,
    private val articleId: Int,
    private val session: Session? = null
) {
    private lateinit var json: JsonBrowser

    data class ViewInfo(
        val gallTitle: String,
        val category: Int,
        val subject: String,
        val identifier: Int,
        val name: String,
        val level: Int,
        val memberIcon: Int,
        val totalComment: Int,
        val ip: String,
        val imageCheck: Boolean,
        val recommendCheck: Boolean,
        val winnertaCheck: Boolean,
        val voiceCheck: Boolean,
        val views: Int,
        val writeType: String,
        val userId: String,
        val previousLink: Int,
        val previousSubject: String,
        val headTitle: String,
        val nextLink: Int,
        val nextSubject: String,
        val bestCheck: Boolean,
        val isNotice: Boolean,
        val gallerCon: String?,
        val dateTime: String,
        val isMinor: Boolean,
        val isMini: Boolean,
        val useAutoDelete: Int?,
        val useListFix: Boolean?,
        val membership: Boolean?,
        val memberGrant: Int?,
        val headText: List<HeadText>,
        val commentDeleteScope: Boolean // TODO: commentDel_scope 용도 파악 (유동닉 글에서만 확인 가능)
    )

    data class ViewMain(
        val content: String,
        val upvote: Int,
        val upvoteMember: Int,
        val downvote: Int,
        val isManager: Boolean
    )

    /**
     * 클래스의 메소드들을 사용하기 전, 이 메소드를 호출해주세요. (권장)
     * @exception [be.zvz.kotlininside.http.HttpException] 글을 불러오지 못할 경우, HttpException 발생
     */
    @Throws(HttpException::class)
    fun request() {
        val url =
            "${ApiUrl.Article.READ}?id=$gallId&no=$articleId&app_id=${KotlinInside.getInstance().auth.getAppId()}" +
                    StringBuilder().apply {
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
     * @return [be.zvz.kotlininside.api.article.ArticleRead.ViewInfo] view_info 객체를 반환합니다.
     * @exception [be.zvz.kotlininside.http.HttpException] 글을 불러오지 못할 경우, HttpException 발생
     */
    fun getViewInfo(): ViewInfo {
        if (!::json.isInitialized)
            request()

        val viewInfo = json.index(0).get("view_info")
        return ViewInfo(
            gallTitle = viewInfo.get("galltitle").safeText(),
            category = viewInfo.get("category").asInteger(),
            subject = viewInfo.get("subject").safeText(),
            identifier = viewInfo.get("no").asInteger(),
            name = viewInfo.get("name").safeText(),
            level = viewInfo.get("level").asInteger(),
            memberIcon = viewInfo.get("member_icon").asInteger(),
            totalComment = viewInfo.get("total_comment").asInteger(),
            ip = viewInfo.get("ip").safeText(),
            imageCheck = StringUtil.ynToBoolean(viewInfo.get("img_chk").safeText()),
            recommendCheck = StringUtil.ynToBoolean(viewInfo.get("recommend_chk").safeText()),
            winnertaCheck = StringUtil.ynToBoolean(viewInfo.get("winnerta_chk").safeText()),
            voiceCheck = StringUtil.ynToBoolean(viewInfo.get("voice_chk").safeText()),
            views = viewInfo.get("hit").asInteger(),
            writeType = viewInfo.get("write_type").safeText(),
            userId = viewInfo.get("user_id").safeText(),
            previousLink = viewInfo.get("prev_link").asInteger(),
            previousSubject = viewInfo.get("prev_subject").safeText(),
            headTitle = viewInfo.get("headtitle").safeText(),
            nextLink = viewInfo.get("next_link").asInteger(),
            nextSubject = viewInfo.get("next_subject").safeText(),
            bestCheck = StringUtil.ynToBoolean(viewInfo.get("best_chk").safeText()),
            isNotice = StringUtil.ynToBoolean(viewInfo.get("isNotice").safeText()),
            gallerCon = viewInfo.get("gallercon").text(),
            dateTime = viewInfo.get("date_time").safeText(),
            isMinor = viewInfo.get("is_minor").asBoolean(),
            isMini = viewInfo.get("is_mini").asBoolean(),
            useAutoDelete = viewInfo.get("use_auto_delete").asNullableInteger(),
            useListFix = viewInfo.get("use_list_fix").text()?.let {
                StringUtil.ynToBoolean(it)
            },
            membership = viewInfo.get("membership").asNullableBoolean(),
            memberGrant = viewInfo.get("member_grant").asNullableInteger(),
            headText = mutableListOf<HeadText>().apply {
                viewInfo.get("head_text").values().forEach {
                    add(
                        HeadText(
                            identifier = it.get("no").asInteger(),
                            name = it.get("name").safeText(),
                            level = it.get("level").asInteger(),
                            selected = it.get("selected").asBoolean()
                        )
                    )
                }
            },
            commentDeleteScope = viewInfo.get("commentDel_scope").asBoolean()
        )
    }

    /**
     *
     * @return [be.zvz.kotlininside.api.article.ArticleRead.ViewMain] view_main 객체를 반환합니다.
     * @exception [be.zvz.kotlininside.http.HttpException] 글을 불러오지 못할 경우, HttpException 발생
     */
    fun getViewMain(): ViewMain {
        if (!::json.isInitialized)
            request()

        val viewMain = json.index(0).get("view_main")
        return ViewMain(
            content = viewMain.get("memo").safeText(),
            upvote = viewMain.get("recommend").asInteger(),
            upvoteMember = viewMain.get("recommend_member").asInteger(),
            downvote = viewMain.get("nonrecommend").asInteger(),
            isManager = viewMain.get("managerskill").asBoolean()
        )
    }
}
