package com.company;

import java.util.Scanner;

public class StarPattern {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();
        String star = "* ";

        for(int i = 0; i < N; i++){
            System.out.print(star);
            star += "* ";
            System.out.println();
        }

    }
}
