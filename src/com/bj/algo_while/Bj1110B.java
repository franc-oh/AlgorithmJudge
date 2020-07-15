package com.bj.algo_while;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1110B {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();

		int number = N;
		int cycle = 0;

		do {
			// 10�� �ڸ� = ���� 1�� �ڸ� �� , 1�� �ڸ� = ���� �հ�(10�� �ڸ��� 1�� �ڸ� ��) 1�� �ڸ� ��
			number = (number % 10 * 10) + (((number / 10) + (number % 10)) % 10);
			cycle++; // ����Ŭ ����

		} while (N != number);

		System.out.println(cycle);

	}

}
