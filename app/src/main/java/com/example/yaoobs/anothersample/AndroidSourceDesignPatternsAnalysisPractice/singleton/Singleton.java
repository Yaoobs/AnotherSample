package com.example.yaoobs.anothersample.AndroidSourceDesignPatternsAnalysisPractice.singleton;

/**
 * Created by yaoobs on 2017/10/12.
 */

// 懒汉模式
public class Singleton {
    private static Singleton instance;
    private Singleton() {}

    private static synchronized Singleton getInstance(){
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
