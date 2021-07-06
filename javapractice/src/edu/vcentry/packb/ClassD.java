package edu.vcentry.packb;

import edu.vcentry.packa.ClassA;
import edu.vcentry.staticexample.StaticExample;

public class ClassD extends ClassA{
	
	public void accessClassAMethods() {
//		privateMethod();
//		defaultMethod();
		protectedMethod();
		publicMethod();
		
		ClassA aObj = new ClassA();
//		aObj.defaultMethod();
//		aObj.protectedMethod();
		aObj.publicMethod();
		
		int x = StaticExample.staticVar;
	}

}
