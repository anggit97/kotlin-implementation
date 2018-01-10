package com.anggitprayogo.kotlinimplementation

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log


class MainActivity : AppCompatActivity() {

    private val tag = BaseApplication.tag

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.v(tag," [ ON CREATE] ")
    }

    override fun onCreate(savedInstanceState: Bundle?, persistableBundle: PersistableBundle?) {
        super.onCreate(savedInstanceState,persistableBundle)
        Log.v(tag," [ ON CREATE 2] ")
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        Log.v(tag," [ ON POSTCREATE] ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.v(tag," [ ON RESTART] ")
    }

    override fun onStart() {
        super.onStart()
        Log.v(tag," [ ON START] ")
    }

    override fun onResume() {
        super.onResume()
        Log.v(tag," [ ON RESUME] ")
    }

    override fun onPostResume() {
        super.onPostResume()
        Log.v(tag," [ ON POSTRESUME] ")
    }

    override fun onPause() {
        super.onPause()
        Log.v(tag," [ ON PAUSE] ")
    }

    override fun onStop() {
        super.onStop()
        Log.v(tag," [ ON STOP] ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v(tag," [ ON DESTROY] ")
    }
}
