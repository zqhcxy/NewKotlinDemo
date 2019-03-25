package com.zqh.newkotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.zqh.newkotlindemo.mode.DataMode

/**
 * 类与方法，
 */
class ClassAndModeActivity : AppCompatActivity() {

    lateinit var mDataMode:DataMode

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class_and_mode)

        initData()
    }

    fun initData(){
        mDataMode = DataMode()

        mDataMode.name="zqh"
        mDataMode.age=17

        Log.i("TAG","name: ${mDataMode.name} \t age: ${mDataMode.age}")
    }




}
