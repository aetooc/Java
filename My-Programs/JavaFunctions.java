package com.company;

import java.util.Scanner;

public class JavaFunctions {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Two Values: ");
        float valOne = sc.nextFloat();
        float valTwo = sc.nextFloat();

        JavaFunctions call = new JavaFunctions();

        float result = call.Addition(valOne, valTwo);
        System.out.println(valOne + " + " + valTwo + " = " + result );

    }

    public float Addition(float numOne, float numTwo){
        return numOne + numTwo;
    }
}
