package com.learn.ming.learnvideo.component;

import com.learn.ming.learnvideo.utils.RxUtils;

import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.processors.FlowableProcessor;
import io.reactivex.processors.PublishProcessor;

/**
 * @author ：ming on 2018/3/28 17:22
 * @email：401410305@qq.com
 */
public class RxBus {

    private final FlowableProcessor<Object> bus;


    /**
     * PublishSubject只会把在订阅发生的时间点之后来自原始Flowable的数据发射给观察者
     */
    private RxBus() {
        bus = PublishProcessor.create().toSerialized();
    }

    public static RxBus getDefault() {
        return RxBusHolder.sInstance;
    }

    private static class RxBusHolder {
        private static final RxBus sInstance = new RxBus();
    }

    public void post(Object o) {
        bus.onNext(o);
    }

    //根据传递的eventtype 类型返回
    public <T> Flowable<T> toFlowable(Class<T> eventType) {
        return bus.ofType(eventType);
    }

    //封装默认订阅
    public <T>Disposable toDefaultFlowable(Class<T> eventType, Consumer<T> act) {
        return bus.ofType(eventType).compose(RxUtils.<T>rxSchedulerHelper()).subscribe(act);
    }
}
