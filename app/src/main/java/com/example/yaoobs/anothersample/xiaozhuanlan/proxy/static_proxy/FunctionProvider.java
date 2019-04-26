package com.example.yaoobs.anothersample.xiaozhuanlan.proxy.static_proxy;

/**
 * author yaozheng
 * introduce : 功能提供者
 * PACKAGE_NAME com.eastmoney.android.fund.activity
 * PROJECT_NAME FundAs
 * DATE  2019/4/25 7:30 PM
 */
class FunctionProvider implements IFunction {
    @Override
    public void doAThing() {
        System.out.print("do A");
    }
}
