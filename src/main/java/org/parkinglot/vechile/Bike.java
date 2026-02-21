package org.parkinglot.vechile;

public class Bike implements Vechile {

    private String vehicleNo;
    private String type;

    public Bike(String vehicleNo, String type) {
        this.vehicleNo = vehicleNo;
        this.type = type;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void vechileInfo(String vechileNo, String type) {

    }
}
