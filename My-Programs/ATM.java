package com.company;

import java.util.Scanner;

public class ATM {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int totalAmount = 0, amount;
        String choice;

        while (true) {
            System.out.print("Press D for Deposit, W for withdraw or Q for quit: ");
            choice = sc.next();

            if(choice.equals("D") || choice.equals("d")){
                System.out.print("Enter amount: ");
                amount = sc.nextInt();
                totalAmount += amount;
            }

            else if(choice.equals("W") || choice.equals("w")){

                if (totalAmount != 0) {
                    System.out.print("Enter amount: ");
                    amount = sc.nextInt();

                    if (totalAmount > amount)
                        totalAmount -= amount;
                    else
                        System.out.println("Insufficient Balance to Withdraw");
                }

                else
                    System.out.println("Zero Balance!");
            }

            else if (choice.equals("Q") || choice.equals("q")){
                System.out.print("Do you want to see your balance (y/n): ");
                choice = sc.next();
                if (choice.equals("n") || choice.equals("N")) {
                    System.out.println("Have a Good Day!");
                    break;
                }
                else{
                    System.out.println("\nTotal Amount: " + totalAmount + "\nHave a Good Day!");
                    break;
                }

            }

        }

    }
}
