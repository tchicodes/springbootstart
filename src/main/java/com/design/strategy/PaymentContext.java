package com.design.strategy;

public class PaymentContext {

    private Payment payment;

    public PaymentContext(Payment payment) {
        this.payment = payment;
    }

    public void executeStrategy(String uid, double account) {
        payment.pay(uid, account);
    }

}
