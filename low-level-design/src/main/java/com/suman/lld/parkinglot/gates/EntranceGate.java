package com.suman.lld.parkinglot.gates;
import java.util.UUID;

import com.suman.lld.parkinglot.manager.ParkingSpotManager;
import com.suman.lld.parkinglot.parking.ParkingSpot;
import com.suman.lld.parkinglot.ticket.ParkingTicket;
import com.suman.lld.parkinglot.vehicle.Vehicle;



public class EntranceGate {

    private final ParkingSpotManager manager;

    public EntranceGate(ParkingSpotManager manager){
        this.manager = manager;
    }

    public ParkingTicket enter(Vehicle vehicle){
        ParkingSpot spot = manager.allocateSpot(vehicle);
        if(spot == null){
            throw new IllegalStateException("No available parking spots available for vehicle type:  " + vehicle.getVehicleType());
        }

        return new ParkingTicket(UUID.randomUUID().toString(), vehicle, spot);
    }

}
