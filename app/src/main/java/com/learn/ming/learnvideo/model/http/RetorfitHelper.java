package com.learn.ming.learnvideo.model.http;

import com.learn.ming.learnvideo.model.bean.VersionBean;
import com.learn.ming.learnvideo.model.http.api.TestApis;
import com.learn.ming.learnvideo.model.http.response.MyHttpResponse;

import javax.inject.Inject;

import io.reactivex.Flowable;

/**
 * @author ：ming on 2018/3/23 10:28
 * @email：401410305@qq.com
 */
public class RetorfitHelper implements HttpHelper{

    private TestApis testApis;

    @Inject
    public RetorfitHelper(TestApis testApis) {
        this.testApis = testApis;
    }

    @Override
    public Flowable<MyHttpResponse<VersionBean>> fetchVersionInfo() {
        return testApis.getVersionInfo();
    }
}
