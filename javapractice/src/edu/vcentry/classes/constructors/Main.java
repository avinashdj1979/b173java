package edu.vcentry.classes.constructors;

public class Main {

	public static void main(String[] args) {
		
		//new Person(); -> object created with reference

//		Person santhosh = new Person();
//		
//		santhosh.setAge(22);
//		santhosh.setName("Santhosh kumar");
//		
//		int santhoshAge = santhosh.getAge();
//		String santhoshName = santhosh.getName();
//		
//		System.out.println("Santosh's age " + santhoshAge);
//		System.out.println("Santosh's name " + santhoshName);
		
		new Person("Rahim", 34).eats();
	
		String ramsName = new Person("Ram", 20).getName();
		
		System.out.println("Ram's name is " + ramsName);
		
		
		Person sachin = new Person("Sachin", 40);
		
		System.out.println(sachin.getName());
		System.out.println(sachin.getAge());
		
		sachin.eats();
		sachin.myAgeIs();
		
		Person newBorn = new Person();
		System.out.println(newBorn.getName() +"'s age is " + newBorn.getAge());
		
	}

}
/*




*/
