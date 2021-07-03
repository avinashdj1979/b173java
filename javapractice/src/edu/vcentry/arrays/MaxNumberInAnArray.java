package edu.vcentry.arrays;

import java.util.Scanner;

public class MaxNumberInAnArray {

	public int maxNumber(int[] inputArr) {
		
		return 0;
	}
	
	public static void main(String args[]) {
//		MaxNumberInAnArray mn = new MaxNumberInAnArray();
//		int myArr[] = {2, 34, 23, 45, 56, 23, 12};
//		mn.maxNumber(myArr);
		
		Scanner scan = new Scanner(System.in);
		double myArr2[] = new double[4];
		int counter = 0;
		while(counter < myArr2.length) {
			System.out.printf("Enter the value for the Index - %d => ", counter);
			myArr2[counter] = scan.nextInt();
			counter++;
		}

		for(double num : myArr2) {
			num *= 10;
			System.out.println(num);
		}
	}
}
