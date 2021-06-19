package edu.vcentry.classes.constructors;

public class Person {
	
	//instance variables // copy of this variables are created for each object/instance of a class.
	private String name;
	private int age;
	
	Person(){
		this("New Born", 0);
//		this.name = "New Born";
//		this.age = 0;
	}
	
	Person(String name){
//		this.name = name;
//		this.age = 0;
		//System.out.println("Hello"); // Constructor call must be the first statement in a constructor
		this(name, 0);
	}
	
	//Parameterized Constructor or AllArgsConsturctors
	Person(String name, int age){
		System.out.println("I am called - Parameterized constructor");
		this.name = name;
		this.age = age;
	}
	
	Person(int age, String name){
		//System.out.println("I am called - Parameterized constructor");
//		this.name = name;
//		this.age = age;
		this(name, age);
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
	
	public void myAgeIs() {
		System.out.println("My name is " + name + " and my age is " + getAge());
	}
}


/*
1. Constructor is a special method, which helps in constructing/creating objects
2. Constructor has the same name as that of the Class
3. We do not mention return type for the Constructor
4. Constructors are created by default when you create a class this constructor don't have any parameter.
5. Constructors can have parameters and those constructors are explicitly created by us.
6. Constructors have a default return type of that of the Class
7. Once parameterized constructor is defined, non-parameterized constructor will not be created by default
8. the program will be forced to define an empty constructor.

// Local variables
1.Local variable life ends within the block it is created
2.Inside a method, local variable takes precedence, ie., if the local variable and instance variable has same name, 
then the variable will be considered as local variable and not instance variable.
3. this refers to current object

// Constructor Overloading
1. We can multiple multiple constructors
2. Constructors can have different number or type of arguments
3. A constructor can be called from another Constructor using this()
4. this() should be the first statement in the Constructor.


*/