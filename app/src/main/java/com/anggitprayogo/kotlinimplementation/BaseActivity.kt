package com.anggitprayogo.kotlinimplementation

import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.util.Log
import com.anggitprayogo.kotlinimplementation.R.id.activity_title
import kotlinx.android.synthetic.main.activity_header.*

/**
 * Created by Anggit on 10/01/2018.
 */
abstract class BaseActivity : FragmentActivity() {

    protected abstract val tag : String
    protected abstract fun getLayout() : Int
    protected abstract fun getActivityTitle() : Int

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(getLayout())
        activity_title.setText(getActivityTitle())
        Log.v(tag, " [ON CREATE] ")
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

