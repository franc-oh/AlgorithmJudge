package com.lombre.sort;

import java.util.Arrays;

public class QuickSort2 {

	public static void main(String args[]) {
		int src[] = new int[]{3,6,41,2,4,1,5,743};

		quickSort(src, 0, src.length-1);

		System.out.println(Arrays.toString(src));


	}

	/**
	 * �� ���� �ϴ� ������ ��͸� ���� ó���ϴ� �޼���
	 * @param arr (���� ��� �迭)
	 * @param start (�迭 ���� idx)
	 * @param end (�迭 �� idx)
	 */
	public static void quickSort(int arr[], int start, int end) {

		int part2 = partition(arr, start, end);	// �ǹ� �� �޾ƿ���

		if(start < part2 - 1) {	// �޾ƿ� �ǹ��� ��������, ���� �迭�� ��Ұ� ���� ���� �� ���� ����+���� �ݺ�
			quickSort(arr, start, part2-1);
		}
		if(part2 < end) { // �޾ƿ� �ǹ��� ��������, ���� �迭�� ��Ұ� ���� ���� �� ���� ����+���� �ݺ�
			quickSort(arr, part2, end);
		}

	}

	/**
	 * �Ǻ����� �� �κй迭 ���� �� ����
	 * @param arr (���� ��� �迭)
	 * @param start (�迭 ���� idx)
	 * @param end (�迭 �� idx)
	 * @return start (���� �κй迭 1��° ��)
	 */
	public static int partition(int arr[], int start, int end) {
		int pivot = arr[(start + end) / 2];	// �Ǻ��� �迭�� �߰����� ����

		while(start <= end) { // �������� ������ ������ ������ ����
			while (arr[start] < pivot) start++; // ������ ���� ��, �Ǻ� �̻��� ���� ������ stop, �ƴϸ� ����
			while (arr[end] > pivot) end--; // ���� ���� ��, �Ǻ� ������ ���� ������ stop, �ƴϸ� ����

			if(start <= end) { // �������� ������ �������� ���� ���¿��� ���� ���� ã�� ���¶�� ������ �� ���� �� ����
				swap(arr, start, end);
				start++;
				end--;
			}
		}

		return start; // �������� ������ �������� �Ǹ�, ������(=�����迭 1��° idx) ��ȯ
	}

	/**
	 * �迭 �� ��ȯ
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
