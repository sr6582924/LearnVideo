package com.learn.ming.learnvideo.presenter;

import com.learn.ming.learnvideo.base.RxPresenter;
import com.learn.ming.learnvideo.base.contract.MainContract;
import com.learn.ming.learnvideo.model.DataManager;
import com.tbruyelle.rxpermissions2.RxPermissions;

import javax.inject.Inject;

/**
 * @author ：ming on 2018/4/4 15:36
 * @email：401410305@qq.com
 */
public class MainPresenter extends RxPresenter<MainContract.View> implements MainContract.Presenter{

    private DataManager mDataManager;

    @Inject
    public MainPresenter(DataManager mDataManager) {
        this.mDataManager = mDataManager;
    }

    @Override
    public void attachView(MainContract.View view) {
        super.attachView(view);
    }

    @Override
    public void detachView() {
        super.detachView();
    }

    @Override
    public void checkVersion(String currentVersion) {

    }

    @Override
    public void checkPermissions(RxPermissions rxPermissions) {

    }

    @Override
    public void setNightModeState(boolean b) {

    }

    @Override
    public void setCurrentItem(int index) {

    }

    @Override
    public int getCurrentItem() {
        return 0;
    }

    @Override
    public void setVersionPoint(boolean b) {

    }

    @Override
    public boolean getVersionPoint() {
        return false;
    }
}
