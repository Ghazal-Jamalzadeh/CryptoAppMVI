package com.jmzd.ghazal.cryptoappmvi.data.repository

import com.jmzd.ghazal.cryptoappmvi.data.network.ApiServices
import javax.inject.Inject

class DetailRepository @Inject constructor(private val api : ApiServices) {

    suspend fun getCoinDetail(id : String) = api.getCoinDetail(id = id , sparkline = true )
}