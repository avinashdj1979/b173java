package edu.vcentry.basics.methodsadvanced;

import edu.vcentry.classes.basics.Person;

public class MyClass {
	
	public void changeValue(MyObject myObjParam) { // here a is a parameter
		myObjParam.a = myObjParam.a + 15;
		System.out.printf("The value of a is %d\n", myObjParam.a);
	}
	
	public void changeName(Person dinesh) { // here a is a parameter
		dinesh.setAge(60);
		dinesh.setName("Dinesh");
	}

}

/*
MyObject myObjParam = myObj
myObjParam.a = 20;
myObjParam.a --> Print = 20
*/