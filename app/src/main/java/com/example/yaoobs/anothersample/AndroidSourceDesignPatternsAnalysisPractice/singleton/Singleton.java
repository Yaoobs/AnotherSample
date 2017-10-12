package com.example.yaoobs.anothersample.AndroidSourceDesignPatternsAnalysisPractice.singleton;

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
}
