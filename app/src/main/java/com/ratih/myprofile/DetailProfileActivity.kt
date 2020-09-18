package com.ratih.myprofile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail_profile.*

class DetailProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_profile)
        back.setOnClickListener {
            val intent = Intent(this, myprofile::class.java)
            startActivity(intent)
        }
    }
}