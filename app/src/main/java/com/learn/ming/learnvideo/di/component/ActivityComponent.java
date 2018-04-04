package com.learn.ming.learnvideo.di.component;

import android.app.Activity;

import com.learn.ming.learnvideo.di.module.ActivityModule;
import com.learn.ming.learnvideo.di.module.AppModule;
import com.learn.ming.learnvideo.di.scope.ActivityScope;
import com.learn.ming.learnvideo.ui.activity.MainActivity;

import dagger.Component;

/**
 * @author ：ming on 2018/3/22 14:54
 * @email：401410305@qq.com
 */
@ActivityScope
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    Activity getActivity();

    void inject(MainActivity activity);

}
