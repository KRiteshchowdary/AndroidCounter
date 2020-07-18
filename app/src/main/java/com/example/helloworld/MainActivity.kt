package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_increase = findViewById(R.id.increase) as Button
        val btn_decrease = findViewById(R.id.decrease) as Button
        val btn_reset = findViewById(R.id.reset) as Button
        val txt_message = findViewById(R.id.countview) as TextView

        var counter = 0

        btn_increase.setOnClickListener {
            counter=counter+1
            txt_message.text= counter.toString()
            Toast.makeText(this@MainActivity,"Increased", Toast.LENGTH_SHORT).show()
        }

        btn_decrease.setOnClickListener {
            counter=counter-1
            txt_message.text= counter.toString()
            Toast.makeText(this@MainActivity,"Decreased", Toast.LENGTH_SHORT).show()
        }

        btn_reset.setOnClickListener {
            counter=0
            txt_message.text= counter.toString()
            Toast.makeText(this@MainActivity,"Count reset", Toast.LENGTH_SHORT).show()
        }

    }
}