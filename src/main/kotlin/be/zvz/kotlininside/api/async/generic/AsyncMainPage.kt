package be.zvz.kotlininside.api.async.generic

import be.zvz.kotlininside.api.generic.MainPage
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

class AsyncMainPage {
    private val mainPage = MainPage()

    suspend fun requestAsync() = coroutineScope {
        async(Dispatchers.IO) {
            mainPage.request()
        }
    }

    suspend fun getHitAsync() = coroutineScope {
        async(Dispatchers.Default) {
            mainPage.getHit()
        }
    }

    suspend fun getBestAsync() = coroutineScope {
        async(Dispatchers.Default) {
            mainPage.getBest()
        }
    }

    suspend fun getIssueZoomAsync() = coroutineScope {
        async(Dispatchers.Default) {
            mainPage.getIssueZoom()
        }
    }

    suspend fun getNewGalleryAsync() = coroutineScope {
        async(Dispatchers.Default) {
            mainPage.getNewGallery()
        }
    }
}