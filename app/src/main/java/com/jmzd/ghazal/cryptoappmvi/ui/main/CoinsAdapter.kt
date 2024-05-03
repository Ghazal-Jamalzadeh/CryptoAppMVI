package com.jmzd.ghazal.cryptoappmvi.ui.main

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.jmzd.ghazal.cryptoappmvi.R
import com.jmzd.ghazal.cryptoappmvi.data.model.main.ResponseCoinsMarket.ResponseCoinsMarketItem
import com.jmzd.ghazal.cryptoappmvi.databinding.ItemCoinsMarketBinding
import com.jmzd.ghazal.cryptoappmvi.utils.base.BaseDiffUtils
import com.jmzd.ghazal.cryptoappmvi.utils.doublePairs
import com.jmzd.ghazal.cryptoappmvi.utils.loadImage
import com.jmzd.ghazal.cryptoappmvi.utils.moneySeparating
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class CoinsAdapter @Inject constructor(@ApplicationContext private val context: Context) :
    RecyclerView.Adapter<CoinsAdapter.ViewHolder>() {

    private var items = emptyList<ResponseCoinsMarketItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemCoinsMarketBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(items[position])

    override fun getItemCount() = items.size

    override fun getItemViewType(position: Int) = position

    override fun getItemId(position: Int) = position.toLong()

    inner class ViewHolder(private val binding: ItemCoinsMarketBinding) : RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("SetTextI18n")
        fun bind(item: ResponseCoinsMarketItem) {
            binding.apply {
                //Text
                symbolTxt.text = item.symbol
                nameTxt.text = item.name
                priceTxt.text = "$${item.currentPrice?.toInt()?.moneySeparating()}"
                //Image
                item.image?.let { iconImg.loadImage(it) }
                //Chart
                coinChart.apply {
                    gradientFillColors = intArrayOf(chartColorAlpha(item.priceChangePercentage24h!!), Color.TRANSPARENT)
                    lineColor = chartColorLine(item.priceChangePercentage24h)
                    animation.duration = 800
                    val chartData = item.sparklineIn7d?.price?.dropLast(100).doublePairs()
                    animate(chartData)
                }
                //Change
                changeTxt.apply {
                    setCompoundDrawablesWithIntrinsicBounds(changeIcon(item.priceChangePercentage24h!!), 0, 0, 0)
                    compoundDrawables[0].setTint(chartColorLine(item.priceChangePercentage24h))
                    text = "$${item.priceChange24h}"
                    setTextColor(chartColorLine(item.priceChangePercentage24h))
                }
                //Click
                root.setOnClickListener {
                    //Click
                    onItemClickListener?.let {
                        it(item)
                    }
                }
            }
        }
    }

    private var onItemClickListener: ((ResponseCoinsMarketItem) -> Unit)? = null

    fun setOnItemClickListener(listener: (ResponseCoinsMarketItem) -> Unit) {
        onItemClickListener = listener
    }

    fun setData(data: List<ResponseCoinsMarketItem>) {
        val adapterDiffUtils = BaseDiffUtils(items, data)
        val diffUtils = DiffUtil.calculateDiff(adapterDiffUtils)
        items = data
        diffUtils.dispatchUpdatesTo(this)
    }

    private fun chartColorLine(percent: Double?): Int {
        return if (percent!! < 0)
            ContextCompat.getColor(context, R.color.goldenrod)
        else
            ContextCompat.getColor(context, R.color.turquoise)
    }

    private fun chartColorAlpha(percent: Double?): Int {
        return if (percent!! < 0)
            ContextCompat.getColor(context, R.color.goldenrodAlpha)
        else
            ContextCompat.getColor(context, R.color.turquoiseAlpha)
    }

    private fun changeIcon(percent: Double?): Int {
        return if (percent!! < 0)
            R.drawable.round_arrow_drop_down_24
        else
            R.drawable.round_arrow_drop_up_24
    }
}