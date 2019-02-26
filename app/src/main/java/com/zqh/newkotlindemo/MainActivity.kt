package com.zqh.newkotlindemo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var textview1: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textview1 = findViewById(R.id.textview1)

        textview1.setOnClickListener(View.OnClickListener {
            val intent=Intent(MainActivity@this,FlowControlActivity::class.java)
            intent.putExtra("aa","ss")
            startActivity(intent)
        })
    }
}
