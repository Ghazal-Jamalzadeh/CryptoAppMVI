package com.jmzd.ghazal.cryptoappmvi.ui.detail

sealed class DetailIntent {
    data class CallCoinDetail (val id : String) : DetailIntent()
}
