package com.jmzd.ghazal.cryptoappmvi.ui.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import com.jmzd.ghazal.cryptoappmvi.databinding.FragmentDetailBinding
import com.jmzd.ghazal.cryptoappmvi.utils.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailFragment : BaseFragment<FragmentDetailBinding>() {
    //binding
    override val bindingInflater: (inflater: LayoutInflater) -> FragmentDetailBinding
        get() = FragmentDetailBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}