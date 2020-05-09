package com.design.strategy;

/**
 * 具体的策略类
 */
public class AddAlgorithmStrategy implements IStrategy{
    @Override
    public void algorithm(int a, int b) {
        System.out.println("a + b = " + (a + b));
    }
}
