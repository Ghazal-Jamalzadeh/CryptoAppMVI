package com.jmzd.ghazal.cryptoappmvi.data.model


import com.google.gson.annotations.SerializedName

data class ResponseError429(
    @SerializedName("status")
    val status: Status?
) {
    data class Status(
        @SerializedName("error_code")
        val errorCode: Int?, // 429
        @SerializedName("error_message")
        val errorMessage: String? // You've exceeded the Rate Limit. Please visit https://www.coingecko.com/en/api/pricing to subscribe to our API plans for higher rate limits.
    )
}