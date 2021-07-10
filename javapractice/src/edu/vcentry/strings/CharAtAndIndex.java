package edu.vcentry.strings;

public class CharAtAndIndex {

	public static void main(String[] args) {

		String s = "Happy";

		System.out.println(s.charAt(2)); // returns p
		System.out.println(s.charAt(5)); // throws exception

		System.out.println(s.indexOf("z")); // returns -1
		System.out.println(s.indexOf("p")); // return 2

	}

}
