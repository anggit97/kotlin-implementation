package com.anggitprayogo.kotlinimplementation.Fragment

import com.anggitprayogo.kotlinimplementation.R

/**
 * Created by Anggit on 11/01/2018.
 */
class ItemFragment : BaseFragment(){
    override val logTag = "Items Fragment"

    override fun getLayout(): Int {
        return R.layout.fragment_items
    }
}