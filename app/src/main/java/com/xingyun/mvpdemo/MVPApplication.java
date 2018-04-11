package com.xingyun.mvpdemo;

import android.app.Application;

import com.xingyun.slimvan.application.BaseLibrary;
import com.xingyun.slimvan.util.Utils;

/**
 * Created by xingyun on 2018/1/4.
 */

public class MVPApplication extends Application {
    private static MVPApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        init();
    }

    private void init() {
        BaseLibrary.init(getApplicationContext());
        Utils.init(getApplicationContext());
    }

    public static MVPApplication getInstance() {
        return instance;
    }
}
