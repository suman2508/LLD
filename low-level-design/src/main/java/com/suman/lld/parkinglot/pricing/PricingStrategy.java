package com.suman.lld.parkinglot.pricing;

public interface PricingStrategy {
    double calculate(long durationMillis); 
}
