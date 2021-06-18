package be.zvz.kotlininside.session

data class SessionDetail(
    val result: Boolean,
    val userId: String,
    val userNo: String,
    val name: String,
    val stype: String,
    val isAdult: Int,
    val isDormancy: Int,
    val isOtp: Int,
    val pwCampaign: Int,
    val mailSend: String,
    val cause: String?
)
