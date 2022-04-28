package com.zerdasoftware.timer

import android.app.Service
import android.content.Intent
import android.os.Handler
import android.os.IBinder
import android.widget.Toast

class TimerService : Service() {


    private lateinit var handler: Handler

    private val thread = object :Runnable{
        override fun run() {
            Toast.makeText(this@TimerService,"Service Continues to Run",Toast.LENGTH_SHORT).show()
            this@TimerService.handler.postDelayed(this,5000)
        }
    }

    override fun onBind(p0: Intent?): IBinder? {
        return null
    }

    override fun onCreate() {
        handler = Handler()
        handler.postDelayed(thread,5000)
        Toast.makeText(this,"Service Started",Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        handler.removeCallbacks(thread)
        Toast.makeText(this,"Service Stopped",Toast.LENGTH_SHORT).show()
    }
}