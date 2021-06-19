package edu.vcentry.classes.basics;

public class Person {
	
	//instance variables // copy of this variables are created for each object/instance of a class.
	private String name;
	private int age;

	public void setName(String nameValue) {
		name = nameValue;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int ageValue){
		age = ageValue;
	}
}


/*
1. Complex data type - combination of primitive data type
2. Bundling of multiple data type
3. Template 
4. It contains multiple attributes in the form of data
5. Not technical term for variable inside the class in Attributes
6. behaviors are represented by methods.

Encapsulation and Data hiding
1. Combining more than one data type into a complex data type.
2. preventing the access of those variables outside the class is called as data hiding
3. Prevention of access outside the class is done using a keyword called private
4. Access modifier. (private)

//	<Access modifier> returnType methodName() {
//		return returnType
//	}

Return Type - type of the data the method returns

*/