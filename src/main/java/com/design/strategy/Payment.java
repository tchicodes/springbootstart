package com.design.strategy;

public abstract class Payment {

    public abstract String getName();

    public abstract double queryAccount(String uid);

    public void pay(String uid, double account) {
        if (account > queryAccount(uid)) {
            System.err.println("用户：" + uid + "， " + getName() + "金额不足, 账单：" + account + "余额：" + queryAccount(uid));
            return;
        }
        System.out.println("用户：" + uid + ", 支付成功， 余额：" + (queryAccount(uid) - account));
    }

}
