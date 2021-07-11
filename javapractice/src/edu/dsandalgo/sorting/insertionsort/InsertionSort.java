package edu.dsandalgo.sorting.insertionsort;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {12, 7, 6, 4, 2, 13, 1};
		
		int len = arr.length;
		int temp;
		int pass = 0;
		for(int i = 1; i < len ; i++) {
			int key = arr[i];
			int j = i - 1;
			while(j >= 0 && (key < arr[j])) {
				arr[j+1] = arr[j];
				--j;
			}
			arr[j+1] = key;
			System.out.printf("pass %d - ", ++pass);
			for(int k = 0; k < len;k++) {
				System.out.printf("%d ", arr[k]);
				if(k < len -1) {
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
