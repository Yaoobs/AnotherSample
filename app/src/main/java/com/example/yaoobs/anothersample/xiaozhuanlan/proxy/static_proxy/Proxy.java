package com.example.yaoobs.anothersample.xiaozhuanlan.proxy.static_proxy;

/**
 * author yaozheng
 * introduce : 功能代理者
 * PACKAGE_NAME com.eastmoney.android.fund.activity
 * PROJECT_NAME FundAs
 * DATE  2019/4/25 7:31 PM
 */
class Proxy implements IFunction {

    private FunctionProvider provider;

    Proxy(FunctionProvider provider) {
        this.provider = provider;
    }

    @Override
    public void doAThing() {
        provider.doAThing();
    }
}
