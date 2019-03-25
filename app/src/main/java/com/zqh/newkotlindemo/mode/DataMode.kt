package com.zqh.newkotlindemo.mode

class DataMode {

    var name: String = ""
    var age =2
        get() = if(field>5) 5 else 0


}