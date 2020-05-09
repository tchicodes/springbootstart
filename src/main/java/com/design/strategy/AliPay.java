package com.design.strategy;

public class AliPay extends Payment{
    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    public double queryAccount(String uid) {
        return 1000;
    }
}
