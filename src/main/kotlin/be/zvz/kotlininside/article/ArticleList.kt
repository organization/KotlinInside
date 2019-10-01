package be.zvz.kotlininside.article

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.http.Request
import be.zvz.kotlininside.utils.StringUtil
import be.zvz.kotlininside.value.ApiUrl
import kotlin.collections.List

class ArticleList(val id: String, val page: Int, val option: Option? = null) {
    class Option {
        var recommand = false
        var notice = false
        var headid = 0
    }

    data class Type(
        val identifier: Int,
        val views: Int,
        val upvote: Int,
        val imgIcon: Boolean,
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
        val subject: String,
        val name: String,
        val dateTime: String,
        val headText: String
    )

    /**
     *
     * @exception [be.zvz.kotlininside.http.HttpException] 글 목록을 불러오지 못할 경우, HttpException 발생
     * @return [be.zvz.kotlininside.article.ArticleList.Type] 목록들을 반환합니다.
     */
    fun get(): List<Type> {
        val url = "${ApiUrl.Article.LIST}?id=$id&page=$page&app_id=${KotlinInside.getInstance().auth.getAppId()}" +
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

        val json = KotlinInside.getInstance().httpInterface.get(Request.redirectUrl(url), Request.getDefaultOption())

        val array = ArrayList<Type>()

        for (gallList in json!!.index(0).get("gall_list").values()) {
            array.add(
                Type(
                    identifier   = gallList.get("no").`as`(Int::class.java),
                    views        = gallList.get("hit").`as`(Int::class.java),
                    upvote       = gallList.get("recommend").`as`(Int::class.java),
                    imgIcon      = StringUtil.ynToBoolean(gallList.get("img_icon").text()),
                    upvoteIcon   = StringUtil.ynToBoolean(gallList.get("recommend_icon").text()),
                    bestCheck    = StringUtil.ynToBoolean(gallList.get("best_chk").text()),
                    level        = gallList.get("level").`as`(Int::class.java),
                    totalComment = gallList.get("total_comment").`as`(Int::class.java),
                    totalVoice   = gallList.get("total_voice").`as`(Int::class.java),
                    userId       = gallList.get("user_id").text(),
                    voiceIcon    = StringUtil.ynToBoolean(gallList.get("voice_icon").text()),
                    winnertaIcon = StringUtil.ynToBoolean(gallList.get("winnerta_icon").text()),
                    memberIcon   = gallList.get("member_icon").`as`(Int::class.java),
                    ip           = gallList.get("ip").text(),
                    subject      = gallList.get("subject").text(),
                    name         = gallList.get("name").text(),
                    dateTime     = gallList.get("date_time").text(),
                    headText     = gallList.get("head_text").text()
                )
            )
        }

        return array
    }
}