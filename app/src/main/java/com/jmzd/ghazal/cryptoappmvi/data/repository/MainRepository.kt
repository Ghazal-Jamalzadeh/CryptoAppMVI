package com.jmzd.ghazal.cryptoappmvi.data.repository

import com.jmzd.ghazal.cryptoappmvi.data.network.ApiServices
import javax.inject.Inject

class MainRepository @Inject constructor(private val api : ApiServices) {

    suspend fun getCoinsList() = api.getCoinsList()
}