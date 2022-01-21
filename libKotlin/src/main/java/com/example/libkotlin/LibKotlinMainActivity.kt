package com.example.libkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter

@Route(path = "/libKotlin/LibKotlinMainActivity")
class LibKotlinMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lib_kotlin_main)
    }
    fun toMainActivity(view: View?) {
        ARouter.getInstance().build("/router/app/main/").navigation()
        Log.d("test", "LibKotlinMainActivity toMainActivity")
    }

    fun toMainActivity2(view: View?) {
        ARouter.getInstance().build("/router/app/activity2").navigation()
    }
}