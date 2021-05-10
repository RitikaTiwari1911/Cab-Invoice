package com.invoiceGenerator;

public class InvoiceGenerator {
    private static final int MINIMUM_COST_PER_KM = 10 ;
    private static final int COST_PER_TIME = 1;

    public double calculateFare(double distance, int time) {
        return  distance * MINIMUM_COST_PER_KM + time * COST_PER_TIME;
    }
}