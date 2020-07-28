package com.lombre.sort;

import java.util.Arrays;

public class QuickSort2 {

	public static void main(String args[]) {
		int src[] = new int[]{3,6,41,2,4,1,5,743};

		quickSort(src, 0, src.length-1);

		System.out.println(Arrays.toString(src));


	}

	/**
	 * 퀵 정렬 하는 과정을 재귀를 통해 처리하는 메서드
	 * @param arr (정렬 대상 배열)
	 * @param start (배열 시작 idx)
	 * @param end (배열 끝 idx)
	 */
	public static void quickSort(int arr[], int start, int end) {

		int part2 = partition(arr, start, end);	// 피벗 값 받아오기

		if(start < part2 - 1) {	// 받아온 피벗을 기준으로, 좌측 배열에 요소가 남아 있을 때 까지 분할+정복 반복
			quickSort(arr, start, part2-1);
		}
		if(part2 < end) { // 받아온 피벗을 기준으로, 우측 배열에 요소가 남아 있을 때 까지 분할+정복 반복
			quickSort(arr, part2, end);
		}

	}

	/**
	 * 피봇기준 각 부분배열 분할 및 정렬
	 * @param arr (정렬 대상 배열)
	 * @param start (배열 시작 idx)
	 * @param end (배열 끝 idx)
	 * @return start (우측 부분배열 1번째 값)
	 */
	public static int partition(int arr[], int start, int end) {
		int pivot = arr[(start + end) / 2];	// 피봇은 배열의 중간으로 정함

		while(start <= end) { // 시작점과 끝점이 엇갈릴 때까지 진행
			while (arr[start] < pivot) start++; // 시작점 진행 중, 피봇 이상의 값이 있으면 stop, 아니면 진행
			while (arr[end] > pivot) end--; // 끝점 진행 중, 피봇 이하의 값이 있으면 stop, 아니면 진행

			if(start <= end) { // 시작점과 끝점이 엇갈리지 않은 상태에서 서로 값을 찾은 상태라면 서로의 값 스왑 후 진행
				swap(arr, start, end);
				start++;
				end--;
			}
		}

		return start; // 시작점과 끝점이 엇갈리게 되면, 시작점(=우측배열 1번째 idx) 반환
	}

	/**
	 * 배열 값 교환
	 * @param arr
	 * @param i
	 * @param j
	 */
	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
