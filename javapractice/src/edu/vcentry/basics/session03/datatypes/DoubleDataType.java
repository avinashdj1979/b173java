package edu.vcentry.basics.session03.datatypes;

public class DoubleDataType {

	public static void main(String[] args) {
		double myDouble1 = 23.23d;
		double myDouble2 = 45.455555D;
		
		double myDouble3 = myDouble1 * myDouble2;
		
		System.out.println(myDouble3);
		
		double maxDoubleValue = Double.MAX_VALUE;
		double minDoubleValue = Double.MIN_VALUE;
		
		System.out.println("MyMinDoubleValue: " + minDoubleValue);
		System.out.println("MyMaxDoubleValue: " + maxDoubleValue);

	}

}
