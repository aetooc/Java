package com.company;

import java.util.Scanner;

public class StdInOutII {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter Num:");
        int userNum = sc.nextInt();

        // System.out.println("Enter Double:");
        double userDouble = sc.nextDouble();

        // Consume newline left-over
        sc.nextLine();

        // System.out.println("Enter String:");
        String userStr = sc.nextLine();

        System.out.println("String: " + userStr);
        System.out.println("Double: " + userDouble);
        System.out.println("Int: " + userNum);

    }
}


