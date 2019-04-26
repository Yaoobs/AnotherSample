package com.example.yaoobs.anothersample.xiaozhuanlan.proxy.static_proxy;

import com.eastmoney.android.fund.activity.proxy.common.AFunc;
import com.eastmoney.android.fund.activity.proxy.common.BFunc;
import com.eastmoney.android.fund.activity.proxy.common.IAFunc;
import com.eastmoney.android.fund.activity.proxy.common.IBFunc;

/**
 * author yaozheng
 * introduce :
 * PACKAGE_NAME com.eastmoney.android.fund.activity.static_proxy
 * PROJECT_NAME FundAs
 * DATE  2019/4/25 7:37 PM
 */
class TimeConsumeProxy implements IAFunc, IBFunc {

    private AFunc a;
    private BFunc b;

    TimeConsumeProxy(AFunc a, BFunc b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void doA() {
        long start = System.currentTimeMillis();

        a.doA();

        System.out.println("耗时：" + (System.currentTimeMillis() - start));
    }

    @Override
    public void doB() {
        long start = System.currentTimeMillis();

        b.doB();

        System.out.println("耗时：" + (System.currentTimeMillis() - start));
    }
}
