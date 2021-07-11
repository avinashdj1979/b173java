package edu.vcentry.exceptions;

public class ThrowExample {

	static int a = 12;
	static int b = 6;
	public static void main(String[] args) {
		try {
			if(b > 5) {
				throw new ArithmeticException("B is greater than 5");
			}
			System.out.println(b);
			int c = a/b;
			System.out.println(c);
		} catch(ArithmeticException a) {
			System.out.printf("The value of b is %d\n", b);
			System.out.println(a.toString());
			a.printStackTrace();
		}
	}

}
