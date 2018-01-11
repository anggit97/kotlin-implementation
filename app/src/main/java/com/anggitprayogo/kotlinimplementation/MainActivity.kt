package com.anggitprayogo.kotlinimplementation

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log


class MainActivity : BaseActivity() {

    override fun getActivityTitle() = R.string.app_name

    override val tag = "Main Activity"

    override fun getLayout()= R.layout.activity_main

}
