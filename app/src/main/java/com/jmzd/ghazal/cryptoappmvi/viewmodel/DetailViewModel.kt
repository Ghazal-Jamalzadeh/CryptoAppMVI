package com.jmzd.ghazal.cryptoappmvi.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jmzd.ghazal.cryptoappmvi.data.repository.DetailRepository
import com.jmzd.ghazal.cryptoappmvi.data.repository.MainRepository
import com.jmzd.ghazal.cryptoappmvi.ui.detail.DetailIntent
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
class DetailViewModel @Inject constructor(private val repository: DetailRepository) : ViewModel() {
    val intentChannel = Channel<DetailIntent>()
    private val _state = MutableStateFlow<BaseState>(BaseState.Idle)
    val state: StateFlow<BaseState> get() = _state

    init {
        handleIntents()
    }

    private fun handleIntents() = viewModelScope.launch {
        intentChannel.consumeAsFlow().collect { intent ->
            when (intent) {
                is DetailIntent.CallCoinDetail -> fetchingCoinDetail(intent.id)
            }
        }
    }


    private fun fetchingCoinDetail(id: String) = viewModelScope.launch {
        _state.emit(BaseState.Loading)
        val response = repository.getCoinDetail(id)
        if (response.isSuccessful) {
            response.body()?.let { BaseState.Detail.LoadCoinDetail(it) }?.let { _state.emit(it) }
        } else {
            val error = ErrorResponse(response).generateResponse()
            _state.emit(error)
        }
    }

}