package edu.vcentry.basics.session06.operators;

public class TernaryOperator {

	public static void main(String[] args) {
		int a = 0;

//		if(a % 2 == 0) {
//			System.out.println("Even");
//		} else {
//			System.out.println("Odd");
//		}

		boolean result = (a % 2 == 0) ? true : false;

		String str = (a % 2 == 0) ? "Even" : "Odd";

		int d = (a > 2) ? (a - 2) : (2 - a);

		System.out.println("result is " + result);
		System.out.println("Odd or Even is " + str);
		System.out.println("difference is " + d);

	}

}
