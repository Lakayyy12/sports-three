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

class BetFragment : Fragment(), View.OnClickListener {

    private var g1: Button? = null
    private var g2: Button? = null
    private var g3: Button? = null
    private var g4: Button? = null
    private var g5: Button? = null
    private var g6: Button? = null
    private var g7: Button? = null
    private var g8: Button? = null
    private var g9: Button? = null
    private var g10: Button? = null

    private var getView: View? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        // Inflate the layout for this fragment
        getView = inflater.inflate(R.layout.fragment_bet1, container, false)
        initComponents()
        initListener()
        return getView
    }

    private fun initComponents() {
        g1 = getView?.findViewById(R.id.gd1)
        g2 = getView?.findViewById(R.id.gd2)
        g3 = getView?.findViewById(R.id.gd3)
        g4 = getView?.findViewById(R.id.gd4)
        g5 = getView?.findViewById(R.id.gd5)
        g6 = getView?.findViewById(R.id.gd6)
        g7 = getView?.findViewById(R.id.gd7)
        g8 = getView?.findViewById(R.id.gd8)
        g9 = getView?.findViewById(R.id.gd9)
        g10 = getView?.findViewById(R.id.gd10)
    }

    private fun initListener() {
        g1?.setOnClickListener(this)
        g2?.setOnClickListener(this)
        g3?.setOnClickListener(this)
        g4?.setOnClickListener(this)
        g5?.setOnClickListener(this)
        g6?.setOnClickListener(this)
        g7?.setOnClickListener(this)
        g8?.setOnClickListener(this)
        g9?.setOnClickListener(this)
        g10?.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.gd1 -> {
               openPage(context,
                   BetGuide::class.java,
                  g1?.text.toString(),
                   "${getString(R.string.bgt1)} ${getString(R.string.bg1)}")

                val animation = AnimationUtils.loadAnimation(context, R.anim.fade_in)
                p0.startAnimation(animation)
            }

            R.id.gd2 -> {
                openPage(context,
                    BetGuide::class.java,
                    g2?.text.toString(),
                    "${getString(R.string.bgt2)} ${getString(R.string.bg2)}")

                val animation = AnimationUtils.loadAnimation(context, R.anim.fade_in)
                p0.startAnimation(animation)
            }


            R.id.gd3 -> {
                openPage(context,
                    BetGuide::class.java,
                    g3?.text.toString(),
                    "${getString(R.string.bgt3)} ${getString(R.string.bg3)}")

                val animation = AnimationUtils.loadAnimation(context, R.anim.fade_in)
                p0.startAnimation(animation)
            }

            R.id.gd4 -> {
                openPage(context,
                    BetGuide::class.java,
                    g4?.text.toString(),
                    "${getString(R.string.bgt4)} ${getString(R.string.bg4)}")

                val animation = AnimationUtils.loadAnimation(context, R.anim.fade_in)
                p0.startAnimation(animation)
            }

            R.id.gd5 -> {
                openPage(context,
                    BetGuide::class.java,
                    g5?.text.toString(),
                    "${getString(R.string.bgt5)} ${getString(R.string.bg5)}")

                val animation = AnimationUtils.loadAnimation(context, R.anim.fade_in)
                p0.startAnimation(animation)
            }

            R.id.gd6 -> {
                openPage(context,
                    BetGuide::class.java,
                    g6?.text.toString(),
                    "${getString(R.string.bgt6)} ${getString(R.string.bg6)}")

                val animation = AnimationUtils.loadAnimation(context, R.anim.fade_in)
                p0.startAnimation(animation)
            }

            R.id.gd7 -> {
                openPage(context,
                    BetGuide::class.java,
                    g7?.text.toString(),
                    "${getString(R.string.bgt7)} ${getString(R.string.bg7)}")

                val animation = AnimationUtils.loadAnimation(context, R.anim.fade_in)
                p0.startAnimation(animation)
            }

            R.id.gd8 -> {
                openPage(context,
                    BetGuide::class.java,
                    g8?.text.toString(),
                    "${getString(R.string.bgt8)} ${getString(R.string.bg8)}")

                val animation = AnimationUtils.loadAnimation(context, R.anim.fade_in)
                p0.startAnimation(animation)
            }

            R.id.gd9 -> {
                openPage(context,
                    BetGuide::class.java,
                    g9?.text.toString(),
                    "${getString(R.string.bgt9)} ${getString(R.string.bg9)}")

                val animation = AnimationUtils.loadAnimation(context, R.anim.fade_in)
                p0.startAnimation(animation)
            }

            R.id.gd10 -> {
                openPage(context,
                    BetGuide::class.java,
                    g10?.text.toString(),
                    "${getString(R.string.bgt10)} ${getString(R.string.bg10)}")

                val animation = AnimationUtils.loadAnimation(context, R.anim.fade_in)
                p0.startAnimation(animation)
            }
        }
    }
}
