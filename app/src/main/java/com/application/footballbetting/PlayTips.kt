package com.application.footballbetting

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import footballbetting.R

class PlayTips : AppCompatActivity() {

    private var title: TextView? = null
    private var content: TextView? = null
    private var cl2: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play_tips)
title = findViewById(R.id.title)
content = findViewById(R.id.content)


title?.text = intent.getStringExtra("title")
content?.text = intent.getStringExtra("content")

        cl2 = findViewById(R.id.cl2)
        cl2?.setOnClickListener{
            onBackPressed()
        }
}
}