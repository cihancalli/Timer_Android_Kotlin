package com.zerdasoftware.timer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_Start.setOnClickListener {
            startService(Intent(this@MainActivity,TimerService::class.java))
        }

        button_Stop.setOnClickListener {
            stopService(Intent(this@MainActivity,TimerService::class.java) )
        }
    }
}