package edu.vcentry.arrays;

public class PassArrayAsParam {
	
	public void paramExample() {

		int[] myIntArr = {2, 34, 44, 51};
		int lastIndex = myIntArr.length - 1;
		
		System.out.println("Before passing the array as param");
		for(int counter=0;counter <= lastIndex; counter++) {
			System.out.printf("The value in the index - %d is %d\n", counter, myIntArr[counter]);
		}
		
		changeArray(myIntArr);
		
		System.out.println("After after the array as param");
		for(int counter=0;counter <= lastIndex; counter++) {
			System.out.printf("The value in the index - %d is %d\n", counter, myIntArr[counter]);
		}
	}
	
	public void changeArray(int[] arr) {
		arr[3] = 1000;
	}
	
	public static void main(String[] args) {
		PassArrayAsParam arrayExample = new PassArrayAsParam();
		arrayExample.paramExample();
	}
}
