package com.suman.lld.parkinglot.parking;

import com.suman.lld.parkinglot.vehicle.VehicleType;

public abstract class ParkingSpot {
    @SuppressWarnings("unused")
    private final String spotId;
    private boolean isOccupied;

    protected ParkingSpot(String spotId){
        this.spotId=spotId;
    }

    public boolean isFree(){
        return !isOccupied;
    }

    public void occupy(){
        isOccupied=true;
    }

    public void vacateSpot(){
        isOccupied=false;
    }

    public abstract VehicleType supportedVehicleType();
}
