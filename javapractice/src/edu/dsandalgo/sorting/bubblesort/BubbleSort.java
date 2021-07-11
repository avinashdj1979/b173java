package edu.dsandalgo.sorting.bubblesort;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {7, 9, 11, 2, 17, 4};
		//int[] arr = {2, 4, 7, 9, 11, 17};
		
		int len = arr.length;
		int counter = len - 1;
		int pass = 0;
		int temp;
		boolean isSwap = true;
		while(counter > 0 && isSwap) {
			isSwap = false;
			for(int i = 0; i < counter; i++) {
				if(arr[i] > arr[i+1]) {
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					isSwap = true;
				}
			}
			--counter;
			System.out.printf("pass %d - ", ++pass);
			for(int i = 0; i < len;i++) {
				System.out.printf("%d ", arr[i]);
				if(i < len -1) {
					System.out.print(",");
				}
			}
			System.out.println();
		}
		
		for(int i = 0; i < len;i++) {
			System.out.printf("%d", arr[i]);
			if(i < (len -1)) {
				System.out.print(",");
			}
		}
		System.out.println();
	}
	
	

}
