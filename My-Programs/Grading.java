package com.company;

public class Grading {
    public static void main(String [] args){
        float percent = 50f;
        String remarks = "\nCongratulations! You have passed this course.\nGrade : ";

        if (percent >= 90)
            System.out.println(remarks + "A+");

        else if (percent >= 80 && percent < 90)
            System.out.println(remarks + "A");

        else if (percent >= 70 && percent < 80)
            System.out.println(remarks + "B");

        else if (percent >= 60 && percent < 70)
            System.out.println(remarks + "C");

        else if (percent >= 50 && percent < 60)
            System.out.println(remarks + "D");
        
        else
            System.out.println("Grade: F");
    }
}
