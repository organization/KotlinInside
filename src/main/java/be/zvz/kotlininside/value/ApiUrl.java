package be.zvz.kotlininside.value;

public final class ApiUrl {
    public static final String APP_API = "https://app.dcinside.com/api/";
    public static final String AUTH_API = "https://dcid.dcinside.com/join/";
    public static final String MAIN_API = "http://json2.dcinside.com/";
    public static final String REDIRECT = APP_API + "redirect.php";

    public static final class Article {
        public static final String LIST = APP_API + "gall_list_new.php";
        public static final String READ = APP_API + "gall_view_new.php";
        public static final String WRITE = "https://upload.dcinside.com/_app_write_api.php";
        public static final String DELETE = APP_API + "gall_del.php";
        public static final String MODIFY = APP_API + "gall_modify.php";

        public static final String UPVOTE = APP_API + "_recommend_up.php";
        public static final String DOWNVOTE = APP_API + "_recommend_down.php";

        public static final String REPORT = "http://m.dcinside.com/api/report.php";

        public static final String HIT_UPVOTE = APP_API + "hit_recommend";
    }

    public static final class Comment {
        public static final String OK = APP_API + "comment_ok.php";
        public static final String DELETE = APP_API + "comment_del.php";
        public static final String READ = APP_API + "comment_new.php";
    }

    public static final class Gallery {
        public static final String MINOR_INFO = APP_API + "minor_info";
        public static final String MINOR_MANAGEMENT = "https://gall.dcinside.com/mgallery/management/mobile";
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

    public static final class MainInfo {
        public static final String APP_MAIN = MAIN_API + "json3/main_content.php";
        public static final String GALLERY_RANK = MAIN_API + "json3/ranking_gallery.php";
        public static final String MINOR_GALLERY_RANK = MAIN_API + "json1/mgallmain/mgallery_ranking.php";
    }
}
