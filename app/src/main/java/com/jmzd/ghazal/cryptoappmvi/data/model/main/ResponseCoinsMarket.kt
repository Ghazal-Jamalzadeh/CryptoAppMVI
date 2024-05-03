package com.jmzd.ghazal.cryptoappmvi.data.model.main


import com.google.gson.annotations.SerializedName

class ResponseCoinsMarket : ArrayList<ResponseCoinsMarket.ResponseCoinsMarketItem>(){
    data class ResponseCoinsMarketItem(
        @SerializedName("ath")
        val ath: Double?, // 4878.26
        @SerializedName("ath_change_percentage")
        val athChangePercentage: Double?, // -19.59318
        @SerializedName("ath_date")
        val athDate: String?, // 2024-03-14T07:10:36.635Z
        @SerializedName("atl")
        val atl: Double?, // 67.81
        @SerializedName("atl_change_percentage")
        val atlChangePercentage: Double?, // 87337.26202
        @SerializedName("atl_date")
        val atlDate: String?, // 2013-07-06T00:00:00.000Z
        @SerializedName("circulating_supply")
        val circulatingSupply: Double?, // 120094013.283484
        @SerializedName("current_price")
        val currentPrice: Double?, // 2971.92
        @SerializedName("fully_diluted_valuation")
        val fullyDilutedValuation: Long?, // 1244761621556
        @SerializedName("high_24h")
        val high24h: Double?, // 3030.91
        @SerializedName("id")
        val id: String?, // bitcoin
        @SerializedName("image")
        val image: String?, // https://assets.coingecko.com/coins/images/1/large/bitcoin.png?1696501400
        @SerializedName("last_updated")
        val lastUpdated: String?, // 2024-05-03T09:05:32.194Z
        @SerializedName("low_24h")
        val low24h: Double?, // 2935.98
        @SerializedName("market_cap")
        val marketCap: Long?, // 1167314094596
        @SerializedName("market_cap_change_24h")
        val marketCapChange24h: Double?, // -117328720.855136
        @SerializedName("market_cap_change_percentage_24h")
        val marketCapChangePercentage24h: Double?, // 2.50562
        @SerializedName("market_cap_rank")
        val marketCapRank: Int?, // 1
        @SerializedName("max_supply")
        val maxSupply: Double?, // 155232.81826528
        @SerializedName("name")
        val name: String?, // Bitcoin
        @SerializedName("price_change_24h")
        val priceChange24h: Double?, // 1459.25
        @SerializedName("price_change_percentage_24h")
        val priceChangePercentage24h: Double?, // 2.52571
        @SerializedName("roi")
        val roi: Roi?,
        @SerializedName("sparkline_in_7d")
        val sparklineIn7d: SparklineIn7d?,
        @SerializedName("symbol")
        val symbol: String?, // btc
        @SerializedName("total_supply")
        val totalSupply: Double?, // 120094013.283484
        @SerializedName("total_volume")
        val totalVolume: Long? // 29484542712
    ) {
        data class Roi(
            @SerializedName("currency")
            val currency: String?, // btc
            @SerializedName("percentage")
            val percentage: Double?, // 6608.22825649145
            @SerializedName("times")
            val times: Double? // 66.0822825649145
        )
    
        data class SparklineIn7d(
            @SerializedName("price")
            val price: List<Double?>?
        )
    }
}