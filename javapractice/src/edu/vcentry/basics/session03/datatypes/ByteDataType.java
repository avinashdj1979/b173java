package edu.vcentry.basics.session03.datatypes;

public class ByteDataType {

	public static void main(String[] args) {
		
		byte myByte1 = 6;
		byte myByte2 = 10;
		
		//myByte2 = 127;
		
		byte myByte3 = 6 + 90;
		
		//myByte1 = 127;
		
		System.out.printf("myByte3 is %d\n", myByte3);
		
		byte myByte4 = myByte1;
		
		System.out.printf("myByte4 is %d\n", myByte4);
		
		//byte myByte5 = myByte1 + 10;
		//Any mathematical operation carried out over 2 or more Byte variables will result in an integer.
		
		
		byte myByteMaxValue = Byte.MAX_VALUE;
		byte myByteMinValue = Byte.MIN_VALUE;
		
		System.out.printf("The range of Byte value is %d to %d\n", myByteMinValue, myByteMaxValue);
		
	}
}

// int - 4 bytes - 32 bits 31 -number 1 -sign
// byte - 1 byte - 7 bits 1- sign
// -128 to 127
// 1111111
// DataType VariableName = value;
