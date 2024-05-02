package com.jmzd.ghazal.cryptoappmvi.data.model.main


import com.google.gson.annotations.SerializedName

class ResponseCoinsList : ArrayList<ResponseCoinsList.ResponseCoinsListItem>(){
    data class ResponseCoinsListItem(
        @SerializedName("id")
        val id: String?, // 01coin
        @SerializedName("name")
        val name: String?, // 01coin
        @SerializedName("symbol")
        val symbol: String? // zoc
    )
}