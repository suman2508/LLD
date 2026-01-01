package com.suman.lld.parkinglot.pricing;

public class HourlyPricingStrategy implements PricingStrategy {
    
    @Override
    public double calculate(long durationMillis) {
       return  Math.ceil(durationMillis / (1000.0 * 60 * 60)) * 50 ; // Example: $50 per hour 
    }

}
