package com.azhansy.kolinandroiddemo.kotlin

/**
 * Created by zhanshuyong on 2017/7/8.
 * 实体类
 */
class MenPerson() {
    //自定义设置
    var name: String
        set(value) {
            name = value
        }
        get() {
            return name + "one"
        }

}
