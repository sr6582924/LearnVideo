package com.learn.ming.learnvideo.di.module;

import com.learn.ming.learnvideo.app.LVApplication;
import com.learn.ming.learnvideo.model.DataManager;
import com.learn.ming.learnvideo.model.http.HttpHelper;
import com.learn.ming.learnvideo.model.http.RetorfitHelper;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author ：ming on 2018/3/22 14:57
 * @email：401410305@qq.com
 */
@Module
public class AppModule {

    private LVApplication application;

    public AppModule(LVApplication application) {
        this.application = application;
    }

    @Provides
    @Singleton
    LVApplication provideApplicationContext() {
        return application;
    }

    @Provides
    @Singleton
    HttpHelper provideHttpHelper(RetorfitHelper retorfitHelper) {
        return retorfitHelper;
    }

    @Provides
    @Singleton
    DataManager provideDataManager(HttpHelper httpHelper) {
        return new DataManager(httpHelper);
    }
}
