package com.learn.ming.learnvideo.di.component;

import com.learn.ming.learnvideo.app.LVApplication;
import com.learn.ming.learnvideo.di.module.AppModule;
import com.learn.ming.learnvideo.di.module.HttpModule;
import com.learn.ming.learnvideo.model.DataManager;
import com.learn.ming.learnvideo.model.http.RetorfitHelper;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author ：ming on 2018/3/22 14:55
 * @email：401410305@qq.com
 */
@Singleton
@Component(modules = {AppModule.class, HttpModule.class})
public interface AppComponent {

    LVApplication getContext();

    DataManager getDataManager();

    RetorfitHelper retorfitHelper();

}
