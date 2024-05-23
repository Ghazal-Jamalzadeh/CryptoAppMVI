package com.jmzd.ghazal.cryptoappmvi.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jmzd.ghazal.cryptoappmvi.data.repository.MainRepository
import com.jmzd.ghazal.cryptoappmvi.ui.main.MainIntent
import com.jmzd.ghazal.cryptoappmvi.utils.base.BaseState
import com.jmzd.ghazal.cryptoappmvi.utils.network.ErrorResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.consumeAsFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repository: MainRepository) : ViewModel() {
    val intentChannel = Channel<MainIntent>()
    private val _state = MutableStateFlow<BaseState>(BaseState.Idle)
    val state: StateFlow<BaseState> get() = _state

    init {
        handleIntents()
    }

    private fun handleIntents() = viewModelScope.launch {
        intentChannel.consumeAsFlow().collect { intent ->
            when (intent) {
                is MainIntent.GetCoinsList -> fetchingCoinsList()
                is MainIntent.GetSupportedCurrencies -> fetchingSupportedCurrenciesList()
                is MainIntent.GetPrice -> fetchingPrice(intent.fromId, intent.toCurrency)
                is MainIntent.GetCoinsMarkets -> fetchingCoinsMarket()
                is MainIntent.NavigateToDetail -> navigateToDetail(intent.id)
            }
        }
    }

    private fun fetchingCoinsList() = viewModelScope.launch {
        val response = repository.getCoinsList()
        if (response.isSuccessful) {
            response.body()?.let { BaseState.Main.LoadCoinsList(it) }?.let { _state.emit(it) }
        } else {
            val error = ErrorResponse(response).generateResponse()
            _state.emit(error)
        }
    }

    private fun fetchingSupportedCurrenciesList() = viewModelScope.launch {
        val response = repository.getSupportedCurrencies()
        if (response.isSuccessful) {
            response.body()?.let { BaseState.Main.LoadSupportedCurrenciesList(it) }
                ?.let { _state.emit(it) }
        } else {
            val error = ErrorResponse(response).generateResponse()
            _state.emit(error)
        }
    }

    private fun fetchingPrice(fromId: String, toCurrency: String) = viewModelScope.launch {
        _state.emit(BaseState.Main.LoadingPrice)
        val response = repository.getPrice(fromId, toCurrency)
        if (response.isSuccessful) {
            val responseData = response.body()
            responseData?.let {
                val coinInfo = it[fromId]?.get(toCurrency)
                coinInfo?.let { info -> BaseState.Main.LoadPrice(info) }
                    ?.let { price -> _state.emit(price) }
            }
        } else {
            val error = ErrorResponse(response).generateResponse()
            _state.emit(error)
        }
    }

    private fun fetchingCoinsMarket() = viewModelScope.launch {
        _state.emit(BaseState.Loading)
        val response = repository.getCoinsMarket()
        if (response.isSuccessful) {
            response.body()?.let { BaseState.Main.LoadCoinsMarket(it) }?.let { _state.emit(it) }
        } else {
            val error = ErrorResponse(response).generateResponse()
            _state.emit(error)
        }
    }

    private fun navigateToDetail(id: String) = viewModelScope.launch {
        _state.emit(BaseState.Main.NavigateToDetail(id))
    }

}