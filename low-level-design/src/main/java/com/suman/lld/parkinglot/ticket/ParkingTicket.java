package com.suman.lld.parkinglot.ticket;

import java.time.Instant;

import com.suman.lld.parkinglot.parking.ParkingSpot;
import com.suman.lld.parkinglot.vehicle.Vehicle;



public class ParkingTicket {

    private final String ticketId;
    private final Vehicle vehicle;
    private final ParkingSpot parkingspot;
    private Instant entryTime;
    private Instant exitTime;

    public ParkingTicket(String ticketId, Vehicle vehicle, ParkingSpot spot){
        this.ticketId = ticketId;
        this.vehicle = vehicle;
        this.parkingspot = spot;
        this.entryTime = Instant.now();
    }

    public void closeTicket(){
        this.exitTime = Instant.now();
    }

    public long getDuration(){
        if(exitTime == null){
            throw new IllegalStateException("Ticket is still open. Cannot calculate duration.");
        }
        return exitTime.getEpochSecond() - entryTime.getEpochSecond();
    }

    public ParkingSpot getSpot(){
        return this.parkingspot;
    }

}