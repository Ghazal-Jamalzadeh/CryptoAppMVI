package com.jmzd.ghazal.cryptoappmvi.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jmzd.ghazal.cryptoappmvi.data.repository.MainRepository
import com.jmzd.ghazal.cryptoappmvi.ui.main.MainIntent
import com.jmzd.ghazal.cryptoappmvi.utils.base.BaseState
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
            }
        }
    }

    private fun fetchingCoinsList() = viewModelScope.launch {
        val response = repository.getCoinsList()
        if (response.isSuccessful) {
            response.body()?.let { BaseState.Main.LoadCoinsList(it) }?.let { _state.emit(it) }
        } else {
//            val error = ErrorResponse(response).generateResponse()
//            _state.emit(error)
        }
    }

}