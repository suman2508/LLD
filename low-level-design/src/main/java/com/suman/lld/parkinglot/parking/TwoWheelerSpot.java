package com.suman.lld.parkinglot.parking;

import com.suman.lld.parkinglot.vehicle.VehicleType;

public class TwoWheelerSpot extends ParkingSpot {
    
    public TwoWheelerSpot(String spotId) {
        super(spotId);
    }

    @Override
    public VehicleType supportedVehicleType() {
        return VehicleType.TWO_WHEELER;
    }

}
