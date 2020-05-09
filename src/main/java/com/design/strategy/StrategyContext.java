package com.design.strategy;

/**
 * 策略上下文， 用来决定使用核中策略及策略切换
 */
public class StrategyContext {

    private IStrategy strategy;

    public StrategyContext(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void contextMethod(int a, int b) {
        strategy.algorithm(a, b);
    }

}
