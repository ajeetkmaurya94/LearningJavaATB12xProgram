package ex_05_While;

import java.util.Random;
import java.util.Scanner;

public class Lab23_While_GuessingGame {

    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber= random.nextInt(100)+1;
        System.out.println("Number to Guess");

        // Guess a number between 0 to 100
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int guess;
        int attempts = 0;


        while(true){

            guess = sc.nextInt();
            attempts++;

            if(guess < randomNumber){

                System.out.println("To Low, ");
            }
           else if(guess > randomNumber){

                System.out.println("To High, ");
            }
          else{
                System.out.println("You are correct! Attempts are :" + attempts );

            }

        }





    }
}
