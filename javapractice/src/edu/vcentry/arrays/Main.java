package edu.vcentry.arrays;

public class Main {

	public static void main(String[] args) {
		PrintingArrayBackwards arrayExample = new PrintingArrayBackwards();
		int[] myIntArr = new int[8];
		
		arrayExample.printingArray(myIntArr);
		
		for(int counter = myIntArr.length - 1;counter >= 0; counter--) {
			System.out.printf("The value in the index - %d is %d\n", counter, myIntArr[counter]);
		}
	}

}
