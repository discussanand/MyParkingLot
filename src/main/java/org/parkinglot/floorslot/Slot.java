package org.parkinglot.floorslot;

public class Slot {

    private int slotNo;
    private String type;


    public Slot(int slotNo) {
        this.slotNo = slotNo;
    }

    public int getSlotNo() {
        return slotNo;
    }

    public void setSlotNo(int slotNo) {
        this.slotNo = slotNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
