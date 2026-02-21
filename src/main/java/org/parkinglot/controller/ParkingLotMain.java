package org.parkinglot.controller;

import org.parkinglot.floorslot.FloorWithSlot;
import org.parkinglot.gate.Gate;
import org.parkinglot.gate.GateFactory;
import org.parkinglot.util.EnumType;

import java.util.List;
import java.util.Scanner;

public class ParkingLotMain {

    static Scanner sc = new Scanner(System.in);
    static boolean isComplete = false;
    private static String vehicleNo;
    private static String vehicleType;

    public static void main(String[] args) {
        int noOfFloors = 1;
        int noOfSlots = 4;
        List<FloorWithSlot> floorWithSlots = FloorWithSlot.createLot(noOfFloors, noOfSlots);
        System.out.println(floorWithSlots.size());
        System.out.println(floorWithSlots);
        showMenu();
        do {
            int start = sc.nextInt();
            processMenu(start);
        } while (!isComplete);
    }

    private static void showMenu() {
        System.out.println("Welcome to parking lot !!");
        System.out.println("Choose menu option:");
        System.out.println("Enter Parking:0");
        System.out.println("Exit Parking:1");
        System.out.println("Exit Menu:2");

    }

    private static void processMenu(int no) {
        GateFactory gateFactory = new GateFactory();
        Gate gate;
        switch (no) {
            case 0:
                System.out.println("Enter Vehicle no:");
                vehicleNo = sc.next();
                System.out.println("Enter Vehicle type:");
                vehicleType = sc.next();
                gate = gateFactory.getGate(EnumType.ENTRY.getType());
                gate.processParking(EnumType.ENTRY.getType(), vehicleNo, vehicleType);
                break;
            case 1:
                System.out.println("Please enter payment option:");
                System.out.println("Debit,Credit,Cash");
                String pay = sc.next();
                gate = gateFactory.getGate(EnumType.EXIT.getType());
                gate.processParking(EnumType.EXIT.getType(), vehicleNo, vehicleType);
                System.out.println("Process Completed !!");
                isComplete = true;
                System.exit(0);
                break;
            case 2:
                System.out.println("Process Completed !!");
                isComplete = true;
                System.exit(0);
                break;
            case 3:
                System.out.println("No parking, please exit !:3");
                isComplete = true;
                System.exit(0);
                break;
        }
    }
}
