package edu.vcentry.classes.inheritance;

public class RuntimePolymorphism {

	public static void main(String[] args) {
		
		//Person per = new Person();
		
		Person raj = new Indian("Raj", 23, "AADHAAR-1234");

		raj.eats();
		//raj.canVote();
		
		Indian kumar = new Indian("Raj", 23, "AADHAAR-1234");
		kumar.canVote();
		
		Person john = new American("john", 22, "SSN-1234");

		john.eats();
		
		//Indian gautam = new Person("Gautam", 34);
//		
		//gautam.canVote();
		
		Person p1  = new Person("Gautam", 34);
		
	}

}
/*
	Person raj = new Indian("Raj", 23, "AADHAAR-1234");
	Compile Time Type - Person
	Runtime Type - Indian
	
	Super class reference,  can point to a sub class object
	 



*/
