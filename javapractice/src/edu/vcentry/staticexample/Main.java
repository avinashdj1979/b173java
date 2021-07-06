package edu.vcentry.staticexample;

public class Main {

	public static void main(String args[]) {
		StaticExample se = new StaticExample();
		StaticExample se2 = new StaticExample();
		
		for(int i = 0; i <5; i++) {
			new StaticExample().increment();
		}
		
		System.out.println("Static variable: " + StaticExample.staticVar);
		System.out.println("Non static variable: " + se.nonStaticVar);
		
//		for(int i = 0; i <5; i++) {
//			se.increment();
//		}
//		
//		System.out.println("Static variable: " + StaticExample.staticVar);
//		System.out.println("SE 1 - Non static variable: " + se.nonStaticVar);
//		
//		
//		for(int i = 0; i <5; i++) {
//			se2.increment();
//		}
//		System.out.println("Static variable: " + StaticExample.staticVar);
//		System.out.println("SE 2 - Non static variable: " + se2.nonStaticVar);
	}

}


/*
1. Static variable can be accessed using class name
2. We cannot access a non-static variable/method inside a static method
3. Static variable belong to the class
4. Static block will be always executed as the first statement



*/