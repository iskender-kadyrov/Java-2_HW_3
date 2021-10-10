package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount += sum;
    }

    public void withdraw(int sum) throws LimitException {
        if (amount < sum) {
            LimitException ex = new LimitException("Requested amount is more than remaining funds. Available funds: "+ amount, getAmount());
            throw ex;
        } else amount = (int) (amount - sum);
    }
}
