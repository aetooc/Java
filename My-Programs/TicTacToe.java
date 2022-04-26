package com.company;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String repeatChoice;
        // Names of both players
        System.out.print("Player One, Please Enter Your Name: ");
        String playerName1 = sc.nextLine();
        System.out.print("Player Two, Please Enter Your Name: ");
        String playerName2 = sc.nextLine();

        do {

            // Players Choice
            System.out.print(playerName1 + ", do you want to choose rock, paper or scissors?(R/P/S)");
            String choiceOne = sc.nextLine();
            System.out.print(playerName2 + ", do you want to choose rock, paper or scissors?(R/P/S)");
            String choiceTwo = sc.nextLine();


            if (choiceOne.equals(choiceTwo)){
                System.out.println("Game Tie");
            }
            else if( (choiceOne.equals("R") && choiceTwo.equals("S") ) || (choiceOne.equals("S") && choiceTwo.equals("P") ) || (choiceOne.equals("P") && choiceTwo.equals("R") ) ) {
                System.out.println(playerName1 + " Wins!");
            }
            else if( (choiceOne.equals("R") && choiceTwo.equals("P") ) || (choiceOne.equals("S") && choiceTwo.equals("R") ) || (choiceOne.equals("P") && choiceTwo.equals("S") ) ) {
                System.out.println(playerName2 + " Wins!");
            }
            System.out.println("Do you wanna play again: (Y/N)");
            repeatChoice = sc.nextLine();

        }while(repeatChoice.equals("Y") || repeatChoice.equals("y"));

        System.out.println("Thanks for Playing!\nHave a Good Day!");

    } 
}
