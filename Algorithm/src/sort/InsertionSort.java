package sort;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int number1 = 2;
		int number2 = 2;
		int[] arr = {5,6,number2,3,number1,7,1};
		InsertionSort.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static int[] sort(int[] arr) {
		for(int i = 1; i<arr.length; i++) {
			for(int j = i; j>=1; j--) {
				if(arr[j-1]>arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		return arr;
	}
}
