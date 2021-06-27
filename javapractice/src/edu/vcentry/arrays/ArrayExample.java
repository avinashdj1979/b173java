package edu.vcentry.arrays;

public class ArrayExample {
	
	public void myArrayExample() {
		
		int myNum = 2;
		
		//int myNum2 = 2, 3;
		
		// datatype[] //1-D array
		int[] myIntArr = {2, 34, 44, 51};
		
		//Accessing the array
		//arrayVariableName[index]
		System.out.printf("The length of the array is %d\n", myIntArr.length);
		
		System.out.println(myIntArr[2]); // 2nd index ==> 3rd element in the array
		
		int lastIndex = myIntArr.length - 1;
		
		for(int counter=0;counter <= lastIndex; counter++) {
			System.out.printf("The value in the index - %d is %d\n", counter, myIntArr[counter]);
		}
	}
	
	public void myArrayExample2() {
		
		//int myNum2 = 2, 3;
		
		// datatype[] //1-D array
		int[] myIntArr = new int[5];
		//myIntArr = {1 , 2, 3, 4, 5};
		
		//Accessing the array
		//arrayVariableName[index]
		System.out.printf("The length of the array is %d\n", myIntArr.length);
		int lastIndex = myIntArr.length - 1;
		
	
		
		//Initialize
		for(int counter=0;counter <= lastIndex; counter++) {
			myIntArr[counter] = counter * 10;
		}
		
		myIntArr[3] = 400;
		
		for(int counter=0;counter <= lastIndex; counter++) {
			System.out.printf("The value in the index - %d is %d\n", counter, myIntArr[counter]);
		}
	}
	
	public static void main(String[] args) {
		ArrayExample arrayExample = new ArrayExample();
		arrayExample.myArrayExample2();
	}
}
