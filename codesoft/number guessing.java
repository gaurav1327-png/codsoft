package codsoft;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessing {

    public static void main(String[] e) {
        Scanner SC = new Scanner(System.in);
        Random ran = new Random();

        int LBound = 1;
        int UBound = 100;
        int maximumAttempts = 5;
        int totalAttempts = 0;
        int score = 0;
        
        //Game starts from here

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between " + LBound + " and " + UBound + ".");
        System.out.println("Can you guess it? You have " + maximumAttempts + " attempts.");
        
        //computer generates random value

        boolean f=true;
        while (f) {
            int targetNumber = ran.nextInt(UBound - LBound + 1) + LBound;
            int attempts = 0;
            
            //computer asks your guess

            while (attempts < maximumAttempts) {
                System.out.print("Please Enter your guess: ");
                int userGuess = SC.nextInt();
                attempts++;

                if (userGuess == targetNumber) {       //if user guesses right number
                    System.out.println("Congratulations! You guessed the correct number.");
                    System.out.println("The guessed number is: "+ targetNumber);
                    score++;
                    break;
                } else if (userGuess < targetNumber) {	//if guessed number is in lower bound
                    System.out.println("Too low! Please try again.....");
                } else {								//if guessed number is in upper bound
                    System.out.println("Too high! Please try again....");
                }
            }

            totalAttempts += attempts;
           if(totalAttempts == maximumAttempts)   
        	   System.out.println("Sorry your attempts are over...");
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = SC.next();
            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
        }
        
        //prints final output after game

        System.out.println("Game over! Your total score:");
        System.out.println("Rounds won: " + score);
        System.out.println("Total attempts: " + totalAttempts);
        SC.close();
}
}