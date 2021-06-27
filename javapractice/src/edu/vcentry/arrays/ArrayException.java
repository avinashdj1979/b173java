package edu.vcentry.arrays;

public class ArrayException {	
	public void arrayExceptionExample() {

		int[] myIntArr = new int[4];
		
		myIntArr[-1] = 45;
		
		//Initialize
		for(int counter=0;counter < myIntArr.length; counter++) {
			myIntArr[counter] = counter * 10;
		}
		
		for(int counter=0;counter < myIntArr.length; counter++) {
			System.out.printf("The value in the index - %d is %d\n", counter, myIntArr[counter]);
		}
	}
	
	public static void main(String[] args) {
		ArrayException arrayExample = new ArrayException();
		arrayExample.arrayExceptionExample();
	}
}
