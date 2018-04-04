package com.learn.ming.learnvideo.model.http;

import com.learn.ming.learnvideo.model.bean.VersionBean;
import com.learn.ming.learnvideo.model.http.response.MyHttpResponse;

import io.reactivex.Flowable;

/**
 * @author ：ming on 2018/3/23 10:27
 * @email：401410305@qq.com
 */
public interface HttpHelper {

    Flowable<MyHttpResponse<VersionBean>> fetchVersionInfo();
}
