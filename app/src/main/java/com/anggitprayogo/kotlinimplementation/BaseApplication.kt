package com.anggitprayogo.kotlinimplementation

import android.app.Application
import android.content.Context

/**
 * Created by Anggit on 10/01/2018.
 */
class BaseApplication : Application(){

    companion object {
        var ctx: Context? = null;
    }

    override fun onCreate() {
        super.onCreate()
        ctx = applicationContext;
    }
}