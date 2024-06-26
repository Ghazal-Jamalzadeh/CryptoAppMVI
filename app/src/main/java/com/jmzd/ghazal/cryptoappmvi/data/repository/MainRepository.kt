package com.jmzd.ghazal.cryptoappmvi.data.repository

import com.jmzd.ghazal.cryptoappmvi.data.network.ApiServices
import com.jmzd.ghazal.cryptoappmvi.utils.PER_PAGE
import com.jmzd.ghazal.cryptoappmvi.utils.USD
import javax.inject.Inject

class MainRepository @Inject constructor(private val api : ApiServices) {

    suspend fun getCoinsList() = api.getCoinsList()
    suspend fun getSupportedCurrencies() = api.getSupportedCurrencies()
    suspend fun getPrice(fromId : String , toCurrency : String) = api.getCoinPrice(fromId , toCurrency)
    suspend fun getCoinsMarket() = api.getCoinsMarkets(currency = USD , sparkLine = true , page = PER_PAGE)
}