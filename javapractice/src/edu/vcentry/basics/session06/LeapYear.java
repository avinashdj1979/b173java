package edu.vcentry.basics.session06;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
//		int year = 1901;
//	
//		boolean isLeapYear = false;
//		if(year % 4 == 0) {
//			isLeapYear = true;
//			if (year % 400 == 0) {
//				isLeapYear = true;
//			} else if(year % 100 == 0) {
//				isLeapYear = false;
//			}
//		}
//		
//		System.out.printf("Is Year %d is a Leap Year? %b", year, isLeapYear);
		
		String userChoice = "Yes";
		System.out.println("Do you want to continue?");
		Scanner scan = new Scanner(System.in);
		userChoice = scan.next();
		System.out.println("User choice " + userChoice);
		
//		// while(useChoice.equals("Yes") {
//		System.out.println("Do you want to continue?");
//		Scanner scan = new Scanner(System.in);
//		userChoice = scan.next();
//		//}

	}

}
/*
1. Divisible by 4
2. Not Divisible by 100
3. Divisible by 400
*/