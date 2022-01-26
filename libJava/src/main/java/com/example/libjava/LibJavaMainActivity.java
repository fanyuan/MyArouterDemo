package com.example.libjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

@Route(path = "/libJava/libJavaMainActivity")
public class LibJavaMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lib_java_main);
    }

    public void toMainActivity(View view) {
        ARouter.getInstance().build("/router/app/main/").navigation();
        Log.d("test","LibJavaMainActivity toMainActivity 路由跳转发起");
    }

    public void toMainActivity2(View view) {
        ARouter.getInstance().build("/router/app/activity2").navigation();
    }
    public void toLibKotlinMainActivity(View view) {
        ARouter.getInstance().build("/libKotlin/LibKotlinMainActivity").navigation();
    }
    public void toLibJavaKotlin_JavaActivity(View view) {
        ARouter.getInstance().build("/libJavaKotlin/JavaActivity").navigation();
    }
    public void toLibJavaKotlin_KotlinActivity(View view) {
        ARouter.getInstance().build("/libJavaKotlin/KotlinActivity").navigation();
    }
}