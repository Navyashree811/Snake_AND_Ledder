/*
* UC2 : Snake and Ladder game play with single player at start position 0 .
*       The player roll the die and get the number between 1 to 6 .
*/
package com.bridgelabz.snakeladder;

import java.util.Scanner;

public class SnakeLadder {
	// use method to roll die
	static void rolldie() {
		int min = 1;
		int max = 6;
		int Number = (int) Math.floor(Math.random() * (max - min) + min);

		System.out.println("Die = " + Number);
	}

	public static void main(String[] args) {

		int position = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter how many players want to play");
		int player = sc.nextInt();

		System.out.println("Player in the Position = " + position);

		// Function call
		rolldie();
	}

}
