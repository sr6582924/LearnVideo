package com.learn.ming.learnvideo.di.scope;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author ：ming on 2018/3/22 14:59
 * @email：401410305@qq.com
 */
@Scope
@Retention(RUNTIME)
public @interface ActivityScope {
}
