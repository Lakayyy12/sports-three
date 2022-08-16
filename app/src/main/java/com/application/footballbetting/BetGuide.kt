package com.application.footballbetting

import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import footballbetting.R

class BetGuide : AppCompatActivity() {

    private var title: TextView? = null
    private var content: TextView? = null
    private var cl1: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bet_guide)
        
        content?.visibility = View.VISIBLE
        val animation = AnimationUtils.loadAnimation(this, R.anim.fade_in)
        content?.startAnimation(animation)

        title = findViewById(R.id.title)
        content = findViewById(R.id.content)

        title?.text = intent.getStringExtra("title")
        content?.text = intent.getStringExtra("content")

        cl1 = findViewById(R.id.cl1)
        cl1?.setOnClickListener{
            onBackPressed()
        }
    }
}