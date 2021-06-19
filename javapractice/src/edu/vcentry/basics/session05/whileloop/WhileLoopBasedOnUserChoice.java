package edu.vcentry.basics.session05.whileloop;

import java.util.Scanner;

public class WhileLoopBasedOnUserChoice {

	public static void main(String[] args) {
		int num = 0; // initialization
		String userChoice = "N";
		Scanner s = new Scanner(System.in);
		while(userChoice.equals("Y")) { //condition
			System.out.println(num);
			num = num + 1; //increment
			System.out.println("Enter User's choice:");
			userChoice = s.next();
		}
		System.out.println("Loop ends");
	}
}

//for(initialization;condition;increment)
// for is used, when the condition is based on a number
// while is generally used when the condition is based on non-numeric values
