package com.company;

import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int userInput = sc.nextInt();


        String s = Integer.toString(userInput);

        if (userInput < -100 || userInput > 100){
            System.out.println("Wrong Answer");
        }
        else
            System.out.println("Good job");
    }

}
