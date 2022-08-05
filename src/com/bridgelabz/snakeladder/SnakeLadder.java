/*
* UC3 : The Player then checks for a option. They are No Play, Ladder or Snake.
*/
package com.bridgelabz.snakeladder;

public class SnakeLadder {
	// use method to roll die

	static void rolldie() {
		int min = 1;
		int max = 6;
		int dieNumber = (int) Math.floor(Math.random() * (max - min) + min);

		System.out.println("Die = " + dieNumber);
	}

	static void checkPlayer(int check) {
		// check they are no play, ladder or snake
		switch (check) {
		case 0:
			System.out.println("They are no play");
			break;
		case 1:
			System.out.println("Ladder");
			rolldie();
			break;
		case 2:
			System.out.println("Snake");
			rolldie();
			break;
		default:
			System.out.println("Some thing went wrong");
		}
	}

	public static void main(String[] args) {
		int position = 0;
		int player = 1;
		System.out.println("Player in the Position = " + position);

		// Generate random number
		int check = (int) Math.floor((Math.random() * 10) % 3);

		// static method call
		checkPlayer(check);
	}
}
