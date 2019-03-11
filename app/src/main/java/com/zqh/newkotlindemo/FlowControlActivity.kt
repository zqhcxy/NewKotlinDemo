package com.zqh.newkotlindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.TextView

/**
 * 循环控制语句：if、for、when、while、do{}while
 */
class FlowControlActivity : AppCompatActivity(), View.OnClickListener {


    private lateinit var mResultTextView: TextView
    private lateinit var mAddButtom: Button
    private lateinit var mLessButtom: Button
    private lateinit var mMoreButtom: Button
    private lateinit var mStepButtom: Button
    private lateinit var mStringButtom: Button
    private lateinit var mArrayButtom: Button
    private lateinit var mValueInArray: Button
    private lateinit var mValueIsType: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flow_control)

        title = "控制语句类"
        initView()
    }

    fun initView() {
        mResultTextView = findViewById(R.id.control_result_tv)
        mAddButtom = findViewById(R.id.control_add_btn)
        mLessButtom = findViewById(R.id.control_less_btn)
        mMoreButtom = findViewById(R.id.control_more_btn)
        mStepButtom = findViewById(R.id.control_step_btn)
        mStringButtom = findViewById(R.id.control_string_btn)
        mArrayButtom = findViewById(R.id.control_array_btn)
        mValueInArray = findViewById(R.id.control_when_in_btn)
        mValueIsType = findViewById(R.id.control_when_is_btn)


        mResultTextView.setOnClickListener(this)
        mAddButtom.setOnClickListener(this)
        mLessButtom.setOnClickListener(this)
        mMoreButtom.setOnClickListener(this)
        mStepButtom.setOnClickListener(this)
        mStringButtom.setOnClickListener(this)
        mArrayButtom.setOnClickListener(this)
        mValueInArray.setOnClickListener(this)
        mValueIsType.setOnClickListener(this)
    }

    /**
     * 递增方法，5递增到9：大于等于5小于10
     */
    fun addCycle() {
        mResultTextView.text = ""
        for (i in 5 until 10) {
            mResultTextView.append(i.toString())
            if (i != 9) mResultTextView.append(",   ")
        }
    }

    /**
     * 递减方法，10到6：小于等于10大于等于5
     */
    fun lessCycle() {
        mResultTextView.text = ""
        for (i in 10 downTo 5) {
            mResultTextView.append(i.toString())
            if (i != 5) mResultTextView.append(",   ")
        }
    }

    /**
     * 增减方法，只是范围不一样：大于等于到小于等于  反之一样
     */
    fun otherCycle() {
        mResultTextView.text = ""
        for (i in 5..10) {
            mResultTextView.append(i.toString())
            if (i != 10) mResultTextView.append(",   ")
        }
    }

    /**
     * 设定步数的循环，每隔2步才执行
     */
    fun stepCycle() {
        mResultTextView.text = ""
        for (i in 5..10 step 2) {
            mResultTextView.append(i.toString())
            if (i != 10) mResultTextView.append(",   ")
        }
    }

    /**
     * 遍历字符串
     */
    fun stringCycle() {
        mResultTextView.text = ""
        for (i in "hello") {
            mResultTextView.append(i.toString() + ",  \t ")
        }
    }

    /**
     * 循环遍历数组
     * <p> 0：普通 遍历
     * <p> 1：转成游标
     * <p> 2：同时取出索引与数据
     * <p> 3：可扩展函数，类型cursor的next判断
     *
     */
    fun arrayCycle(witch: Int) {
        mResultTextView.text = ""
        var array = arrayListOf(1, 2, "a", false)
        when (witch) {
            0 -> {
                //i就是数组的内容
                for (i in array) {
                    mResultTextView.append(i.toString() + ",  \t ")
                }
            }
            1 -> {
                //i就是数组的游标位置。
                for (i in array.indices) {
                    mResultTextView.append("array[$i]: " + array[i] + ", ")
                }
            }
            2 -> {//把数组转换成key和value两个值，同时取出索引和数值
                for ((key, value) in array.withIndex()) {
                    mResultTextView.append("index=> $key  value=> $value \n")
                }
            }
            3 -> {
                var iterator = array.iterator()
                while (iterator.hasNext()) {
                    mResultTextView.append(iterator.next().toString() + " , ")
                }
            }
        }

    }

    /**
     * 判断数值是否在数组内；in/！in
     */
    fun valueInArray() {
        mResultTextView.text = ""
        var array = arrayOf(1, 3, 5, 7, 9)
        when (7) {
            in array -> {
                mResultTextView.text = "true"
            }
            else -> {
                mResultTextView.text = "false"
            }
        }
    }

    /**
     * 判断数据是否为指定类型；is/！is
     */
    fun valueIsType() {
        mResultTextView.text = ""
        var array = "hello"
        when (array) {
            is String -> {
                mResultTextView.text = "true"
            }
            else -> {
                mResultTextView.text = "false"
            }
        }
    }

    fun nullMode(){
        var array= arrayOf(1,null,2,null,3,null,4)

        for(index in array){
            index?.let { "index==> $index " }
        }
    }


    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.control_result_tv -> {
                mResultTextView.text = ""
            }
            R.id.control_add_btn -> {
                addCycle()
            }
            R.id.control_less_btn -> {
                lessCycle()
            }
            R.id.control_more_btn -> {
                otherCycle()
            }
            R.id.control_step_btn -> {
                stepCycle()
            }
            R.id.control_string_btn -> {
                stringCycle()
            }
            R.id.control_array_btn -> {
                arrayCycle(3)
            }
            R.id.control_when_in_btn -> {
                valueInArray()
            }
            R.id.control_when_is_btn -> {
                valueIsType()
            }
        }
    }
}
