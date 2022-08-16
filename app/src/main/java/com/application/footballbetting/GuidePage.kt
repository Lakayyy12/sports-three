package com.application.footballbetting

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import footballbetting.R

class GuidePage : AppCompatActivity() {

    private var guideButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guide_page)

        guideButton = findViewById(R.id.button)
        guideButton?.setOnClickListener {
            onBackPressed()
        }
    }
}