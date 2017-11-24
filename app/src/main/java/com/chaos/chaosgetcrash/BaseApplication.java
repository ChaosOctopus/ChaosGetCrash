package com.chaos.chaosgetcrash;

import android.app.Application;

/**
 * Created by yc.Zhao on 2017/11/24 0024.
 */

public class BaseApplication extends Application{
    private static BaseApplication sInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;

        //为应用设置异常处理,然后程序才能获取未处理的异常
        CrashHandler crashHandler = CrashHandler.getsInstance();
        crashHandler.init(this);

    }

    public  static  BaseApplication getsInstance(){
        return sInstance;
    }
}
