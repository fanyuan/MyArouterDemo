package com.example.libjavakotlin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

@Route(path = "/libJavaKotlin/JavaActivity")
public class JavaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);
    }

    public void toMainActivity(View view) {
        ARouter.getInstance().build("/router/app/main/").navigation();
        Log.d("test","LibJavaMainActivity toMainActivity");
    }

    public void toMainActivity2(View view) {
        ARouter.getInstance().build("/router/app/activity2").navigation();
    }
}