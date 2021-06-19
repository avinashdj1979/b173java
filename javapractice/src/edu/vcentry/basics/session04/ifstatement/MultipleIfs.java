package edu.vcentry.basics.session04.ifstatement;

public class MultipleIfs {

	public static void main(String[] args) {
		int age = 62;
		
		if (age <= 17) {
			System.out.println("I am a minor");
		}
		
		if (age > 60) {
			System.out.println("I am a Senior Citizen");
		}
		
		if( age >= 18) {
			System.out.println("I am a Major");
		}

	}

}
