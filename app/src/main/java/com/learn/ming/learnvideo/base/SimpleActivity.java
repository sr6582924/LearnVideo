package com.learn.ming.learnvideo.base;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;

import com.learn.ming.learnvideo.app.LVApplication;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import me.yokeyword.fragmentation.SupportActivity;

/**
 * @author ：ming on 2018/3/23 11:25
 * @email：401410305@qq.com
 */
public abstract class SimpleActivity extends SupportActivity{

    private Activity mContext;
    private Unbinder mUnbinder;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        mUnbinder = ButterKnife.bind(this);
        mContext = this;
        onViewCreated();
        ((LVApplication)getApplication()).addActivity(this);
        initDataAndEvent();
    }

    protected void onViewCreated() {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    protected abstract int getLayout();

    protected abstract void initDataAndEvent();
}
