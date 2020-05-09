package com.design.strategy;

public class WechatPay extends Payment{
    @Override
    public String getName() {
        return "微信支付";
    }

    @Override
    public double queryAccount(String uid) {
        return 800;
    }
}
