package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws LimitException {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        //Integer depositAmount = scanner.nextInt();
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);
        System.out.println(bankAccount.getAmount());
        int remainingAmount;

        while (true) {
            try {
                System.out.println("You balance: " + bankAccount.getAmount());
                bankAccount.withdraw(6000);
                System.out.println("You withdrew: 6000");
//                System.out.println("Do you want to withdraw the" + bankAccount.getAmount());

            } catch (LimitException limitException) {
                System.out.println(limitException.getMessage());
                System.out.println("You may withdraw only: " + bankAccount.getAmount());
                break;
            }
//            if (scanner.nextLine() == "y") {
//                remainingAmount = (int) bankAccount.getAmount();
//                bankAccount.withdraw(remainingAmount);
//                System.out.println("You withdrew: " + remainingAmount);
//            }
//            if (scanner.nextLine() == "n") {
//                System.out.println("Your balance is: " + bankAccount.getAmount());
//            } else System.out.println("Your balance is: " + bankAccount.getAmount());
        }
    }
}
