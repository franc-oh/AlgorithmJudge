package com.lombre.sort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String args[]) {
		int testArr[] = new int[]{3,6,41,2,4,1,5,743};

		System.out.println(Arrays.toString(selectionSort(testArr)));

	}


	public static int[] selectionSort(int arr[]) {

		for(int i = 0; i < arr.length; i++) {
			int minIdx = i;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[minIdx]) {
					minIdx = j;
				}
			}

			int temp = arr[i];
			arr[i] = arr[minIdx];
			arr[minIdx] = temp;
		}

		return arr;
	}
}
