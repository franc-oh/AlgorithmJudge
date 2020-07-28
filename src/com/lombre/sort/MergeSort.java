package com.lombre.sort;

import java.util.Arrays;

public class MergeSort {

	public static void main(String args[]) {
		int src[] = new int[]{3,6,41,2,4,1,5,743};
		mergeSort(src, 0, src.length-1);

		System.out.println(Arrays.toString(src));

	}

	/**
	 * �������� ó�� ������ ��͸� ���� ó���ϴ� �޼���
	 * @param arr (���� ��� �迭)
	 * @param start (�迭 ���� idx)
	 * @param end (�迭 �� idx)
	 */
	public static void mergeSort(int arr[], int start, int end) {

		// ������ �迭(2�� �̻��� ����)�� �ִ� ��� ����
		if(start < end) {
			int middle = (start + end) / 2; // �迭�� �߰� idx

			mergeSort(arr, start, middle); // �� �κп� ���� ����
			mergeSort(arr, middle+1, end); // �� �κп� ���� ����

			merge(arr, start, middle, end);// ������ ������ �պ� ó��
		}

	}

	/**
	 * ���ҵ� �迭 ��Ҹ� ���Ͽ� ����/�պ�
	 * @param arr (���� ��� �迭)
	 * @param start (�迭 ���� idx)
	 * @param middle (�迭 �߰� idx)
	 * @param end (�迭 �� idx)
	 */
	public static void merge(int arr[], int start, int middle, int end) {
		int i = start;		// �� �迭�� ������
		int j = middle+1;	// �� �迭�� ������
		int k = start;		// temp �迭�� index
		int temp[] = new int[arr.length];	// ���ҵ� ��Ҹ� �����Ͽ� �ӽ� ������ �迭

		// 1. ��.�� �迭�� �����͸� ���� ���Ͽ� temp�� ����
		// 2. ����� �� �迭�� ���� �����Ϳ� �񱳸� �ݺ��Ͽ�, ��� ������ ������ �պ��� ���� �� ���� �۾� ����
		while(i <= middle && j <= end) {
			if(arr[i] <= arr[j])
				temp[k++] = arr[i++];
			else
				temp[k++] = arr[j++];
		}

		while(i <= middle) {	// �� ���� �� �� �迭�� �ܿ� ������ temp�� ����
			temp[k++] = arr[i++];
		}
		while(j <= end) {		// �� ���� �� �� �迭�� �ܿ� ������ temp�� ����
			temp[k++] = arr[j++];
		}

		// ���ĵ� ����(temp)�� ��� �迭�� ���� ����
		for(int idx = start; idx <= end; idx++) {
			arr[idx] = temp[idx];
		}
	}

}
