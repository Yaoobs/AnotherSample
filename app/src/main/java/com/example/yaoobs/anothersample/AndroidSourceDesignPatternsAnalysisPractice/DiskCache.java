package com.example.yaoobs.anothersample.AndroidSourceDesignPatternsAnalysisPractice;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by yaoobs on 2017/9/6.
 */

public class DiskCache implements ImageCache {
    static String cacheDir = "sdcard/cache/";
    private DiskLruCache mDiskLruCache;

    //从缓存中获取图片
    public Bitmap get(String url) {
        return BitmapFactory.decodeFile(cacheDir + url);
    }

    //把图片缓存到内存中
//    public void put(String url, Bitmap bmp) {
//        FileOutputStream fileOutputStream = null;
//        try{
//            fileOutputStream = new FileOutputStream(cacheDir + url);
//            bmp.compress(CompressFormat.PNG,100,fileOutputStream);
//        } catch (FileNotFoundException e){
//            e.printStackTrace();
//        } finally {
//            CloseUtils.closeQuietly(fileOutputStream);
//        }

    public void put (String url,Bitmap value){
        DiskLruCache.Editor editor = null;
        try {
            //如果没有找到对应缓存,则准备从网络上请求数据，并写入缓存
            editor = mDiskLruCache.edit(url);
            if (editor!=null){
                OutputStream outputStream = editor.newOutputStream(0);
                if (writeBitmapToDisk(value,outputStream)){
                    //写入Disk缓存
                    editor.commit();
                } else {
                    editor.abort();
                }
                CloseUtils.closeQuietly(outputStream);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    }





















}
