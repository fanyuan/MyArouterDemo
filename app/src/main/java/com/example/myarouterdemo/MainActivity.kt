package com.example.myarouterdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
@Route(path = "/router/app/main/")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toActivity2(view: View) {
        ARouter.getInstance().build("/router/app/activity2").navigation()
    }

    fun toLibJavaMainActivity(view: View) {
        ARouter.getInstance().build("/libJava/libJavaMainActivity").navigation()
    }

    fun toLibKotlinMainActivity(view: View) {
        ARouter.getInstance().build("/libKotlin/LibKotlinMainActivity").navigation()
    }

    fun toLibJavaKotlin_JavaActivity(view: View) {
        ARouter.getInstance().build("/libJavaKotlin/JavaActivity").navigation()
    }
    fun toLibJavaKotlin_KotlinActivity(view: View) {
        ARouter.getInstance().build("/libJavaKotlin/KotlinActivity").navigation()
    }
}