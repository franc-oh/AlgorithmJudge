package com.codeup.algo.recursion;

import java.util.Scanner;

public class Cu1902 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		calc(sc.nextInt());
	}


	public static void calc(int n) {

		if(n < 1) {
			return;
		}

		// ����Լ��� ����(LIFO)�� �ױ� ������, ��Ͱ� ���ÿ� ���̱� �� ����ϸ� n~1���� ���� ����� �ȴ�.
		System.out.println(n);
		calc(n-1);

	}

}
