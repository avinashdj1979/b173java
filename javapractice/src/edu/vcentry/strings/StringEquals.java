package edu.vcentry.strings;

public class StringEquals {

	public static void main(String[] args) {

		// String memory Allocation
		String s1 = "Welcome";
		String s2 = "Welcome";
		String s3 = new String("Welcome");
		String s4 = new String("Welcome");
		String s5 = s4;
		
		s5 = "Hi Hello";
		
	
		//s1 == s3
		boolean result = s1 == s3;
		System.out.printf("s1 == s3 ==> %b\n", result);
		
		//s1 == s2
		result = s1 == s2;
		System.out.printf("s1 == s2 ==> %b\n", result);
		
		//s1.equals(s3)
		result = s1.equals(s3);
		System.out.printf("s1.equals(s2) ==> %b\n", result);
		
		//s4.equals(s3)
		result = s4.equals(s3);
		System.out.printf("s4.equals(s3) ==> %b\n", result);
		
		//s4 == s3
		result = s4 == s3;
		System.out.printf("s4 == s3 ==> %b\n", result);
		
		//s4 == s5
		result = s4 == s5;
		System.out.printf("s4 == s5 ==> %b\n", result);
		
		System.out.println(s5);
		
		System.out.println(s4);
		
		//equalsIgnoreCase
		String s6 = "TEST"; //test
		String s7 = "Test1"; //test
		
		System.out.printf("s6.equals(s7) ==> %b\n", s6.equals(s7));
		System.out.printf("s6.equalsIgnoreCase(s7) ==> %b\n", s6.equalsIgnoreCase(s7));
		
		//CompareTo
		String a = "Apple"; //65
		String b = "Aaple"; //66
		
		String b1 = "B";
		
		System.out.println(a.codePointAt(0));
		
		System.out.printf("a.compareTo(b) ==> %d\n", a.compareTo(b)); //a - b
		System.out.printf("b.compareTo(a) ==> %d\n", b.compareTo(a)); //b - a
		System.out.printf("b.compareTo(b1) ==> %d\n", b.compareTo(b1));
		
		
		String aLower = "a"; //97
		System.out.println(aLower.codePointAt(0));
		System.out.printf("a.compareTo(aLower) ==> %d\n", a.compareTo(aLower)); //a - aLower
		System.out.printf("a.compareToIgnoreCase(aLower) ==> %d\n", a.compareToIgnoreCase(aLower)); //a - aLower
	}

}
