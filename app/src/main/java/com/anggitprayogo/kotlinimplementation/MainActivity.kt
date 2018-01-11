package com.anggitprayogo.kotlinimplementation

import android.os.Bundle
import com.anggitprayogo.kotlinimplementation.Fragment.ItemFragment

class MainActivity : BaseActivity() {

    override fun getActivityTitle() = R.string.app_name

    override val tag = "Main Activity"

    override fun getLayout()= R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val fragment = ItemFragment()
        supportFragmentManager.beginTransaction().add(R.id.fragment_cotainer, fragment).commit()
    }
}
