package com.codeup.algo.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cu1916 {

	static long data[] = new long[201];

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		br.close();

		System.out.println((fibonacci(n)));

	}

	public static long fibonacci(int n) {

		if(n <= 2) {
			return 1;
		}

		if(data[n] != 0) {
			// �̹� ����� �� ���(�޸𸮿� �� ����), ������ �ƴ� ������ Ȱ��
			return data[n];
		} else {
			// ���� ����� �ȵ� ���(�޸𸮿� �� ����), ���� �� �޸𸮿� ����
			return data[n] = (fibonacci(n-1) + fibonacci(n-2)) % 10009;
		}
	}

}
