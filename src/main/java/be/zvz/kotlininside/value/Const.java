package be.zvz.kotlininside.value;

import org.apache.commons.lang3.RandomStringUtils;

public final class Const {
    public static final String DC_APP_SIGNATURE = "ReOo4u96nnv8Njd7707KpYiIVYQ3FlcKHDJE046Pg6s=";
    public static final String DC_APP_PACKAGE = "com.dcinside.app";
    public static final String DC_APP_VERSION_CODE = "30308";
    public static final String DC_APP_VERSION_NAME = "3.8.15";

    public static final String DEFAULT_FCM_TOKEN;

    static {
        DEFAULT_FCM_TOKEN = RandomStringUtils.randomAlphanumeric(11) + ":APA91bFMI-0d1b0wJmlIWoDPVa_V5Nv0OWnAefN7fGLegy6D76TN_CRo5RSUO-6V7Wnq44t7Rzx0A4kICVZ7wX-hJd3mrczE5NnLud722k5c-XRjIxYGVM9yZBScqE3oh4xbJOe2AvDe";
    }

    public static final String USER_AGENT = "dcinside.app";
}
