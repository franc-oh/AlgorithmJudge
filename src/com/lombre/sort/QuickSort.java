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
        int pivot = arr[(left + right) / 2]; // pivot�� �߾� ������ ����

        do {
            while (arr[left] < pivot) left++;	// left���� pivot���� ū �� �߰��� �� ���� ����

            while (arr[right] > pivot) right--;	// right���� pivot���� ���� �� �߰��� �� ���� ����

            // left���� pivot���� ū ��, right���� pivot���� ���� �� �߽߰� ���� ��ȯ �� ����
            if (left <= right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }

        } while (left <= right);	// left, right ���� �� ���� �ݺ�

        if (l < right) {//���������� �� �̻� ���� ���� ���� ��� üũ (���� ������ �� �ִ��� üũ)
            quickSort(arr, l, right);
        }
        if (r > left) {//���������� �� �̻� ���� ���� ���� ��� üũ (������ ������ �� �ִ��� üũ)
            quickSort(arr, left, r);
        }

	}

}
