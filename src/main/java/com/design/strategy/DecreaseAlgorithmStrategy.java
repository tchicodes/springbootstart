package com.design.strategy;

public class DecreaseAlgorithmStrategy implements IStrategy {
    @Override
    public void algorithm(int a, int b) {
        System.out.println("a - b = " + (a - b));
    }
}
