package edu.vcentry.basics.session03.datatypes;

public class IntDatatype
{
	public static void main(String[] args) {
		int number1 = 6;
		number1 = -9;
		int number2 = 10;
		int sum = number1 + number2;
		System.out.println(sum);
		
		int maxIntValue = Integer.MAX_VALUE;
		int minIntValue = Integer.MIN_VALUE;
		
		System.out.print("\n");
		
		String myString = "abc";
		
		System.out.printf("My String is : %s%S\n", myString, myString);

		
		System.out.printf("The Max value is %d\n", maxIntValue);
		System.out.printf("The Min value is %d\n", minIntValue);
		
		//Passing 2 values with format printing
		System.out.println("*** Printing the range ***");
		System.out.printf("The Range of int is %d to %d \n", minIntValue, maxIntValue);
		
		//Print with ln - ln refers to new line
		System.out.println("*** Printing the numbers with print and no ln ***");
		System.out.print("Min value is: " + minIntValue);
		System.out.print("Max value is: " + maxIntValue);
		
		
//		//range -2147483648 to 2147483647 (4 bytes of memory - 32 bits - (1)(31 bits))
//
//		maxIntValue = maxIntValue + 1; //-2147483648
//		
//		//printing out after adding 1
//		System.out.printf("The Max value after adding 1 to max %d\n", maxIntValue);
//
//		minIntValue = minIntValue - 1; //2147483647 = 2147483647
//		System.out.printf("The Min value after subtracting 1 from min %d\n", minIntValue);
	}
}

//Add 2 numbers
//Show the result of addition

// 1. create a int variable number1 and store 2
// 2. create a int variable number2 and store 3
// 3. create a int variable sum = add number1 and number 2 and store in it
// 4. print the sum

