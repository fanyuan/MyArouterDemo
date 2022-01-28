package com.example.myarouterdemo

import android.app.Application
import android.content.Context
import android.content.pm.ApplicationInfo
import android.util.Log
import com.alibaba.android.arouter.launcher.ARouter

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Log.d("test","000 MyApplication BuildConfig.DEBUG = ${BuildConfig.DEBUG}")
        if (isDebugApp(this)) {           // 这两行必须写在init之前，否则这些配置在init过程中将无效
            ARouter.openLog()     // 打印日志
            ARouter.openDebug()  // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        }
        ARouter.init(this) // 尽可能早，推荐在Application中初始化

        Log.d("test","123 MyApplication BuildConfig.DEBUG = ${BuildConfig.DEBUG}")
    }
    private fun isDebugApp(context: Context):Boolean{

        //Log.d("test","MyApplication BuildConfig.DEBUG = ${BuildConfig.DEBUG}")

        return try {
            val info = context.applicationInfo
            val result = (info.flags and ApplicationInfo.FLAG_DEBUGGABLE) != 0
            Log.d("test","MyApplication isDebugApp = $result    BuildConfig.DEBUG = ${BuildConfig.DEBUG}")
            result
        } catch (x:Exception) {
            false
        }
    }
}