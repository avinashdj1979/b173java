package edu.vcentry.basics.methodsadvanced;

import edu.vcentry.classes.basics.Person;

public class Main {

	public static void main(String[] args) {
//		MethodsWithPrimtiveParams m = new MethodsWithPrimtiveParams();
//		int a = 5;
//		m.changeValue(a); // here a is argument
//		System.out.printf("The value of a after changing is %d\n", a);
		
//		MyObject myObj = new MyObject();
//		MyObject myObj2 = new MyObject();
////		myObj.setA(5);
////		int a  = myObj.getA();
//		myObj.a = 5;
//		System.out.printf("The value of a before changing is %d\n", myObj.a);
		
		Person karthi = new Person();
		karthi.setAge(15);
		karthi.setName("Karhick");
		
//		MyClass x = new MyClass();
//		x.changeValue(myObj);
//		System.out.printf("The value of a after changing is %d\n", myObj.a);
		
		MyClass y = new MyClass();
		y.changeName(karthi);
		System.out.printf("Karthik's name changed to %s\n", karthi.getName());
		System.out.printf("Karthik's age changed to %d\n", karthi.getAge());
	}
}


/*
Primitive Args
1. Pass by Value. ie., value gets passed to the method (5)
Object based Arg
2. Passed by reference.


*/