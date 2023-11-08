package com.hideonshroud.guga_natroshvili_5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Telephony.Sms.Intents
import android.widget.Button
import android.widget.EditText

class SecondActivity : AppCompatActivity() {

    private lateinit var phoneText: EditText
    private lateinit var gtp3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val prevBundle = intent.extras

        phoneText = findViewById(R.id.phoneText)
        gtp3 = findViewById(R.id.gtp3Button)



        gtp3.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            val bundle = Bundle(prevBundle)
            bundle.putString("PHONE", phoneText.text.toString())
            intent.putExtras(bundle)
            startActivity(intent)
            finish()
        }


    }
}