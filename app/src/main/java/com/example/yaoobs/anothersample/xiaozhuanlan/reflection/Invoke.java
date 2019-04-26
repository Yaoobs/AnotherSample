package com.example.yaoobs.anothersample.xiaozhuanlan.reflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * author yaozheng
 * introduce :
 * PACKAGE_NAME com.example.yaoobs.anothersample.xiaozhuanlan.reflection
 * PROJECT_NAME FundAs
 * DATE  2019/4/26 4:17 PM
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Invoke {
}
