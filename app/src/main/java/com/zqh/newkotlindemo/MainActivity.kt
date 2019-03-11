package com.zqh.newkotlindemo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onClick(v: View?) {
        when(v?.id){
            R.id.textview1 -> {
                val intent=Intent(MainActivity@this,FlowControlActivity::class.java)
                intent.putExtra("aa","ss")
                startActivity(intent)
            }
            R.id.textview2 ->{
                val intent = Intent(this,StringActivity::class.java)
                startActivity(intent)
            }

        }

    }

    private lateinit var textview1: TextView
    private lateinit var textview2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textview1 = findViewById(R.id.textview1)
        textview2 = findViewById(R.id.textview2)

        textview1.setOnClickListener(this)
        textview2.setOnClickListener(this)

    }
}
