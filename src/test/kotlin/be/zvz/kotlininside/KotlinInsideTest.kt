/*
 * KotlinInside Junit5 Test
 */
package be.zvz.kotlininside

import be.zvz.kotlininside.api.article.*
import be.zvz.kotlininside.api.type.*
import be.zvz.kotlininside.http.DefaultHttpClient
import be.zvz.kotlininside.session.user.Anonymous
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.TestMethodOrder
import org.junit.jupiter.api.TestInstance
import kotlin.test.Test
import kotlin.test.assertNotNull

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation::class)
class KotlinInsideTest {
    private var articleId = 0

    @Order(1)
    @Test fun initKotlinInside() {
        KotlinInside.createInstance(
                Anonymous("ㅇㅇ", "1234"),
                DefaultHttpClient(true)
        )
    }

    @Order(2)
    @Test fun testArticleList() {
        val articleList = ArticleList("hit", 1)
        articleList.request()

        val gallList = articleList.getGallList()
        val gallInfo = articleList.getGallInfo()

        assertNotNull(gallList[0], "ArticleList.getGallList()[0] must not be null")

        println(gallInfo)
        gallList.forEach {
            println(it)
        }
    }

    @Order(3)
    @Test fun testArticleRead() {
        val articleRead = ArticleRead("hit", 1)
        articleRead.request()

        println(articleRead.getViewInfo())
        println(articleRead.getViewMain())
    }

    @Order(4)
    @Test fun testArticleWrite() {
        val articleWrite = ArticleWrite(
                gallId = "github",
                article = Article(
                        subject = "KotlinInside 테스트 글입니다",
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
                         ) //옵션입니다. 없어도 글 작성됩니다.
                ),
                session = KotlinInside.getInstance().session
        )

        Thread.sleep(5_000)

        val writeResult = articleWrite.write()

        println(writeResult)

        if (writeResult.result)
            articleId = writeResult.articleId!!
    }

    @Order(5)
    @Test fun testArticleVote() {
        val articleVote = ArticleVote(
                gallId = "github",
                articleId = articleId,
                session = KotlinInside.getInstance().session
        )

        val upvoteResult = articleVote.upvote()

        println(upvoteResult)

        val downvoteResult = articleVote.downvote()

        println(downvoteResult)
    }

    @Order(6)
    @Test fun testArticleDelete() {
        val articleDelete = ArticleDelete(
                gallId = "github",
                articleId = articleId,
                session = KotlinInside.getInstance().session
        )

        val deleteResult = articleDelete.delete()

        println(deleteResult)
    }
}
