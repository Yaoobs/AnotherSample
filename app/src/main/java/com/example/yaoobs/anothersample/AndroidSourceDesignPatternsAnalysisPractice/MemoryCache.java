package com.example.yaoobs.anothersample.AndroidSourceDesignPatternsAnalysisPractice;

import android.graphics.Bitmap;
import android.support.v4.util.LruCache;

/**
 * Created by yaoobs on 2017/9/6.
 */

//内存缓存MemoryCache类
public class MemoryCache implements ImageCache{
    //图片LRU缓存
    LruCache<String,Bitmap> mMemoryCache;

    public MemoryCache() {
        initImageCache();
    }

    private void initImageCache() {
        //计算可使用的最大内存
        final int maxMemory = (int) (Runtime.getRuntime().maxMemory() / 1024);
        //取四分之一的可用内存作为缓存
        final int cacheSize = maxMemory / 4;
        mMemoryCache = new LruCache<String,Bitmap>(cacheSize) {
            @Override
            protected int sizeOf(String key, Bitmap bitmap) {
                return bitmap.getRowBytes() * bitmap.getHeight() / 1024;
            }
        };
    }

    public void put(String url, Bitmap bitmap) {
        mMemoryCache.put(url, bitmap);
    }

    public Bitmap get(String url) {
        return mMemoryCache.get(url);
    }
}
