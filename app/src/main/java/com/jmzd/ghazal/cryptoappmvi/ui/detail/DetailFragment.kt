package com.jmzd.ghazal.cryptoappmvi.ui.detail

import android.annotation.SuppressLint
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.core.text.HtmlCompat
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.navArgs
import com.jmzd.ghazal.cryptoappmvi.R
import com.jmzd.ghazal.cryptoappmvi.data.model.detail.ResponseDetail
import com.jmzd.ghazal.cryptoappmvi.databinding.FragmentDetailBinding
import com.jmzd.ghazal.cryptoappmvi.utils.base.BaseFragment
import com.jmzd.ghazal.cryptoappmvi.utils.base.BaseState
import com.jmzd.ghazal.cryptoappmvi.utils.changeVisibility
import com.jmzd.ghazal.cryptoappmvi.utils.loadImage
import com.jmzd.ghazal.cryptoappmvi.utils.moneySeparating
import com.jmzd.ghazal.cryptoappmvi.utils.openBrowser
import com.jmzd.ghazal.cryptoappmvi.utils.showSnackBar
import com.jmzd.ghazal.cryptoappmvi.utils.showTwoDecimal
import com.jmzd.ghazal.cryptoappmvi.viewmodel.DetailViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class DetailFragment : BaseFragment<FragmentDetailBinding>() {
    //binding
    override val bindingInflater: (inflater: LayoutInflater) -> FragmentDetailBinding
        get() = FragmentDetailBinding::inflate

    //viewModel
    private val viewModel by viewModels<DetailViewModel>()

    //args
    private val args by navArgs<DetailFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Args
        args.let {
            if (it.id.isNotEmpty()) {
                //Call api
                viewLifecycleOwner.lifecycleScope.launch {
                    repeatOnLifecycle(Lifecycle.State.CREATED) {
                        if (isNetworkAvailable) {
                            viewModel.intentChannel.send(DetailIntent.CallCoinDetail(it.id))
                        }
                    }
                }
            }
        }
        //Load data
        handleStates()
    }


    private fun handleStates() {
        binding.apply {
            viewLifecycleOwner.lifecycleScope.launch {
                repeatOnLifecycle(Lifecycle.State.CREATED) {
                    viewModel.state.collect { state ->
                        when (state) {
                            is BaseState.Idle -> {}
                            is BaseState.Loading -> loading.isVisible = true
                            is BaseState.Error -> {
                                loading.changeVisibility(false, container)
                                state.error?.let { root.showSnackBar(it) }
                            }

                            is BaseState.Detail.LoadCoinDetail -> initDetailViews(state.detail)
                            else -> {}
                        }
                    }
                }
            }
        }
    }



    @SuppressLint("SetTextI18n")
    private fun initDetailViews(detail: ResponseDetail) {
        binding.apply {
            loading.changeVisibility(false, container)
            //Text
            nameTxt.text = "${detail.name} (${detail.symbol})"
            genesisDate.text = "${getString(R.string.genesisDate)} : ${detail.genesisDate}"
            detail.categories?.let { categoryDate.text = "${getString(R.string.category)} : ${it[0]}" }
            //Desc
            detail.description?.let {
                val descFormatter = HtmlCompat.fromHtml(it.en!!, HtmlCompat.FROM_HTML_MODE_COMPACT)
                descText.text = descFormatter
            }
            //Prices
            detail.marketData?.let { market ->
                //Current
                market.currentPrice?.let { priceTxt.text = "$${it.usd?.toInt()?.moneySeparating()}" }
                //High
                market.high24h?.let { highPriceTxt.text = "$${it.usd?.toInt()?.moneySeparating()}" }
                //Low
                market.low24h?.let { lowPriceTxt.text = "$${it.usd?.toInt()?.moneySeparating()}" }
                //Percent
                market.priceChangePercentage24h?.let { price1Day.text = "${it.showTwoDecimal()}%" }
                market.priceChangePercentage7d?.let { price7Day.text = "${it.showTwoDecimal()}%" }
                market.priceChangePercentage14d?.let { price14Day.text = "${it.showTwoDecimal()}%" }
                market.priceChangePercentage30d?.let { price30Day.text = "${it.showTwoDecimal()}%" }
                market.priceChangePercentage60d?.let { price60Day.text = "${it.showTwoDecimal()}%" }
                market.priceChangePercentage200d?.let { price200Day.text = "${it.showTwoDecimal()}%" }
                market.priceChangePercentage1y?.let { price1Year.text = "${it.showTwoDecimal()}%" }
            }
            //Links
            detail.links?.let { links ->
                //Homepage
                if (links.homepage != null) {
                    val link = links.homepage[0]
                    homePageTxt.apply {
                        text = link
                        setOnClickListener { Uri.parse(link).openBrowser(requireContext()) }
                    }
                } else {
                    homePageLay.isVisible = false
                }
                //Official form
                if (links.officialForumUrl != null) {
                    val link = links.officialForumUrl[0]
                    officialFormTxt.apply {
                        text = link
                        setOnClickListener { Uri.parse(link).openBrowser(requireContext()) }
                    }
                } else {
                    officialFormLay.isVisible = false
                }
                //Github
                if (links.reposUrl != null) {
                    links.reposUrl.github?.let { github ->
                        val link = github[0]
                        githubTxt.apply {
                            text = link
                            setOnClickListener { Uri.parse(link).openBrowser(requireContext()) }
                        }
                    }
                } else {
                    githubLay.isVisible = false
                }
            }
            //Image
            detail.image?.small?.let { iconImg.loadImage(it) }
            //Chart
            detail.marketData?.let { market ->
                coinChartBig.apply {
//                    gradientFillColors = intArrayOf(chartColorAlpha(market.priceChangePercentage24h!!), Color.TRANSPARENT)
//                    lineColor = chartColorLine(market.priceChangePercentage24h)
//                    animation.duration = 800
//                    val chartData = market.sparkline7d?.price?.dropLast(100).doublePairs()
//                    animate(chartData)
                }
            }
        }
    }



}