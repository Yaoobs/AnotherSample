package com.example.yaoobs.anothersample.AndroidSourceDesignPatternsAnalysisPractice.singleton;

import java.io.ObjectStreamException;

/**
 * Created by yaoobs on 2017/10/12.
 */

public class Singleton {
    private Singleton() {}
    public static Singleton getInstance() {
        return SingletonHolder.sInstance;
    }
    /**
     * 静态内部类
     */
    private static class SingletonHolder{
        private static final Singleton sInstance = new Singleton();
    }

    //懒汉模式
//    private static Singleton instance;
//    private Singleton() {}
//
//    public static synchronized Singleton getInstance() {
//        if (instance == null){
//            instance = new Singleton();
//        }
//        return instance;
//    }

    //DCL
//    private static Singleton mInstance = null;
//    private Singleton() {
//    }
//    public void doSomething() {
//        System.out.println("do sth.");
//    }
//
//    public static Singleton getInstance() {
//        if (mInstance == null){
//            synchronized (Singleton.class){
//                if (mInstance == null) {
//                    mInstance = new Singleton();
//                }
//            }
//        }
//        return mInstance;
//    }

    //防止反序列化重新创建新对象
//    private Object readResolve() throws ObjectStreamException {
//        return mInstance;
//    }
}
