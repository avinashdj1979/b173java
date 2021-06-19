package edu.vcentry.basics.session05.dowhile;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		String userChoice = "N";
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("I am in");
			System.out.println("Enter user choice: ");
			userChoice = scan.next();
		} while(userChoice.equals("Y"));
		System.out.println("Loop Ends");
	}
}

/*
Syntax
do{
//block of code
} while(condition);

*/