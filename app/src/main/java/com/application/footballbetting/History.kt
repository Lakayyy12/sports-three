package com.application.footballbetting

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import footballbetting.R

class History : AppCompatActivity() {

    private var btn : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)

        btn = findViewById(R.id.btn_back)
        btn?.setOnClickListener{
            onBackPressed()
        }

    }
}