package com.zqh.newkotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Range
import android.view.View
import android.widget.Button
import android.widget.TextView


const val str = "girl i like you"

/**
 * 字符串操作相关
 */
class StringActivity : AppCompatActivity(), View.OnClickListener {


    private lateinit var mShowTextview: TextView
    private lateinit var mFindStringBtn: Button
    private lateinit var mSubStringBtn: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_string)

        title="String edit"
        initView()
    }

    private fun initView() {
        mShowTextview = findViewById(R.id.string_show_tv)
        mFindStringBtn = findViewById(R.id.string_findstring_btn)
        mSubStringBtn = findViewById(R.id.string_substring_btn)

        mShowTextview.setOnClickListener(this)
        mFindStringBtn.setOnClickListener(this)
        mSubStringBtn.setOnClickListener(this)


    }

    override fun onClick(v: View?) {

        when (v?.id) {
            R.id.string_show_tv -> {
                cleatShow()
            }
            R.id.string_findstring_btn -> {
                findString()
            }
            R.id.string_substring_btn -> {
                subString()
            }
        }
    }

    fun cleatShow() {
        mShowTextview.text = ""
    }

    /**
     * str：i like you girl
     *
     * 查找第一个字符、最后一个字符、第一次使用l的角标、最后一次使用l角标
     *
     */
    fun findString() {
        //first():字符串为空时会报异常；firstOrNull()：字符串为空时候返回null
        var firstStr = str.firstOrNull()//get(0)
        var endStr = str.lastOrNull()
        //str.indexOfFirst { it=='l' }
        var firstUse = str.indexOf("l", 0)
        var endUse = str.lastIndexOf("l")

        var showTxt = "find from: " + str + " : \n  firstStr: $firstStr \n endStr: $endStr \n firstUse: $firstUse \n endUse: $endUse"
        mShowTextview.text = showTxt

    }

    /**
     * 截取str文本中的字段
     */
    fun subString(){
        var subStr=str.substring(0,5)//0到5，不包括5
        var subRang= str.substring(IntRange(0,5))//range 包括5这个位置
        var showText="subString str: $str \n sub(0-5): $subStr \n sub rang(0-5): $subRang"
        mShowTextview.text=showText
    }


}
