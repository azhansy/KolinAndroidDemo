package com.azhansy.kolinandroiddemo.kotlin

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.TextView
import com.azhansy.kolinandroiddemo.R

class Kotlin01Activity : AppCompatActivity() {


    //定义变量
    var sum: Int = 0

    //延迟加载，视图的控件配合Butter Knife效果更佳 @BindView(R.id.toolbar) lateinit var toolbar: Toolbar
    lateinit var text1: TextView

    //懒加载，比如项目中很多对话框、自定义控件，
    // 就可以采用，可以使得打开页面的速度就会快很多
    val textView by lazy {
        //find<TextView>(R.id.text)
        findViewById(R.id.text)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
        initView()
        initClick()

    }

    fun initView() {
        text1 = findViewById(R.id.text1) as TextView
    }

    fun initClick() {
        textView.setOnClickListener {
            Log.d(TAG_LOG, "老铁们，没毛病")
        }
        textView.setOnLongClickListener {
            Log.d(TAG_LOG, "双击加关注")
            true
        }
    }

    fun onClick1(view: View) {
        val person = Person("azhansy", "Men")
        Log.d(TAG_LOG, person.toString())
        Log.d(TAG_LOG, person.name)
    }

    fun filter() {
//        val list = MutableList(0, 1, 2, 3)
//        list.filter { it > 10 }.map { element -> element * 2 }
    }

    companion object { // 这些 companion 对象是类里面的单例对象
        //        const val DEFAULT_USER_AGE = 30
        fun launch(context: Context) {
            val intent = Intent(context, Kotlin01Activity::class.java)
            context.startActivity(intent)

        }
    }
}
