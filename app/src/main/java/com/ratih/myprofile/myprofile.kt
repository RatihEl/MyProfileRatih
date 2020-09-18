package com.ratih.myprofile

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_myprofile.*

class myprofile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_myprofile)
        btnNext.setOnClickListener {
            val intent = Intent ( this, DetailProfileActivity ::class.java)
            startActivity(intent)
        }
    }
}