package com.example.yaoobs.anothersample.AndroidSourceDesignPatternsAnalysisPractice;

import android.graphics.Bitmap;

/**
 * Created by yaoobs on 2017/9/6.
 */

public interface ImageCache {
    public Bitmap get(String url);
    public void put(String url, Bitmap bmp);
}
