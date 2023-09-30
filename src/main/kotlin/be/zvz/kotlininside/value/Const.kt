package be.zvz.kotlininside.value

object Const {
    const val DC_APP_SIGNATURE = "ReOo4u96nnv8Njd7707KpYiIVYQ3FlcKHDJE046Pg6s="
    const val DC_APP_PACKAGE = "com.dcinside.app.android"
    const val DC_APP_VERSION_CODE = "100051"
    const val DC_APP_VERSION_NAME = "4.8.1"
    const val USER_AGENT = "dcinside.app"

    object Firebase {
        const val APP_ID = "1:477369754343:android:d2ffdd960120a207727842"
        const val AUTH_VERSION = "FIS_v2"
        const val FIREBASE_CLIENT = "H4sIAAAAAAAAAKtWykhNLCpJSk0sKVayio7VUSpLLSrOzM9TslIyUqoFAFyivEQfAAAA"
        const val SDK_VERSION = "a:17.1.0"
        const val CERT = "E6DA04787492CDBD34C77F31B890A3FAA3682D44"
    }

    object Installations {
        const val X_ANDROID_PACKAGE = DC_APP_PACKAGE
        const val X_ANDROID_CERT = Firebase.CERT
        const val X_GOOG_API_KEY = "AIzaSyDcbVof_4Bi2GwJ1H8NjSwSTaMPPZeCE38"
    }

    object Register3 {
        const val SENDER = "477369754343"
        const val X_SCOPE_ALL = "*"
        const val X_SCOPE_REFRESH_REMOTE_CONFIG = "/topics/DcRefreshRemoteConfig"
        const val X_SCOPE_SHOW_NOTICE_MESSAGE = "/topics/DcShowNoticeMessage"
        const val X_FIREBASE_APP_NAME_HASH = "R1dAH9Ui7M-ynoznwBdw01tLxhI"
        const val USER_AGENT = "Android-GCM/1.5"
        const val APP = DC_APP_PACKAGE
        const val GCM_VERSION = "232512022"
        const val CERT = Firebase.CERT
    }
}
