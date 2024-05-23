package com.jmzd.ghazal.cryptoappmvi.data.model.detail

import com.google.gson.annotations.SerializedName

data class ResponseDetail(
    @SerializedName("additional_notices")
    val additionalNotices: List<Any?>?,
    @SerializedName("asset_platform_id")
    val assetPlatformId: Any?, // null
    @SerializedName("block_time_in_minutes")
    val blockTimeInMinutes: Int?, // 10
    @SerializedName("categories")
    val categories: List<String?>?,
    @SerializedName("country_origin")
    val countryOrigin: String?,
    @SerializedName("description")
    val description: Description?,
    @SerializedName("detail_platforms")
    val detailPlatforms: DetailPlatforms?,
    @SerializedName("developer_data")
    val developerData: DeveloperData?,
    @SerializedName("genesis_date")
    val genesisDate: String?, // 2009-01-03
    @SerializedName("hashing_algorithm")
    val hashingAlgorithm: String?, // SHA-256
    @SerializedName("id")
    val id: String?, // bitcoin
    @SerializedName("image")
    val image: Image?,
    @SerializedName("last_updated")
    val lastUpdated: String?, // 2024-01-03T08:41:34.739Z
    @SerializedName("links")
    val links: Links?,
    @SerializedName("market_cap_rank")
    val marketCapRank: Int?, // 1
    @SerializedName("market_data")
    val marketData: MarketData?,
    @SerializedName("name")
    val name: String?, // Bitcoin
    @SerializedName("platforms")
    val platforms: Platforms?,
    @SerializedName("preview_listing")
    val previewListing: Boolean?, // false
    @SerializedName("public_notice")
    val publicNotice: Any?, // null
    @SerializedName("sentiment_votes_down_percentage")
    val sentimentVotesDownPercentage: Double?, // 14.72
    @SerializedName("sentiment_votes_up_percentage")
    val sentimentVotesUpPercentage: Double?, // 85.28
    @SerializedName("status_updates")
    val statusUpdates: List<Any?>?,
    @SerializedName("symbol")
    val symbol: String?, // btc
    @SerializedName("watchlist_portfolio_users")
    val watchlistPortfolioUsers: Int?, // 1417303
    @SerializedName("web_slug")
    val webSlug: String? // bitcoin
) {
    data class Description(
        @SerializedName("en")
        val en: String? // Bitcoin is the first successful internet money based on peer-to-peer technology; whereby no central bank or authority is involved in the transaction and production of the Bitcoin currency. It was created by an anonymous individual/group under the name, Satoshi Nakamoto. The source code is available publicly as an open source project, anybody can look at it and be part of the developmental process.Bitcoin is changing the way we see money as we speak. The idea was to produce a means of exchange, independent of any central authority, that could be transferred electronically in a secure, verifiable and immutable way. It is a decentralized peer-to-peer internet currency making mobile payment easy, very low transaction fees, protects your identity, and it works anywhere all the time with no central authority and banks.Bitcoin is designed to have only 21 million BTC ever created, thus making it a deflationary currency. Bitcoin uses the <a href="https://www.coingecko.com/en?hashing_algorithm=SHA-256">SHA-256</a> hashing algorithm with an average transaction confirmation time of 10 minutes. Miners today are mining Bitcoin using ASIC chip dedicated to only mining Bitcoin, and the hash rate has shot up to peta hashes.Being the first successful online cryptography currency, Bitcoin has inspired other alternative currencies such as <a href="https://www.coingecko.com/en/coins/litecoin">Litecoin</a>, <a href="https://www.coingecko.com/en/coins/peercoin">Peercoin</a>, <a href="https://www.coingecko.com/en/coins/primecoin">Primecoin</a>, and so on.The cryptocurrency then took off with the innovation of the turing-complete smart contract by <a href="https://www.coingecko.com/en/coins/ethereum">Ethereum</a> which led to the development of other amazing projects such as <a href="https://www.coingecko.com/en/coins/eos">EOS</a>, <a href="https://www.coingecko.com/en/coins/tron">Tron</a>, and even crypto-collectibles such as <a href="https://www.coingecko.com/buzz/ethereum-still-king-dapps-cryptokitties-need-1-billion-on-eos">CryptoKitties</a>.
    )

    data class DetailPlatforms(
        @SerializedName("")
        val x: X?
    ) {
        data class X(
            @SerializedName("contract_address")
            val contractAddress: String?,
            @SerializedName("decimal_place")
            val decimalPlace: Any? // null
        )
    }

    data class DeveloperData(
        @SerializedName("closed_issues")
        val closedIssues: Int?, // 7378
        @SerializedName("code_additions_deletions_4_weeks")
        val codeAdditionsDeletions4Weeks: CodeAdditionsDeletions4Weeks?,
        @SerializedName("commit_count_4_weeks")
        val commitCount4Weeks: Int?, // 135
        @SerializedName("forks")
        val forks: Int?, // 36362
        @SerializedName("last_4_weeks_commit_activity_series")
        val last4WeeksCommitActivitySeries: List<Int?>?,
        @SerializedName("pull_request_contributors")
        val pullRequestContributors: Int?, // 846
        @SerializedName("pull_requests_merged")
        val pullRequestsMerged: Int?, // 11206
        @SerializedName("stars")
        val stars: Int?, // 73021
        @SerializedName("subscribers")
        val subscribers: Int?, // 3962
        @SerializedName("total_issues")
        val totalIssues: Int? // 7738
    ) {
        data class CodeAdditionsDeletions4Weeks(
            @SerializedName("additions")
            val additions: Int?, // 233
            @SerializedName("deletions")
            val deletions: Int? // -88
        )
    }

    data class Image(
        @SerializedName("large")
        val large: String?, // https://assets.coingecko.com/coins/images/1/large/bitcoin.png?1696501400
        @SerializedName("small")
        val small: String?, // https://assets.coingecko.com/coins/images/1/small/bitcoin.png?1696501400
        @SerializedName("thumb")
        val thumb: String? // https://assets.coingecko.com/coins/images/1/thumb/bitcoin.png?1696501400
    )

    data class Links(
        @SerializedName("announcement_url")
        val announcementUrl: List<String?>?,
        @SerializedName("bitcointalk_thread_identifier")
        val bitcointalkThreadIdentifier: Any?, // null
        @SerializedName("blockchain_site")
        val blockchainSite: List<String?>?,
        @SerializedName("chat_url")
        val chatUrl: List<String?>?,
        @SerializedName("facebook_username")
        val facebookUsername: String?, // bitcoins
        @SerializedName("homepage")
        val homepage: List<String?>?,
        @SerializedName("official_forum_url")
        val officialForumUrl: List<String?>?,
        @SerializedName("repos_url")
        val reposUrl: ReposUrl?,
        @SerializedName("subreddit_url")
        val subredditUrl: String?, // https://www.reddit.com/r/Bitcoin/
        @SerializedName("telegram_channel_identifier")
        val telegramChannelIdentifier: String?,
        @SerializedName("twitter_screen_name")
        val twitterScreenName: String? // bitcoin
    ) {
        data class ReposUrl(
            @SerializedName("bitbucket")
            val bitbucket: List<Any?>?,
            @SerializedName("github")
            val github: List<String?>?
        )
    }

    data class MarketData(
        @SerializedName("ath")
        val ath: Ath?,
        @SerializedName("ath_change_percentage")
        val athChangePercentage: AthChangePercentage?,
        @SerializedName("ath_date")
        val athDate: AthDate?,
        @SerializedName("atl")
        val atl: Atl?,
        @SerializedName("atl_change_percentage")
        val atlChangePercentage: AtlChangePercentage?,
        @SerializedName("atl_date")
        val atlDate: AtlDate?,
        @SerializedName("circulating_supply")
        val circulatingSupply: Double?, // 19588293.0
        @SerializedName("current_price")
        val currentPrice: CurrentPrice?,
        @SerializedName("fdv_to_tvl_ratio")
        val fdvToTvlRatio: Any?, // null
        @SerializedName("fully_diluted_valuation")
        val fullyDilutedValuation: FullyDilutedValuation?,
        @SerializedName("high_24h")
        val high24h: High24h?,
        @SerializedName("last_updated")
        val lastUpdated: String?, // 2024-01-03T08:41:34.739Z
        @SerializedName("low_24h")
        val low24h: Low24h?,
        @SerializedName("market_cap")
        val marketCap: MarketCap?,
        @SerializedName("market_cap_change_24h")
        val marketCapChange24h: Double?, // -11302073501.372
        @SerializedName("market_cap_change_24h_in_currency")
        val marketCapChange24hInCurrency: MarketCapChange24hInCurrency?,
        @SerializedName("market_cap_change_percentage_24h")
        val marketCapChangePercentage24h: Double?, // -1.26148
        @SerializedName("market_cap_change_percentage_24h_in_currency")
        val marketCapChangePercentage24hInCurrency: MarketCapChangePercentage24hInCurrency?,
        @SerializedName("market_cap_fdv_ratio")
        val marketCapFdvRatio: Double?, // 0.93
        @SerializedName("market_cap_rank")
        val marketCapRank: Int?, // 1
        @SerializedName("max_supply")
        val maxSupply: Double?, // 21000000.0
        @SerializedName("mcap_to_tvl_ratio")
        val mcapToTvlRatio: Any?, // null
        @SerializedName("price_change_24h")
        val priceChange24h: Double?, // -534.4526532066
        @SerializedName("price_change_24h_in_currency")
        val priceChange24hInCurrency: PriceChange24hInCurrency?,
        @SerializedName("price_change_percentage_14d")
        val priceChangePercentage14d: Double?, // 5.19791
        @SerializedName("price_change_percentage_14d_in_currency")
        val priceChangePercentage14dInCurrency: PriceChangePercentage14dInCurrency?,
        @SerializedName("price_change_percentage_1h_in_currency")
        val priceChangePercentage1hInCurrency: PriceChangePercentage1hInCurrency?,
        @SerializedName("price_change_percentage_1y")
        val priceChangePercentage1y: Double?, // 170.1099
        @SerializedName("price_change_percentage_1y_in_currency")
        val priceChangePercentage1yInCurrency: PriceChangePercentage1yInCurrency?,
        @SerializedName("price_change_percentage_200d")
        val priceChangePercentage200d: Double?, // 69.73087
        @SerializedName("price_change_percentage_200d_in_currency")
        val priceChangePercentage200dInCurrency: PriceChangePercentage200dInCurrency?,
        @SerializedName("price_change_percentage_24h")
        val priceChangePercentage24h: Double?, // -1.16992
        @SerializedName("price_change_percentage_24h_in_currency")
        val priceChangePercentage24hInCurrency: PriceChangePercentage24hInCurrency?,
        @SerializedName("price_change_percentage_30d")
        val priceChangePercentage30d: Double?, // 8.96908
        @SerializedName("price_change_percentage_30d_in_currency")
        val priceChangePercentage30dInCurrency: PriceChangePercentage30dInCurrency?,
        @SerializedName("price_change_percentage_60d")
        val priceChangePercentage60d: Double?, // 29.75459
        @SerializedName("price_change_percentage_60d_in_currency")
        val priceChangePercentage60dInCurrency: PriceChangePercentage60dInCurrency?,
        @SerializedName("price_change_percentage_7d")
        val priceChangePercentage7d: Double?, // 6.35371
        @SerializedName("price_change_percentage_7d_in_currency")
        val priceChangePercentage7dInCurrency: PriceChangePercentage7dInCurrency?,
        @SerializedName("roi")
        val roi: Any?, // null
        @SerializedName("sparkline_7d")
        val sparkline7d: Sparkline7d?,
        @SerializedName("total_supply")
        val totalSupply: Double?, // 21000000.0
        @SerializedName("total_value_locked")
        val totalValueLocked: Any?, // null
        @SerializedName("total_volume")
        val totalVolume: TotalVolume?
    ) {
        data class Ath(
            @SerializedName("aed")
            val aed: Double?, // 165821
            @SerializedName("ars")
            val ars: Double?, // 36601458
            @SerializedName("aud")
            val aud: Double?, // 66827
            @SerializedName("bch")
            val bch: Double?, // 171.902
            @SerializedName("bdt")
            val bdt: Double?, // 4958833
            @SerializedName("bhd")
            val bhd: Double?, // 17015.56
            @SerializedName("bits")
            val bits: Double?, // 999904
            @SerializedName("bmd")
            val bmd: Double?, // 45148
            @SerializedName("bnb")
            val bnb: Double?, // 141.748
            @SerializedName("brl")
            val brl: Double?, // 222311
            @SerializedName("btc")
            val btc: Double?, // 1.0
            @SerializedName("cad")
            val cad: Double?, // 60167
            @SerializedName("chf")
            val chf: Double?, // 38389
            @SerializedName("clp")
            val clp: Double?, // 39954411
            @SerializedName("cny")
            val cny: Double?, // 320455
            @SerializedName("czk")
            val czk: Double?, // 1015793
            @SerializedName("dkk")
            val dkk: Double?, // 307262
            @SerializedName("dot")
            val dot: Double?, // 5329
            @SerializedName("eos")
            val eos: Double?, // 51900
            @SerializedName("eth")
            val eth: Double?, // 19.060966
            @SerializedName("eur")
            val eur: Double?, // 41206
            @SerializedName("gbp")
            val gbp: Double?, // 35704
            @SerializedName("gel")
            val gel: Double?, // 120998
            @SerializedName("hkd")
            val hkd: Double?, // 352640
            @SerializedName("huf")
            val huf: Double?, // 15707486
            @SerializedName("idr")
            val idr: Double?, // 700727591
            @SerializedName("ils")
            val ils: Double?, // 164200
            @SerializedName("inr")
            val inr: Double?, // 3759027
            @SerializedName("jpy")
            val jpy: Double?, // 6437271
            @SerializedName("krw")
            val krw: Double?, // 59074767
            @SerializedName("kwd")
            val kwd: Double?, // 13886.0
            @SerializedName("link")
            val link: Double?, // 2933
            @SerializedName("lkr")
            val lkr: Double?, // 14548911
            @SerializedName("ltc")
            val ltc: Double?, // 617.186
            @SerializedName("mmk")
            val mmk: Double?, // 94881814
            @SerializedName("mxn")
            val mxn: Double?, // 768700
            @SerializedName("myr")
            val myr: Double?, // 209331
            @SerializedName("ngn")
            val ngn: Double?, // 39962278
            @SerializedName("nok")
            val nok: Double?, // 467662
            @SerializedName("nzd")
            val nzd: Double?, // 72119
            @SerializedName("php")
            val php: Double?, // 2511701
            @SerializedName("pkr")
            val pkr: Double?, // 12583433
            @SerializedName("pln")
            val pln: Double?, // 179905
            @SerializedName("rub")
            val rub: Double?, // 4121944
            @SerializedName("sar")
            val sar: Double?, // 169318
            @SerializedName("sats")
            val sats: Double?, // 99990378
            @SerializedName("sek")
            val sek: Double?, // 460430
            @SerializedName("sgd")
            val sgd: Double?, // 59884
            @SerializedName("thb")
            val thb: Double?, // 1547735
            @SerializedName("try")
            val tryX: Double?, // 1344423
            @SerializedName("twd")
            val twd: Double?, // 1398582
            @SerializedName("uah")
            val uah: Double?, // 1723971
            @SerializedName("usd")
            val usd: Double?, // 45148
            @SerializedName("vef")
            val vef: Double?, // 4520.72
            @SerializedName("vnd")
            val vnd: Double?, // 1100779981
            @SerializedName("xag")
            val xag: Double?, // 1921.4
            @SerializedName("xau")
            val xau: Double?, // 21.9
            @SerializedName("xdr")
            val xdr: Double?, // 33676
            @SerializedName("xlm")
            val xlm: Double?, // 344819
            @SerializedName("xrp")
            val xrp: Double?, // 71480
            @SerializedName("yfi")
            val yfi: Double?, // 5.473424
            @SerializedName("zar")
            val zar: Double? // 838620
        )

        data class AthChangePercentage(
            @SerializedName("aed")
            val aed: Double?, // -34.59629
            @SerializedName("ars")
            val ars: Double?, // -1.41673
            @SerializedName("aud")
            val aud: Double?, // -28.49289
            @SerializedName("bch")
            val bch: Double?, // -36.45846
            @SerializedName("bdt")
            val bdt: Double?, // -16.2401
            @SerializedName("bhd")
            val bhd: Double?, // -34.61402
            @SerializedName("bits")
            val bits: Double?, // -5.50826
            @SerializedName("bmd")
            val bmd: Double?, // -34.59095
            @SerializedName("bnb")
            val bnb: Double?, // -99.90091
            @SerializedName("brl")
            val brl: Double?, // -41.56351
            @SerializedName("btc")
            val btc: Double?, // -0.32896
            @SerializedName("cad")
            val cad: Double?, // -29.73657
            @SerializedName("chf")
            val chf: Double?, // -39.04023
            @SerializedName("clp")
            val clp: Double?, // -27.55219
            @SerializedName("cny")
            val cny: Double?, // -27.30484
            @SerializedName("czk")
            val czk: Double?, // -32.49695
            @SerializedName("dkk")
            val dkk: Double?, // -30.79768
            @SerializedName("dot")
            val dot: Double?, // -35.53234
            @SerializedName("eos")
            val eos: Double?, // -14.03241
            @SerializedName("eth")
            val eth: Double?, // -96.94604
            @SerializedName("eur")
            val eur: Double?, // -30.97753
            @SerializedName("gbp")
            val gbp: Double?, // -30.0155
            @SerializedName("gel")
            val gel: Double?, // -1.7282
            @SerializedName("hkd")
            val hkd: Double?, // -34.41814
            @SerializedName("huf")
            val huf: Double?, // -27.50539
            @SerializedName("idr")
            val idr: Double?, // -28.77562
            @SerializedName("ils")
            val ils: Double?, // -24.00576
            @SerializedName("inr")
            val inr: Double?, // -26.68034
            @SerializedName("jpy")
            val jpy: Double?, // -17.75087
            @SerializedName("krw")
            val krw: Double?, // -27.35122
            @SerializedName("kwd")
            val kwd: Double?, // -33.32249
            @SerializedName("link")
            val link: Double?, // -96.08327
            @SerializedName("lkr")
            val lkr: Double?, // -2.31971
            @SerializedName("ltc")
            val ltc: Double?, // -2.0101
            @SerializedName("mmk")
            val mmk: Double?, // -24.95701
            @SerializedName("mxn")
            val mxn: Double?, // -45.43735
            @SerializedName("myr")
            val myr: Double?, // -26.98469
            @SerializedName("ngn")
            val ngn: Double?, // -3.07463
            @SerializedName("nok")
            val nok: Double?, // -20.95056
            @SerializedName("nzd")
            val nzd: Double?, // -25.65202
            @SerializedName("php")
            val php: Double?, // -27.27636
            @SerializedName("pkr")
            val pkr: Double?, // -1.6397
            @SerializedName("pln")
            val pln: Double?, // -34.68141
            @SerializedName("rub")
            val rub: Double?, // -32.13515
            @SerializedName("sar")
            val sar: Double?, // -34.59157
            @SerializedName("sats")
            val sats: Double?, // -5.50826
            @SerializedName("sek")
            val sek: Double?, // -22.7691
            @SerializedName("sgd")
            val sgd: Double?, // -34.26249
            @SerializedName("thb")
            val thb: Double?, // -31.45367
            @SerializedName("try")
            val tryX: Double?, // -1.30218
            @SerializedName("twd")
            val twd: Double?, // -26.91657
            @SerializedName("uah")
            val uah: Double?, // -5.03053
            @SerializedName("usd")
            val usd: Double?, // -34.59095
            @SerializedName("vef")
            val vef: Double?, // -99.99995
            @SerializedName("vnd")
            val vnd: Double?, // -29.56795
            @SerializedName("xag")
            val xag: Double?, // -31.72636
            @SerializedName("xau")
            val xau: Double?, // -41.91145
            @SerializedName("xdr")
            val xdr: Double?, // -31.13238
            @SerializedName("xlm")
            val xlm: Double?, // -5.02106
            @SerializedName("xrp")
            val xrp: Double?, // -55.12889
            @SerializedName("yfi")
            val yfi: Double?, // -52.77858
            @SerializedName("zar")
            val zar: Double? // -20.63968
        )

        data class AthDate(
            @SerializedName("aed")
            val aed: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("ars")
            val ars: String?, // 2024-01-02T14:15:25.538Z
            @SerializedName("aud")
            val aud: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("bch")
            val bch: String?, // 2023-06-10T04:30:21.139Z
            @SerializedName("bdt")
            val bdt: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("bhd")
            val bhd: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("bits")
            val bits: String?, // 2021-05-19T16:00:11.072Z
            @SerializedName("bmd")
            val bmd: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("bnb")
            val bnb: String?, // 2017-10-19T00:00:00.000Z
            @SerializedName("brl")
            val brl: String?, // 2021-11-09T04:09:45.771Z
            @SerializedName("btc")
            val btc: String?, // 2019-10-15T16:00:56.136Z
            @SerializedName("cad")
            val cad: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("chf")
            val chf: String?, // 2021-11-10T17:30:22.767Z
            @SerializedName("clp")
            val clp: String?, // 2021-11-09T04:09:45.771Z
            @SerializedName("cny")
            val cny: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("czk")
            val czk: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("dkk")
            val dkk: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("dot")
            val dot: String?, // 2023-10-27T11:45:24.509Z
            @SerializedName("eos")
            val eos: String?, // 2023-12-06T05:40:04.442Z
            @SerializedName("eth")
            val eth: String?, // 2015-10-20T00:00:00.000Z
            @SerializedName("eur")
            val eur: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("gbp")
            val gbp: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("gel")
            val gel: String?, // 2024-01-02T08:25:07.182Z
            @SerializedName("hkd")
            val hkd: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("huf")
            val huf: String?, // 2021-11-10T16:54:53.781Z
            @SerializedName("idr")
            val idr: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("ils")
            val ils: String?, // 2021-10-20T14:54:17.702Z
            @SerializedName("inr")
            val inr: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("jpy")
            val jpy: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("krw")
            val krw: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("kwd")
            val kwd: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("link")
            val link: String?, // 2017-12-12T00:00:00.000Z
            @SerializedName("lkr")
            val lkr: String?, // 2024-01-02T08:25:07.182Z
            @SerializedName("ltc")
            val ltc: String?, // 2023-12-21T01:40:00.676Z
            @SerializedName("mmk")
            val mmk: String?, // 2021-10-20T14:54:17.702Z
            @SerializedName("mxn")
            val mxn: String?, // 2021-11-10T17:30:22.767Z
            @SerializedName("myr")
            val myr: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("ngn")
            val ngn: String?, // 2024-01-02T08:25:07.182Z
            @SerializedName("nok")
            val nok: String?, // 2021-11-10T17:30:22.767Z
            @SerializedName("nzd")
            val nzd: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("php")
            val php: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("pkr")
            val pkr: String?, // 2024-01-02T08:25:07.182Z
            @SerializedName("pln")
            val pln: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("rub")
            val rub: String?, // 2022-03-07T16:43:46.826Z
            @SerializedName("sar")
            val sar: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("sats")
            val sats: String?, // 2021-05-19T16:00:11.072Z
            @SerializedName("sek")
            val sek: String?, // 2021-11-10T17:30:22.767Z
            @SerializedName("sgd")
            val sgd: String?, // 2021-11-09T00:00:00.000Z
            @SerializedName("thb")
            val thb: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("try")
            val tryX: String?, // 2024-01-02T08:25:07.182Z
            @SerializedName("twd")
            val twd: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("uah")
            val uah: String?, // 2021-04-14T06:52:46.198Z
            @SerializedName("usd")
            val usd: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("vef")
            val vef: String?, // 2021-01-03T12:04:17.372Z
            @SerializedName("vnd")
            val vnd: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("xag")
            val xag: String?, // 2021-11-09T04:09:45.771Z
            @SerializedName("xau")
            val xau: String?, // 2021-10-20T14:54:17.702Z
            @SerializedName("xdr")
            val xdr: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("xlm")
            val xlm: String?, // 2023-12-05T22:55:13.824Z
            @SerializedName("xrp")
            val xrp: String?, // 2021-01-03T07:54:40.240Z
            @SerializedName("yfi")
            val yfi: String?, // 2020-07-18T00:00:00.000Z
            @SerializedName("zar")
            val zar: String? // 2021-11-10T17:49:04.400Z
        )

        data class Atl(
            @SerializedName("aed")
            val aed: Double?, // 165821
            @SerializedName("ars")
            val ars: Double?, // 36601458
            @SerializedName("aud")
            val aud: Double?, // 66827
            @SerializedName("bch")
            val bch: Double?, // 171.902
            @SerializedName("bdt")
            val bdt: Double?, // 4958833
            @SerializedName("bhd")
            val bhd: Double?, // 17015.56
            @SerializedName("bits")
            val bits: Double?, // 999904
            @SerializedName("bmd")
            val bmd: Double?, // 45148
            @SerializedName("bnb")
            val bnb: Double?, // 141.748
            @SerializedName("brl")
            val brl: Double?, // 222311
            @SerializedName("btc")
            val btc: Double?, // 1.0
            @SerializedName("cad")
            val cad: Double?, // 60167
            @SerializedName("chf")
            val chf: Double?, // 38389
            @SerializedName("clp")
            val clp: Double?, // 39954411
            @SerializedName("cny")
            val cny: Double?, // 320455
            @SerializedName("czk")
            val czk: Double?, // 1015793
            @SerializedName("dkk")
            val dkk: Double?, // 307262
            @SerializedName("dot")
            val dot: Double?, // 5329
            @SerializedName("eos")
            val eos: Double?, // 51900
            @SerializedName("eth")
            val eth: Double?, // 19.060966
            @SerializedName("eur")
            val eur: Double?, // 41206
            @SerializedName("gbp")
            val gbp: Double?, // 35704
            @SerializedName("gel")
            val gel: Double?, // 120998
            @SerializedName("hkd")
            val hkd: Double?, // 352640
            @SerializedName("huf")
            val huf: Double?, // 15707486
            @SerializedName("idr")
            val idr: Double?, // 700727591
            @SerializedName("ils")
            val ils: Double?, // 164200
            @SerializedName("inr")
            val inr: Double?, // 3759027
            @SerializedName("jpy")
            val jpy: Double?, // 6437271
            @SerializedName("krw")
            val krw: Double?, // 59074767
            @SerializedName("kwd")
            val kwd: Double?, // 13886.0
            @SerializedName("link")
            val link: Double?, // 2933
            @SerializedName("lkr")
            val lkr: Double?, // 14548911
            @SerializedName("ltc")
            val ltc: Double?, // 617.186
            @SerializedName("mmk")
            val mmk: Double?, // 94881814
            @SerializedName("mxn")
            val mxn: Double?, // 768700
            @SerializedName("myr")
            val myr: Double?, // 209331
            @SerializedName("ngn")
            val ngn: Double?, // 39962278
            @SerializedName("nok")
            val nok: Double?, // 467662
            @SerializedName("nzd")
            val nzd: Double?, // 72119
            @SerializedName("php")
            val php: Double?, // 2511701
            @SerializedName("pkr")
            val pkr: Double?, // 12583433
            @SerializedName("pln")
            val pln: Double?, // 179905
            @SerializedName("rub")
            val rub: Double?, // 4121944
            @SerializedName("sar")
            val sar: Double?, // 169318
            @SerializedName("sats")
            val sats: Double?, // 99990378
            @SerializedName("sek")
            val sek: Double?, // 460430
            @SerializedName("sgd")
            val sgd: Double?, // 59884
            @SerializedName("thb")
            val thb: Double?, // 1547735
            @SerializedName("try")
            val tryX: Double?, // 1344423
            @SerializedName("twd")
            val twd: Double?, // 1398582
            @SerializedName("uah")
            val uah: Double?, // 1723971
            @SerializedName("usd")
            val usd: Double?, // 45148
            @SerializedName("vef")
            val vef: Double?, // 4520.72
            @SerializedName("vnd")
            val vnd: Double?, // 1100779981
            @SerializedName("xag")
            val xag: Double?, // 1921.4
            @SerializedName("xau")
            val xau: Double?, // 21.9
            @SerializedName("xdr")
            val xdr: Double?, // 33676
            @SerializedName("xlm")
            val xlm: Double?, // 344819
            @SerializedName("xrp")
            val xrp: Double?, // 71480
            @SerializedName("yfi")
            val yfi: Double?, // 5.473424
            @SerializedName("zar")
            val zar: Double? // 838620
        )

        data class AtlChangePercentage(
            @SerializedName("aed")
            val aed: Double?, // 165821
            @SerializedName("ars")
            val ars: Double?, // 36601458
            @SerializedName("aud")
            val aud: Double?, // 66827
            @SerializedName("bch")
            val bch: Double?, // 171.902
            @SerializedName("bdt")
            val bdt: Double?, // 4958833
            @SerializedName("bhd")
            val bhd: Double?, // 17015.56
            @SerializedName("bits")
            val bits: Double?, // 999904
            @SerializedName("bmd")
            val bmd: Double?, // 45148
            @SerializedName("bnb")
            val bnb: Double?, // 141.748
            @SerializedName("brl")
            val brl: Double?, // 222311
            @SerializedName("btc")
            val btc: Double?, // 1.0
            @SerializedName("cad")
            val cad: Double?, // 60167
            @SerializedName("chf")
            val chf: Double?, // 38389
            @SerializedName("clp")
            val clp: Double?, // 39954411
            @SerializedName("cny")
            val cny: Double?, // 320455
            @SerializedName("czk")
            val czk: Double?, // 1015793
            @SerializedName("dkk")
            val dkk: Double?, // 307262
            @SerializedName("dot")
            val dot: Double?, // 5329
            @SerializedName("eos")
            val eos: Double?, // 51900
            @SerializedName("eth")
            val eth: Double?, // 19.060966
            @SerializedName("eur")
            val eur: Double?, // 41206
            @SerializedName("gbp")
            val gbp: Double?, // 35704
            @SerializedName("gel")
            val gel: Double?, // 120998
            @SerializedName("hkd")
            val hkd: Double?, // 352640
            @SerializedName("huf")
            val huf: Double?, // 15707486
            @SerializedName("idr")
            val idr: Double?, // 700727591
            @SerializedName("ils")
            val ils: Double?, // 164200
            @SerializedName("inr")
            val inr: Double?, // 3759027
            @SerializedName("jpy")
            val jpy: Double?, // 6437271
            @SerializedName("krw")
            val krw: Double?, // 59074767
            @SerializedName("kwd")
            val kwd: Double?, // 13886.0
            @SerializedName("link")
            val link: Double?, // 2933
            @SerializedName("lkr")
            val lkr: Double?, // 14548911
            @SerializedName("ltc")
            val ltc: Double?, // 617.186
            @SerializedName("mmk")
            val mmk: Double?, // 94881814
            @SerializedName("mxn")
            val mxn: Double?, // 768700
            @SerializedName("myr")
            val myr: Double?, // 209331
            @SerializedName("ngn")
            val ngn: Double?, // 39962278
            @SerializedName("nok")
            val nok: Double?, // 467662
            @SerializedName("nzd")
            val nzd: Double?, // 72119
            @SerializedName("php")
            val php: Double?, // 2511701
            @SerializedName("pkr")
            val pkr: Double?, // 12583433
            @SerializedName("pln")
            val pln: Double?, // 179905
            @SerializedName("rub")
            val rub: Double?, // 4121944
            @SerializedName("sar")
            val sar: Double?, // 169318
            @SerializedName("sats")
            val sats: Double?, // 99990378
            @SerializedName("sek")
            val sek: Double?, // 460430
            @SerializedName("sgd")
            val sgd: Double?, // 59884
            @SerializedName("thb")
            val thb: Double?, // 1547735
            @SerializedName("try")
            val tryX: Double?, // 1344423
            @SerializedName("twd")
            val twd: Double?, // 1398582
            @SerializedName("uah")
            val uah: Double?, // 1723971
            @SerializedName("usd")
            val usd: Double?, // 45148
            @SerializedName("vef")
            val vef: Double?, // 4520.72
            @SerializedName("vnd")
            val vnd: Double?, // 1100779981
            @SerializedName("xag")
            val xag: Double?, // 1921.4
            @SerializedName("xau")
            val xau: Double?, // 21.9
            @SerializedName("xdr")
            val xdr: Double?, // 33676
            @SerializedName("xlm")
            val xlm: Double?, // 344819
            @SerializedName("xrp")
            val xrp: Double?, // 71480
            @SerializedName("yfi")
            val yfi: Double?, // 5.473424
            @SerializedName("zar")
            val zar: Double? // 838620
        )

        data class AtlDate(
            @SerializedName("aed")
            val aed: String?, // 2015-01-14T00:00:00.000Z
            @SerializedName("ars")
            val ars: String?, // 2015-01-14T00:00:00.000Z
            @SerializedName("aud")
            val aud: String?, // 2013-07-05T00:00:00.000Z
            @SerializedName("bch")
            val bch: String?, // 2017-08-02T00:00:00.000Z
            @SerializedName("bdt")
            val bdt: String?, // 2013-09-08T00:00:00.000Z
            @SerializedName("bhd")
            val bhd: String?, // 2013-09-08T00:00:00.000Z
            @SerializedName("bits")
            val bits: String?, // 2021-05-19T13:14:13.071Z
            @SerializedName("bmd")
            val bmd: String?, // 2013-09-08T00:00:00.000Z
            @SerializedName("bnb")
            val bnb: String?, // 2022-11-27T02:35:06.345Z
            @SerializedName("brl")
            val brl: String?, // 2013-07-05T00:00:00.000Z
            @SerializedName("btc")
            val btc: String?, // 2019-10-21T00:00:00.000Z
            @SerializedName("cad")
            val cad: String?, // 2013-07-05T00:00:00.000Z
            @SerializedName("chf")
            val chf: String?, // 2013-07-05T00:00:00.000Z
            @SerializedName("clp")
            val clp: String?, // 2015-01-14T00:00:00.000Z
            @SerializedName("cny")
            val cny: String?, // 2013-07-05T00:00:00.000Z
            @SerializedName("czk")
            val czk: String?, // 2015-01-14T00:00:00.000Z
            @SerializedName("dkk")
            val dkk: String?, // 2013-07-05T00:00:00.000Z
            @SerializedName("dot")
            val dot: String?, // 2021-05-19T11:04:48.978Z
            @SerializedName("eos")
            val eos: String?, // 2019-04-11T00:00:00.000Z
            @SerializedName("eth")
            val eth: String?, // 2017-06-12T00:00:00.000Z
            @SerializedName("eur")
            val eur: String?, // 2013-07-05T00:00:00.000Z
            @SerializedName("gbp")
            val gbp: String?, // 2013-07-05T00:00:00.000Z
            @SerializedName("gel")
            val gel: String?, // 2023-12-13T04:20:40.163Z
            @SerializedName("hkd")
            val hkd: String?, // 2013-07-05T00:00:00.000Z
            @SerializedName("huf")
            val huf: String?, // 2015-01-14T00:00:00.000Z
            @SerializedName("idr")
            val idr: String?, // 2013-07-05T00:00:00.000Z
            @SerializedName("ils")
            val ils: String?, // 2015-01-14T00:00:00.000Z
            @SerializedName("inr")
            val inr: String?, // 2013-07-05T00:00:00.000Z
            @SerializedName("jpy")
            val jpy: String?, // 2013-07-05T00:00:00.000Z
            @SerializedName("krw")
            val krw: String?, // 2013-07-05T00:00:00.000Z
            @SerializedName("kwd")
            val kwd: String?, // 2015-01-14T00:00:00.000Z
            @SerializedName("link")
            val link: String?, // 2020-08-16T08:13:13.338Z
            @SerializedName("lkr")
            val lkr: String?, // 2015-01-14T00:00:00.000Z
            @SerializedName("ltc")
            val ltc: String?, // 2013-11-28T00:00:00.000Z
            @SerializedName("mmk")
            val mmk: String?, // 2013-09-08T00:00:00.000Z
            @SerializedName("mxn")
            val mxn: String?, // 2013-07-05T00:00:00.000Z
            @SerializedName("myr")
            val myr: String?, // 2013-07-05T00:00:00.000Z
            @SerializedName("ngn")
            val ngn: String?, // 2013-07-06T00:00:00.000Z
            @SerializedName("nok")
            val nok: String?, // 2015-01-14T00:00:00.000Z
            @SerializedName("nzd")
            val nzd: String?, // 2013-07-05T00:00:00.000Z
            @SerializedName("php")
            val php: String?, // 2013-07-05T00:00:00.000Z
            @SerializedName("pkr")
            val pkr: String?, // 2015-01-14T00:00:00.000Z
            @SerializedName("pln")
            val pln: String?, // 2013-07-05T00:00:00.000Z
            @SerializedName("rub")
            val rub: String?, // 2013-07-05T00:00:00.000Z
            @SerializedName("sar")
            val sar: String?, // 2015-01-14T00:00:00.000Z
            @SerializedName("sats")
            val sats: String?, // 2021-05-19T13:14:13.071Z
            @SerializedName("sek")
            val sek: String?, // 2013-07-05T00:00:00.000Z
            @SerializedName("sgd")
            val sgd: String?, // 2013-07-05T00:00:00.000Z
            @SerializedName("thb")
            val thb: String?, // 2015-01-14T00:00:00.000Z
            @SerializedName("try")
            val tryX: String?, // 2015-01-14T00:00:00.000Z
            @SerializedName("twd")
            val twd: String?, // 2013-07-05T00:00:00.000Z
            @SerializedName("uah")
            val uah: String?, // 2013-07-06T00:00:00.000Z
            @SerializedName("usd")
            val usd: String?, // 2013-07-06T00:00:00.000Z
            @SerializedName("vef")
            val vef: String?, // 2013-09-08T00:00:00.000Z
            @SerializedName("vnd")
            val vnd: String?, // 2015-01-14T00:00:00.000Z
            @SerializedName("xag")
            val xag: String?, // 2013-07-05T00:00:00.000Z
            @SerializedName("xau")
            val xau: String?, // 2013-07-05T00:00:00.000Z
            @SerializedName("xdr")
            val xdr: String?, // 2013-07-05T00:00:00.000Z
            @SerializedName("xlm")
            val xlm: String?, // 2018-11-20T00:00:00.000Z
            @SerializedName("xrp")
            val xrp: String?, // 2018-12-25T00:00:00.000Z
            @SerializedName("yfi")
            val yfi: String?, // 2020-09-12T20:09:36.122Z
            @SerializedName("zar")
            val zar: String? // 2013-07-05T00:00:00.000Z
        )

        data class CurrentPrice(
            @SerializedName("aed")
            val aed: Double?, // 165821
            @SerializedName("ars")
            val ars: Double?, // 36601458
            @SerializedName("aud")
            val aud: Double?, // 66827
            @SerializedName("bch")
            val bch: Double?, // 171.902
            @SerializedName("bdt")
            val bdt: Double?, // 4958833
            @SerializedName("bhd")
            val bhd: Double?, // 17015.56
            @SerializedName("bits")
            val bits: Double?, // 999904
            @SerializedName("bmd")
            val bmd: Double?, // 45148
            @SerializedName("bnb")
            val bnb: Double?, // 141.748
            @SerializedName("brl")
            val brl: Double?, // 222311
            @SerializedName("btc")
            val btc: Double?, // 1.0
            @SerializedName("cad")
            val cad: Double?, // 60167
            @SerializedName("chf")
            val chf: Double?, // 38389
            @SerializedName("clp")
            val clp: Double?, // 39954411
            @SerializedName("cny")
            val cny: Double?, // 320455
            @SerializedName("czk")
            val czk: Double?, // 1015793
            @SerializedName("dkk")
            val dkk: Double?, // 307262
            @SerializedName("dot")
            val dot: Double?, // 5329
            @SerializedName("eos")
            val eos: Double?, // 51900
            @SerializedName("eth")
            val eth: Double?, // 19.060966
            @SerializedName("eur")
            val eur: Double?, // 41206
            @SerializedName("gbp")
            val gbp: Double?, // 35704
            @SerializedName("gel")
            val gel: Double?, // 120998
            @SerializedName("hkd")
            val hkd: Double?, // 352640
            @SerializedName("huf")
            val huf: Double?, // 15707486
            @SerializedName("idr")
            val idr: Double?, // 700727591
            @SerializedName("ils")
            val ils: Double?, // 164200
            @SerializedName("inr")
            val inr: Double?, // 3759027
            @SerializedName("jpy")
            val jpy: Double?, // 6437271
            @SerializedName("krw")
            val krw: Double?, // 59074767
            @SerializedName("kwd")
            val kwd: Double?, // 13886.0
            @SerializedName("link")
            val link: Double?, // 2933
            @SerializedName("lkr")
            val lkr: Double?, // 14548911
            @SerializedName("ltc")
            val ltc: Double?, // 617.186
            @SerializedName("mmk")
            val mmk: Double?, // 94881814
            @SerializedName("mxn")
            val mxn: Double?, // 768700
            @SerializedName("myr")
            val myr: Double?, // 209331
            @SerializedName("ngn")
            val ngn: Double?, // 39962278
            @SerializedName("nok")
            val nok: Double?, // 467662
            @SerializedName("nzd")
            val nzd: Double?, // 72119
            @SerializedName("php")
            val php: Double?, // 2511701
            @SerializedName("pkr")
            val pkr: Double?, // 12583433
            @SerializedName("pln")
            val pln: Double?, // 179905
            @SerializedName("rub")
            val rub: Double?, // 4121944
            @SerializedName("sar")
            val sar: Double?, // 169318
            @SerializedName("sats")
            val sats: Double?, // 99990378
            @SerializedName("sek")
            val sek: Double?, // 460430
            @SerializedName("sgd")
            val sgd: Double?, // 59884
            @SerializedName("thb")
            val thb: Double?, // 1547735
            @SerializedName("try")
            val tryX: Double?, // 1344423
            @SerializedName("twd")
            val twd: Double?, // 1398582
            @SerializedName("uah")
            val uah: Double?, // 1723971
            @SerializedName("usd")
            val usd: Double?, // 45148
            @SerializedName("vef")
            val vef: Double?, // 4520.72
            @SerializedName("vnd")
            val vnd: Double?, // 1100779981
            @SerializedName("xag")
            val xag: Double?, // 1921.4
            @SerializedName("xau")
            val xau: Double?, // 21.9
            @SerializedName("xdr")
            val xdr: Double?, // 33676
            @SerializedName("xlm")
            val xlm: Double?, // 344819
            @SerializedName("xrp")
            val xrp: Double?, // 71480
            @SerializedName("yfi")
            val yfi: Double?, // 5.473424
            @SerializedName("zar")
            val zar: Double? // 838620
        )

        data class FullyDilutedValuation(
            @SerializedName("aed")
            val aed: Double?, // 165821
            @SerializedName("ars")
            val ars: Double?, // 36601458
            @SerializedName("aud")
            val aud: Double?, // 66827
            @SerializedName("bch")
            val bch: Double?, // 171.902
            @SerializedName("bdt")
            val bdt: Double?, // 4958833
            @SerializedName("bhd")
            val bhd: Double?, // 17015.56
            @SerializedName("bits")
            val bits: Double?, // 999904
            @SerializedName("bmd")
            val bmd: Double?, // 45148
            @SerializedName("bnb")
            val bnb: Double?, // 141.748
            @SerializedName("brl")
            val brl: Double?, // 222311
            @SerializedName("btc")
            val btc: Double?, // 1.0
            @SerializedName("cad")
            val cad: Double?, // 60167
            @SerializedName("chf")
            val chf: Double?, // 38389
            @SerializedName("clp")
            val clp: Double?, // 39954411
            @SerializedName("cny")
            val cny: Double?, // 320455
            @SerializedName("czk")
            val czk: Double?, // 1015793
            @SerializedName("dkk")
            val dkk: Double?, // 307262
            @SerializedName("dot")
            val dot: Double?, // 5329
            @SerializedName("eos")
            val eos: Double?, // 51900
            @SerializedName("eth")
            val eth: Double?, // 19.060966
            @SerializedName("eur")
            val eur: Double?, // 41206
            @SerializedName("gbp")
            val gbp: Double?, // 35704
            @SerializedName("gel")
            val gel: Double?, // 120998
            @SerializedName("hkd")
            val hkd: Double?, // 352640
            @SerializedName("huf")
            val huf: Double?, // 15707486
            @SerializedName("idr")
            val idr: Double?, // 700727591
            @SerializedName("ils")
            val ils: Double?, // 164200
            @SerializedName("inr")
            val inr: Double?, // 3759027
            @SerializedName("jpy")
            val jpy: Double?, // 6437271
            @SerializedName("krw")
            val krw: Double?, // 59074767
            @SerializedName("kwd")
            val kwd: Double?, // 13886.0
            @SerializedName("link")
            val link: Double?, // 2933
            @SerializedName("lkr")
            val lkr: Double?, // 14548911
            @SerializedName("ltc")
            val ltc: Double?, // 617.186
            @SerializedName("mmk")
            val mmk: Double?, // 94881814
            @SerializedName("mxn")
            val mxn: Double?, // 768700
            @SerializedName("myr")
            val myr: Double?, // 209331
            @SerializedName("ngn")
            val ngn: Double?, // 39962278
            @SerializedName("nok")
            val nok: Double?, // 467662
            @SerializedName("nzd")
            val nzd: Double?, // 72119
            @SerializedName("php")
            val php: Double?, // 2511701
            @SerializedName("pkr")
            val pkr: Double?, // 12583433
            @SerializedName("pln")
            val pln: Double?, // 179905
            @SerializedName("rub")
            val rub: Double?, // 4121944
            @SerializedName("sar")
            val sar: Double?, // 169318
            @SerializedName("sats")
            val sats: Double?, // 99990378
            @SerializedName("sek")
            val sek: Double?, // 460430
            @SerializedName("sgd")
            val sgd: Double?, // 59884
            @SerializedName("thb")
            val thb: Double?, // 1547735
            @SerializedName("try")
            val tryX: Double?, // 1344423
            @SerializedName("twd")
            val twd: Double?, // 1398582
            @SerializedName("uah")
            val uah: Double?, // 1723971
            @SerializedName("usd")
            val usd: Double?, // 45148
            @SerializedName("vef")
            val vef: Double?, // 4520.72
            @SerializedName("vnd")
            val vnd: Double?, // 1100779981
            @SerializedName("xag")
            val xag: Double?, // 1921.4
            @SerializedName("xau")
            val xau: Double?, // 21.9
            @SerializedName("xdr")
            val xdr: Double?, // 33676
            @SerializedName("xlm")
            val xlm: Double?, // 344819
            @SerializedName("xrp")
            val xrp: Double?, // 71480
            @SerializedName("yfi")
            val yfi: Double?, // 5.473424
            @SerializedName("zar")
            val zar: Double? // 838620
        )

        data class High24h(
            @SerializedName("aed")
            val aed: Double?, // 165821
            @SerializedName("ars")
            val ars: Double?, // 36601458
            @SerializedName("aud")
            val aud: Double?, // 66827
            @SerializedName("bch")
            val bch: Double?, // 171.902
            @SerializedName("bdt")
            val bdt: Double?, // 4958833
            @SerializedName("bhd")
            val bhd: Double?, // 17015.56
            @SerializedName("bits")
            val bits: Double?, // 999904
            @SerializedName("bmd")
            val bmd: Double?, // 45148
            @SerializedName("bnb")
            val bnb: Double?, // 141.748
            @SerializedName("brl")
            val brl: Double?, // 222311
            @SerializedName("btc")
            val btc: Double?, // 1.0
            @SerializedName("cad")
            val cad: Double?, // 60167
            @SerializedName("chf")
            val chf: Double?, // 38389
            @SerializedName("clp")
            val clp: Double?, // 39954411
            @SerializedName("cny")
            val cny: Double?, // 320455
            @SerializedName("czk")
            val czk: Double?, // 1015793
            @SerializedName("dkk")
            val dkk: Double?, // 307262
            @SerializedName("dot")
            val dot: Double?, // 5329
            @SerializedName("eos")
            val eos: Double?, // 51900
            @SerializedName("eth")
            val eth: Double?, // 19.060966
            @SerializedName("eur")
            val eur: Double?, // 41206
            @SerializedName("gbp")
            val gbp: Double?, // 35704
            @SerializedName("gel")
            val gel: Double?, // 120998
            @SerializedName("hkd")
            val hkd: Double?, // 352640
            @SerializedName("huf")
            val huf: Double?, // 15707486
            @SerializedName("idr")
            val idr: Double?, // 700727591
            @SerializedName("ils")
            val ils: Double?, // 164200
            @SerializedName("inr")
            val inr: Double?, // 3759027
            @SerializedName("jpy")
            val jpy: Double?, // 6437271
            @SerializedName("krw")
            val krw: Double?, // 59074767
            @SerializedName("kwd")
            val kwd: Double?, // 13886.0
            @SerializedName("link")
            val link: Double?, // 2933
            @SerializedName("lkr")
            val lkr: Double?, // 14548911
            @SerializedName("ltc")
            val ltc: Double?, // 617.186
            @SerializedName("mmk")
            val mmk: Double?, // 94881814
            @SerializedName("mxn")
            val mxn: Double?, // 768700
            @SerializedName("myr")
            val myr: Double?, // 209331
            @SerializedName("ngn")
            val ngn: Double?, // 39962278
            @SerializedName("nok")
            val nok: Double?, // 467662
            @SerializedName("nzd")
            val nzd: Double?, // 72119
            @SerializedName("php")
            val php: Double?, // 2511701
            @SerializedName("pkr")
            val pkr: Double?, // 12583433
            @SerializedName("pln")
            val pln: Double?, // 179905
            @SerializedName("rub")
            val rub: Double?, // 4121944
            @SerializedName("sar")
            val sar: Double?, // 169318
            @SerializedName("sats")
            val sats: Double?, // 99990378
            @SerializedName("sek")
            val sek: Double?, // 460430
            @SerializedName("sgd")
            val sgd: Double?, // 59884
            @SerializedName("thb")
            val thb: Double?, // 1547735
            @SerializedName("try")
            val tryX: Double?, // 1344423
            @SerializedName("twd")
            val twd: Double?, // 1398582
            @SerializedName("uah")
            val uah: Double?, // 1723971
            @SerializedName("usd")
            val usd: Double?, // 45148
            @SerializedName("vef")
            val vef: Double?, // 4520.72
            @SerializedName("vnd")
            val vnd: Double?, // 1100779981
            @SerializedName("xag")
            val xag: Double?, // 1921.4
            @SerializedName("xau")
            val xau: Double?, // 21.9
            @SerializedName("xdr")
            val xdr: Double?, // 33676
            @SerializedName("xlm")
            val xlm: Double?, // 344819
            @SerializedName("xrp")
            val xrp: Double?, // 71480
            @SerializedName("yfi")
            val yfi: Double?, // 5.473424
            @SerializedName("zar")
            val zar: Double? // 838620
        )

        data class Low24h(
            @SerializedName("aed")
            val aed: Double?, // 165821
            @SerializedName("ars")
            val ars: Double?, // 36601458
            @SerializedName("aud")
            val aud: Double?, // 66827
            @SerializedName("bch")
            val bch: Double?, // 171.902
            @SerializedName("bdt")
            val bdt: Double?, // 4958833
            @SerializedName("bhd")
            val bhd: Double?, // 17015.56
            @SerializedName("bits")
            val bits: Double?, // 999904
            @SerializedName("bmd")
            val bmd: Double?, // 45148
            @SerializedName("bnb")
            val bnb: Double?, // 141.748
            @SerializedName("brl")
            val brl: Double?, // 222311
            @SerializedName("btc")
            val btc: Double?, // 1.0
            @SerializedName("cad")
            val cad: Double?, // 60167
            @SerializedName("chf")
            val chf: Double?, // 38389
            @SerializedName("clp")
            val clp: Double?, // 39954411
            @SerializedName("cny")
            val cny: Double?, // 320455
            @SerializedName("czk")
            val czk: Double?, // 1015793
            @SerializedName("dkk")
            val dkk: Double?, // 307262
            @SerializedName("dot")
            val dot: Double?, // 5329
            @SerializedName("eos")
            val eos: Double?, // 51900
            @SerializedName("eth")
            val eth: Double?, // 19.060966
            @SerializedName("eur")
            val eur: Double?, // 41206
            @SerializedName("gbp")
            val gbp: Double?, // 35704
            @SerializedName("gel")
            val gel: Double?, // 120998
            @SerializedName("hkd")
            val hkd: Double?, // 352640
            @SerializedName("huf")
            val huf: Double?, // 15707486
            @SerializedName("idr")
            val idr: Double?, // 700727591
            @SerializedName("ils")
            val ils: Double?, // 164200
            @SerializedName("inr")
            val inr: Double?, // 3759027
            @SerializedName("jpy")
            val jpy: Double?, // 6437271
            @SerializedName("krw")
            val krw: Double?, // 59074767
            @SerializedName("kwd")
            val kwd: Double?, // 13886.0
            @SerializedName("link")
            val link: Double?, // 2933
            @SerializedName("lkr")
            val lkr: Double?, // 14548911
            @SerializedName("ltc")
            val ltc: Double?, // 617.186
            @SerializedName("mmk")
            val mmk: Double?, // 94881814
            @SerializedName("mxn")
            val mxn: Double?, // 768700
            @SerializedName("myr")
            val myr: Double?, // 209331
            @SerializedName("ngn")
            val ngn: Double?, // 39962278
            @SerializedName("nok")
            val nok: Double?, // 467662
            @SerializedName("nzd")
            val nzd: Double?, // 72119
            @SerializedName("php")
            val php: Double?, // 2511701
            @SerializedName("pkr")
            val pkr: Double?, // 12583433
            @SerializedName("pln")
            val pln: Double?, // 179905
            @SerializedName("rub")
            val rub: Double?, // 4121944
            @SerializedName("sar")
            val sar: Double?, // 169318
            @SerializedName("sats")
            val sats: Double?, // 99990378
            @SerializedName("sek")
            val sek: Double?, // 460430
            @SerializedName("sgd")
            val sgd: Double?, // 59884
            @SerializedName("thb")
            val thb: Double?, // 1547735
            @SerializedName("try")
            val tryX: Double?, // 1344423
            @SerializedName("twd")
            val twd: Double?, // 1398582
            @SerializedName("uah")
            val uah: Double?, // 1723971
            @SerializedName("usd")
            val usd: Double?, // 45148
            @SerializedName("vef")
            val vef: Double?, // 4520.72
            @SerializedName("vnd")
            val vnd: Double?, // 1100779981
            @SerializedName("xag")
            val xag: Double?, // 1921.4
            @SerializedName("xau")
            val xau: Double?, // 21.9
            @SerializedName("xdr")
            val xdr: Double?, // 33676
            @SerializedName("xlm")
            val xlm: Double?, // 344819
            @SerializedName("xrp")
            val xrp: Double?, // 71480
            @SerializedName("yfi")
            val yfi: Double?, // 5.473424
            @SerializedName("zar")
            val zar: Double? // 838620
        )

        data class MarketCap(
            @SerializedName("aed")
            val aed: Double?, // 165821
            @SerializedName("ars")
            val ars: Double?, // 36601458
            @SerializedName("aud")
            val aud: Double?, // 66827
            @SerializedName("bch")
            val bch: Double?, // 171.902
            @SerializedName("bdt")
            val bdt: Double?, // 4958833
            @SerializedName("bhd")
            val bhd: Double?, // 17015.56
            @SerializedName("bits")
            val bits: Double?, // 999904
            @SerializedName("bmd")
            val bmd: Double?, // 45148
            @SerializedName("bnb")
            val bnb: Double?, // 141.748
            @SerializedName("brl")
            val brl: Double?, // 222311
            @SerializedName("btc")
            val btc: Double?, // 1.0
            @SerializedName("cad")
            val cad: Double?, // 60167
            @SerializedName("chf")
            val chf: Double?, // 38389
            @SerializedName("clp")
            val clp: Double?, // 39954411
            @SerializedName("cny")
            val cny: Double?, // 320455
            @SerializedName("czk")
            val czk: Double?, // 1015793
            @SerializedName("dkk")
            val dkk: Double?, // 307262
            @SerializedName("dot")
            val dot: Double?, // 5329
            @SerializedName("eos")
            val eos: Double?, // 51900
            @SerializedName("eth")
            val eth: Double?, // 19.060966
            @SerializedName("eur")
            val eur: Double?, // 41206
            @SerializedName("gbp")
            val gbp: Double?, // 35704
            @SerializedName("gel")
            val gel: Double?, // 120998
            @SerializedName("hkd")
            val hkd: Double?, // 352640
            @SerializedName("huf")
            val huf: Double?, // 15707486
            @SerializedName("idr")
            val idr: Double?, // 700727591
            @SerializedName("ils")
            val ils: Double?, // 164200
            @SerializedName("inr")
            val inr: Double?, // 3759027
            @SerializedName("jpy")
            val jpy: Double?, // 6437271
            @SerializedName("krw")
            val krw: Double?, // 59074767
            @SerializedName("kwd")
            val kwd: Double?, // 13886.0
            @SerializedName("link")
            val link: Double?, // 2933
            @SerializedName("lkr")
            val lkr: Double?, // 14548911
            @SerializedName("ltc")
            val ltc: Double?, // 617.186
            @SerializedName("mmk")
            val mmk: Double?, // 94881814
            @SerializedName("mxn")
            val mxn: Double?, // 768700
            @SerializedName("myr")
            val myr: Double?, // 209331
            @SerializedName("ngn")
            val ngn: Double?, // 39962278
            @SerializedName("nok")
            val nok: Double?, // 467662
            @SerializedName("nzd")
            val nzd: Double?, // 72119
            @SerializedName("php")
            val php: Double?, // 2511701
            @SerializedName("pkr")
            val pkr: Double?, // 12583433
            @SerializedName("pln")
            val pln: Double?, // 179905
            @SerializedName("rub")
            val rub: Double?, // 4121944
            @SerializedName("sar")
            val sar: Double?, // 169318
            @SerializedName("sats")
            val sats: Double?, // 99990378
            @SerializedName("sek")
            val sek: Double?, // 460430
            @SerializedName("sgd")
            val sgd: Double?, // 59884
            @SerializedName("thb")
            val thb: Double?, // 1547735
            @SerializedName("try")
            val tryX: Double?, // 1344423
            @SerializedName("twd")
            val twd: Double?, // 1398582
            @SerializedName("uah")
            val uah: Double?, // 1723971
            @SerializedName("usd")
            val usd: Double?, // 45148
            @SerializedName("vef")
            val vef: Double?, // 4520.72
            @SerializedName("vnd")
            val vnd: Double?, // 1100779981
            @SerializedName("xag")
            val xag: Double?, // 1921.4
            @SerializedName("xau")
            val xau: Double?, // 21.9
            @SerializedName("xdr")
            val xdr: Double?, // 33676
            @SerializedName("xlm")
            val xlm: Double?, // 344819
            @SerializedName("xrp")
            val xrp: Double?, // 71480
            @SerializedName("yfi")
            val yfi: Double?, // 5.473424
            @SerializedName("zar")
            val zar: Double? // 838620
        )

        data class MarketCapChange24hInCurrency(
            @SerializedName("aed")
            val aed: Double?, // 165821
            @SerializedName("ars")
            val ars: Double?, // 36601458
            @SerializedName("aud")
            val aud: Double?, // 66827
            @SerializedName("bch")
            val bch: Double?, // 171.902
            @SerializedName("bdt")
            val bdt: Double?, // 4958833
            @SerializedName("bhd")
            val bhd: Double?, // 17015.56
            @SerializedName("bits")
            val bits: Double?, // 999904
            @SerializedName("bmd")
            val bmd: Double?, // 45148
            @SerializedName("bnb")
            val bnb: Double?, // 141.748
            @SerializedName("brl")
            val brl: Double?, // 222311
            @SerializedName("btc")
            val btc: Double?, // 1.0
            @SerializedName("cad")
            val cad: Double?, // 60167
            @SerializedName("chf")
            val chf: Double?, // 38389
            @SerializedName("clp")
            val clp: Double?, // 39954411
            @SerializedName("cny")
            val cny: Double?, // 320455
            @SerializedName("czk")
            val czk: Double?, // 1015793
            @SerializedName("dkk")
            val dkk: Double?, // 307262
            @SerializedName("dot")
            val dot: Double?, // 5329
            @SerializedName("eos")
            val eos: Double?, // 51900
            @SerializedName("eth")
            val eth: Double?, // 19.060966
            @SerializedName("eur")
            val eur: Double?, // 41206
            @SerializedName("gbp")
            val gbp: Double?, // 35704
            @SerializedName("gel")
            val gel: Double?, // 120998
            @SerializedName("hkd")
            val hkd: Double?, // 352640
            @SerializedName("huf")
            val huf: Double?, // 15707486
            @SerializedName("idr")
            val idr: Double?, // 700727591
            @SerializedName("ils")
            val ils: Double?, // 164200
            @SerializedName("inr")
            val inr: Double?, // 3759027
            @SerializedName("jpy")
            val jpy: Double?, // 6437271
            @SerializedName("krw")
            val krw: Double?, // 59074767
            @SerializedName("kwd")
            val kwd: Double?, // 13886.0
            @SerializedName("link")
            val link: Double?, // 2933
            @SerializedName("lkr")
            val lkr: Double?, // 14548911
            @SerializedName("ltc")
            val ltc: Double?, // 617.186
            @SerializedName("mmk")
            val mmk: Double?, // 94881814
            @SerializedName("mxn")
            val mxn: Double?, // 768700
            @SerializedName("myr")
            val myr: Double?, // 209331
            @SerializedName("ngn")
            val ngn: Double?, // 39962278
            @SerializedName("nok")
            val nok: Double?, // 467662
            @SerializedName("nzd")
            val nzd: Double?, // 72119
            @SerializedName("php")
            val php: Double?, // 2511701
            @SerializedName("pkr")
            val pkr: Double?, // 12583433
            @SerializedName("pln")
            val pln: Double?, // 179905
            @SerializedName("rub")
            val rub: Double?, // 4121944
            @SerializedName("sar")
            val sar: Double?, // 169318
            @SerializedName("sats")
            val sats: Double?, // 99990378
            @SerializedName("sek")
            val sek: Double?, // 460430
            @SerializedName("sgd")
            val sgd: Double?, // 59884
            @SerializedName("thb")
            val thb: Double?, // 1547735
            @SerializedName("try")
            val tryX: Double?, // 1344423
            @SerializedName("twd")
            val twd: Double?, // 1398582
            @SerializedName("uah")
            val uah: Double?, // 1723971
            @SerializedName("usd")
            val usd: Double?, // 45148
            @SerializedName("vef")
            val vef: Double?, // 4520.72
            @SerializedName("vnd")
            val vnd: Double?, // 1100779981
            @SerializedName("xag")
            val xag: Double?, // 1921.4
            @SerializedName("xau")
            val xau: Double?, // 21.9
            @SerializedName("xdr")
            val xdr: Double?, // 33676
            @SerializedName("xlm")
            val xlm: Double?, // 344819
            @SerializedName("xrp")
            val xrp: Double?, // 71480
            @SerializedName("yfi")
            val yfi: Double?, // 5.473424
            @SerializedName("zar")
            val zar: Double? // 838620
        )

        data class MarketCapChangePercentage24hInCurrency(
            @SerializedName("aed")
            val aed: Double?, // 165821
            @SerializedName("ars")
            val ars: Double?, // 36601458
            @SerializedName("aud")
            val aud: Double?, // 66827
            @SerializedName("bch")
            val bch: Double?, // 171.902
            @SerializedName("bdt")
            val bdt: Double?, // 4958833
            @SerializedName("bhd")
            val bhd: Double?, // 17015.56
            @SerializedName("bits")
            val bits: Double?, // 999904
            @SerializedName("bmd")
            val bmd: Double?, // 45148
            @SerializedName("bnb")
            val bnb: Double?, // 141.748
            @SerializedName("brl")
            val brl: Double?, // 222311
            @SerializedName("btc")
            val btc: Double?, // 1.0
            @SerializedName("cad")
            val cad: Double?, // 60167
            @SerializedName("chf")
            val chf: Double?, // 38389
            @SerializedName("clp")
            val clp: Double?, // 39954411
            @SerializedName("cny")
            val cny: Double?, // 320455
            @SerializedName("czk")
            val czk: Double?, // 1015793
            @SerializedName("dkk")
            val dkk: Double?, // 307262
            @SerializedName("dot")
            val dot: Double?, // 5329
            @SerializedName("eos")
            val eos: Double?, // 51900
            @SerializedName("eth")
            val eth: Double?, // 19.060966
            @SerializedName("eur")
            val eur: Double?, // 41206
            @SerializedName("gbp")
            val gbp: Double?, // 35704
            @SerializedName("gel")
            val gel: Double?, // 120998
            @SerializedName("hkd")
            val hkd: Double?, // 352640
            @SerializedName("huf")
            val huf: Double?, // 15707486
            @SerializedName("idr")
            val idr: Double?, // 700727591
            @SerializedName("ils")
            val ils: Double?, // 164200
            @SerializedName("inr")
            val inr: Double?, // 3759027
            @SerializedName("jpy")
            val jpy: Double?, // 6437271
            @SerializedName("krw")
            val krw: Double?, // 59074767
            @SerializedName("kwd")
            val kwd: Double?, // 13886.0
            @SerializedName("link")
            val link: Double?, // 2933
            @SerializedName("lkr")
            val lkr: Double?, // 14548911
            @SerializedName("ltc")
            val ltc: Double?, // 617.186
            @SerializedName("mmk")
            val mmk: Double?, // 94881814
            @SerializedName("mxn")
            val mxn: Double?, // 768700
            @SerializedName("myr")
            val myr: Double?, // 209331
            @SerializedName("ngn")
            val ngn: Double?, // 39962278
            @SerializedName("nok")
            val nok: Double?, // 467662
            @SerializedName("nzd")
            val nzd: Double?, // 72119
            @SerializedName("php")
            val php: Double?, // 2511701
            @SerializedName("pkr")
            val pkr: Double?, // 12583433
            @SerializedName("pln")
            val pln: Double?, // 179905
            @SerializedName("rub")
            val rub: Double?, // 4121944
            @SerializedName("sar")
            val sar: Double?, // 169318
            @SerializedName("sats")
            val sats: Double?, // 99990378
            @SerializedName("sek")
            val sek: Double?, // 460430
            @SerializedName("sgd")
            val sgd: Double?, // 59884
            @SerializedName("thb")
            val thb: Double?, // 1547735
            @SerializedName("try")
            val tryX: Double?, // 1344423
            @SerializedName("twd")
            val twd: Double?, // 1398582
            @SerializedName("uah")
            val uah: Double?, // 1723971
            @SerializedName("usd")
            val usd: Double?, // 45148
            @SerializedName("vef")
            val vef: Double?, // 4520.72
            @SerializedName("vnd")
            val vnd: Double?, // 1100779981
            @SerializedName("xag")
            val xag: Double?, // 1921.4
            @SerializedName("xau")
            val xau: Double?, // 21.9
            @SerializedName("xdr")
            val xdr: Double?, // 33676
            @SerializedName("xlm")
            val xlm: Double?, // 344819
            @SerializedName("xrp")
            val xrp: Double?, // 71480
            @SerializedName("yfi")
            val yfi: Double?, // 5.473424
            @SerializedName("zar")
            val zar: Double? // 838620
        )

        data class PriceChange24hInCurrency(
            @SerializedName("aed")
            val aed: Double?, // 165821
            @SerializedName("ars")
            val ars: Double?, // 36601458
            @SerializedName("aud")
            val aud: Double?, // 66827
            @SerializedName("bch")
            val bch: Double?, // 171.902
            @SerializedName("bdt")
            val bdt: Double?, // 4958833
            @SerializedName("bhd")
            val bhd: Double?, // 17015.56
            @SerializedName("bits")
            val bits: Double?, // 999904
            @SerializedName("bmd")
            val bmd: Double?, // 45148
            @SerializedName("bnb")
            val bnb: Double?, // 141.748
            @SerializedName("brl")
            val brl: Double?, // 222311
            @SerializedName("btc")
            val btc: Double?, // 1.0
            @SerializedName("cad")
            val cad: Double?, // 60167
            @SerializedName("chf")
            val chf: Double?, // 38389
            @SerializedName("clp")
            val clp: Double?, // 39954411
            @SerializedName("cny")
            val cny: Double?, // 320455
            @SerializedName("czk")
            val czk: Double?, // 1015793
            @SerializedName("dkk")
            val dkk: Double?, // 307262
            @SerializedName("dot")
            val dot: Double?, // 5329
            @SerializedName("eos")
            val eos: Double?, // 51900
            @SerializedName("eth")
            val eth: Double?, // 19.060966
            @SerializedName("eur")
            val eur: Double?, // 41206
            @SerializedName("gbp")
            val gbp: Double?, // 35704
            @SerializedName("gel")
            val gel: Double?, // 120998
            @SerializedName("hkd")
            val hkd: Double?, // 352640
            @SerializedName("huf")
            val huf: Double?, // 15707486
            @SerializedName("idr")
            val idr: Double?, // 700727591
            @SerializedName("ils")
            val ils: Double?, // 164200
            @SerializedName("inr")
            val inr: Double?, // 3759027
            @SerializedName("jpy")
            val jpy: Double?, // 6437271
            @SerializedName("krw")
            val krw: Double?, // 59074767
            @SerializedName("kwd")
            val kwd: Double?, // 13886.0
            @SerializedName("link")
            val link: Double?, // 2933
            @SerializedName("lkr")
            val lkr: Double?, // 14548911
            @SerializedName("ltc")
            val ltc: Double?, // 617.186
            @SerializedName("mmk")
            val mmk: Double?, // 94881814
            @SerializedName("mxn")
            val mxn: Double?, // 768700
            @SerializedName("myr")
            val myr: Double?, // 209331
            @SerializedName("ngn")
            val ngn: Double?, // 39962278
            @SerializedName("nok")
            val nok: Double?, // 467662
            @SerializedName("nzd")
            val nzd: Double?, // 72119
            @SerializedName("php")
            val php: Double?, // 2511701
            @SerializedName("pkr")
            val pkr: Double?, // 12583433
            @SerializedName("pln")
            val pln: Double?, // 179905
            @SerializedName("rub")
            val rub: Double?, // 4121944
            @SerializedName("sar")
            val sar: Double?, // 169318
            @SerializedName("sats")
            val sats: Double?, // 99990378
            @SerializedName("sek")
            val sek: Double?, // 460430
            @SerializedName("sgd")
            val sgd: Double?, // 59884
            @SerializedName("thb")
            val thb: Double?, // 1547735
            @SerializedName("try")
            val tryX: Double?, // 1344423
            @SerializedName("twd")
            val twd: Double?, // 1398582
            @SerializedName("uah")
            val uah: Double?, // 1723971
            @SerializedName("usd")
            val usd: Double?, // 45148
            @SerializedName("vef")
            val vef: Double?, // 4520.72
            @SerializedName("vnd")
            val vnd: Double?, // 1100779981
            @SerializedName("xag")
            val xag: Double?, // 1921.4
            @SerializedName("xau")
            val xau: Double?, // 21.9
            @SerializedName("xdr")
            val xdr: Double?, // 33676
            @SerializedName("xlm")
            val xlm: Double?, // 344819
            @SerializedName("xrp")
            val xrp: Double?, // 71480
            @SerializedName("yfi")
            val yfi: Double?, // 5.473424
            @SerializedName("zar")
            val zar: Double? // 838620
        )

        data class PriceChangePercentage14dInCurrency(
            @SerializedName("aed")
            val aed: Double?, // 165821
            @SerializedName("ars")
            val ars: Double?, // 36601458
            @SerializedName("aud")
            val aud: Double?, // 66827
            @SerializedName("bch")
            val bch: Double?, // 171.902
            @SerializedName("bdt")
            val bdt: Double?, // 4958833
            @SerializedName("bhd")
            val bhd: Double?, // 17015.56
            @SerializedName("bits")
            val bits: Double?, // 999904
            @SerializedName("bmd")
            val bmd: Double?, // 45148
            @SerializedName("bnb")
            val bnb: Double?, // 141.748
            @SerializedName("brl")
            val brl: Double?, // 222311
            @SerializedName("btc")
            val btc: Double?, // 1.0
            @SerializedName("cad")
            val cad: Double?, // 60167
            @SerializedName("chf")
            val chf: Double?, // 38389
            @SerializedName("clp")
            val clp: Double?, // 39954411
            @SerializedName("cny")
            val cny: Double?, // 320455
            @SerializedName("czk")
            val czk: Double?, // 1015793
            @SerializedName("dkk")
            val dkk: Double?, // 307262
            @SerializedName("dot")
            val dot: Double?, // 5329
            @SerializedName("eos")
            val eos: Double?, // 51900
            @SerializedName("eth")
            val eth: Double?, // 19.060966
            @SerializedName("eur")
            val eur: Double?, // 41206
            @SerializedName("gbp")
            val gbp: Double?, // 35704
            @SerializedName("gel")
            val gel: Double?, // 120998
            @SerializedName("hkd")
            val hkd: Double?, // 352640
            @SerializedName("huf")
            val huf: Double?, // 15707486
            @SerializedName("idr")
            val idr: Double?, // 700727591
            @SerializedName("ils")
            val ils: Double?, // 164200
            @SerializedName("inr")
            val inr: Double?, // 3759027
            @SerializedName("jpy")
            val jpy: Double?, // 6437271
            @SerializedName("krw")
            val krw: Double?, // 59074767
            @SerializedName("kwd")
            val kwd: Double?, // 13886.0
            @SerializedName("link")
            val link: Double?, // 2933
            @SerializedName("lkr")
            val lkr: Double?, // 14548911
            @SerializedName("ltc")
            val ltc: Double?, // 617.186
            @SerializedName("mmk")
            val mmk: Double?, // 94881814
            @SerializedName("mxn")
            val mxn: Double?, // 768700
            @SerializedName("myr")
            val myr: Double?, // 209331
            @SerializedName("ngn")
            val ngn: Double?, // 39962278
            @SerializedName("nok")
            val nok: Double?, // 467662
            @SerializedName("nzd")
            val nzd: Double?, // 72119
            @SerializedName("php")
            val php: Double?, // 2511701
            @SerializedName("pkr")
            val pkr: Double?, // 12583433
            @SerializedName("pln")
            val pln: Double?, // 179905
            @SerializedName("rub")
            val rub: Double?, // 4121944
            @SerializedName("sar")
            val sar: Double?, // 169318
            @SerializedName("sats")
            val sats: Double?, // 99990378
            @SerializedName("sek")
            val sek: Double?, // 460430
            @SerializedName("sgd")
            val sgd: Double?, // 59884
            @SerializedName("thb")
            val thb: Double?, // 1547735
            @SerializedName("try")
            val tryX: Double?, // 1344423
            @SerializedName("twd")
            val twd: Double?, // 1398582
            @SerializedName("uah")
            val uah: Double?, // 1723971
            @SerializedName("usd")
            val usd: Double?, // 45148
            @SerializedName("vef")
            val vef: Double?, // 4520.72
            @SerializedName("vnd")
            val vnd: Double?, // 1100779981
            @SerializedName("xag")
            val xag: Double?, // 1921.4
            @SerializedName("xau")
            val xau: Double?, // 21.9
            @SerializedName("xdr")
            val xdr: Double?, // 33676
            @SerializedName("xlm")
            val xlm: Double?, // 344819
            @SerializedName("xrp")
            val xrp: Double?, // 71480
            @SerializedName("yfi")
            val yfi: Double?, // 5.473424
            @SerializedName("zar")
            val zar: Double? // 838620
        )

        data class PriceChangePercentage1hInCurrency(
            @SerializedName("aed")
            val aed: Double?, // 165821
            @SerializedName("ars")
            val ars: Double?, // 36601458
            @SerializedName("aud")
            val aud: Double?, // 66827
            @SerializedName("bch")
            val bch: Double?, // 171.902
            @SerializedName("bdt")
            val bdt: Double?, // 4958833
            @SerializedName("bhd")
            val bhd: Double?, // 17015.56
            @SerializedName("bits")
            val bits: Double?, // 999904
            @SerializedName("bmd")
            val bmd: Double?, // 45148
            @SerializedName("bnb")
            val bnb: Double?, // 141.748
            @SerializedName("brl")
            val brl: Double?, // 222311
            @SerializedName("btc")
            val btc: Double?, // 1.0
            @SerializedName("cad")
            val cad: Double?, // 60167
            @SerializedName("chf")
            val chf: Double?, // 38389
            @SerializedName("clp")
            val clp: Double?, // 39954411
            @SerializedName("cny")
            val cny: Double?, // 320455
            @SerializedName("czk")
            val czk: Double?, // 1015793
            @SerializedName("dkk")
            val dkk: Double?, // 307262
            @SerializedName("dot")
            val dot: Double?, // 5329
            @SerializedName("eos")
            val eos: Double?, // 51900
            @SerializedName("eth")
            val eth: Double?, // 19.060966
            @SerializedName("eur")
            val eur: Double?, // 41206
            @SerializedName("gbp")
            val gbp: Double?, // 35704
            @SerializedName("gel")
            val gel: Double?, // 120998
            @SerializedName("hkd")
            val hkd: Double?, // 352640
            @SerializedName("huf")
            val huf: Double?, // 15707486
            @SerializedName("idr")
            val idr: Double?, // 700727591
            @SerializedName("ils")
            val ils: Double?, // 164200
            @SerializedName("inr")
            val inr: Double?, // 3759027
            @SerializedName("jpy")
            val jpy: Double?, // 6437271
            @SerializedName("krw")
            val krw: Double?, // 59074767
            @SerializedName("kwd")
            val kwd: Double?, // 13886.0
            @SerializedName("link")
            val link: Double?, // 2933
            @SerializedName("lkr")
            val lkr: Double?, // 14548911
            @SerializedName("ltc")
            val ltc: Double?, // 617.186
            @SerializedName("mmk")
            val mmk: Double?, // 94881814
            @SerializedName("mxn")
            val mxn: Double?, // 768700
            @SerializedName("myr")
            val myr: Double?, // 209331
            @SerializedName("ngn")
            val ngn: Double?, // 39962278
            @SerializedName("nok")
            val nok: Double?, // 467662
            @SerializedName("nzd")
            val nzd: Double?, // 72119
            @SerializedName("php")
            val php: Double?, // 2511701
            @SerializedName("pkr")
            val pkr: Double?, // 12583433
            @SerializedName("pln")
            val pln: Double?, // 179905
            @SerializedName("rub")
            val rub: Double?, // 4121944
            @SerializedName("sar")
            val sar: Double?, // 169318
            @SerializedName("sats")
            val sats: Double?, // 99990378
            @SerializedName("sek")
            val sek: Double?, // 460430
            @SerializedName("sgd")
            val sgd: Double?, // 59884
            @SerializedName("thb")
            val thb: Double?, // 1547735
            @SerializedName("try")
            val tryX: Double?, // 1344423
            @SerializedName("twd")
            val twd: Double?, // 1398582
            @SerializedName("uah")
            val uah: Double?, // 1723971
            @SerializedName("usd")
            val usd: Double?, // 45148
            @SerializedName("vef")
            val vef: Double?, // 4520.72
            @SerializedName("vnd")
            val vnd: Double?, // 1100779981
            @SerializedName("xag")
            val xag: Double?, // 1921.4
            @SerializedName("xau")
            val xau: Double?, // 21.9
            @SerializedName("xdr")
            val xdr: Double?, // 33676
            @SerializedName("xlm")
            val xlm: Double?, // 344819
            @SerializedName("xrp")
            val xrp: Double?, // 71480
            @SerializedName("yfi")
            val yfi: Double?, // 5.473424
            @SerializedName("zar")
            val zar: Double? // 838620
        )

        data class PriceChangePercentage1yInCurrency(
            @SerializedName("aed")
            val aed: Double?, // 165821
            @SerializedName("ars")
            val ars: Double?, // 36601458
            @SerializedName("aud")
            val aud: Double?, // 66827
            @SerializedName("bch")
            val bch: Double?, // 171.902
            @SerializedName("bdt")
            val bdt: Double?, // 4958833
            @SerializedName("bhd")
            val bhd: Double?, // 17015.56
            @SerializedName("bits")
            val bits: Double?, // 999904
            @SerializedName("bmd")
            val bmd: Double?, // 45148
            @SerializedName("bnb")
            val bnb: Double?, // 141.748
            @SerializedName("brl")
            val brl: Double?, // 222311
            @SerializedName("btc")
            val btc: Double?, // 1.0
            @SerializedName("cad")
            val cad: Double?, // 60167
            @SerializedName("chf")
            val chf: Double?, // 38389
            @SerializedName("clp")
            val clp: Double?, // 39954411
            @SerializedName("cny")
            val cny: Double?, // 320455
            @SerializedName("czk")
            val czk: Double?, // 1015793
            @SerializedName("dkk")
            val dkk: Double?, // 307262
            @SerializedName("dot")
            val dot: Double?, // 5329
            @SerializedName("eos")
            val eos: Double?, // 51900
            @SerializedName("eth")
            val eth: Double?, // 19.060966
            @SerializedName("eur")
            val eur: Double?, // 41206
            @SerializedName("gbp")
            val gbp: Double?, // 35704
            @SerializedName("gel")
            val gel: Double?, // 120998
            @SerializedName("hkd")
            val hkd: Double?, // 352640
            @SerializedName("huf")
            val huf: Double?, // 15707486
            @SerializedName("idr")
            val idr: Double?, // 700727591
            @SerializedName("ils")
            val ils: Double?, // 164200
            @SerializedName("inr")
            val inr: Double?, // 3759027
            @SerializedName("jpy")
            val jpy: Double?, // 6437271
            @SerializedName("krw")
            val krw: Double?, // 59074767
            @SerializedName("kwd")
            val kwd: Double?, // 13886.0
            @SerializedName("link")
            val link: Double?, // 2933
            @SerializedName("lkr")
            val lkr: Double?, // 14548911
            @SerializedName("ltc")
            val ltc: Double?, // 617.186
            @SerializedName("mmk")
            val mmk: Double?, // 94881814
            @SerializedName("mxn")
            val mxn: Double?, // 768700
            @SerializedName("myr")
            val myr: Double?, // 209331
            @SerializedName("ngn")
            val ngn: Double?, // 39962278
            @SerializedName("nok")
            val nok: Double?, // 467662
            @SerializedName("nzd")
            val nzd: Double?, // 72119
            @SerializedName("php")
            val php: Double?, // 2511701
            @SerializedName("pkr")
            val pkr: Double?, // 12583433
            @SerializedName("pln")
            val pln: Double?, // 179905
            @SerializedName("rub")
            val rub: Double?, // 4121944
            @SerializedName("sar")
            val sar: Double?, // 169318
            @SerializedName("sats")
            val sats: Double?, // 99990378
            @SerializedName("sek")
            val sek: Double?, // 460430
            @SerializedName("sgd")
            val sgd: Double?, // 59884
            @SerializedName("thb")
            val thb: Double?, // 1547735
            @SerializedName("try")
            val tryX: Double?, // 1344423
            @SerializedName("twd")
            val twd: Double?, // 1398582
            @SerializedName("uah")
            val uah: Double?, // 1723971
            @SerializedName("usd")
            val usd: Double?, // 45148
            @SerializedName("vef")
            val vef: Double?, // 4520.72
            @SerializedName("vnd")
            val vnd: Double?, // 1100779981
            @SerializedName("xag")
            val xag: Double?, // 1921.4
            @SerializedName("xau")
            val xau: Double?, // 21.9
            @SerializedName("xdr")
            val xdr: Double?, // 33676
            @SerializedName("xlm")
            val xlm: Double?, // 344819
            @SerializedName("xrp")
            val xrp: Double?, // 71480
            @SerializedName("yfi")
            val yfi: Double?, // 5.473424
            @SerializedName("zar")
            val zar: Double? // 838620
        )

        data class PriceChangePercentage200dInCurrency(
            @SerializedName("aed")
            val aed: Double?, // 165821
            @SerializedName("ars")
            val ars: Double?, // 36601458
            @SerializedName("aud")
            val aud: Double?, // 66827
            @SerializedName("bch")
            val bch: Double?, // 171.902
            @SerializedName("bdt")
            val bdt: Double?, // 4958833
            @SerializedName("bhd")
            val bhd: Double?, // 17015.56
            @SerializedName("bits")
            val bits: Double?, // 999904
            @SerializedName("bmd")
            val bmd: Double?, // 45148
            @SerializedName("bnb")
            val bnb: Double?, // 141.748
            @SerializedName("brl")
            val brl: Double?, // 222311
            @SerializedName("btc")
            val btc: Double?, // 1.0
            @SerializedName("cad")
            val cad: Double?, // 60167
            @SerializedName("chf")
            val chf: Double?, // 38389
            @SerializedName("clp")
            val clp: Double?, // 39954411
            @SerializedName("cny")
            val cny: Double?, // 320455
            @SerializedName("czk")
            val czk: Double?, // 1015793
            @SerializedName("dkk")
            val dkk: Double?, // 307262
            @SerializedName("dot")
            val dot: Double?, // 5329
            @SerializedName("eos")
            val eos: Double?, // 51900
            @SerializedName("eth")
            val eth: Double?, // 19.060966
            @SerializedName("eur")
            val eur: Double?, // 41206
            @SerializedName("gbp")
            val gbp: Double?, // 35704
            @SerializedName("gel")
            val gel: Double?, // 120998
            @SerializedName("hkd")
            val hkd: Double?, // 352640
            @SerializedName("huf")
            val huf: Double?, // 15707486
            @SerializedName("idr")
            val idr: Double?, // 700727591
            @SerializedName("ils")
            val ils: Double?, // 164200
            @SerializedName("inr")
            val inr: Double?, // 3759027
            @SerializedName("jpy")
            val jpy: Double?, // 6437271
            @SerializedName("krw")
            val krw: Double?, // 59074767
            @SerializedName("kwd")
            val kwd: Double?, // 13886.0
            @SerializedName("link")
            val link: Double?, // 2933
            @SerializedName("lkr")
            val lkr: Double?, // 14548911
            @SerializedName("ltc")
            val ltc: Double?, // 617.186
            @SerializedName("mmk")
            val mmk: Double?, // 94881814
            @SerializedName("mxn")
            val mxn: Double?, // 768700
            @SerializedName("myr")
            val myr: Double?, // 209331
            @SerializedName("ngn")
            val ngn: Double?, // 39962278
            @SerializedName("nok")
            val nok: Double?, // 467662
            @SerializedName("nzd")
            val nzd: Double?, // 72119
            @SerializedName("php")
            val php: Double?, // 2511701
            @SerializedName("pkr")
            val pkr: Double?, // 12583433
            @SerializedName("pln")
            val pln: Double?, // 179905
            @SerializedName("rub")
            val rub: Double?, // 4121944
            @SerializedName("sar")
            val sar: Double?, // 169318
            @SerializedName("sats")
            val sats: Double?, // 99990378
            @SerializedName("sek")
            val sek: Double?, // 460430
            @SerializedName("sgd")
            val sgd: Double?, // 59884
            @SerializedName("thb")
            val thb: Double?, // 1547735
            @SerializedName("try")
            val tryX: Double?, // 1344423
            @SerializedName("twd")
            val twd: Double?, // 1398582
            @SerializedName("uah")
            val uah: Double?, // 1723971
            @SerializedName("usd")
            val usd: Double?, // 45148
            @SerializedName("vef")
            val vef: Double?, // 4520.72
            @SerializedName("vnd")
            val vnd: Double?, // 1100779981
            @SerializedName("xag")
            val xag: Double?, // 1921.4
            @SerializedName("xau")
            val xau: Double?, // 21.9
            @SerializedName("xdr")
            val xdr: Double?, // 33676
            @SerializedName("xlm")
            val xlm: Double?, // 344819
            @SerializedName("xrp")
            val xrp: Double?, // 71480
            @SerializedName("yfi")
            val yfi: Double?, // 5.473424
            @SerializedName("zar")
            val zar: Double? // 838620
        )

        data class PriceChangePercentage24hInCurrency(
            @SerializedName("aed")
            val aed: Double?, // 165821
            @SerializedName("ars")
            val ars: Double?, // 36601458
            @SerializedName("aud")
            val aud: Double?, // 66827
            @SerializedName("bch")
            val bch: Double?, // 171.902
            @SerializedName("bdt")
            val bdt: Double?, // 4958833
            @SerializedName("bhd")
            val bhd: Double?, // 17015.56
            @SerializedName("bits")
            val bits: Double?, // 999904
            @SerializedName("bmd")
            val bmd: Double?, // 45148
            @SerializedName("bnb")
            val bnb: Double?, // 141.748
            @SerializedName("brl")
            val brl: Double?, // 222311
            @SerializedName("btc")
            val btc: Double?, // 1.0
            @SerializedName("cad")
            val cad: Double?, // 60167
            @SerializedName("chf")
            val chf: Double?, // 38389
            @SerializedName("clp")
            val clp: Double?, // 39954411
            @SerializedName("cny")
            val cny: Double?, // 320455
            @SerializedName("czk")
            val czk: Double?, // 1015793
            @SerializedName("dkk")
            val dkk: Double?, // 307262
            @SerializedName("dot")
            val dot: Double?, // 5329
            @SerializedName("eos")
            val eos: Double?, // 51900
            @SerializedName("eth")
            val eth: Double?, // 19.060966
            @SerializedName("eur")
            val eur: Double?, // 41206
            @SerializedName("gbp")
            val gbp: Double?, // 35704
            @SerializedName("gel")
            val gel: Double?, // 120998
            @SerializedName("hkd")
            val hkd: Double?, // 352640
            @SerializedName("huf")
            val huf: Double?, // 15707486
            @SerializedName("idr")
            val idr: Double?, // 700727591
            @SerializedName("ils")
            val ils: Double?, // 164200
            @SerializedName("inr")
            val inr: Double?, // 3759027
            @SerializedName("jpy")
            val jpy: Double?, // 6437271
            @SerializedName("krw")
            val krw: Double?, // 59074767
            @SerializedName("kwd")
            val kwd: Double?, // 13886.0
            @SerializedName("link")
            val link: Double?, // 2933
            @SerializedName("lkr")
            val lkr: Double?, // 14548911
            @SerializedName("ltc")
            val ltc: Double?, // 617.186
            @SerializedName("mmk")
            val mmk: Double?, // 94881814
            @SerializedName("mxn")
            val mxn: Double?, // 768700
            @SerializedName("myr")
            val myr: Double?, // 209331
            @SerializedName("ngn")
            val ngn: Double?, // 39962278
            @SerializedName("nok")
            val nok: Double?, // 467662
            @SerializedName("nzd")
            val nzd: Double?, // 72119
            @SerializedName("php")
            val php: Double?, // 2511701
            @SerializedName("pkr")
            val pkr: Double?, // 12583433
            @SerializedName("pln")
            val pln: Double?, // 179905
            @SerializedName("rub")
            val rub: Double?, // 4121944
            @SerializedName("sar")
            val sar: Double?, // 169318
            @SerializedName("sats")
            val sats: Double?, // 99990378
            @SerializedName("sek")
            val sek: Double?, // 460430
            @SerializedName("sgd")
            val sgd: Double?, // 59884
            @SerializedName("thb")
            val thb: Double?, // 1547735
            @SerializedName("try")
            val tryX: Double?, // 1344423
            @SerializedName("twd")
            val twd: Double?, // 1398582
            @SerializedName("uah")
            val uah: Double?, // 1723971
            @SerializedName("usd")
            val usd: Double?, // 45148
            @SerializedName("vef")
            val vef: Double?, // 4520.72
            @SerializedName("vnd")
            val vnd: Double?, // 1100779981
            @SerializedName("xag")
            val xag: Double?, // 1921.4
            @SerializedName("xau")
            val xau: Double?, // 21.9
            @SerializedName("xdr")
            val xdr: Double?, // 33676
            @SerializedName("xlm")
            val xlm: Double?, // 344819
            @SerializedName("xrp")
            val xrp: Double?, // 71480
            @SerializedName("yfi")
            val yfi: Double?, // 5.473424
            @SerializedName("zar")
            val zar: Double? // 838620
        )

        data class PriceChangePercentage30dInCurrency(
            @SerializedName("aed")
            val aed: Double?, // 165821
            @SerializedName("ars")
            val ars: Double?, // 36601458
            @SerializedName("aud")
            val aud: Double?, // 66827
            @SerializedName("bch")
            val bch: Double?, // 171.902
            @SerializedName("bdt")
            val bdt: Double?, // 4958833
            @SerializedName("bhd")
            val bhd: Double?, // 17015.56
            @SerializedName("bits")
            val bits: Double?, // 999904
            @SerializedName("bmd")
            val bmd: Double?, // 45148
            @SerializedName("bnb")
            val bnb: Double?, // 141.748
            @SerializedName("brl")
            val brl: Double?, // 222311
            @SerializedName("btc")
            val btc: Double?, // 1.0
            @SerializedName("cad")
            val cad: Double?, // 60167
            @SerializedName("chf")
            val chf: Double?, // 38389
            @SerializedName("clp")
            val clp: Double?, // 39954411
            @SerializedName("cny")
            val cny: Double?, // 320455
            @SerializedName("czk")
            val czk: Double?, // 1015793
            @SerializedName("dkk")
            val dkk: Double?, // 307262
            @SerializedName("dot")
            val dot: Double?, // 5329
            @SerializedName("eos")
            val eos: Double?, // 51900
            @SerializedName("eth")
            val eth: Double?, // 19.060966
            @SerializedName("eur")
            val eur: Double?, // 41206
            @SerializedName("gbp")
            val gbp: Double?, // 35704
            @SerializedName("gel")
            val gel: Double?, // 120998
            @SerializedName("hkd")
            val hkd: Double?, // 352640
            @SerializedName("huf")
            val huf: Double?, // 15707486
            @SerializedName("idr")
            val idr: Double?, // 700727591
            @SerializedName("ils")
            val ils: Double?, // 164200
            @SerializedName("inr")
            val inr: Double?, // 3759027
            @SerializedName("jpy")
            val jpy: Double?, // 6437271
            @SerializedName("krw")
            val krw: Double?, // 59074767
            @SerializedName("kwd")
            val kwd: Double?, // 13886.0
            @SerializedName("link")
            val link: Double?, // 2933
            @SerializedName("lkr")
            val lkr: Double?, // 14548911
            @SerializedName("ltc")
            val ltc: Double?, // 617.186
            @SerializedName("mmk")
            val mmk: Double?, // 94881814
            @SerializedName("mxn")
            val mxn: Double?, // 768700
            @SerializedName("myr")
            val myr: Double?, // 209331
            @SerializedName("ngn")
            val ngn: Double?, // 39962278
            @SerializedName("nok")
            val nok: Double?, // 467662
            @SerializedName("nzd")
            val nzd: Double?, // 72119
            @SerializedName("php")
            val php: Double?, // 2511701
            @SerializedName("pkr")
            val pkr: Double?, // 12583433
            @SerializedName("pln")
            val pln: Double?, // 179905
            @SerializedName("rub")
            val rub: Double?, // 4121944
            @SerializedName("sar")
            val sar: Double?, // 169318
            @SerializedName("sats")
            val sats: Double?, // 99990378
            @SerializedName("sek")
            val sek: Double?, // 460430
            @SerializedName("sgd")
            val sgd: Double?, // 59884
            @SerializedName("thb")
            val thb: Double?, // 1547735
            @SerializedName("try")
            val tryX: Double?, // 1344423
            @SerializedName("twd")
            val twd: Double?, // 1398582
            @SerializedName("uah")
            val uah: Double?, // 1723971
            @SerializedName("usd")
            val usd: Double?, // 45148
            @SerializedName("vef")
            val vef: Double?, // 4520.72
            @SerializedName("vnd")
            val vnd: Double?, // 1100779981
            @SerializedName("xag")
            val xag: Double?, // 1921.4
            @SerializedName("xau")
            val xau: Double?, // 21.9
            @SerializedName("xdr")
            val xdr: Double?, // 33676
            @SerializedName("xlm")
            val xlm: Double?, // 344819
            @SerializedName("xrp")
            val xrp: Double?, // 71480
            @SerializedName("yfi")
            val yfi: Double?, // 5.473424
            @SerializedName("zar")
            val zar: Double? // 838620
        )

        data class PriceChangePercentage60dInCurrency(
            @SerializedName("aed")
            val aed: Double?, // 165821
            @SerializedName("ars")
            val ars: Double?, // 36601458
            @SerializedName("aud")
            val aud: Double?, // 66827
            @SerializedName("bch")
            val bch: Double?, // 171.902
            @SerializedName("bdt")
            val bdt: Double?, // 4958833
            @SerializedName("bhd")
            val bhd: Double?, // 17015.56
            @SerializedName("bits")
            val bits: Double?, // 999904
            @SerializedName("bmd")
            val bmd: Double?, // 45148
            @SerializedName("bnb")
            val bnb: Double?, // 141.748
            @SerializedName("brl")
            val brl: Double?, // 222311
            @SerializedName("btc")
            val btc: Double?, // 1.0
            @SerializedName("cad")
            val cad: Double?, // 60167
            @SerializedName("chf")
            val chf: Double?, // 38389
            @SerializedName("clp")
            val clp: Double?, // 39954411
            @SerializedName("cny")
            val cny: Double?, // 320455
            @SerializedName("czk")
            val czk: Double?, // 1015793
            @SerializedName("dkk")
            val dkk: Double?, // 307262
            @SerializedName("dot")
            val dot: Double?, // 5329
            @SerializedName("eos")
            val eos: Double?, // 51900
            @SerializedName("eth")
            val eth: Double?, // 19.060966
            @SerializedName("eur")
            val eur: Double?, // 41206
            @SerializedName("gbp")
            val gbp: Double?, // 35704
            @SerializedName("gel")
            val gel: Double?, // 120998
            @SerializedName("hkd")
            val hkd: Double?, // 352640
            @SerializedName("huf")
            val huf: Double?, // 15707486
            @SerializedName("idr")
            val idr: Double?, // 700727591
            @SerializedName("ils")
            val ils: Double?, // 164200
            @SerializedName("inr")
            val inr: Double?, // 3759027
            @SerializedName("jpy")
            val jpy: Double?, // 6437271
            @SerializedName("krw")
            val krw: Double?, // 59074767
            @SerializedName("kwd")
            val kwd: Double?, // 13886.0
            @SerializedName("link")
            val link: Double?, // 2933
            @SerializedName("lkr")
            val lkr: Double?, // 14548911
            @SerializedName("ltc")
            val ltc: Double?, // 617.186
            @SerializedName("mmk")
            val mmk: Double?, // 94881814
            @SerializedName("mxn")
            val mxn: Double?, // 768700
            @SerializedName("myr")
            val myr: Double?, // 209331
            @SerializedName("ngn")
            val ngn: Double?, // 39962278
            @SerializedName("nok")
            val nok: Double?, // 467662
            @SerializedName("nzd")
            val nzd: Double?, // 72119
            @SerializedName("php")
            val php: Double?, // 2511701
            @SerializedName("pkr")
            val pkr: Double?, // 12583433
            @SerializedName("pln")
            val pln: Double?, // 179905
            @SerializedName("rub")
            val rub: Double?, // 4121944
            @SerializedName("sar")
            val sar: Double?, // 169318
            @SerializedName("sats")
            val sats: Double?, // 99990378
            @SerializedName("sek")
            val sek: Double?, // 460430
            @SerializedName("sgd")
            val sgd: Double?, // 59884
            @SerializedName("thb")
            val thb: Double?, // 1547735
            @SerializedName("try")
            val tryX: Double?, // 1344423
            @SerializedName("twd")
            val twd: Double?, // 1398582
            @SerializedName("uah")
            val uah: Double?, // 1723971
            @SerializedName("usd")
            val usd: Double?, // 45148
            @SerializedName("vef")
            val vef: Double?, // 4520.72
            @SerializedName("vnd")
            val vnd: Double?, // 1100779981
            @SerializedName("xag")
            val xag: Double?, // 1921.4
            @SerializedName("xau")
            val xau: Double?, // 21.9
            @SerializedName("xdr")
            val xdr: Double?, // 33676
            @SerializedName("xlm")
            val xlm: Double?, // 344819
            @SerializedName("xrp")
            val xrp: Double?, // 71480
            @SerializedName("yfi")
            val yfi: Double?, // 5.473424
            @SerializedName("zar")
            val zar: Double? // 838620
        )

        data class PriceChangePercentage7dInCurrency(
            @SerializedName("aed")
            val aed: Double?, // 165821
            @SerializedName("ars")
            val ars: Double?, // 36601458
            @SerializedName("aud")
            val aud: Double?, // 66827
            @SerializedName("bch")
            val bch: Double?, // 171.902
            @SerializedName("bdt")
            val bdt: Double?, // 4958833
            @SerializedName("bhd")
            val bhd: Double?, // 17015.56
            @SerializedName("bits")
            val bits: Double?, // 999904
            @SerializedName("bmd")
            val bmd: Double?, // 45148
            @SerializedName("bnb")
            val bnb: Double?, // 141.748
            @SerializedName("brl")
            val brl: Double?, // 222311
            @SerializedName("btc")
            val btc: Double?, // 1.0
            @SerializedName("cad")
            val cad: Double?, // 60167
            @SerializedName("chf")
            val chf: Double?, // 38389
            @SerializedName("clp")
            val clp: Double?, // 39954411
            @SerializedName("cny")
            val cny: Double?, // 320455
            @SerializedName("czk")
            val czk: Double?, // 1015793
            @SerializedName("dkk")
            val dkk: Double?, // 307262
            @SerializedName("dot")
            val dot: Double?, // 5329
            @SerializedName("eos")
            val eos: Double?, // 51900
            @SerializedName("eth")
            val eth: Double?, // 19.060966
            @SerializedName("eur")
            val eur: Double?, // 41206
            @SerializedName("gbp")
            val gbp: Double?, // 35704
            @SerializedName("gel")
            val gel: Double?, // 120998
            @SerializedName("hkd")
            val hkd: Double?, // 352640
            @SerializedName("huf")
            val huf: Double?, // 15707486
            @SerializedName("idr")
            val idr: Double?, // 700727591
            @SerializedName("ils")
            val ils: Double?, // 164200
            @SerializedName("inr")
            val inr: Double?, // 3759027
            @SerializedName("jpy")
            val jpy: Double?, // 6437271
            @SerializedName("krw")
            val krw: Double?, // 59074767
            @SerializedName("kwd")
            val kwd: Double?, // 13886.0
            @SerializedName("link")
            val link: Double?, // 2933
            @SerializedName("lkr")
            val lkr: Double?, // 14548911
            @SerializedName("ltc")
            val ltc: Double?, // 617.186
            @SerializedName("mmk")
            val mmk: Double?, // 94881814
            @SerializedName("mxn")
            val mxn: Double?, // 768700
            @SerializedName("myr")
            val myr: Double?, // 209331
            @SerializedName("ngn")
            val ngn: Double?, // 39962278
            @SerializedName("nok")
            val nok: Double?, // 467662
            @SerializedName("nzd")
            val nzd: Double?, // 72119
            @SerializedName("php")
            val php: Double?, // 2511701
            @SerializedName("pkr")
            val pkr: Double?, // 12583433
            @SerializedName("pln")
            val pln: Double?, // 179905
            @SerializedName("rub")
            val rub: Double?, // 4121944
            @SerializedName("sar")
            val sar: Double?, // 169318
            @SerializedName("sats")
            val sats: Double?, // 99990378
            @SerializedName("sek")
            val sek: Double?, // 460430
            @SerializedName("sgd")
            val sgd: Double?, // 59884
            @SerializedName("thb")
            val thb: Double?, // 1547735
            @SerializedName("try")
            val tryX: Double?, // 1344423
            @SerializedName("twd")
            val twd: Double?, // 1398582
            @SerializedName("uah")
            val uah: Double?, // 1723971
            @SerializedName("usd")
            val usd: Double?, // 45148
            @SerializedName("vef")
            val vef: Double?, // 4520.72
            @SerializedName("vnd")
            val vnd: Double?, // 1100779981
            @SerializedName("xag")
            val xag: Double?, // 1921.4
            @SerializedName("xau")
            val xau: Double?, // 21.9
            @SerializedName("xdr")
            val xdr: Double?, // 33676
            @SerializedName("xlm")
            val xlm: Double?, // 344819
            @SerializedName("xrp")
            val xrp: Double?, // 71480
            @SerializedName("yfi")
            val yfi: Double?, // 5.473424
            @SerializedName("zar")
            val zar: Double? // 838620
        )

        data class Sparkline7d(
            @SerializedName("price")
            val price: List<Double?>?
        )

        data class TotalVolume(
            @SerializedName("aed")
            val aed: Long?, // 88857231374
            @SerializedName("ars")
            val ars: Long?, // 19613301505302
            @SerializedName("aud")
            val aud: Long?, // 35810107786
            @SerializedName("bch")
            val bch: Long?, // 92115785
            @SerializedName("bdt")
            val bdt: Long?, // 2657246133558
            @SerializedName("bhd")
            val bhd: Long?, // 9117979024
            @SerializedName("bits")
            val bits: Long?, // 535809644269
            @SerializedName("bmd")
            val bmd: Long?, // 24193321546
            @SerializedName("bnb")
            val bnb: Long?, // 75957294
            @SerializedName("brl")
            val brl: Long?, // 119127915293
            @SerializedName("btc")
            val btc: Long?, // 535810
            @SerializedName("cad")
            val cad: Long?, // 32241423505
            @SerializedName("chf")
            val chf: Long?, // 20571024864
            @SerializedName("clp")
            val clp: Long?, // 21410019062173
            @SerializedName("cny")
            val cny: Long?, // 171719357670
            @SerializedName("czk")
            val czk: Long?, // 544323847932
            @SerializedName("dkk")
            val dkk: Long?, // 164649851374
            @SerializedName("dot")
            val dot: Long?, // 2855420502
            @SerializedName("eos")
            val eos: Long?, // 27811417961
            @SerializedName("eth")
            val eth: Long?, // 10214032
            @SerializedName("eur")
            val eur: Long?, // 22080760709
            @SerializedName("gbp")
            val gbp: Long?, // 19132489965
            @SerializedName("gel")
            val gel: Long?, // 64838101743
            @SerializedName("hkd")
            val hkd: Long?, // 188966074994
            @SerializedName("huf")
            val huf: Long?, // 8417032499709
            @SerializedName("idr")
            val idr: Long?, // 375492731641695
            @SerializedName("ils")
            val ils: Long?, // 87988255651
            @SerializedName("inr")
            val inr: Long?, // 2014316573075
            @SerializedName("jpy")
            val jpy: Long?, // 3449483786038
            @SerializedName("krw")
            val krw: Long?, // 31655875737071
            @SerializedName("kwd")
            val kwd: Long?, // 7440970555
            @SerializedName("link")
            val link: Long?, // 1571724272
            @SerializedName("lkr")
            val lkr: Long?, // 7796196764328
            @SerializedName("ltc")
            val ltc: Long?, // 330725930
            @SerializedName("mmk")
            val mmk: Long?, // 50843483435369
            @SerializedName("mxn")
            val mxn: Long?, // 411916774889
            @SerializedName("myr")
            val myr: Long?, // 112172335348
            @SerializedName("ngn")
            val ngn: Long?, // 21414234700066
            @SerializedName("nok")
            val nok: Long?, // 250601682571
            @SerializedName("nzd")
            val nzd: Long?, // 38645637651
            @SerializedName("php")
            val php: Long?, // 1345922912637
            @SerializedName("pkr")
            val pkr: Long?, // 6742973316964
            @SerializedName("pln")
            val pln: Long?, // 96403926744
            @SerializedName("rub")
            val rub: Long?, // 2208789677078
            @SerializedName("sar")
            val sar: Long?, // 90731028321
            @SerializedName("sats")
            val sats: Long?, // 53580964426884
            @SerializedName("sek")
            val sek: Long?, // 246726589872
            @SerializedName("sgd")
            val sgd: Long?, // 32089779765
            @SerializedName("thb")
            val thb: Long?, // 829371255921
            @SerializedName("try")
            val tryX: Long?, // 720423890334
            @SerializedName("twd")
            val twd: Long?, // 749445835961
            @SerializedName("uah")
            val uah: Long?, // 923809039809
            @SerializedName("usd")
            val usd: Long?, // 24193321546
            @SerializedName("vef")
            val vef: Long?, // 2422477286
            @SerializedName("vnd")
            val vnd: Long?, // 589865287870966
            @SerializedName("xag")
            val xag: Long?, // 1029606072
            @SerializedName("xau")
            val xau: Long?, // 11736422
            @SerializedName("xdr")
            val xdr: Long?, // 18045556608
            @SerializedName("xlm")
            val xlm: Long?, // 184775012954
            @SerializedName("xrp")
            val xrp: Long?, // 38303370612
            @SerializedName("yfi")
            val yfi: Long?, // 2932995
            @SerializedName("zar")
            val zar: Long? // 449383689722
        )
    }

    data class Platforms(
        @SerializedName("")
        val x: String?
    )
}