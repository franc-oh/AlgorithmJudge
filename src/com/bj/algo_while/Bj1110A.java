package com.bj.algo_while;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1110A {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		br.close();

		// �ʱ� �� ����
		int init1 = (N / 10);
		int init2 = (N % 10);

		int num1 = (N / 10);
		int num2 = (N % 10);
		int sum = 0;
		int cycle = 0;

		while(true) {
			sum = num1 + num2; // 10�� �ڸ� ���� 1�� �ڸ� �� �հ�
			num1 = num2; // 10�� �ڸ� = 1�� �ڸ� ��
			num2 = (sum % 10); // 1���ڸ� = �հ��� 1�� �ڸ� ��

			cycle++; // ����Ŭ ����

			// �ʱ� �Է°��� ���ο� ���� ������ �ݺ� ����
			if(num1 == init1 && num2 == init2) {
				break;
			}

		}

		System.out.println(cycle);

	}

}
