package com.anggitprayogo.kotlinimplementation

import android.app.Application
import android.content.Context
import android.util.Log

/**
 * Created by Anggit on 10/01/2018.
 */
class BaseApplication : Application(){

    companion object {
        val tag = "Kotlin"
        var ctx: Context? = null
    }

    override fun onCreate() {
        super.onCreate()
        ctx = applicationContext;
        Log.v(tag,"[ ON CREATE ]")
    }

    override fun onLowMemory() {
        super.onLowMemory()
        Log.w(tag,"[ ON LOW MEMORY ]")
    }

    override fun onTrimMemory(level: Int) {
        super.onTrimMemory(level)
        Log.d(tag,"[ ON LOW MEMORY ]")
    }
}