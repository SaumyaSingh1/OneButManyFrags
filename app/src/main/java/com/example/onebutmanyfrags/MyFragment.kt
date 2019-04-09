package com.example.onebutmanyfrags


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_my.view.*
import java.text.FieldPosition

class MyFragment : Fragment() {

    companion object {
        var myFragment: MyFragment? = null

        fun getInstance(name: String): Fragment? {
            if (myFragment == null) {
                myFragment = MyFragment()
            }
            myFragment.apply {
                val bundle = Bundle()
                bundle.putString("NAME", name)
                this!!.arguments = bundle
            }
            return myFragment
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.tv.text=arguments?.getString("NAME").toString()
    }

}
