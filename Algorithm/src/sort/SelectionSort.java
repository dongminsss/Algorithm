package sort;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = {13,23,2,56,11};
		SelectionSort.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static int[] sort(int[] arr) {
		for(int i = 0; i<arr.length; i++) {
			int minIndex = i;
			
			for(int j = i; j<arr.length; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			if(minIndex != i) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
			
		}
		return arr;
	}
}
