package com.suman.lld.parkinglot.gates;

import com.suman.lld.parkinglot.pricing.CostComputation;
import com.suman.lld.parkinglot.ticket.ParkingTicket;

public class ExitGate {
     private final CostComputation costComputation;

    public ExitGate(CostComputation costComputation){
        this.costComputation = costComputation;
    }

    public double exit(ParkingTicket ticket){
        ticket.closeTicket();
        ticket.getSpot().vacateSpot();
        return costComputation.computeCost(ticket.getDuration());
    }
}

