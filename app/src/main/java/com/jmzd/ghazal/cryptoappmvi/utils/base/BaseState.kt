package com.jmzd.ghazal.cryptoappmvi.utils.base

import com.jmzd.ghazal.cryptoappmvi.data.model.main.ResponseCoinsList

sealed class BaseState ( val error : String? = null) {
    data object Idle : BaseState()
    data object Loading : BaseState()
    class Error( error : String?) : BaseState(error)

    sealed class Main : BaseState() {
        data class LoadCoinsList(val coinsList: ResponseCoinsList) : Main()
    }
}