package com.example.tabzhou.applicationlifecycle;

import android.app.Application;

/**
 * Created by tabzhou on 31/07/2017.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        registerActivityLifecycleCallbacks(new AppLifecycleHandler());
    }
}
