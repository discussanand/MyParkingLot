package org.parkinglot.floorslot;

import org.parkinglot.util.EnumType;

import java.util.ArrayList;
import java.util.List;

public class FloorWithSlot {

    private int noOfFloors;
    private int noOfSlots;
    private boolean isOccupied = false;
    private String vehicleNo;
    private static final List<FloorWithSlot> floorWithSlots = new ArrayList<>();
    EnumType type;

    public FloorWithSlot(int noOfFloors, int noOfSlots, EnumType type, boolean isOccupied, String vehicleNo) {
        Floor floor = new Floor(noOfFloors);
        Slot slot = new Slot(noOfSlots);
        this.type = type;
        this.isOccupied = isOccupied;
        this.vehicleNo = vehicleNo;
        this.noOfFloors = floor.getFloorNo();
        this.noOfSlots = slot.getSlotNo();

    }

    public int getFloorNo() {
        return noOfFloors;
    }

    public void setFloorNo(int floorNo) {
        this.noOfFloors = floorNo;
    }

    public int getNoOfSlots() {
        return noOfSlots;
    }

    public void setNoOfSlots(int noOfSlots) {
        this.noOfSlots = noOfSlots;
    }

    public EnumType getType() {
        return type;
    }

    public void setType(EnumType type) {
        this.type = type;
    }

    public boolean isIsOccupied() {
        return isOccupied;
    }

    public void setIsOccupied(boolean isOccupied) {
        this.isOccupied = isOccupied;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }


    public static List<FloorWithSlot> createLot(int noOfFloors, int noOfSlots) {
        for (int i = 1; i < noOfFloors + 1; i++) {
            for (int j = 1; j < noOfSlots + 1; j++) {
                if (j % 2 == 0) {
                    floorWithSlots.add(new FloorWithSlot(i, j, EnumType.CAR, false, ""));
                } else
                    floorWithSlots.add(new FloorWithSlot(i, j, EnumType.BIKE, false, ""));

            }
        }
        return floorWithSlots;
    }

    @Override
    public String toString() {
        return "FloorWithSlot{" +
                "noOfFloors=" + noOfFloors +
                ", noOfSlots=" + noOfSlots +
                ", type=" + type +
                ", isOccupied=" + isOccupied +
                '}';
    }
}

