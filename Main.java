/*
Mini Project 1
Group #6: John Trygier, Andrew Ireton, Kayla Nehus, John Lewis 
Date: 2/17/21
*/

import java.util.Random;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {


    Scanner s = new Scanner(System.in);
    Random r = new Random();

    System.out.println("Welcome to the guessing game!");    
    System.out.println("Please enter any positive whole number: ");

    int userNum = s.nextInt();
    int randomNum = r.nextInt(userNum);

    System.out.println("A random number to guess has been generated.");

    playGame(randomNum, userNum);

    }
    static void playGame(int guessNum, int inputNum) {

        System.out.println("Please guess a number between 0 and " + inputNum);
          Scanner sc = new Scanner(System.in);
          int userGuess = sc.nextInt();        
          int numTries = 1;
        while(userGuess != guessNum) {
          if(userGuess > guessNum)
            System.out.println("Guess lower!");
          else 
            System.out.println("Guess higher!");
          System.out.println("Enter a new guess: ");
          userGuess = sc.nextInt();
          numTries = numTries + 1;
        }
        System.out.println("Great, you win! It took you " + numTries + " tries.");
    }
}