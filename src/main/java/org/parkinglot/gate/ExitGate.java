package org.parkinglot.gate;

public class ExitGate implements Gate {

    private String gateType;

    public ExitGate(String gateType) {
        this.gateType = gateType;
    }

    public String getGateType() {
        return gateType;
    }

    public void setGateType(String gateType) {
        this.gateType = gateType;
    }

    @Override
    public void processParking(String gateType, String vechileNo, String type) {

    }
}
