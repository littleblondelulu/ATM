package com.theironyard.charlotte;

import java.util.Scanner;

import static java.lang.Double.valueOf;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static double accountBalance;


    public static void main(String[] args) throws Exception {

        accountBalance = 100.00;

        System.out.println("Hi, please enter your name.");
        String name = Main.scanner.nextLine();
            if(name.length() < 1) {
                throw new Exception("Invalid name");
        }

       // public static void transaction() throws Exception {
            System.out.println("Please select what you would like to do [Check Balance/Withdraw/Cancel]");
            String transaction = Main.scanner.nextLine();

            if(transaction.equalsIgnoreCase("Check Balance")){
                System.out.println("Your balance is $" + accountBalance);
        }

            else if(transaction.equalsIgnoreCase("Withdraw")) {
                System.out.println("How much would you like to withdraw?");
                double withdrawAmount = Double.valueOf(Main.scanner.nextLine());

                    if(withdrawAmount != 5 && withdrawAmount != 10 && withdrawAmount != 20 || withdrawAmount > 100) {
                        throw new Exception("Invalid amount");
                }
                    else {
                    System.out.println("Thank you. Please take your cash from the ATM.");
                    System.out.println("Your ending balance is $" + (accountBalance - withdrawAmount));

                }

        }

            else {

                return;

            }
    }


}

