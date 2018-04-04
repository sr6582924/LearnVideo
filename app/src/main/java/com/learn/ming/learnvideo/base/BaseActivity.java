package com.learn.ming.learnvideo.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.learn.ming.learnvideo.app.LVApplication;
import com.learn.ming.learnvideo.di.component.ActivityComponent;
import com.learn.ming.learnvideo.di.component.AppComponent;
import com.learn.ming.learnvideo.di.component.DaggerActivityComponent;
import com.learn.ming.learnvideo.di.module.ActivityModule;

import javax.inject.Inject;

/**
 * @author ：ming on 2018/3/26 10:30
 * @email：401410305@qq.com
 */
public abstract class BaseActivity<T extends BasePresenter> extends SimpleActivity implements BaseView {

    @Inject
    T mPresenter;

    protected ActivityComponent getActivityComponent() {
        AppComponent appComponent = ((LVApplication)getApplication()).getAppComponent();
        return DaggerActivityComponent.builder().
                appComponent(appComponent).activityModule(getActivityModule()).build();
    }

    protected ActivityModule getActivityModule() {
        return new ActivityModule(this);
    }

    @Override
    protected void onViewCreated() {
        super.onViewCreated();
        initInject();
        if (mPresenter != null) {
            mPresenter.attachView(this);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.detachView();
        }
    }


    @Override
    public void stateError() {

    }

    @Override
    public void stateEmpty() {

    }

    @Override
    public void stateLoading() {

    }

    @Override
    public void stateMain() {

    }

    protected abstract void initInject();
}
