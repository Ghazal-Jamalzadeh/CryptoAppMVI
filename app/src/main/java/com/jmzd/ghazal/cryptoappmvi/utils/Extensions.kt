package com.jmzd.ghazal.cryptoappmvi.utils

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.View
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.core.view.WindowCompat
import androidx.core.view.isVisible
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.request.CachePolicy
import com.google.android.material.snackbar.Snackbar
import com.jmzd.ghazal.cryptoappmvi.R
import java.text.DecimalFormat

fun FragmentActivity.setStatusBarIconsColor(isDark: Boolean) {
    this.window.apply {
        WindowCompat.getInsetsController(this, this.decorView).apply {
            isAppearanceLightStatusBars = isDark
        }
    }
}

fun View.showSnackBar(message: String) {
    Snackbar.make(this, message, Snackbar.LENGTH_SHORT).show()
}

fun ImageView.loadImage(url: String) {
    this.load(url) {
        crossfade(true)
        crossfade(500)
        diskCachePolicy(CachePolicy.ENABLED)
        error(R.drawable.placeholder)
    }
}

fun RecyclerView.setupRecyclerview(myLayoutManager: RecyclerView.LayoutManager, myAdapter: RecyclerView.Adapter<*>) {
    this.apply {
        layoutManager = myLayoutManager
        setHasFixedSize(true)
        adapter = myAdapter
    }
}

fun View.isVisible(isShownLoading: Boolean, container: View) {
    if (isShownLoading) {
        this.isVisible = true
        container.isVisible = false
    } else {
        this.isVisible = false
        container.isVisible = true
    }
}

fun Uri.openBrowser(context: Context) {
    val intent = Intent(Intent.ACTION_VIEW, this)
    ContextCompat.startActivity(context, intent, null)
}

fun Int.moneySeparating(): String {
    return DecimalFormat("#,###.##").format(this)
}

fun List<Double?>?.doublePairs(): List<Pair<String, Float>> {
    return this!!.map {
        val s = it.toString()
        val f = it!!.toFloat()
        Pair(s, f)
    }
}

fun Double.showTwoDecimal(): String {
    return DecimalFormat("##.##").format(this)
}