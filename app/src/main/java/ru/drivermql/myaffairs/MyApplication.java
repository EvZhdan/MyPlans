package ru.drivermql.myaffairs;

import android.app.Application;

/**
 * Created by dkmngkfj on 23.01.2018.
 */

public class MyApplication extends Application {

    private static boolean activityVisible;

    public static boolean isActivityVisible() {
        return activityVisible;
    }

    public static void activityResumed() {
        activityVisible = true;
    }

    public static void activityPaused() {
        activityVisible = false;
    }
}
