package edu.vcentry.classes.inheritance;

public class Person {
	
	//instance variables // copy of this variables are created for each object/instance of a class.
	private String name;
	private int age;
	
	Person(){
		//this("New Born", 0);
		super();
	}
//	
	//Parameterized Constructor or AllArgsConsturctors
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void eats() {
		System.out.println("My name is " + name + " and i eat anything edible.");
	}
}


/*


*/