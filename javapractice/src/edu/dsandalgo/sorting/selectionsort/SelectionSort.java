package edu.dsandalgo.sorting.selectionsort;

public class SelectionSort {
	
	public static void main(String args[]) {
		
		int[] arr = {12, 7, 6, 4, 2, 13, 1};
		int len = arr.length;
		int min;
		int temp;
		int pass = 0;
		for(int i = 0; i < len - 1;i++) {
			min = i;
			int j = i + 1;
			while(j < len) {
				if(arr[j] < arr[min]) {
					min = j;
				}
				j++;
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			
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
