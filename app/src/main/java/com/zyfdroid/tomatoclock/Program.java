package com.zyfdroid.tomatoclock;

import android.app.Application;

import com.zyfdroid.tomatoclock.util.SpUtils;


public class Program extends Application {

    public static final String ACTION_CLOCK="com.zyfdroid.tomatoclock.ACTION_CLOCK";

    @Override
    public void onCreate() {
        super.onCreate();
        SpUtils.init(this);
    }
}
