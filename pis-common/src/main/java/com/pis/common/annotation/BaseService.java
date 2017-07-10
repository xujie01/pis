package com.pis.common.annotation;

import java.lang.annotation.*;

/**
 * 初始化继承BaseService的service
 * Created on 2017/2/11.
 */
@Target({ElementType.TYPE})// 定义注解的作用目标,接口、类、枚举、注解
@Retention(RetentionPolicy.RUNTIME)// 注解会在class字节码文件中存在，在运行时可以通过反射获取到
@Documented//说明该注解将被包含在javadoc中
public @interface BaseService {//@interface自定义的annotation
}
