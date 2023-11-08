package com.hideonshroud.guga_natroshvili_5

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ThirdActivity : AppCompatActivity() {

    private lateinit var idText: EditText
    private lateinit var gtpFinalButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        var prevBundle = intent.extras

        idText = findViewById(R.id.idText)
        gtpFinalButton = findViewById(R.id.gtpFinalButton)

        gtpFinalButton.setOnClickListener {

            val intent = Intent(this, FinalActivity::class.java)
            val bundle = Bundle(prevBundle)

            bundle.putString("ID", idText.text.toString())
            intent.putExtras(bundle)
            startActivity(intent)
            finish()

        }

    }
}