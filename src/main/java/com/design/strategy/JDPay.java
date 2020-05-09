package com.design.strategy;

public class JDPay extends Payment{
    @Override
    public String getName() {
        return "京东支付";
    }

    @Override
    public double queryAccount(String uid) {
        return 500;
    }
}
