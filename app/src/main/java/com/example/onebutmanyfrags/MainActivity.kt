package com.example.onebutmanyfrags

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.view.PagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentList = arrayListOf(
            MyFragment().apply {
                val bundle = Bundle().apply {
                    putString("NAME", "Saumya Singh")
                }
                arguments = bundle
            },
            MyFragment().apply {
                val bundle = Bundle().apply {
                    putString("NAME", "TWINKLE ❤❤")
                }
                arguments = bundle
            }
        )

        val pagerAdapter=PagerAdapter(supportFragmentManager, fragmentList)
        viewpgr.adapter=pagerAdapter



    }
}
