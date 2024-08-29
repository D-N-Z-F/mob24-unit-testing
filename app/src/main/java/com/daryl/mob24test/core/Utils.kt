package com.daryl.mob24test.core

import android.util.Log

object Utils {
    fun debugLog(): (Any) -> Unit = { Log.d("debugging", it.toString()) }
}