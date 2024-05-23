package com.jmzd.ghazal.cryptoappmvi.ui.main

sealed class MainIntent {
    data object GetCoinsList : MainIntent()
    data object GetSupportedCurrencies : MainIntent()
    data class GetPrice( val fromId : String ,  val toCurrency : String) : MainIntent()
    data object GetCoinsMarkets : MainIntent()
    data class NavigateToDetail (val id : String) : MainIntent()
}
