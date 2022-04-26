package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Loop2 {
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter val of N");
        int N = sc.nextInt();
        int result;
        
        for(int i = 0; i < N; i++){
            
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            result = a;

            for(int j = 0; j < n; j++){
                result += Math.pow(2,j) * b;
                System.out.print(result + " ");
            }
            System.out.println();
        }
    }
}
