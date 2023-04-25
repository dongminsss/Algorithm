package sort;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {12,34,3,2,1};
		arr = BubbleSort.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static int[] sort(int[] arr) {
		for(int i = 0; i<arr.length; i++) {
			for(int j=arr.length-2; j>=0; j--) {
				if(arr[j] > arr[j+1]) {
					int temp;
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
}
