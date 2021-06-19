package edu.vcentry.basics.session06.breakandcontinue;

public class ContinueClass {
	public static void main(String[] args) {
		
		for(int number = 1; number <= 10; number += 1) {
			if(number > 3 && number < 9) {
				continue;
			}
			System.out.println(number);
		}
		System.out.println("I am out of the loop");
	}
}
