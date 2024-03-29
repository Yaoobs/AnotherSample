package com.example.yaoobs.anothersample.xiaozhuanlan.reflection;

/**
 * author yaozheng
 * introduce :
 * PACKAGE_NAME com.example.yaoobs.anothersample.xiaozhuanlan.reflection
 * PROJECT_NAME FundAs
 * DATE  2019/4/26 4:16 PM
 */
public class UserBean {

    public String userName;

    private long userId;

    public UserBean(String userName, long userId) {
        this.userName = userName;
        this.userId = userId;
    }

    public String getName() {
        return userName;
    }

    public long getId() {
        return userId;
    }

    @Invoke
    public static void staticMethod(String devName) {
        System.out.printf("Hi %s, I'm a static method", devName);
    }

    @Invoke
    public void publicMethod() {
        System.out.println("I'm a public method");
    }

    @Invoke
    private void privateMethod() {
        System.out.println("I'm a private method");
    }
}
