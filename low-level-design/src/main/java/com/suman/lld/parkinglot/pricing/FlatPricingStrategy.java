package com.suman.lld.parkinglot.pricing;

public class FlatPricingStrategy implements PricingStrategy {
    
    private final double flatRate = 100.0; // Example: $100 flat rate

    @Override
    public double calculate(long durationMillis) {
        return flatRate;
    }
}
