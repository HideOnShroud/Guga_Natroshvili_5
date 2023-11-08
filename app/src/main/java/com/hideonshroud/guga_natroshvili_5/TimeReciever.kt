package com.hideonshroud.guga_natroshvili_5

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.Date

class TimeReceiver(private val timeTextView: TextView) : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent?.action == Intent.ACTION_TIME_TICK) {

            timeTextView.text = getCurrentTimeFormatted()
            Log.d("this","worked")
        }
    }
    fun getCurrentTimeFormatted(): String {
        val currentTimeMillis = System.currentTimeMillis()
        val sdf = SimpleDateFormat("HH:mm")
        val currentTime = Date(currentTimeMillis)
        return sdf.format(currentTime)
    }
}