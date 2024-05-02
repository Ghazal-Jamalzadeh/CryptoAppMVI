package com.jmzd.ghazal.cryptoappmvi.data.network

import com.jmzd.ghazal.cryptoappmvi.data.model.main.ResponseCoinsList
import retrofit2.Response
import retrofit2.http.GET

interface ApiServices {
    @GET("coins/list")
    suspend fun getCoinsList() : Response<ResponseCoinsList>
}