package com.company;

import java.util.Scanner;

/*
Task
Given an integer, n, perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.
*/

public class IfElse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter: ");
        int userNum = sc.nextInt();

        int mod = userNum % 2;

        if (mod != 0)
            System.out.println("Weird");

        else if (mod == 0 && userNum >= 2 && userNum <= 5)
            System.out.println("Not Weird");

        else if (mod == 0 && userNum >= 6 && userNum <= 20)
            System.out.println("Weird");

        else if (mod == 0 && userNum > 20)
            System.out.println("Not Weird");
    }
}


