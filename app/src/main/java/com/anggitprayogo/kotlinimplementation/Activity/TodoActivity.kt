package com.anggitprayogo.kotlinimplementation.Activity

import com.anggitprayogo.kotlinimplementation.R

/**
 * Created by Anggit on 11/01/2018.
 */
class TodoActivity : ItemActivity(){

    override fun getActivityTitle() = R.string.app_name

    override val tag = "TODO Activity"

    override fun getLayout() = R.layout.activity_todo
}