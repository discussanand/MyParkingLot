package org.parkinglot.util;

public enum EnumType {

    CAR("CAR"),
    BIKE("BIKE"),
    EXIT("EXIT"),
    ENTRY("ENTRY");

    private final String type;

    EnumType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
