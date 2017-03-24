package com.rkpattanaik.androidjobdemo;

import android.app.Application;

import com.evernote.android.job.JobManager;


/**
 * @author Rajesh Pattanaik
 */

public class MainApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        JobManager.create(this).addJobCreator(new DemoJobCreator());
        JobManager.instance().getConfig().setAllowSmallerIntervalsForMarshmallow(true); // Don't use this in production
    }
}
