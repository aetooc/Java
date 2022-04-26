package com.company;

public class Swapping {
    public static void main( String [] args){

        float numOne = 5.5f;
        float numTwo = 6.5f;

        Swapping obj = new Swapping();

        System.out.println("\nBefore Swapping, numOne = " + numOne + ", numTwo = " + numTwo );
        obj.Swap(numOne, numTwo);

        float result = obj.Addition(numOne, numTwo);
        System.out.print("After Addition: " + result);
        System.out.println();
    }

    public void Swap(float a, float b){
        float temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping, numOne = " + a + ", numTwo = " + b );
    }

    public float Addition(float numOne, float numTwo){
        return numOne + numTwo;
    }
}
