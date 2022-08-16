package com.application.footballbetting

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import footballbetting.R

class HomeAct : AppCompatActivity() {

    private var homeButton : Button? = null
    private var guideButton : Button? = null
    private var guideButton2 : Button? = null
    private var exit = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        homeButton = findViewById(R.id.homeButton)
        guideButton = findViewById(R.id.guideButton)
        guideButton2 = findViewById(R.id.guideButton2)

        homeButton?.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle())
        }
        guideButton?.setOnClickListener {
            val intent = Intent(this, GuidePage::class.java)
            startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle())
        }
        guideButton2?.setOnClickListener{
            val intent = Intent(this, History::class.java)
            startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle())
        }
    }
        override fun onBackPressed() {
            if (exit == 0) {
                exit = 1
                Toast.makeText(this, "CLICK AGAIN TO EXIT", Toast.LENGTH_SHORT).show()
            } else {
                finish()
            }
        }
    }
