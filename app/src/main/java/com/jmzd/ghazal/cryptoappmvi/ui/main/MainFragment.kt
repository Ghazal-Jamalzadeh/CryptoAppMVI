package com.jmzd.ghazal.cryptoappmvi.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.ArrayAdapter
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.jmzd.ghazal.cryptoappmvi.R
import com.jmzd.ghazal.cryptoappmvi.data.model.main.ResponseCoinsList.ResponseCoinsListItem
import com.jmzd.ghazal.cryptoappmvi.databinding.FragmentMainBinding
import com.jmzd.ghazal.cryptoappmvi.utils.base.BaseFragment
import com.jmzd.ghazal.cryptoappmvi.utils.base.BaseState
import com.jmzd.ghazal.cryptoappmvi.utils.showSnackBar
import com.jmzd.ghazal.cryptoappmvi.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainFragment : BaseFragment<FragmentMainBinding>() {

    //binding
    override val bindingInflater: (inflater: LayoutInflater) -> FragmentMainBinding
        get() = FragmentMainBinding::inflate

    //view model
    private val viewModel by viewModels<MainViewModel>()

    //other
    private var coinPriceId = ""
    private var coinPriceName = ""

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //call api
        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.CREATED) {
                if (isNetworkAvailable) {
                    viewModel.intentChannel.send(MainIntent.GetCoinsList)
                }
            }
        }

        handleStates()

    }

    private fun handleStates() {
        binding.apply {
            viewLifecycleOwner.lifecycleScope.launch {
                repeatOnLifecycle(Lifecycle.State.CREATED) {
                    viewModel.state.collect { state ->
                        when (state) {
                            is BaseState.Idle -> {}
                            is BaseState.Loading -> coinsMarketLoading.isVisible = true
                            is BaseState.Error -> {
                                state.error?.let { root.showSnackBar(it) }
                            }

                            is BaseState.Main.LoadCoinsList -> initCoinsSpinner(state.coinsList)
                            else -> {}
                        }
                    }
                }
            }
        }
    }

    private fun initCoinsSpinner(data: MutableList<ResponseCoinsListItem>) {
        //Coins name
        val coinsName = mutableListOf<String>()
        data.forEach { coinsName.add(it.name ?: "---") }
        //Adapter
        val coinsAdapter = ArrayAdapter(requireContext(), R.layout.dropdown_menu_popup_item, coinsName)
        //Update view
        binding.fromCoinAutoTxt.apply {
            setAdapter(coinsAdapter)
            setOnItemClickListener { _, _, position, _ ->
                coinPriceId = data[position].id ?: ""
                //Call api
//                if (coinPriceName.isNotEmpty())
//                    callCoinPriceApi()
            }
        }
    }


}