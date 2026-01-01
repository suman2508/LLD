package com.suman.lld.parkinglot.manager;

import java.util.List;

import com.suman.lld.parkinglot.parking.ParkingSpot;
import com.suman.lld.parkinglot.strategy.ParkingStrategy;



public class ParkingSpotManagerFactory {

    public static ParkingSpotManager create(
        List<ParkingSpot> spots,
        ParkingStrategy strategy
    ){
        return new ParkingSpotManager(spots,strategy);
    }

}
