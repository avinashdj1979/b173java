package edu.vcentry.arrays;

public class PrintingArrayBackwards {	
	public void printingArray(int[] myIntArr) {
		//Initialize
		for(int counter=0;counter < myIntArr.length; counter++) {
			myIntArr[counter] = counter * 10;
		}
	}
}
