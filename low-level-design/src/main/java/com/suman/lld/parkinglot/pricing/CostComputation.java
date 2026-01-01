package com.suman.lld.parkinglot.pricing;

public class CostComputation {

    private final PricingStrategy pricingStrategy;
    public CostComputation(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public double computeCost(long  duration) {
        return pricingStrategy.calculate(duration);
    }

}
