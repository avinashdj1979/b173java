package edu.vcentry.strings;

public class StringSplit {

	public static void main(String[] args) {

		String s = "Happy Morning to everyone";

		String[] sArr = s.split(" ");
		
		System.out.printf("Number of words in String s is %d\n", sArr.length);

		String s2 = "Happy>Morning>to>everyone";

		String[] sArr2 = s2.split(">");
		
		System.out.printf("Number of words in String s2 is %d\n", sArr2.length);
	
		for(String val : sArr2) {
			System.out.println(val);
		}

	}

}
