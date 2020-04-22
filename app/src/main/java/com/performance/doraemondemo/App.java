package com.performance.doraemondemo;

import android.app.Application;
import android.content.Context;
import android.os.StrictMode;

import com.performance.analysis.DoraemonKit;

import androidx.multidex.MultiDex;


public class App extends Application {
    private static final String TAG = "App";


    @Override
    public void onCreate() {
        super.onCreate();
        DoraemonKit.install(this);
        //是否显示入口icon
//        DoraemonKit.setAwaysShowMainIcon(false);
        //严格检查模式
        StrictMode.enableDefaults();

    }


    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}