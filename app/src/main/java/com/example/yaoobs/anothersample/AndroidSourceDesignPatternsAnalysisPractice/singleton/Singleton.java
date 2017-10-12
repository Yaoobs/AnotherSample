package com.example.yaoobs.anothersample.AndroidSourceDesignPatternsAnalysisPractice.singleton;

/**
 * Created by yaoobs on 2017/10/12.
 */

// 懒汉模式 Double Check Lock
public class Singleton {
    private static Singleton mInstance = null;
    private Singleton() {}
    public void doSomething(){
        System.out.println("do sth.");
    }

    private static Singleton getInstance(){
        synchronized (Singleton.class) {
            if (mInstance == null) {
                mInstance = new Singleton();
            }
        }
        return mInstance;
    }
}
