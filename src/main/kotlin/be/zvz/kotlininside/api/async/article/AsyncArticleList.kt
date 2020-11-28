package be.zvz.kotlininside.api.async.article

import be.zvz.kotlininside.api.article.ArticleList
import be.zvz.kotlininside.session.Session
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

class AsyncArticleList @JvmOverloads constructor(
        gallId: String,
        searchKeyword: String,
        searchType: ArticleList.SearchType = ArticleList.SearchType.ALL,
        page: Int = 1,
        recommend: Boolean = false,
        notice: Boolean = false,
        headId: Int = 0,
        session: Session? = null
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
            searchType = ArticleList.SearchType.ALL,
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
            searchType = ArticleList.SearchType.ALL,
            page = page,
            recommend = recommend,
            notice = notice,
            headId = headId,
            session = session
    )

    private val articleList = ArticleList(
            gallId,
            searchKeyword,
            searchType,
            page,
            recommend,
            notice,
            headId,
            session
    )

    suspend fun requestAsync() = coroutineScope {
        async(Dispatchers.IO) {
            articleList.request()
        }
    }

    suspend fun getGallInfoAsync() = coroutineScope {
        async(Dispatchers.Default) {
            articleList.getGallInfo()
        }
    }

    suspend fun getGallListAsync() = coroutineScope {
        async(Dispatchers.Default) {
            articleList.getGallList()
        }
    }
}