package edu.vcentry.strings;

public class StringBufferExample {

	public static void main(String[] args) {

		String s3 = new String("Welcome");

		
		s3.concat(" Everyone");
		System.out.println(s3);
		
		//How to make String mutable
		StringBuffer sb = new StringBuffer(s3);
		sb.append(" Everyone");
		sb.replace(0, 3, "Hiii");
		
		System.out.println(sb.toString());
	}

}
