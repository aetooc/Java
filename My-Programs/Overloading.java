package com.company;

public class Overloading {
    public static void main(String [] args){
        Overloading obj = new Overloading();
        int numOne = 10, numTwo = 20;
        float floatOne = 10.5f, floatTwo = 20.0f;

        int resultInt = obj.Multiplication(numOne, numTwo);
        float resultFloat = obj.Multiplication(floatOne, floatTwo);

        System.out.println();
        System.out.println("\tInt Answer: " + resultInt + "\n\tFloat Answer: " + resultFloat);

    }

    public float Multiplication(float n, float m){
        return n*m;
    }

    public int Multiplication(int n, int m) {
        return n * m;
    }
}
