package com.suman.lld.parkinglot.strategy;

import java.util.List;

import com.suman.lld.parkinglot.parking.ParkingSpot;


public class DefaultParkingStrategy implements ParkingStrategy {

    @Override
    public ParkingSpot findSpot(List<ParkingSpot> spots){
        return spots.stream()
                .filter((spot)->spot.isFree())
                .findFirst()
                .orElseThrow(()-> new RuntimeException("No parking spot available"));
    }
}
