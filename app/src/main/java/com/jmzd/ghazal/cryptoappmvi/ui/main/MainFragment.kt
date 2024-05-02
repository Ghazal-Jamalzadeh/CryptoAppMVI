package com.jmzd.ghazal.cryptoappmvi.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.jmzd.ghazal.cryptoappmvi.R
import com.jmzd.ghazal.cryptoappmvi.databinding.FragmentMainBinding
import com.jmzd.ghazal.cryptoappmvi.utils.base.BaseFragment
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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //call api
        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.CREATED){
                if (isNetworkAvailable) {
                    viewModel.intentChannel.send(MainIntent.GetCoinsList)
                }
            }

            }

    }

}