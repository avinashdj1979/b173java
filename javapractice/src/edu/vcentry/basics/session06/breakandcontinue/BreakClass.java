package edu.vcentry.basics.session06.breakandcontinue;

public class BreakClass {
	public static void main(String[] args) {
		
		int startRange = 40;
		int endRange = 80;
		
		int evenCtr = 0;
		
		for(int number = startRange; number <= endRange; number += 1) {
			if(number % 2 == 0) {
				if(evenCtr == 2) {
					break;
				}
				evenCtr++;
				System.out.println(number);
			}
		}
		System.out.println("I am out of the loop");
	}
}
