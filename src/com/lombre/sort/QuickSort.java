package com.lombre.sort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String args[]) {
		int src[] = new int[]{3,6,41,2,4,1,5,743};

		System.out.println(Arrays.toString(src));
		quickSort(src, 0, src.length-1);

		System.out.println(Arrays.toString(src));


	}

	public static void quickSort(int arr[], int l, int r) {
		int left = l;
        int right = r;
        int pivot = arr[(left + right) / 2]; // pivot을 중앙 값으로 셋팅

        do {
            while (arr[left] < pivot) left++;	// left에서 pivot보다 큰 수 발견할 때 까지 진행

            while (arr[right] > pivot) right--;	// right에서 pivot보다 작은 수 발견할 때 까지 진행

            // left에서 pivot보다 큰 수, right에서 pivot보다 작은 수 발견시 서로 교환 후 진행
            if (left <= right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }

        } while (left <= right);	// left, right 교차 전 까지 반복

        if (l < right) {//분할정복시 더 이상 분할 것이 없는 경우 체크 (왼쪽 분할할 수 있는지 체크)
            quickSort(arr, l, right);
        }
        if (r > left) {//분할정복시 더 이상 분할 것이 없는 경우 체크 (오른쪽 분할할 수 있는지 체크)
            quickSort(arr, left, r);
        }

	}

}
