 package edu.vcentry.basics.session01.firstprogram;

public class MyFirstProgram {

	public static void main(String[] args) {
		//addTwoNumber(2,3); //calling
		System.out.println("My First Program");
	}
	
	//Method definition
	public static int addTwoNumber(int a, int b) {
		return a + b;
	}
	
	// public - access specifier
	// void - return type - return nothing
	// main - Method's name - should always be followed by ()
	// examples of methods - add(), multiply(2,3)
	// main(parameter) - declaring//defining - { } - open and close paranthesis
	// println(arguments); - calling the method - ends with semicolon
	// add(2,3) where 2 and 3 are arguments
	// add(int a, int b) -> where a and b are called as Parameters
	
}
