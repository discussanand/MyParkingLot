package org.parkinglot.payment;

public class CashPayment implements Payment{
    @Override
    public void processPayment() {
        System.out.println("Debit Payment !!");
    }
}
