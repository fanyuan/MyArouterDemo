package com.example.libjavakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter

@Route(path = "/libJavaKotlin/KotlinActivity")
class KotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
    }

    fun toMainActivity(view: View?) {
        ARouter.getInstance().build("/router/app/main/").navigation()
        Log.d("test", "LibJavaMainActivity toMainActivity")
    }

    fun toMainActivity2(view: View?) {
        ARouter.getInstance().build("/router/app/activity2").navigation()
    }
}