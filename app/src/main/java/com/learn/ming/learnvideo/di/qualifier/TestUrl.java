package com.learn.ming.learnvideo.di.qualifier;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Qualifier;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author ：ming on 2018/3/22 16:43
 * @email：401410305@qq.com
 */

@Qualifier
@Documented
@Retention(RUNTIME)
public @interface TestUrl {
}
