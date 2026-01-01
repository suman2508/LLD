package com.suman.lld.parkinglot.pricing;

public class CostComputationFactory {

    public static CostComputation createHourly() {
        return new CostComputation(new HourlyPricingStrategy());
    }

    public static CostComputation createFlat() {
        return new CostComputation(new FlatPricingStrategy());
    }

}
