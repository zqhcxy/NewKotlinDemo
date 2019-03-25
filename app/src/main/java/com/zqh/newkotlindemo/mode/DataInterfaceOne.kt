package com.zqh.newkotlindemo.mode

/**
 * 接口类，无结构体
 */
interface DataInterfaceOne {

    fun from()

    fun sex(str: String)

    fun age(age: Int): Int {
        return 17
    }

    fun getName(): String {
        return "zqh"
    }

}