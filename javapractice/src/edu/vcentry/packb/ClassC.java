package edu.vcentry.packb;

import edu.vcentry.packa.ClassA;

public class ClassC {
	
	public void accessClassAMethods() {
		ClassA aObj = new ClassA();
//		aObj.privateMethod();
//		aObj.defaultMethod();
//		aObj.protectedMethod();
		aObj.publicMethod();
	}

}
