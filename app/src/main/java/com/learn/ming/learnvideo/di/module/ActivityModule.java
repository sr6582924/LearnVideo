package com.learn.ming.learnvideo.di.module;

import android.app.Activity;

import com.learn.ming.learnvideo.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * @author ：ming on 2018/3/22 14:57
 * @email：401410305@qq.com
 */
@Module
public class ActivityModule {
    Activity mActivity;

    public ActivityModule(Activity activity) {
        this.mActivity = activity;
    }

    @Provides
    @ActivityScope
    public Activity provideActivity() {
        return mActivity;
    }
}
