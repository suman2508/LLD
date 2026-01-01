package com.suman.lld.parkinglot.manager;

import java.util.List;

import com.suman.lld.parkinglot.parking.ParkingSpot;
import com.suman.lld.parkinglot.strategy.ParkingStrategy;
import com.suman.lld.parkinglot.vehicle.Vehicle;



public class ParkingSpotManager {

    private final List<ParkingSpot> spots;
    private final ParkingStrategy strategy;

    public ParkingSpotManager(List<ParkingSpot> spots, ParkingStrategy strategy) {
        this.spots = spots;
        this.strategy = strategy;
    }

    public ParkingSpot allocateSpot(Vehicle vehicle){
        List<ParkingSpot> compatible = spots.stream()
                                            .filter(s -> s.supportedVehicleType() == vehicle.getVehicleType())
                                            .toList();

        ParkingSpot spot =strategy.findSpot(compatible);
    
        spot.occupy();
        return spot;
    }

}
