package be.zvz.kotlininside.value

object ApiUrl {
    const val PC_WEB = Protocol.HTTPS + "gall.dcinside.com/"
    const val MOBILE_WEB = Protocol.HTTP + "m.dcinside.com/"
    const val MOBILE_WEB_HTTPS = Protocol.HTTPS + "m.dcinside.com/"
    const val MOBILE_APP = Protocol.HTTPS + "app.dcinside.com/"
    const val APP_API = MOBILE_APP + "api/"
    const val AUTH_API = Protocol.HTTPS + "msign.dcinside.com/"
    const val MAIN_API = Protocol.HTTP + "json2.dcinside.com/"
    const val UPLOAD = Protocol.HTTPS + "upload.dcinside.com/"
    const val MOVIE_UPLOAD = Protocol.HTTPS + "m4up4.dcinside.com/"
    const val REDIRECT = APP_API + "redirect.php"

    private object Protocol {
        const val HTTP = "http://"
        const val HTTPS = "https://"
    }

    object Firebase {
        const val INSTALLATIONS =
            Protocol.HTTPS + "firebaseinstallations.googleapis.com/v1/projects/dcinside-b3f40/installations"
    }

    object PlayService {
        const val ANDROID_CLIENT = Protocol.HTTPS + "android.clients.google.com"
        const val REGISTER3 = "$ANDROID_CLIENT/c2dm/register3"
        const val CHECKIN = "$ANDROID_CLIENT/checkin"
    }

    object Upload {
        const val CHECK_UPLOAD_RESTRICTION = APP_API + "chk_upload_restriction"
        const val MOVIE = "$MOVIE_UPLOAD/movie_upload_v1.php"
    }

    object Article {
        const val LIST = APP_API + "gall_list_new.php"
        const val READ = APP_API + "gall_view_new.php"
        const val WRITE = UPLOAD + "_app_write_api.php"
        const val DELETE = APP_API + "gall_del.php"
        const val MODIFY = APP_API + "gall_modify.php"
        const val UPVOTE = APP_API + "_recommend_up.php"
        const val DOWNVOTE = APP_API + "_recommend_down.php"
        const val REPORT = MOBILE_WEB + "api/report.php"
        const val HIT_UPVOTE = APP_API + "hit_recommend"
        const val INSERT_MOVIE_INFO = MOBILE_APP + "movie/insert-mvinfo"
    }

    object Comment {
        const val OK = APP_API + "comment_ok.php"
        const val DELETE = APP_API + "comment_del.php"
        const val READ = APP_API + "comment_new.php"
    }

    object DCCon {
        const val DCCON = APP_API + "dccon.php"
    }

    object Gallery {
        const val MINOR_INFO = APP_API + "minor_info"
        const val MINOR_MANAGEMENT = PC_WEB + "mgallery/management/mobile"
        const val MINOR_NOMEMBER = MOBILE_WEB_HTTPS + "management/minor/nomember"
        const val MINOR_MANAGER_REQUEST = APP_API + "_manager_request.php"
        const val MINOR_BLOCK_WEB = APP_API + "minor_avoid"
        const val MINOR_BLOCK_ADD = APP_API + "minor_avoidadd"
    }

    object Search {
        const val SEARCH = APP_API + "_total_search.php"
    }

    object Auth {
        const val LOGIN = AUTH_API + "api/login"
        const val APP_ID = AUTH_API + "auth/mobile_app_verification"
        const val APP_CHECK = MAIN_API + "json0/app_check_A_rina_one.php"
    }

    object User {
        const val MY_GALL = APP_API + "mygall.php"
        const val MY_GALL_MODIFY = APP_API + "mygall_modify.php"
        const val MY_MANAGE_GALL_CHECK = APP_API + "mymanageGallChk"
        const val MY_MINI_JOIN_CHECK = APP_API + "myminijoinGallChk"
    }

    object MiniGallery {
        const val JOIN = APP_API + "memberjoin"
        const val JOIN_OK = APP_API + "memberjoin_ok"
        const val QUIT = APP_API + "memberout_ok"
    }

    object MainInfo {
        const val APP_MAIN = MAIN_API + "json3/main_content.php"
        const val GALLERY_RANKING = MAIN_API + "json3/ranking_gallery.php"
        const val MINOR_GALLERY_RANKING = MAIN_API + "json1/mgallmain/mgallery_ranking.php"
        const val MINI_GALLERY_RANKING = MAIN_API + "json1/migallmain/migallery_ranking.php"
    }
}
