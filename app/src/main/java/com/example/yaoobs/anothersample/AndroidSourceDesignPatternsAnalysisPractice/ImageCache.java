package com.example.yaoobs.anothersample.AndroidSourceDesignPatternsAnalysisPractice;

import android.graphics.Bitmap;

/**
 * Created by yaoobs on 2017/9/6.
 */

public interface ImageCache {
    public Bitmap get(String url);
    public void put(String url, Bitmap bmp);
}

////窗口类
//public class Window {
//    public void show(View child){
//        child.draw();
//    }
//}
//
////建立视图抽象，测量视图的宽高为公用代码，绘制实现交给具体的子类
//public abstract class View {
//    public abstract void draw();
//    public void measure(int width,int height) {
//        //测量视图大小
//    }
//}
//
////按钮类的具体实现
//public class Button extends View {
//    public void draw(){
//        //绘制按钮
//    }
//}
////TextView的具体实现
//public class TextView extends View {
//    public void draw(){
//        //绘制文本
//    }
//}


























