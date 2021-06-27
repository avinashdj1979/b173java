package edu.vcentry.arrays;

public class FinalArray {
	
	public void finalArray() {
		
		final int myNum = 2;
		
		//myNum = 6; // Compile error final variable value cannot  be changed

		final int[] myIntArr = {2, 34, 44, 51};
		
		int[] myIntArr2 = {2, 34, 44, 51};

		myIntArr[3] = 500; //This is allowed
		
		//myIntArr = myIntArr2; //Compile error final array can be assinged another array
		
		for(int counter=0;counter < myIntArr.length; counter++) {
			System.out.printf("The value in the index - %d is %d\n", counter, myIntArr[counter]);
		}
	}
	
	public static void main(String[] args) {
		FinalArray arrayExample = new FinalArray();
		arrayExample.finalArray();
	}
}
