package edu.vcentry.classes.inheritance;

public class RuntimePolymorphism {

	public static void main(String[] args) {
		
		//Person per = new Person();
		
		Person raj = new Indian("Raj", 23, "AADHAAR-1234");

		raj.eats();
		//raj.canVote(); // Compile time error
		
		/*
		 * Compile time type of raj is Person
		 * Person dont have access to canVote() method which of Indian class
		 * Hence, the compile time error in line number 12.
		 */
		
		Indian kumar = new Indian("Raj", 23, "AADHAAR-1234");
		kumar.canVote();
		
		Person john = new American("john", 22, "SSN-1234");

		john.eats();
		
		//Indian gautam = new Person("Gautam", 34);
		/*
		 * The above statement will give compile error
		 * Super class - Person
		 * Sub class - Indian
		 * A Sub class reference variable cannot point to a Super class object.
		 * Reason -
		 * 1. If this line is allowed, gautam which is Indian class reference will act as Person during runtime
		 * 2. Person class will not have access to be members of Indian class
		 * 3. Hence leads to Runtime error
		 * 4. So compiler identifies it and gives a compile error.
		 */
		
		//gautam.canVote();
		
		Person p1  = new Person("Gautam", 34);
		
	}

}

/*
	Person raj = new Indian("Raj", 23, "AADHAAR-1234");
	Compile Time Type - Person
	Runtime Type - Indian
	
	Super class reference,  can point to a sub class object
	 
	The reverse is always not possible. A Subclass reference variable cannot point to a super class object
*/
