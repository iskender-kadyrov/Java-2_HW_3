package com.company;

public class LimitException extends Exception{
    private Double remainingAmount;

    public LimitException(String message, double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }



    public Double getRemainingAmount() {
        return remainingAmount;
    }
}
