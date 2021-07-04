package edu.vcentry.finalmethodandoverride;

public class ClassB {
	
	public void accessClassAMethods() {
		ClassA aObj = new ClassA();
		//aObj.privateMethod();
		aObj.defaultMethod();
		aObj.protectedMethod();
		aObj.publicMethod();
	}
}
