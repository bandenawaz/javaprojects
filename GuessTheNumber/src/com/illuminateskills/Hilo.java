package com.illuminateskills;

import java.util.Scanner;

public class Hilo {

	public static void main(String[] args) {
		
		//Lets get the number from the user
		Scanner sc = new Scanner(System.in);
		String playAgain = "";
		do {
		//Create a random number for the user to guess
		int theNumber  = (int) (Math.random() * 100 + 1);
		//System.out.println(theNumber);
		
		int guess = 0;
		while(guess != theNumber) {
		System.out.println("Guess a number between 1 and 100:");
		guess = sc.nextInt();
		
		if(guess < theNumber) {
			System.out.println(guess + " is too low. Try Again.");
		}else if(guess > theNumber) {
			System.out.println(guess + " is too high. Try again");
		}else {
			System.out.println(guess + " is correct. You win!!");
		}
		
		
		}
		System.out.println("Would you like to play again (y/n?)");
		playAgain = sc.next();
		
	}while(playAgain.equalsIgnoreCase("y"));
		System.out.println("Thank you for playing! Good bye");
		sc.close();
		

	}

}
