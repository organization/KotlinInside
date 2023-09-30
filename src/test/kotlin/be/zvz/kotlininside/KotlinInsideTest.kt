/*
 * KotlinInside Junit5 Test
 */
package be.zvz.kotlininside

import be.zvz.kotlininside.api.article.ArticleDelete
import be.zvz.kotlininside.api.article.ArticleList
import be.zvz.kotlininside.api.article.ArticleRead
import be.zvz.kotlininside.api.article.ArticleVote
import be.zvz.kotlininside.api.article.ArticleWrite
import be.zvz.kotlininside.api.generic.GalleryRanking
import be.zvz.kotlininside.api.generic.MiniGalleryRanking
import be.zvz.kotlininside.api.generic.MinorGalleryRanking
import be.zvz.kotlininside.api.type.Article
import be.zvz.kotlininside.api.type.HeadText
import be.zvz.kotlininside.api.type.content.HtmlContent
import be.zvz.kotlininside.api.type.content.MarkdownContent
import be.zvz.kotlininside.api.type.content.StringContent
import be.zvz.kotlininside.http.DefaultHttpClient
import be.zvz.kotlininside.session.user.Anonymous
import okhttp3.OkHttpClient
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.TestMethodOrder
import java.security.SecureRandom
import java.security.cert.X509Certificate
import java.time.ZoneId
import java.util.Calendar
import java.util.Locale
import java.util.TimeZone
import java.util.logging.Logger
import javax.net.ssl.SSLContext
import javax.net.ssl.TrustManager
import javax.net.ssl.X509TrustManager
import kotlin.test.Test
import kotlin.test.assertNotNull

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation::class)
class KotlinInsideTest {
    private fun OkHttpClient.Builder.ignoreAllSSLErrors(): OkHttpClient.Builder {
        val naiveTrustManager = object : X509TrustManager {
            override fun getAcceptedIssuers(): Array<X509Certificate> = arrayOf()
            override fun checkClientTrusted(certs: Array<X509Certificate>, authType: String) = Unit
            override fun checkServerTrusted(certs: Array<X509Certificate>, authType: String) = Unit
        }

        val insecureSocketFactory = SSLContext.getInstance("TLSv1.2").apply {
            val trustAllCerts = arrayOf<TrustManager>(naiveTrustManager)
            init(null, trustAllCerts, SecureRandom())
        }.socketFactory

        sslSocketFactory(insecureSocketFactory, naiveTrustManager)
        hostnameVerifier { _, _ -> true }
        return this
    }

    private var log = Logger.getLogger(KotlinInsideTest::class.java.name)
    private var articleId = 0

    @Order(1)
    @Test
    fun initKotlinInside() {
        KotlinInside.createInstance(
            Anonymous("ㅇㅇ", "1234"),
            DefaultHttpClient(okHttpClient = OkHttpClient.Builder().ignoreAllSSLErrors().build())
        )
    }

    @Order(2)
    @Test
    fun testDateGenerator() {
        val auth = KotlinInside.getInstance().auth
        val date = Calendar.getInstance(
            TimeZone.getTimeZone(ZoneId.of("Asia/Seoul")),
            Locale.US
        ).apply {
            minimalDaysInFirstWeek = 4
            firstDayOfWeek = Calendar.MONDAY
        }
        val appCheck = auth.getAppCheck()
        val dateToString = auth::class.java.getDeclaredMethod("dateToString", Calendar::class.java)
        dateToString.isAccessible = true

        log.info(appCheck.date + " == " + dateToString.invoke(auth, date))
        assert(appCheck.date == dateToString.invoke(auth, date))
    }

    @Order(3)
    @Test
    fun testGalleryRanking() {
        val galleryRanking = GalleryRanking()
        log.info(galleryRanking.request().toString())
    }

    @Order(4)
    @Test
    fun testMinorGalleryRanking() {
        val minorGalleryRanking = MinorGalleryRanking()
        log.info(minorGalleryRanking.request().toString())
    }

    @Order(5)
    @Test
    fun testMiniGalleryRanking() {
        val miniGalleryRanking = MiniGalleryRanking()
        log.info(miniGalleryRanking.request().toString())
    }

    @Order(6)
    @Test
    fun testArticleList() {
        val articleList = ArticleList("hit", 1)
        articleList.request()

        val gallList = articleList.getGallList()
        val gallInfo = articleList.getGallInfo()

        assertNotNull(gallList[0], "ArticleList.getGallList()[0] must not be null")

        log.info(gallInfo.toString())
        gallList.forEach {
            log.info(it.toString())
        }
    }

    @Order(7)
    @Test
    fun testArticleRead() {
        val articleRead = ArticleRead("hit", 1)
        articleRead.request()

        log.info(articleRead.getViewInfo().toString())
        log.info(articleRead.getViewMain().toString())
    }

    @Order(8)
    @Test
    fun testArticleWrite() {
        val articleWrite = ArticleWrite(
            gallId = "github",
            article = Article(
                subject = "KotlinInside CI 테스트용 글입니다",
                content = mutableListOf(
                    StringContent(
                        string = "글은 곧 자동으로 삭제됩니다.\n글의 비밀번호는 1234입니다."
                    ),
                    MarkdownContent(
                        markdownString = "**Bold**\n~~취소선~~\n- [ ] Task List\n# 큰 글씨"
                    ),
                    HtmlContent(
                        htmlString = "<strike>취소선</strike>"
                    )
                ),
                headText = HeadText(
                    identifier = 0,
                    name = "일반",
                    level = 0,
                    selected = false
                ) // 옵션입니다. 없어도 글 작성됩니다.
            ),
            session = KotlinInside.getInstance().session
        )

        Thread.sleep(5_000)

        val writeResult = articleWrite.write()

        log.info(writeResult.toString())

        if (writeResult.result) {
            writeResult.articleId?.let {
                articleId = it
            }
        }
    }

    @Order(9)
    @Test
    fun testArticleVote() {
        val articleVote = ArticleVote(
            gallId = "github",
            articleId = articleId,
            session = KotlinInside.getInstance().session
        )

        val upvoteResult = articleVote.upvote()

        log.info(upvoteResult.toString())

        val downvoteResult = articleVote.downvote()

        log.info(downvoteResult.toString())
    }

    @Order(10)
    @Test
    fun testArticleDelete() {
        val articleDelete = ArticleDelete(
            gallId = "github",
            articleId = articleId,
            session = KotlinInside.getInstance().session
        )

        val deleteResult = articleDelete.delete()

        log.info(deleteResult.toString())
    }
}
