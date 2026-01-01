package com.suman.lld.parkinglot.parking;

import com.suman.lld.parkinglot.vehicle.VehicleType;

public class FourWheelerSpot extends ParkingSpot{
    
    public FourWheelerSpot(String spotId){
        super(spotId);
    }

    @Override
    public VehicleType supportedVehicleType() {
        return VehicleType.FOUR_WHEELER;
    }

}
