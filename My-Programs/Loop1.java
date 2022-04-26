package com.company;

import java.util.Scanner;

public class Loop1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter any Number:");
        int userInput = sc.nextInt();
        int output = 0;

        for(int i = 1; i < 11; i++){
            output = i * userInput;
            System.out.println(userInput + " x " + i + " = " + output);
        }
        sc.close();

    }
}
