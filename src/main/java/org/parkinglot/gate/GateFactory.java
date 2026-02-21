package org.parkinglot.gate;

import org.parkinglot.util.EnumType;

public class GateFactory {

    Gate gate;

    public Gate getGate(String gateType) {
        if (gateType.equalsIgnoreCase(EnumType.ENTRY.getType())) {
            gate = new EntryGate(EnumType.ENTRY.getType());
        } else {
            gate = new ExitGate(EnumType.EXIT.getType());
        }
        return gate;
    }
}
