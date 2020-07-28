package com.lombre.sort;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String args[]) {
		int testArr[] = new int[]{3,6,41,2,4,1,5,743};

		System.out.println(Arrays.toString(insertionSort(testArr)));

	}


	public static int[] insertionSort(int arr[]) {

		for(int i = 1; i < arr.length; i++) {

			int initIdx = i;
			for(int j = i-1; j >= 0; j--) {

				if(arr[initIdx] < arr[j]) {
					int temp = arr[j];
					arr[j] = arr[initIdx];
					arr[initIdx] = temp;

					initIdx = j;
				}
			}
		}

		return arr;
	}
}
