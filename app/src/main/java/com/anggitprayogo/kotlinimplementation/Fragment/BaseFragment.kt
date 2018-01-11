package com.anggitprayogo.kotlinimplementation.Fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by Anggit on 11/01/2018.
 */
abstract class BaseFragment : Fragment(){

    protected abstract val logTag : String
    protected abstract fun getLayout() : Int

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
        Log.d(logTag," [ ON CREATE VIEW ] ")
        return inflater?.inflate(getLayout(), container,false)
    }

    override fun onPause() {
        super.onPause()
        Log.d(logTag," [ ON PAUSE ] ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(logTag," [ ON RESUME ] ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(logTag," [ ON DESTROY ] ")
    }
}