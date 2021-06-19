package edu.vcentry.basics.session04.ifstatement;

public class IfElseIfConstruct {
	public static void main(String[] args) {
		int age = 17;
		
		if (age < 18) {
			System.out.println("You are Minor");
		} else if (age < 60){
			System.out.println("You are Major");
		} else {
			System.out.println("You are a Senior Citizen");
		}
	}
}
