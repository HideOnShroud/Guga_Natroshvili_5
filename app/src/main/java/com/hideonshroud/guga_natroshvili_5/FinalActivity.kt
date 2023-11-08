package com.hideonshroud.guga_natroshvili_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class FinalActivity : AppCompatActivity() {

    private lateinit var nameView: TextView
    private lateinit var lastnameView: TextView
    private lateinit var phoneView: TextView
    private lateinit var idView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

        var bundle = intent.extras

        var name:String? = bundle!!.getString("NAME")
        var lastname:String? = bundle!!.getString("LASTNAME")
        var phone:String? = bundle!!.getString("PHONE")
        var id:String? = bundle!!.getString("ID")

        nameView = findViewById(R.id.nameView)
        lastnameView = findViewById(R.id.lastnameView)
        phoneView = findViewById(R.id.phoneView)
        idView = findViewById(R.id.idView)

        nameView.text = name
        lastnameView.text = lastname
        phoneView.text = phone
        idView.text = id

    }
}