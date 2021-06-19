package edu.vcentry.classes.inheritance;

public class Main {

	public static void main(String[] args) {
		
		Indian indian1 = new Indian();
		String indianName = indian1.getName();
		
		System.out.printf("Name of Indian is %s\n", indianName);
		
		Indian indian2 = new Indian("Raj", 34, "6545654566");
		String indian2Name = indian2.getName();
		System.out.printf("Name of Indian is %s\n", indian2Name);
		
		indian2.eats();
		
		String aadhaar = indian2.getAadhaar();
		System.out.println("My aadhaar number is " + aadhaar);
		
	}

}
/*




*/
