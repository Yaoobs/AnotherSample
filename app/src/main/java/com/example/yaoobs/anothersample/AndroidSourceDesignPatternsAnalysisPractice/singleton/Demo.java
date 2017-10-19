package com.example.yaoobs.anothersample.AndroidSourceDesignPatternsAnalysisPractice.singleton;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.os.UserHandle;
import android.support.annotation.MainThread;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by yaoobs on 2017/10/19.
 */

public class Demo {

    Context mContext;
    int mLayoutId;

    // ListView.java
    public View getView(int position, View converview, ViewGroup parent) {
        View itemView = null;
        if (converview == null) {
            itemView = LayoutInflater.from(mContext).inflate(mLayoutId, null);
        } else {

        }
        return itemView;
    }

//    public static LayoutInflater from(Context context) {
//        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        if (layoutInflater == null) {
//            throw new AssertionError("LayoutInflater not found.");
//        }
//        return layoutInflater;
//    }

//    public abstract class Context {
//
//    }

    //ActivityThread.java
    static volatile Handler sMainThreadHandler;
    public static void main(String[] args) {
//        Process.setArgV0("<pre-initialized>");
//        // 主线程消息循环
//        Looper.prepareMainLooper();
//        // 创建ActivityThread对象
//        ActivityThread thread = new ActivityThread();
//        thread.attach(false);
//
//        if (sMainThreadHandler == null) {
//            sMainThreadHandler = thread.getHandler();
//        }
//
//        AsyncTask.init();
//        Looper.loop();
    }

    private void attach(boolean system) {
//        sThreadLocal.set(this);
//        mSystemThread = system;
//        //不是系统应用的情况
//        if (!system) {
//            ViewRootImpl.addFirstDrawHandler(new Runnable() {
//                @Override
//                public void run() {
//                    ensureJitEnabled();
//                }
//            });
//
//            android.ddm.DdmHandleAppName.setAppName("<pre-initialized>",
//                    UserHandle.myUserId());
//            RuntimeInit.setApplicationObject(mAppThread.asBinder());
//            IActivityManager mgr = ActivityManagerNative.getDefault();
//            try {
//                //关联mAppThread
//                mgr.attachApplication(mAppThread);
//            } catch (RemoteException ex) {
//                throw ex.rethrowFromSystemServer();
//            }
//        } else {
//
//        }
    }

    //ActivityManagerService.java
//    private void handleLaunchActivity(ActivityClientRecord r, Intent customIntent) {
//        Activity a = performLaunchActivity(r, customIntent);
//    }

//    private Activity performLaunchActivity(ActivityClientRecord r, Intent customIntent) {
//            //创建Application 对象
//            //2. 获取Context对象
//            //3. 将appContext 等对象attach 到activity中
//            //4. 调用Activity 的 onCreate 方法
//            //5. 创建Context 对象,可以看到实现类是ContextImpl
//    }

//    public final class ContextImpl extends Context {

        //ServiceFetcher通过getService获取服务对象

        //1.Service 容器
        //2.注册服务器
        //3.静态语句块，第一次加载该类时执行(只执行一次，保证实例的唯一性)
        // 4. 根据key 获取对应的服务
//    }


























}
