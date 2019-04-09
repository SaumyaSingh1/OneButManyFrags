package com.example.onebutmanyfrags

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class PagerAdapter( fragmentManager: FragmentManager , private val fragments : List<MyFragment>): FragmentPagerAdapter(fragmentManager){
    override fun getItem(p0: Int): Fragment {
        return fragments[p0]
    }

    override fun getCount(): Int {
    return fragments.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0->return "PAGE 1"
            1-> return "PAGE 2"
            else->return ""
        }
    }


}