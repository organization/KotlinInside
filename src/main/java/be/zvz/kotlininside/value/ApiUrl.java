package be.zvz.kotlininside.value;

public final class ApiUrl {
    public static final String PC_WEB = Protocol.HTTPS + "gall.dcinside.com/";
    public static final String MOBILE_WEB = Protocol.HTTP + "m.dcinside.com/";
    public static final String APP_API = Protocol.HTTPS + "app.dcinside.com/api/";
    public static final String AUTH_API = Protocol.HTTPS + "dcid.dcinside.com/join/";
    public static final String MAIN_API = Protocol.HTTP + "json2.dcinside.com/";
    public static final String UPLOAD = Protocol.HTTPS + "upload.dcinside.com/";

    private static final class Protocol {
        private static final String HTTP = "http://";
        private static final String HTTPS = "https://";
    }

    public static final String REDIRECT = APP_API + "redirect.php";

    public static final class Article {
        public static final String LIST = APP_API + "gall_list_new.php";
        public static final String READ = APP_API + "gall_view_new.php";
        public static final String WRITE = UPLOAD + "_app_write_api.php";
        public static final String DELETE = APP_API + "gall_del.php";
        public static final String MODIFY = APP_API + "gall_modify.php";

        public static final String UPVOTE = APP_API + "_recommend_up.php";
        public static final String DOWNVOTE = APP_API + "_recommend_down.php";

        public static final String REPORT = MOBILE_WEB + "api/report.php";

        public static final String HIT_UPVOTE = APP_API + "hit_recommend";
    }

    public static final class Comment {
        public static final String OK = APP_API + "comment_ok.php";
        public static final String DELETE = APP_API + "comment_del.php";
        public static final String READ = APP_API + "comment_new.php";
    }

    public static final class DCCon {
        public static final String DCCON = APP_API + "dccon.php";
    }

    public static final class Gallery {
        public static final String MINOR_INFO = APP_API + "minor_info";
        public static final String MINOR_MANAGEMENT = PC_WEB + "mgallery/management/mobile";
        public static final String MINOR_MANAGER_REQUEST = APP_API + "_manager_request.php";
        public static final String MINOR_BLOCK_WEB = APP_API + "minor_avoid";
        public static final String MINOR_BLOCK_ADD = APP_API + "minor_avoidadd";
    }

    public static final class Search {
        public static final String SEARCH = APP_API + "_total_search.php";
    }

    public static final class Auth {
        public static final String LOGIN = AUTH_API + "mobile_app_login.php";
        public static final String APP_ID = AUTH_API + "mobile_app_key_verification_3rd.php";
        public static final String APP_CHECK = MAIN_API + "json0/app_check_A_rina_beta.php";
    }

    public static final class User {
        public static final String MY_GALL = APP_API + "mygall.php";
        public static final String MY_GALL_MODIFY = APP_API + "mygall_modify.php";
        public static final String MY_MANAGE_GALL_CHECK = APP_API + "mymanageGallChk";
        public static final String MY_MINI_JOIN_CHECK = APP_API + "myminijoinGallChk";
    }

    public static final class MiniGallery {
        public static final String JOIN = APP_API + "memberjoin";
        public static final String JOIN_OK = APP_API + "memberjoin_ok";
        public static final String QUIT = APP_API + "memberout_ok";
    }

    public static final class MainInfo {
        public static final String APP_MAIN = MAIN_API + "json3/main_content.php";
        public static final String GALLERY_RANKING = MAIN_API + "json3/ranking_gallery.php";
        public static final String MINOR_GALLERY_RANKING = MAIN_API + "json1/mgallmain/mgallery_ranking.php";
    }
}
