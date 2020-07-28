package com.lombre.sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String args[]) {
		int testArr[] = new int[]{3,6,41,2,4,1,5,743};

		System.out.println(Arrays.toString(bubbleSort(testArr)));

	}


	public static int[] bubbleSort(int arr[]) {

		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = 0;
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}

		return arr;
	}
}
