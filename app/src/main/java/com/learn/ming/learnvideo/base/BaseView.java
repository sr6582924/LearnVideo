package com.learn.ming.learnvideo.base;

/**
 * @author ：ming on 2018/3/23 11:05
 * @email：401410305@qq.com
 */
public interface BaseView {

    void showErrorMsg();

    /*======== state ===========*/
    void stateError();

    void stateEmpty();

    void stateLoading();

    void stateMain();


}
