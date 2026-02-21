package org.parkinglot.gate;

import org.parkinglot.floorslot.FloorWithSlot;

import java.util.List;

public class EntryGate implements Gate {

    private String gateType;

    public EntryGate(String gateType) {
        this.gateType = gateType;
    }

    public String getGateType() {
        return gateType;
    }

    public void setGateType(String gateType) {
        this.gateType = gateType;
    }

    @Override
    public void processParking(String gateType, String vehicleNo, String type) {

    }

    private boolean checkAvailability(List<FloorWithSlot> dataList, String matchType) {

        for (FloorWithSlot slot : dataList) {
            if (!slot.isIsOccupied() && slot.getType().getType().equalsIgnoreCase(matchType)) {
                System.out.println("Parking slot is available !!");
            } else throw new RuntimeException("No slot found !!");
        }
        return false;
    }
}
