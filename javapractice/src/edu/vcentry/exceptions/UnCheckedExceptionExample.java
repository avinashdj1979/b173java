package edu.vcentry.exceptions;

public class UnCheckedExceptionExample {
	static String s;
	public static void main(String[] args) {
		try {
			s.split(">");
			int a = 2;
			int b = 0;
			System.out.println(b);
			int c = a/b;
			System.out.println(c);
		} catch(ArrayIndexOutOfBoundsException | ArithmeticException a) {
			System.out.println(a);
		} finally {
			int d =4;
			System.out.println(d);
			System.out.println("Hello");
		}
	}

}
