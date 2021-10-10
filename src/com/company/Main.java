package com.company;


public class Main {

    public static void main(String[] args) throws LimitException {

        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);
        System.out.println(bankAccount.getAmount());

        while (true) {
            try {
                System.out.println("You balance is: " + bankAccount.getAmount());
                bankAccount.withdraw(6000);
                System.out.println("You withdrew: 6000");

            } catch (LimitException limitException) {
                System.out.println(limitException.getMessage());
                System.out.println("You may withdraw only: " + bankAccount.getAmount());
                System.out.println("You withdrew remaining amount: " + bankAccount.getAmount());
                bankAccount.withdraw((int) bankAccount.getAmount());
                System.out.println("Your balance is: " + bankAccount.getAmount());
                break;
            }
        }
    }
}
