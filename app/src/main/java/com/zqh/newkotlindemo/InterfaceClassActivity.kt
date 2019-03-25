package com.zqh.newkotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.zqh.newkotlindemo.mode.DataInterfaceOne

/**
 * 枚举类、接口类的实现　
 * create by zqhcxy 2019-03-25
 */
 val TAG:String ="InterfaceClassActivity"
class InterfaceClassActivity : AppCompatActivity(),DataInterfaceOne {



    override fun from() {
        Log.i(TAG,"us")
    }

    override fun sex(str: String) {
        Log.i(TAG,str)
    }

    override fun age(age: Int): Int {
        return age
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interface_class)

        from()
        sex("man")
        val demo2 = Demo2(1,1)


        Log.i(TAG,"${getName()}${age(7)} ")
        demo2.sum()
    }


    /**
     * 作为抽象类
     */
    interface Demo2Interface{
        val num1:Int
        val num2:Int
    }

    class Demo2(override val num1:Int, override val num2:Int):Demo2Interface{
        fun sum(){
            Log.i(TAG,"plus: ${num1+num2}")
        }
    }

}
