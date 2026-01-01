package com.suman.lld.parkinglot;

import java.util.ArrayList;
import java.util.List;

import com.suman.lld.parkinglot.gates.EntranceGate;
import com.suman.lld.parkinglot.gates.ExitGate;
import com.suman.lld.parkinglot.manager.ParkingSpotManager;
import com.suman.lld.parkinglot.manager.ParkingSpotManagerFactory;
import com.suman.lld.parkinglot.parking.FourWheelerSpot;
import com.suman.lld.parkinglot.parking.ParkingSpot;
import com.suman.lld.parkinglot.parking.TwoWheelerSpot;
import com.suman.lld.parkinglot.pricing.CostComputation;
import com.suman.lld.parkinglot.pricing.CostComputationFactory;
import com.suman.lld.parkinglot.strategy.DefaultParkingStrategy;
import com.suman.lld.parkinglot.strategy.ParkingStrategy;
import com.suman.lld.parkinglot.ticket.ParkingTicket;
import com.suman.lld.parkinglot.vehicle.TwoWheeler;
import com.suman.lld.parkinglot.vehicle.Vehicle;


public class Main {

    public static void main(String[]args) {
        System.out.println("Parking Lot System");

        // 1. Create parkingspots
        List<ParkingSpot> spots = new ArrayList<>();
        spots.add(new TwoWheelerSpot("T1"));
        spots.add(new TwoWheelerSpot("T2"));
        spots.add(new FourWheelerSpot("F1"));

        // 2. Choose parking strategy
        ParkingStrategy parkingStrategy = new DefaultParkingStrategy();

        // 3. Create ParkingSpotManager via Factory
        ParkingSpotManager manager = ParkingSpotManagerFactory.create(spots,parkingStrategy);

        // 4. Create EntranceGate
        EntranceGate entranceGate = new EntranceGate(manager);

        // 5. Create CostComputation via Factory
        CostComputation costComputation = CostComputationFactory.createHourly();

        //6. Create ExitGate
        ExitGate exitGate = new ExitGate(costComputation);

        //7. Vehicle enters
        Vehicle bike = new TwoWheeler("MH14-AB-0679");
        ParkingTicket ticket = entranceGate.enter(bike);

        // Simulate parking duration 
        try{
            Thread.sleep(3000); // 3 seconds
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }

        //8. Vehicle Exits
        double cost = exitGate.exit(ticket);

        System.out.println("Parking cost for vehicle " + bike.getVehicleNumber() + " is: " + cost);
    }

}
