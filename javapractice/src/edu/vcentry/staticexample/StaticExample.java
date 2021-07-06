package edu.vcentry.staticexample;

public class StaticExample {
	
	int nonStaticVar;
	public static int staticVar;
	
	public void increment() {
		nonStaticVar++; //1//1//1//1//1//1//1//1//1
		staticVar++;//1//2//3//4//5//6//7//8//9//10
		staticMethod();
	}
	
	public static void staticIncrement() {
		//nonStaticVar++; //non-static access inside static method not allowed
		staticVar++;
		staticMethod();
		//increment(); //non-static method cannot be called from static method
	}
	
	public StaticExample() {
		//increment();
	}
	
	public static void staticMethod() {
		System.out.println("I am a static method");
	}
	
	{
		int nonStaticA = 2;
		System.out.println("I am in non static block");
	}
	
	
	static
	{
		int staticA = 2;
		System.out.println("I am in static block1");
	}
	
	static
	{
		System.out.println("I am in static block2");
	}
	
//	public static void printA() {
//		System.out.println(a);
//	}

}
