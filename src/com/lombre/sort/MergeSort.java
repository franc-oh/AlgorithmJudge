package com.lombre.sort;

import java.util.Arrays;

public class MergeSort {

	public static void main(String args[]) {
		int src[] = new int[]{3,6,41,2,4,1,5,743};
		mergeSort(src, 0, src.length-1);

		System.out.println(Arrays.toString(src));

	}

	/**
	 * 병합정렬 처리 과정을 재귀를 통해 처리하는 메서드
	 * @param arr (정렬 대상 배열)
	 * @param start (배열 시작 idx)
	 * @param end (배열 끝 idx)
	 */
	public static void mergeSort(int arr[], int start, int end) {

		// 정렬할 배열(2개 이상의 원소)이 있는 경우 실행
		if(start < end) {
			int middle = (start + end) / 2; // 배열의 중간 idx

			mergeSort(arr, start, middle); // 앞 부분에 대한 분할
			mergeSort(arr, middle+1, end); // 뒷 부분에 대한 분할

			merge(arr, start, middle, end);// 분할이 끝나면 합병 처리
		}

	}

	/**
	 * 분할된 배열 요소를 비교하여 정렬/합병
	 * @param arr (정렬 대상 배열)
	 * @param start (배열 시작 idx)
	 * @param middle (배열 중간 idx)
	 * @param end (배열 끝 idx)
	 */
	public static void merge(int arr[], int start, int middle, int end) {
		int i = start;		// 앞 배열의 시작점
		int j = middle+1;	// 뒷 배열의 시작점
		int k = start;		// temp 배열의 index
		int temp[] = new int[arr.length];	// 분할된 요소를 정렬하여 임시 저장할 배열

		// 1. 앞.뒤 배열의 데이터를 서로 비교하여 temp로 저장
		// 2. 저장된 쪽 배열의 다음 데이터와 비교를 반복하여, 어느 한쪽의 데이터 합병이 끝날 때 까지 작업 진행
		while(i <= middle && j <= end) {
			if(arr[i] <= arr[j])
				temp[k++] = arr[i++];
			else
				temp[k++] = arr[j++];
		}

		while(i <= middle) {	// 비교 정렬 후 앞 배열의 잔여 데이터 temp에 저장
			temp[k++] = arr[i++];
		}
		while(j <= end) {		// 비교 정렬 후 뒷 배열의 잔여 데이터 temp에 저장
			temp[k++] = arr[j++];
		}

		// 정렬된 내용(temp)을 결과 배열에 최종 저장
		for(int idx = start; idx <= end; idx++) {
			arr[idx] = temp[idx];
		}
	}

}
