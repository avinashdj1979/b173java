package edu.vcentry.basics.session03.datatypes;

public class ShortDataType {

	public static void main(String[] args) {
		short myShort1 = 23;
		short myShort2 = 34;
		
		short myShort3 = 34 - 23;
		
		System.out.printf("MyShort3 value is %d\n", myShort3);
		
		short myShortMaxValue = Short.MAX_VALUE;
		short myShortMinValue = Short.MIN_VALUE;
		
		System.out.printf("The range of Short value is %d to %d", myShortMinValue, myShortMaxValue);
	}

}


// line 9 - 34, 23 - Operand , (+,-) - operator, expression
// short -16 bits - 1 bit - 15 number
// 2 to the power of 15, Range is -32768 to 32767