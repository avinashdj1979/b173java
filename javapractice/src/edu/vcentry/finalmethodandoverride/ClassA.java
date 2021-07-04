package edu.vcentry.finalmethodandoverride;

public class ClassA {
	
	private void privateMethod() {
		System.out.println("I am private method");
	}
	
	void defaultMethod() {
		System.out.println("I am a default method");
	}
	
	protected void protectedMethod() {
		System.out.println("I am a protected method");
	}
	
	public void publicMethod() {
		System.out.println("I am a public method");
	}
	
	//Final method cannot be overridden
	public final void finalMethod() {
		System.out.println("I am a final method");
	}

}
