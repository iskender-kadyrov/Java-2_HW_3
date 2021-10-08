package com.company;

public class BankAccount {
    private double amount;
    //private int sum;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount += sum;
    }

//    public int getSum() {
//        return sum;
//    }

    public void withdraw(int sum) throws LimitException {
        if (amount- sum <0) {
            LimitException ex = new LimitException("Requested amount is more than remaining funds. Available funds: "+ amount, getAmount());
//            amount -= ex.getRemainingAmount();
            // amount = amount - getRemainingAmount;
            throw ex;
        } else amount = (int) (amount - sum);
    }
}
