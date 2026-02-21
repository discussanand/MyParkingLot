package org.parkinglot.payment;

public class CreditPayment implements Payment {
    @Override
    public void processPayment() {
        System.out.println("Credit Payment !!");
    }
}
