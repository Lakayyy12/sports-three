package com.application.footballbetting

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import footballbetting.R

class LeaguesFragment : Fragment(), View.OnClickListener {

    private var tp1 : TextView? = null
    private var tp2 : TextView? = null
    private var tp3 : TextView? = null
    private var tp4 : TextView? = null

    private var tpView : View? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        tpView = inflater.inflate(R.layout.fragment_leagues, container, false)
        initComponents()
        initListener()

        return tpView
    }
    private fun initComponents(){
        tp1 = tpView?.findViewById(R.id.tp1)
        tp2 = tpView?.findViewById(R.id.tp2)
        tp3 = tpView?.findViewById(R.id.tp3)
        tp4 = tpView?.findViewById(R.id.tp4)
    }
    private fun initListener(){
        tp1?.setOnClickListener(this)
        tp2?.setOnClickListener(this)
        tp3?.setOnClickListener(this)
        tp4?.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.tp1-> Navigator.showContent(context, getString(R.string.tp04))
            R.id.tp2-> Navigator.showContent(context, getString(R.string.tp03))
            R.id.tp3-> Navigator.showContent(context, getString(R.string.tp02))
            R.id.tp4-> Navigator.showContent(context, getString(R.string.tp01))
        }
    }
}