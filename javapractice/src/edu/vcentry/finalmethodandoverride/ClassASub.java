package edu.vcentry.finalmethodandoverride;

public class ClassASub extends ClassA{
	
//	protected void publicMethod() { // When the method is overridden - we cannot reduce the visibility
//		System.out.println("I am in ClassASub");
//	}
	
	public void privateMethod() { // it is not an overridden method
		
	}

	public void protectedMethod() {
		System.out.println("I am a protected method in Sub Class");
	}
	
//	void protectedMethod() { // When the method is overridden - we cannot reduce the visibility
//		System.out.println("I am a protected method");
//	}
	
//	public void finalMethod() { //Final method cannot be overridden
//		System.out.println("I am a final Method in Sub Class");
//	}
}


/*

1. When the method is overridden - we cannot reduce the visibility
2. When the method is overridden - Higher or Same visibility is allowed
3. Final method cannot be overridden



*/