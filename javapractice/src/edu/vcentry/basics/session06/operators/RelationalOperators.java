package edu.vcentry.basics.session06.operators;

public class RelationalOperators {
	
	public static void main(String[] args) {
		
		int a = 6;
		int b = 5;
		
		boolean bool = a > b;
		
		System.out.printf("%d > %d = %b\n", a, b, bool);
		
		bool = a < b;
		
		System.out.printf("%d < %d = %b\n", a, b, bool);
		
		bool = a == b;
		
		System.out.printf("%d == %d = %b\n", a, b, bool);
		
		bool = a != b;
		
		System.out.printf("%d != %d = %b\n", a, b, bool);
		//
		//>= < =
	}

}
