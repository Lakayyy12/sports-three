package com.application.footballbetting

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Button
import androidx.fragment.app.Fragment
import com.application.footballbetting.Navigator.Companion.openPage
import footballbetting.R

class PlayFragment : Fragment(), View.OnClickListener {

    private var t1: Button? = null
    private var t2: Button? = null
    private var t3: Button? = null
    private var t4: Button? = null
    private var t5: Button? = null

    private var getView: View? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        getView = inflater.inflate(R.layout.fragment_play, container, false)
        initComponents()
        initListener()
        return getView
    }
    private fun initComponents() {
        t1 = getView?.findViewById(R.id.t1)
        t2 = getView?.findViewById(R.id.t2)
        t3 = getView?.findViewById(R.id.t3)
        t4 = getView?.findViewById(R.id.t4)
        t5 = getView?.findViewById(R.id.t5)
    }
    private fun initListener() {
        t1?.setOnClickListener(this)
        t2?.setOnClickListener(this)
        t3?.setOnClickListener(this)
        t4?.setOnClickListener(this)
        t5?.setOnClickListener(this)
    }
    override fun onClick(p0: View?) {
        when (p0?.id){
            R.id.t1 -> {
                openPage(context,
                    PlayTips::class.java,
                    t1?.text.toString(),
                    "${getString(R.string.sbt1)}")
                val animation = AnimationUtils.loadAnimation(context, R.anim.zoom_in)
                p0.startAnimation(animation)
            }

            R.id.t2 -> {
                openPage(context, PlayTips::class.java, t2?.text.toString(), "${getString(R.string.sbt1)}")
                val animation = AnimationUtils.loadAnimation(context, R.anim.zoom_in)
                p0.startAnimation(animation)
            }

            R.id.t3 -> {
                openPage(context,
                    PlayTips::class.java,
                    t3?.text.toString(),
                    "${getString(R.string.sbt1)}")
                val animation = AnimationUtils.loadAnimation(context, R.anim.zoom_in)
                p0.startAnimation(animation)
            }

            R.id.t4 -> {
                openPage(context,
                    PlayTips::class.java,
                    t4?.text.toString(),
                    "${getString(R.string.sbt1)}")
                val animation = AnimationUtils.loadAnimation(context, R.anim.zoom_in)
                p0.startAnimation(animation)
            }

            R.id.t5 -> {
                openPage(context,
                    PlayTips::class.java,
                    t5?.text.toString(),
                    "${getString(R.string.sbt1)}")
                val animation = AnimationUtils.loadAnimation(context, R.anim.zoom_in)
                p0.startAnimation(animation)
            }
        }
    }
}

