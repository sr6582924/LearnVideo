package com.learn.ming.learnvideo.base.contract;

import com.learn.ming.learnvideo.base.BasePresenter;
import com.learn.ming.learnvideo.base.BaseView;
import com.tbruyelle.rxpermissions2.RxPermissions;

/**
 * @author ：ming on 2018/4/4 15:44
 * @email：401410305@qq.com
 */
public interface MainContract {

    interface View extends BaseView {

        void showUpdateDialog(String versionContent);

        void startDownloadService();
    }

    interface  Presenter extends BasePresenter<View> {

        void checkVersion(String currentVersion);

        void checkPermissions(RxPermissions rxPermissions);

        void setNightModeState(boolean b);

        void setCurrentItem(int index);

        int getCurrentItem();

        void setVersionPoint(boolean b);

        boolean getVersionPoint();
    }
}
