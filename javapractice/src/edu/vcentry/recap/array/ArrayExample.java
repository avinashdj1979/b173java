package edu.vcentry.recap.array;

public class ArrayExample {
	public void printArray(int[] arr2) {
		arr2[3] = 32;
		for (int num : arr2) {
			System.out.println(num);
		}
	}

	public void printArray(int x) {
		x = 103; //13
		System.out.println(x);
	}

	public static void main(String[] args) {

		// type 1

		int[] arr = { 1, 4, 98, 45 };

		// type 2

		//int[] arr2 = new int[6];

		ArrayExample arrayExamp = new ArrayExample();
		arrayExamp.printArray(arr);
		System.out.println(arr[3]);
		
		
		int x = arr[2];
		arrayExamp.printArray(x);
		System.out.println(x);

	}

}
