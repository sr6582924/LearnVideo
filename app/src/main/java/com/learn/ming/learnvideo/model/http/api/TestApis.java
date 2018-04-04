package com.learn.ming.learnvideo.model.http.api;

import com.learn.ming.learnvideo.model.bean.VersionBean;
import com.learn.ming.learnvideo.model.http.response.MyHttpResponse;

import io.reactivex.Flowable;
import retrofit2.http.GET;

/**
 * @author ：ming on 2018/3/22 16:59
 * @email：401410305@qq.com
 */
public interface TestApis {

    String HOST = "http://codeest.me/api/geeknews/";

    String APK_DOWNLOAD_URL = "http://codeest.me/apk/geeknews.apk";

    /**
     * 获取最新版本信息
     * @return
     */
    @GET("version")
    Flowable<MyHttpResponse<VersionBean>> getVersionInfo();
}
