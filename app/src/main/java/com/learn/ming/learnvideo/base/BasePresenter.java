package com.learn.ming.learnvideo.base;

/**
 * @author ：ming on 2018/3/23 11:04
 * @email：401410305@qq.com
 */
public interface BasePresenter<T extends BaseView> {

    void attachView(T view);

    void detachView();
}
