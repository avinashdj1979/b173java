package edu.vcentry.basics.session06.operators;

public class AssignmentOpeators {
	public static void main(String args[]) {
		
		int a = 5;
		
		int b = a;
		
		System.out.println("b is " + b);
		
		int c = 10;
		c += a;  // c = c + a
		
		System.out.println("c is " + c); // 10 + 5 = 15
		
		c -= a; // c = c - a
		System.out.println("c is " + c); // 15 - 5 = 10
		
		c *= a; // c = c * a
		System.out.println("c is " + c); // 10 * 5 = 50		
		
		c /= a; // c = c / a
		System.out.println("c is " + c); // 50 / 5 = 10
		
		c %= 3; // c = c % 3
		System.out.println("c is " + c); // 10 % 3 = 1
		
	}
}
