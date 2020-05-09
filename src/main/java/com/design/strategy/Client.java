package com.design.strategy;

import org.junit.Test;

public class Client {

    @Test
    public void test() {
        int a = 9;
        int b = 3;

        StrategyContext context = new StrategyContext(new AddAlgorithmStrategy());
        context.contextMethod(a, b);

        context = new StrategyContext(new DecreaseAlgorithmStrategy());
        context.contextMethod(a, b);
    }

    @Test
    public void test0() {
        String uid = "13174";
        double account = 800;

        PaymentContext context = new PaymentContext(new AliPay());
        context.executeStrategy(uid, account);

        context = new PaymentContext(new JDPay());
        context.executeStrategy(uid, account);

        context = new PaymentContext(new WechatPay());
        context.executeStrategy(uid, account);
    }
}
