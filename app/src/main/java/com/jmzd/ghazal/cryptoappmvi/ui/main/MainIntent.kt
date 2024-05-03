package com.jmzd.ghazal.cryptoappmvi.ui.main

sealed class MainIntent {
    data object GetCoinsList : MainIntent()
    data object GetSupportedCurrencies : MainIntent()
    data class GetPrice(private val fromId : String , private  val toCurrency : String) : MainIntent()
}