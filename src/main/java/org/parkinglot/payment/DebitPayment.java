package org.parkinglot.payment;

public class DebitPayment implements Payment{
    @Override
    public void processPayment() {
        System.out.println("Cash Payment !!");
    }
}
