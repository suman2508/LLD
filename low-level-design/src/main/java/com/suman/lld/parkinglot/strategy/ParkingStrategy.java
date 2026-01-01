package com.suman.lld.parkinglot.strategy;

import java.util.List;

import com.suman.lld.parkinglot.parking.ParkingSpot;


public interface ParkingStrategy {

    ParkingSpot findSpot(List<ParkingSpot> spots);
    
}
