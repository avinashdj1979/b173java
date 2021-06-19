package edu.vcentry.basics.session06.operators;

public class LogicalOperators {
	
	public static void main (String[] args) {
		int a = 5;
		int b = 6;
		int c = 7;
		//associativity
		boolean bool = (a <= 5) || (++a <= 5);
		System.out.println(a);
		System.out.println(bool);
		
//		bool = a < 4 || c == 7;
//		System.out.println(bool);
//		
//		bool = !(a < 4);
//		System.out.println(bool);
		
		bool = true;
		
		// && !
	}
	
	

}
