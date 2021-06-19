package edu.vcentry.basics.session03.datatypes;

public class FloatDataType {
	public static void main(String[] args) {
		float myFloat1 = 34.34f;
		float myFloat2 = 43.3434f;
		
		float myFloat3 = myFloat1 / myFloat2;
		
		System.out.println(myFloat3);
		
		float maxFloatValue = Float.MAX_VALUE;
		float minFloatValue = Float.MIN_VALUE;
		
		System.out.println("My min Float value: " + minFloatValue);
		System.out.println("My max Float value: " + maxFloatValue);
	}
}

// expression => myFloat1 / myFloat2
// statement => float myFloat3 = myFloat1 / myFloat2;
// Each statement should end with a semi-colon.
// Default value of whole number expression is integer
// Default value of decimal point value is double.
// float constants should be post-fixed with f , otherwise it will be considered as double
// double constants can be post-fixed with d, but it is not mandatory