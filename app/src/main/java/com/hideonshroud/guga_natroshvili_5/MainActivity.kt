package com.hideonshroud.guga_natroshvili_5


import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView



class MainActivity : AppCompatActivity() {
    private lateinit var timeTextView: TextView
    private lateinit var nameText: EditText
    private lateinit var lastnameText: EditText
    private lateinit var gtp2Button: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        timeTextView = findViewById(R.id.timeTextView)
        nameText = findViewById(R.id.nameText)
        lastnameText = findViewById(R.id.lastnameText)
        gtp2Button = findViewById(R.id.gtp2Button)

        var timeReciever = TimeReceiver(timeTextView)
        timeTextView.text = timeReciever.getCurrentTimeFormatted()

        val filter = IntentFilter(Intent.ACTION_TIME_TICK)
        registerReceiver(timeReciever, filter)

        gtp2Button.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            val bundle = Bundle()
            bundle.putString("NAME", nameText.text.toString())
            bundle.putString("LASTNAME", lastnameText.text.toString())
            intent.putExtras(bundle)
            startActivity(intent)
            finish()
            unregisterReceiver(timeReciever)
        }

    }




}