package edu.vcentry.basics.session03.datatypes;

public class LongDataType {

	public static void main(String[] args) {
		long myLong1 = 23;
		long myLong2 = 32L;
		
		long myLong3 = myLong1 + myLong2;
		
		System.out.printf("My Long 3 value is %d\n", myLong3);
		
		//long's wrapper class
		long myLongMaxValue = Long.MAX_VALUE;
		long myLongMinValue = Long.MIN_VALUE;
		
		System.out.printf("The range of long value is %d to %d", myLongMinValue, myLongMaxValue);
	}

}


