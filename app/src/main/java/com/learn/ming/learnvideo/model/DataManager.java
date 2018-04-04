package com.learn.ming.learnvideo.model;

import com.learn.ming.learnvideo.model.bean.VersionBean;
import com.learn.ming.learnvideo.model.http.HttpHelper;
import com.learn.ming.learnvideo.model.http.response.MyHttpResponse;

import io.reactivex.Flowable;

/**
 * @author ：ming on 2018/3/23 10:22
 * @email：401410305@qq.com
 */
public class DataManager implements HttpHelper{

    HttpHelper httpHelper;

    public DataManager(HttpHelper httpHelper) {
        this.httpHelper = httpHelper;
    }

    @Override
    public Flowable<MyHttpResponse<VersionBean>> fetchVersionInfo() {
        return httpHelper.fetchVersionInfo();
    }
}
