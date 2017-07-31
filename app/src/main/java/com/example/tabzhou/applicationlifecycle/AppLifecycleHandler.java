package com.example.tabzhou.applicationlifecycle;


import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/**
 * Created by tabzhou on 31/07/2017.
 */

public class AppLifecycleHandler implements Application.ActivityLifecycleCallbacks {

    private int activityActiveCount = 0;

    @Override
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {

    }

    @Override
    public void onActivityStarted(Activity activity) {

    }

    @Override
    public void onActivityResumed(Activity activity) {
        if (!isApplicationInForeground()) {
            applicationDidBecomeActive();
        }
        ++activityActiveCount;
    }

    @Override
    public void onActivityPaused(Activity activity) {
        --activityActiveCount;
        if (!isApplicationInForeground()) {
            applicationDidEnterBackground();
        }
    }

    @Override
    public void onActivityStopped(Activity activity) {

    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {

    }

    @Override
    public void onActivityDestroyed(Activity activity) {

    }

    public boolean isApplicationInForeground() {
        return activityActiveCount > 0;
    }

    public void applicationDidBecomeActive() {
        android.util.Log.w("test", "applicationDidBecomeActive");
        //TODO:
    }

    public void applicationDidEnterBackground() {
        android.util.Log.w("test", "applicationDidEnterBackground");
        //TODO:
    }



}
