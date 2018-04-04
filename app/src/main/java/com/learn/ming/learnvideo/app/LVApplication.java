package com.learn.ming.learnvideo.app;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import com.learn.ming.learnvideo.di.component.AppComponent;
import com.learn.ming.learnvideo.di.component.DaggerAppComponent;
import com.learn.ming.learnvideo.di.module.AppModule;
import com.learn.ming.learnvideo.di.module.HttpModule;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ：ming on 2018/3/22 11:23
 * @email：401410305@qq.com
 */
public class LVApplication extends Application{


    public static AppComponent appComponent;
    private Set<Activity> allActivities;

    @Override
    public void onCreate() {
        super.onCreate();
        if (appComponent == null) {
            appComponent = DaggerAppComponent.builder()
                    .appModule(new AppModule(this))
                    .httpModule(new HttpModule()).build();
        }
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    public void addActivity(Activity act) {
        if (allActivities == null) {
            allActivities = new HashSet<>();
        }
        allActivities.add(act);
    }

    public AppComponent getAppComponent() {
        if (appComponent == null) {
            appComponent = DaggerAppComponent.builder()
                    .appModule(new AppModule(this))
                    .httpModule(new HttpModule()).build();
        }
        return appComponent;
    }

}
