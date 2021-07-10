package edu.vcentry.strings;

public class StringImmutable {

	public static void main(String[] args) {

		// String memory Allocation
		String s1 = "Welcome";
		String s3 = new String("Welcome");
		
		s1.toUpperCase();
		
		s1.concat(" Everyone"); //Strings are immutable
		System.out.println(s1);
		
		s3 = s3.concat(" Everyone"); // now s3 value gets replaced
		System.out.println(s3);
	}

}
